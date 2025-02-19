package com.asiainfo.crm.cm.exe.task.bi.business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;


public class GtoneVipPdProcess
{
	private static final transient Log log = LogFactory.getLog(GtoneVipPdProcess.class);
	private static final GtoneVipPdProcess dp = new GtoneVipPdProcess();
	
	private GtoneVipPdProcess() {
		
	}
	
	public static GtoneVipPdProcess getInstance() {
		return dp;
	}
	
	public String mainProcess(GtoneVipPdProcessBean processBean) throws Exception {
		//进行评定数据查询
		return queryPdData(processBean);
	}
	
	private String queryPdData(GtoneVipPdProcessBean processBean) throws Exception {
		Connection srcConnection = null ;
		PreparedStatement ps = null;
		
		ResultSet rs = null;
		try{
			srcConnection = processBean.getConnection();
			ps = srcConnection.prepareStatement(processBean.getSelectSql());
			ps.setFetchSize(processBean.getFetchSize());
			rs = ps.executeQuery();
			//逐条进行客户VIP等级评定
			return dealOneVipCustPd(processBean, rs);
		}finally{
			CmCommonUtil.closeJDBC(srcConnection, ps, rs);
		}
	}
	
	private String dealOneVipCustPd(GtoneVipPdProcessBean processBean, ResultSet rs) throws Exception {
		return null;
		/**
		GtoneVipPdTableBean tableBean = new GtoneVipPdTableBean();	//存放一条评定数据
		IGtoneVipLevelSV sv = (IGtoneVipLevelSV)ServiceFactory.getService(IGtoneVipLevelSV.class);
		IBOBsDistrictValue districtValue = null;
		
		long totalNum = 0;	//处理总数
		long sucessNum = 0;	//成功总数
		while(rs.next()) {
			totalNum++;
			try {
				//生成一条评定数据对象
				processBean.transResultSetToBean(tableBean, rs);
				//2011-7-20,add by xialing,增加对未割接地市的过滤
				districtValue = DistrictUtil.getDistrictByRegionId(tableBean.getRegionCode());
				if(districtValue.getCourseFlag() == 0) {	//未割接地市不评定
					continue;
				}
				//add end
				//一个客户VIP的等级评定作为一个事务提交
				sv.dealOneVipLevel(processBean, tableBean, tableBean.getUserId());
				sucessNum++;
			}catch (BusinessException be) {	//业务异常单独处理
				tableBean.setRemarks(be.getMessage());
			}catch (Exception e) {
				if(log.isInfoEnabled()) {
					log.info(CrmLocaleFactory.getResource("CMS0009080", tableBean.getBillId()), e);	//用户{0}全球通88套餐VIP等级评定失败：
				}
				String errorMsg = e.getCause() == null ? e.getMessage() : e.getCause().getMessage();
				tableBean.setRemarks(CrmLocaleFactory.getResource("CMS0009080", tableBean.getBillId())+errorMsg);
			}finally {
				//2011-7-20,add by xialing,增加最后统一设置已处理标记
				tableBean.setIsModifyFlag(1);
				//add end
				GtoneVipPdProcess.getInstance().updateJkVipPdCrm(processBean, tableBean);
			}
		}
		
		//完成全球通88套餐VIP等级评定工作，业务数据总量：{0}，成功：{1}，失败：{2}
		return CrmLocaleFactory.getResource("CMS0009081", Long.toString(totalNum), Long.toString(sucessNum), Long.toString(totalNum-sucessNum));
	}
	
	public void updateJkVipPdCrm(GtoneVipPdProcessBean processBean, GtoneVipPdTableBean tableBean) throws Exception {
		Connection connection = processBean.getConnection();
		PreparedStatement ps = connection.prepareStatement(processBean.getUpdateSql());
		try{
			ps.setString(1, tableBean.getVipCardNo());
			ps.setInt(2, tableBean.getIsModifyFlag());
			ps.setString(3, tableBean.getRemarks());
			ps.setString(4, tableBean.getRowid());
			ps.executeUpdate();
			connection.commit();
		}catch (Exception e) {
			if(log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0009082"),e);	//更新评定数据抽取表失败：
			}
			connection.rollback();
		}finally {
			CmCommonUtil.closeJDBC(connection, ps, null);
		}
		**/
	}
	
	public GtoneVipPdSmsNotifyBean[] getAllBillIdForSms(GtoneVipPdProcessBean processBean) throws Exception {
		Connection connection = processBean.getConnection();
		PreparedStatement ps = connection.prepareStatement("SELECT t.person_name,t.bill_id,t.email,t.region_id,t.county_id FROM JK_VIP_PD_SMS_NOTIFY t WHERE t.state = 'U'");
		ResultSet rs = null;
		List billList = new ArrayList();
		try{
			rs = ps.executeQuery();
			GtoneVipPdSmsNotifyBean bean = null;
			while(rs.next()) {
				bean = new GtoneVipPdSmsNotifyBean();
				//bean.setPersonName(rs.getString(1));
				bean.setBillId(rs.getString(2));
				//bean.setEmail(rs.getString(3));
				bean.setRegionId(rs.getString(4));
				billList.add(bean);
			}
		}catch (Exception e) {
			if(log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0009083"),e);	//查询需要短信通知的人员名单失败：
			}
		}finally {
			CmCommonUtil.closeJDBC(connection, ps, rs);
		}
		return (GtoneVipPdSmsNotifyBean[])billList.toArray(new GtoneVipPdSmsNotifyBean[0]);
	}
	
	public int getCreditByVipLevel(long vipLevel) throws Exception {
		int credit = 0;
		IBOBsStaticDataValue value = StaticDataUtil.getStaticData("CM_GTONE_VIP_CREDIT_MAPPING", Long.toString(vipLevel));
		if(value != null) {
			credit = Integer.valueOf(value.getCodeName()).intValue();
		}
		return credit;
	}
	
	public void add(GtoneVipPdProcessBean processBean, GtoneVipPdTableBean tableBean) throws Exception {
		/**
		Timestamp now = ServiceManager.getIdGenerator().getSysDate();	//当前系统时间
		if(tableBean.getVipLevelNew() == tableBean.getVipLevelPd()) {
			//抛出异常终止该条数据的处理
			ExceptionUtil.throwBusinessException("CMS0009084");		//新增且新VIP级别等于评定VIP级别，不需要处理
		}else if(tableBean.getVipLevelNew() == tableBean.getVipLevelPlan()) {
			if(log.isInfoEnabled()) {
				log.info(CrmLocaleFactory.getResource("CMS0009085"));	//新增且新VIP级别等于套餐VIP级别，新增对应级别的VIP卡号及相应的信用额度
			}
			//根据手机号码查询客户信息
			ICm2InterFSV interFSV = (ICm2InterFSV)ServiceFactory.getService(ICm2InterFSV.class);
			ICmCustomerValue customerInfo = interFSV.queryCustInfoByBillId(tableBean.getBillId());
			if(customerInfo == null) {
				//客户信息不存在
				ExceptionUtil.throwBusinessException("CMS0006030", tableBean.getBillId());
			}
			//新增cm_indiv_vip_info_{region}表中的数据
			IBOCmIndivVipInfoValue vipInfo = new BOCmIndivVipInfoBean();
			vipInfo.setIndivCustId(tableBean.getCustId());
			vipInfo.setVipLevel((int)tableBean.getVipLevelNew());
			vipInfo.setVipSource(0);
			vipInfo.setCarNo(null);
			vipInfo.setCharactorDesc(null);
			vipInfo.setIsSendSms(1);
			vipInfo.setEducation(customerInfo.getEducation());
			vipInfo.setJobCompanyAddress(null);
			vipInfo.setJobCompany(null);
			vipInfo.setJobPosition(null);
			vipInfo.setGender(customerInfo.getGender());
			vipInfo.setMaritalStatus(customerInfo.getMarryStatus());
			vipInfo.setOtherHobby(null);
			vipInfo.setPhoneType(null);
			vipInfo.setNationality(86);
			vipInfo.setProvinceId(571);
			vipInfo.setCityId(Long.parseLong(tableBean.getRegionCode()));
			vipInfo.setRegionType(customerInfo.getCountyId());
			vipInfo.setRegionDetail(0);	//TODO：片区
			vipInfo.setContPhone(customerInfo.getContPhone());
			vipInfo.setContEmail(customerInfo.getContEmail());
			vipInfo.setContFax(customerInfo.getContFax());
			vipInfo.setOtherContMedium(null);
			vipInfo.setContAddress(customerInfo.getContAddress());
			vipInfo.setZipCode(null);
			vipInfo.setState(CmConstants.RECORD_STATE_USE);
			vipInfo.setEffectiveDate(now);
			vipInfo.setExpireDate(TimeUtil.getMaxExpire());
			vipInfo.setRegionId(customerInfo.getRegionId());
			vipInfo.setVocation1(11000);
			vipInfo.setVocation2(1);
			vipInfo.setCustLevel(10);
			//新增cm_indiv_vip_user_{region}表中的数据
			IBOCmIndivVipUserValue vipUserInfo = new BOCmIndivVipUserBean();
			vipUserInfo.setUserId(tableBean.getUserId());
			vipUserInfo.setBillId(tableBean.getBillId());
			vipUserInfo.setVipLevel((int)tableBean.getVipLevelNew());
			vipUserInfo.setVipSource(0);
			vipUserInfo.setIsSendSms(1);
			vipUserInfo.setState(CmConstants.RECORD_STATE_USE);
			vipUserInfo.setEffectiveDate(now);
			vipUserInfo.setExpireDate(TimeUtil.getMaxExpire());
			vipUserInfo.setRegionId(tableBean.getRegionCode());
			
			//创建大客户信息
			ICmIndivVipSV vipSV = (ICmIndivVipSV)ServiceFactory.getService(ICmIndivVipSV.class);
			long vipAttrId = vipSV.createIndivVip(vipInfo, vipUserInfo, null);	//客户经理此处不进行分配
			
			//新增cm_indiv_vip_card_{region}表中的数据
			IGtoneVipLevelSV gtoneSV = (IGtoneVipLevelSV)ServiceFactory.getService(IGtoneVipLevelSV.class);
			String cardCode = gtoneSV.getVipCardNum((int)tableBean.getVipLevelNew(), tableBean.getRegionCode());
			IBOCmIndivVipCardValue vipCardInfo = new BOCmIndivVipCardBean();
			vipCardInfo.setVipAttrId(vipAttrId);
			vipCardInfo.setGroupCustId(-1);
			vipCardInfo.setCardCode(cardCode);
			vipCardInfo.setCardPassword(CmConstants.GtoneVipLevel.VIP_CARD_DEFAULT_PASSWORD);	//默认密码
			vipCardInfo.setCardSource(0);	//个人大客户
			vipCardInfo.setCardLevel((int)tableBean.getVipLevelNew());
			vipCardInfo.setCardType(2);	//电子卡
			vipCardInfo.setCardYear(Integer.parseInt(TimeUtil.getYYYYMM(now).substring(0, 4)));
			vipCardInfo.setCardFlag(1);	//已发卡
			vipCardInfo.setCardDate(now);
			vipCardInfo.setState(CmConstants.RECORD_STATE_USE);
			vipCardInfo.setEffectiveDate(now);
			vipCardInfo.setExpireDate(TimeUtil.getMaxExpire());
			vipCardInfo.setRegionId(tableBean.getRegionCode());
			
			//创建VIP卡信息
			ICmIndivVipCardSV cardSV = (ICmIndivVipCardSV)ServiceFactory.getService(ICmIndivVipCardSV.class);
			cardSV.createIndivVipCard(vipCardInfo, false);
			
			//回写卡号到数据抽取表中
			tableBean.setVipCardNo(cardCode);
			
			//调用营业侧的接口，更改相应的信用等级
			ICrmFSV crmFSV = (ICrmFSV)ServiceFactory.getService(ICrmFSV.class);
			crmFSV.updateCreditLevel4Cust(tableBean.getBillId(), getCreditByVipLevel(tableBean.getVipLevelNew()));	//将VIP等级映射为信用等级
		}
		**/
	}
	
	public void del(GtoneVipPdProcessBean processBean, GtoneVipPdTableBean tableBean) throws Exception {
		/**
		if(tableBean.getVipLevelNew() == tableBean.getVipLevelPd())	{	//删除当前VIP级别、卡号、客户经理关系和信用额度
			//先判断原先的备份表里是否有数据：
			//如果没有的话,删除cm_indiv_vip_info_{region}，cm_indiv_vip_user_{region}，cm_indiv_vip_card_{region}，CM_INDIV_VIP_MGRREL_{region}表中的数据
			//如果有的话,就恢复原先的数据
			//最后调用营业侧的接口，删除/修正信用额度
				
			//无论备份表中有无数据，首先将现有VIP信息删除
			ICmIndivVipSV vipSV = (ICmIndivVipSV)ServiceFactory.getService(ICmIndivVipSV.class);
			IBOCmIndivVipUserValue vipUserInfo = vipSV.queryVipUserByUserInfo(tableBean.getUserId(), tableBean.getBillId());
			vipUserInfo.setState(CmConstants.RECORD_STATE_DEL);		//删除VIP用户信息
			vipSV.saveIndivVipUser(vipUserInfo);
			
			long vipAttrId = vipUserInfo.getVipAttrId();
			IBOCmIndivVipInfoValue vipInfo = vipSV.queryIndivVipInfoById(vipAttrId);
			vipInfo.setState(CmConstants.RECORD_STATE_DEL);		//删除大客户信息
			vipSV.saveIndivVipInfo(vipInfo);
			
			ICmIndivVipCardSV cardSV = (ICmIndivVipCardSV)ServiceFactory.getService(ICmIndivVipCardSV.class);
			IBOCmIndivVipCardValue[] cardInfos = cardSV.queryIndivVipCards(vipAttrId);
			if(cardInfos != null) {
				for(int i=0,len=cardInfos.length; i<len; i++) {
					cardInfos[i].setState(CmConstants.RECORD_STATE_DEL);	//删除VIP卡信息
					cardSV.saveIndivVipCard(cardInfos[i]);
				}
			}
			
			ICmIndivVipMgrrelSV mgrrelSV = (ICmIndivVipMgrrelSV)ServiceFactory.getService(ICmIndivVipMgrrelSV.class);
			IBOCmIndivVipMgrrelValue mgrInfo = mgrrelSV.queryIndivVipMgrrelByVipAttrId(vipAttrId);
			if(mgrInfo != null) {
				mgrInfo.setState(CmConstants.RECORD_STATE_DEL);	//删除大客户和客户经理关系信息
				mgrrelSV.saveIndivVipMgrrel(mgrInfo);
			}
			
			//查询VIP用户备份信息
			ICmIndivVipGtoneSV gtoneSV = (ICmIndivVipGtoneSV)ServiceFactory.getService(ICmIndivVipGtoneSV.class);
			IBOCmIndivVipUserGtoneValue vipUserGtone = gtoneSV.queryIndivVipUserGtoneByUserIdOrBillId(tableBean.getUserId(), tableBean.getBillId());
	  
			if(vipUserGtone != null) {	//如果备份表中有数据，进行恢复
				if(log.isInfoEnabled()) {
					//删除且新VIP级别等于评定VIP级别，备份表中有数据，进行恢复，原手机号码：{0}，原VIP等级：{1}
					log.info(CrmLocaleFactory.getResource("CMS0009086", vipUserGtone.getBillId(), Integer.toString(vipUserGtone.getVipLevel())));
				}
				
				long vipAttrIdGtone = vipUserGtone.getVipAttrId();
				//查询大客户备份信息
				IBOCmIndivVipInfoGtoneValue vipGtone = gtoneSV.queryIndivVipInfoGtoneByVipAttrId(vipAttrIdGtone);
				//查询VIP卡备份信息
				IBOCmIndivVipCardGtoneValue cardGtone = gtoneSV.queryIndivVipCardGtoneByVipAttrId(vipAttrIdGtone);
				//查询大客户和客户经理关系备份信息
				IBOCmIndivVipMgrrelGtoneValue mgrGtone = gtoneSV.queryIndivVipMgrrelGtoneByVipAttrId(vipAttrIdGtone);
				
				//生成需要恢复的数据对象
				vipInfo.copy(vipGtone);	//大客户信息
				vipInfo.setVipAttrId(0);
				vipInfo.setStsToNew();
				
				vipUserInfo.copy(vipUserGtone);	//VIP用户信息
				vipUserInfo.setVipAttrId(0);
				vipUserInfo.setStsToNew();
				
				mgrInfo.copy(mgrGtone);	//大客户和客户经理关系信息
				mgrInfo.setVipAttrId(0);
				mgrInfo.setStsToNew();
				
				long newVipAttrId = vipSV.createIndivVip(vipInfo, vipUserInfo, mgrInfo);
				IBOCmIndivVipCardValue vipCardInfo = new BOCmIndivVipCardBean();	//VIP卡信息
				vipCardInfo.copy(cardGtone);
				vipCardInfo.setCardId(0);
				vipCardInfo.setVipAttrId(newVipAttrId);
				vipCardInfo.setStsToNew();
				cardSV.createIndivVipCard(vipCardInfo, false);
				
				//将恢复的卡号回写到抽取对象
				tableBean.setVipCardNo(vipCardInfo.getCardCode());
	 			
				//调用营业侧的接口，恢复信用额度
				ICrmFSV crmFSV = (ICrmFSV)ServiceFactory.getService(ICrmFSV.class);
				crmFSV.updateCreditLevel4Cust(tableBean.getBillId(), getCreditByVipLevel(vipUserInfo.getVipLevel()));	//将VIP等级映射为信用等级
			}else {
				if(log.isInfoEnabled()) {
					//删除且新VIP级别等于评定VIP级别，备份表中无数据，进行删除，手机号码：{0}
					log.info(CrmLocaleFactory.getResource("CMS0009087", tableBean.getBillId()));
				}
				
				//VIP相关信息已经删除无需恢复，调用营业侧的接口，删除信用额度
				ICrmFSV crmFSV = (ICrmFSV)ServiceFactory.getService(ICrmFSV.class);
				crmFSV.updateCreditLevel4Cust(tableBean.getBillId(), getCreditByVipLevel(0));	//将VIP等级映射为信用等级
			}
		}else if(tableBean.getVipLevelNew() == tableBean.getVipLevelPlan()) {
			//抛出异常终止该条数据的处理
			ExceptionUtil.throwBusinessException("CMS0009088");	//删除且新VIP级别等于套餐VIP级别，不需要处理
		}
		**/
	}
	
	public void sup(GtoneVipPdProcessBean processBean, GtoneVipPdTableBean tableBean) throws Exception {
		/**
		Timestamp now = ServiceManager.getIdGenerator().getSysDate();	//当前系统时间
		if(tableBean.getVipLevelNew() == tableBean.getVipLevelPd()) {
			//抛出异常终止该条数据的处理
			ExceptionUtil.throwBusinessException("CMS0009089");	//升级且新VIP级别等于评定VIP级别，不需要处理
		}else if(tableBean.getVipLevelNew() == tableBean.getVipLevelPlan()) {
			if(log.isInfoEnabled()) {
				log.info(CrmLocaleFactory.getResource("CMS0009090"));	//升级且新VIP级别等于套餐VIP级别，分配对应级别的VIP卡号，调整相应的信用额度
			}
			
			//分配对应级别的VIP卡号，调整相应的信用额度
			//修改cm_indiv_vip_info_{region}，cm_indiv_vip_user_{region}，cm_indiv_vip_card_{region}表中的数据，删除原有的VIP客户经理
			//调用营业侧的接口，更改相应的信用等级
			ICmIndivVipSV vipSV = (ICmIndivVipSV)ServiceFactory.getService(ICmIndivVipSV.class);
			IBOCmIndivVipUserValue vipUserInfo = vipSV.queryVipUserByUserInfo(tableBean.getUserId(), tableBean.getBillId());
			vipUserInfo.setVipLevel((int)tableBean.getVipLevelNew());	//更新用户VIP等级
			vipSV.saveIndivVipUser(vipUserInfo);
			
			long vipAttrId = vipUserInfo.getVipAttrId();
			IBOCmIndivVipInfoValue vipInfo = vipSV.queryIndivVipInfoById(vipAttrId);
			vipInfo.setVipLevel((int)tableBean.getVipLevelNew());	//更新客户VIP等级
			vipSV.saveIndivVipInfo(vipInfo);
			
			ICmIndivVipCardSV cardSV = (ICmIndivVipCardSV)ServiceFactory.getService(ICmIndivVipCardSV.class);
			IBOCmIndivVipCardValue[] cardInfos = cardSV.queryIndivVipCards(vipAttrId);
			//生成新卡号
			IGtoneVipLevelSV gtoneSV = (IGtoneVipLevelSV)ServiceFactory.getService(IGtoneVipLevelSV.class);
			String cardCode = gtoneSV.getVipCardNum((int)tableBean.getVipLevelNew(), tableBean.getRegionCode());
			
			IBOCmIndivVipCardValue effectCardInfo = null;	//用于存放最新生成的卡号信息
			if(cardInfos != null && cardInfos.length > 0) {	//更新卡号
				effectCardInfo = cardInfos[0];
				for(int i=1,len=cardInfos.length; i<len; i++) {
					if(effectCardInfo.getCreateDate().before(cardInfos[i].getCreateDate())) {
						effectCardInfo.setState(CmConstants.RECORD_STATE_DEL);	//删除较旧的卡信息
						cardSV.saveIndivVipCard(effectCardInfo);
						effectCardInfo = cardInfos[i];	//将当前卡信息置为最新
					}else {
						cardInfos[i].setState(CmConstants.RECORD_STATE_DEL);	//删除较旧的卡信息
						cardSV.saveIndivVipCard(cardInfos[i]);
					}
				}
				effectCardInfo.initProperty(IBOCmIndivVipCardValue.S_CardId, Long.valueOf(effectCardInfo.getCardId()));
				effectCardInfo.setCardCode(cardCode);
				//更新卡信息
				cardSV.saveIndivVipCard(effectCardInfo);
			}else{	//创建卡信息
				effectCardInfo = new BOCmIndivVipCardBean();
				effectCardInfo.setVipAttrId(vipAttrId);
				effectCardInfo.setGroupCustId(-1);
				effectCardInfo.setCardCode(cardCode);
				effectCardInfo.setCardPassword(CmConstants.GtoneVipLevel.VIP_CARD_DEFAULT_PASSWORD);	//默认密码
				effectCardInfo.setCardSource(0);
				effectCardInfo.setCardLevel((int)tableBean.getVipLevelNew());
				effectCardInfo.setCardType(2);	//电子卡
				effectCardInfo.setCardYear(Integer.parseInt(TimeUtil.getYYYYMM(now).substring(0, 4)));
				effectCardInfo.setCardFlag(1);	//已发卡
				effectCardInfo.setCardDate(now);
				effectCardInfo.setState(CmConstants.RECORD_STATE_USE);
				effectCardInfo.setEffectiveDate(now);
				effectCardInfo.setExpireDate(TimeUtil.getMaxExpire());
				effectCardInfo.setRegionId(tableBean.getRegionCode());
				//保存最新创建的卡信息
				cardSV.createIndivVipCard(effectCardInfo, false);
			}
			//将新卡号回写到抽取对象中
			tableBean.setVipCardNo(cardCode);

			//删除原有的VIP客户经理
			ICmIndivVipMgrrelSV mgrrelSV = (ICmIndivVipMgrrelSV)ServiceFactory.getService(ICmIndivVipMgrrelSV.class);
			IBOCmIndivVipMgrrelValue mgrInfo = mgrrelSV.queryIndivVipMgrrelByVipAttrId(vipAttrId);
			if(mgrInfo != null) {
				mgrInfo.setState(CmConstants.RECORD_STATE_DEL);
				mgrrelSV.saveIndivVipMgrrel(mgrInfo);
			}
			
			//VIP相关信息已经删除无需恢复，调用营业侧的接口，删除信用额度
			ICrmFSV crmFSV = (ICrmFSV)ServiceFactory.getService(ICrmFSV.class);
			crmFSV.updateCreditLevel4Cust(tableBean.getBillId(), getCreditByVipLevel(tableBean.getVipLevelNew()));	//将VIP等级映射为信用等级
		}
		**/
	}
	
	public void sub(GtoneVipPdProcessBean processBean, GtoneVipPdTableBean tableBean) throws Exception {
		/**
		Timestamp now = ServiceManager.getIdGenerator().getSysDate();	//当前系统时间
		if(tableBean.getVipLevelNew() == tableBean.getVipLevelPd()) {
			if(log.isInfoEnabled()) {
				log.info(CrmLocaleFactory.getResource("CMS0009091"));	//降级且新VIP级别等于评定VIP级别，进行评定VIP级别的恢复，包括VIP级别、卡号、客户经理工号、信用额度
			}
			//进行评定VIP级别的恢复，包括VIP级别、卡号、客户经理工号、信用额度
			//从VIP信息备份表中获取数据进行更新当前表数据
			
			//降级操作判断原先备份表中是否存在
			//查询VIP用户备份信息
			ICmIndivVipGtoneSV gtoneSV = (ICmIndivVipGtoneSV)ServiceFactory.getService(ICmIndivVipGtoneSV.class);
			IBOCmIndivVipUserGtoneValue vipUserGtone = gtoneSV.queryIndivVipUserGtoneByUserIdOrBillId(tableBean.getUserId(), tableBean.getBillId());
			
			if(vipUserGtone != null) {	//如果备份表中有数据，进行恢复
				if(log.isInfoEnabled()) {
					//降级且新VIP级别等于评定VIP级别，备份表中有数据，进行恢复，原手机号码：{0}，原VIP等级：{1}
					log.info(CrmLocaleFactory.getResource("CMS0009092", vipUserGtone.getBillId(), Integer.toString(vipUserGtone.getVipLevel())));
				}
				//查询恢复备份表的VIP信息
				long vipAttrIdGtone = vipUserGtone.getVipAttrId();
				//查询大客户备份信息
				IBOCmIndivVipInfoGtoneValue vipGtone = gtoneSV.queryIndivVipInfoGtoneByVipAttrId(vipAttrIdGtone);
				//查询VIP卡备份信息
				IBOCmIndivVipCardGtoneValue cardGtone = gtoneSV.queryIndivVipCardGtoneByVipAttrId(vipAttrIdGtone);
				//查询大客户和客户经理关系备份信息
				IBOCmIndivVipMgrrelGtoneValue mgrGtone = gtoneSV.queryIndivVipMgrrelGtoneByVipAttrId(vipAttrIdGtone);
				
				//删除现有VIP信息
				ICmIndivVipSV vipSV = (ICmIndivVipSV)ServiceFactory.getService(ICmIndivVipSV.class);
				IBOCmIndivVipUserValue vipUserInfo = vipSV.queryVipUserByUserInfo(tableBean.getUserId(), tableBean.getBillId());
				vipUserInfo.setState(CmConstants.RECORD_STATE_DEL);		//删除VIP用户信息
				vipSV.saveIndivVipUser(vipUserInfo);
				
				long vipAttrId = vipUserInfo.getVipAttrId();
				IBOCmIndivVipInfoValue vipInfo = vipSV.queryIndivVipInfoById(vipAttrId);
				vipInfo.setState(CmConstants.RECORD_STATE_DEL);		//删除大客户信息
				vipSV.saveIndivVipInfo(vipInfo);
				
				ICmIndivVipCardSV cardSV = (ICmIndivVipCardSV)ServiceFactory.getService(ICmIndivVipCardSV.class);
				IBOCmIndivVipCardValue[] cardInfos = cardSV.queryIndivVipCards(vipAttrId);
				if(cardInfos != null) {
					for(int i=0,len=cardInfos.length; i<len; i++) {
						cardInfos[i].setState(CmConstants.RECORD_STATE_DEL);	//删除VIP卡信息
						cardSV.saveIndivVipCard(cardInfos[i]);
					}
				}
				
				ICmIndivVipMgrrelSV mgrrelSV = (ICmIndivVipMgrrelSV)ServiceFactory.getService(ICmIndivVipMgrrelSV.class);
				IBOCmIndivVipMgrrelValue mgrInfo = mgrrelSV.queryIndivVipMgrrelByVipAttrId(vipAttrId);
				if(mgrInfo != null) {
					mgrInfo.setState(CmConstants.RECORD_STATE_DEL);	//删除大客户和客户经理关系信息
					mgrrelSV.saveIndivVipMgrrel(mgrInfo);
				}
				
				//生成需要恢复的数据对象
				vipInfo.copy(vipGtone);	//大客户信息
				vipInfo.setVipAttrId(0);
				vipInfo.setStsToNew();
				
				vipUserInfo.copy(vipUserGtone);	//VIP用户信息
				vipUserInfo.setVipAttrId(0);
				vipUserInfo.setStsToNew();
				
				mgrInfo.copy(mgrGtone);	//大客户和客户经理关系信息
				mgrInfo.setVipAttrId(0);
				mgrInfo.setStsToNew();
				
				long newVipAttrId = vipSV.createIndivVip(vipInfo, vipUserInfo, mgrInfo);
				IBOCmIndivVipCardValue vipCardInfo = new BOCmIndivVipCardBean();	//VIP卡信息
				vipCardInfo.copy(cardGtone);
				vipCardInfo.setCardId(0);
				vipCardInfo.setVipAttrId(newVipAttrId);
				vipCardInfo.setStsToNew();
				cardSV.createIndivVipCard(vipCardInfo, false);
				
				//将恢复的卡号回写到抽取对象
				tableBean.setVipCardNo(vipCardInfo.getCardCode());
	 			
				//调用营业侧的接口，恢复信用额度
				ICrmFSV crmFSV = (ICrmFSV)ServiceFactory.getService(ICrmFSV.class);
				crmFSV.updateCreditLevel4Cust(tableBean.getBillId(), getCreditByVipLevel(vipUserInfo.getVipLevel()));	//将VIP等级映射为信用等级
			}else{
				//降级且新VIP级别等于评定VIP级别，备份表中无数据，无法进行VIP信息恢复
				//抛出异常终止该条数据的处理
				ExceptionUtil.throwBusinessException("CMS0009093");	//降级且新VIP级别等于评定VIP级别，备份表中无数据，无法进行VIP信息恢复
			}
		}else if(tableBean.getVipLevelNew() == tableBean.getVipLevelPlan()) {
			//分配对应级别的VIP卡号，调整相应的信用额度。
			//修改cm_indiv_vip_info_{region}，cm_indiv_vip_user_{region}，cm_indiv_vip_card_{region}表中的数据，删除原有的VIP客户经理
			//调用营业侧的接口，更改相应的信用等级
			if(log.isInfoEnabled()) {
				log.info(CrmLocaleFactory.getResource("CMS0009094"));	//降级且新VIP级别等于套餐VIP级别，分配对应级别的VIP卡号，调整相应的信用额度
			}
			
			ICmIndivVipSV vipSV = (ICmIndivVipSV)ServiceFactory.getService(ICmIndivVipSV.class);
			IBOCmIndivVipUserValue vipUserInfo = vipSV.queryVipUserByUserInfo(tableBean.getUserId(), tableBean.getBillId());
			vipUserInfo.setVipLevel((int)tableBean.getVipLevelNew());	//更新用户VIP等级
			vipSV.saveIndivVipUser(vipUserInfo);
			
			long vipAttrId = vipUserInfo.getVipAttrId();
			IBOCmIndivVipInfoValue vipInfo = vipSV.queryIndivVipInfoById(vipAttrId);
			vipInfo.setVipLevel((int)tableBean.getVipLevelNew());	//更新客户VIP等级
			vipSV.saveIndivVipInfo(vipInfo);
			
			ICmIndivVipCardSV cardSV = (ICmIndivVipCardSV)ServiceFactory.getService(ICmIndivVipCardSV.class);
			IBOCmIndivVipCardValue[] cardInfos = cardSV.queryIndivVipCards(vipAttrId);
			//生成新卡号
			IGtoneVipLevelSV gtoneSV = (IGtoneVipLevelSV)ServiceFactory.getService(IGtoneVipLevelSV.class);
			String cardCode = gtoneSV.getVipCardNum((int)tableBean.getVipLevelNew(), tableBean.getRegionCode());
			
			IBOCmIndivVipCardValue effectCardInfo = null;	//用于存放最新生成的卡号信息
			if(cardInfos != null && cardInfos.length > 0) {	//更新卡号
				effectCardInfo = cardInfos[0];
				for(int i=1,len=cardInfos.length; i<len; i++) {
					if(effectCardInfo.getCreateDate().before(cardInfos[i].getCreateDate())) {
						effectCardInfo.setState(CmConstants.RECORD_STATE_DEL);	//删除较旧的卡信息
						cardSV.saveIndivVipCard(effectCardInfo);
						effectCardInfo = cardInfos[i];	//将当前卡信息置为最新
					}else {
						cardInfos[i].setState(CmConstants.RECORD_STATE_DEL);	//删除较旧的卡信息
						cardSV.saveIndivVipCard(cardInfos[i]);
					}
				}
				effectCardInfo.initProperty(IBOCmIndivVipCardValue.S_CardId, Long.valueOf(effectCardInfo.getCardId()));
				effectCardInfo.setCardCode(cardCode);
				//更新卡信息
				cardSV.saveIndivVipCard(effectCardInfo);
			}else{	//创建卡信息
				effectCardInfo = new BOCmIndivVipCardBean();
				effectCardInfo.setVipAttrId(vipAttrId);
				effectCardInfo.setGroupCustId(-1);
				effectCardInfo.setCardCode(cardCode);
				effectCardInfo.setCardPassword(CmConstants.GtoneVipLevel.VIP_CARD_DEFAULT_PASSWORD);	//默认密码
				effectCardInfo.setCardSource(0);
				effectCardInfo.setCardLevel((int)tableBean.getVipLevelNew());
				effectCardInfo.setCardType(2);	//电子卡
				effectCardInfo.setCardYear(Integer.parseInt(TimeUtil.getYYYYMM(now).substring(0, 4)));
				effectCardInfo.setCardFlag(1);	//已发卡
				effectCardInfo.setCardDate(now);
				effectCardInfo.setState(CmConstants.RECORD_STATE_USE);
				effectCardInfo.setEffectiveDate(now);
				effectCardInfo.setExpireDate(TimeUtil.getMaxExpire());
				effectCardInfo.setRegionId(tableBean.getRegionCode());
				//保存最新创建的卡信息
				cardSV.createIndivVipCard(effectCardInfo, false);
			}
			//将新卡号回写到抽取对象中
			tableBean.setVipCardNo(cardCode);

			//删除原有的VIP客户经理
			ICmIndivVipMgrrelSV mgrrelSV = (ICmIndivVipMgrrelSV)ServiceFactory.getService(ICmIndivVipMgrrelSV.class);
			IBOCmIndivVipMgrrelValue mgrInfo = mgrrelSV.queryIndivVipMgrrelByVipAttrId(vipAttrId);
			if(mgrInfo != null) {
				mgrInfo.setState(CmConstants.RECORD_STATE_DEL);
				mgrrelSV.saveIndivVipMgrrel(mgrInfo);
			}
			
			//VIP相关信息已经删除无需恢复，调用营业侧的接口，删除信用额度
			ICrmFSV crmFSV = (ICrmFSV)ServiceFactory.getService(ICrmFSV.class);
			crmFSV.updateCreditLevel4Cust(tableBean.getBillId(), getCreditByVipLevel(tableBean.getVipLevelNew()));	//将VIP等级映射为信用等级
		}
		**/
	}
}
