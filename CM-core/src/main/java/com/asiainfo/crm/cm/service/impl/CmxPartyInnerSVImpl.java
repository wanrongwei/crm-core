package com.asiainfo.crm.cm.service.impl;

import java.util.HashMap;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.party.dao.interfaces.ICmxPartyDAO;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmxIndivPartyHobbyValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmxPartyContTypeInfoValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.service.interfaces.ICmxPartyInnerSV;

public class CmxPartyInnerSVImpl implements ICmxPartyInnerSV {

	private ICmxPartyDAO getCmxPartyDAO() {
		return (ICmxPartyDAO) ServiceFactory.getService(ICmxPartyDAO.class);
	}

	public IBOCmxIndivPartyHobbyValue[] queryIndivPartyHobby(long partyId, int hobbyType, int startNum, int endNum) throws Exception {
		if (partyId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxIndivPartyHobbyValue.S_PartyId).append(" = :partyId ");
		paraMap.put("partyId", Long.valueOf(partyId));
		if (hobbyType >= 0) {
			condition.append(" AND ").append(IBOCmxIndivPartyHobbyValue.S_HobbyType).append(" = :hobbyType ");
			paraMap.put("hobbyType", Long.valueOf(hobbyType));
		}
		IBOCmxIndivPartyHobbyValue[] iboCmxIndivPartyHobbyValues = getCmxPartyDAO().queryIndivPartyHobby(null, condition.toString(), paraMap, startNum, endNum);
		return iboCmxIndivPartyHobbyValues;
	}

	public int queryindivPartyHobbyCount(long partyId, int hobbyType) throws Exception {
		if (partyId <= 0) {
			// 输入参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxIndivPartyHobbyValue.S_PartyId).append(" = :partyId ");
		paraMap.put("partyId", Long.valueOf(partyId));
		if (hobbyType > 0) {
			condition.append(" AND ").append(IBOCmxIndivPartyHobbyValue.S_HobbyType).append(" = :hobbyType ");
			paraMap.put("hobbyType", Long.valueOf(hobbyType));
		}
		return getCmxPartyDAO().queryIndivPartyHobbyCount(condition.toString(), paraMap);
	}

	public IBOCmxPartyContTypeInfoValue[] queryPartyContTypeInfo(long partyId, int startNum, int endNum) throws Exception {
		if (partyId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxPartyContTypeInfoValue.S_PartyId).append(" = :partyId ");
		paraMap.put("partyId", Long.valueOf(partyId));
		IBOCmxPartyContTypeInfoValue[] iBOCmxPartyContTypeInfoValues = getCmxPartyDAO().queryPartyContTypeInfo(null, condition.toString(), paraMap, startNum, endNum);
		return iBOCmxPartyContTypeInfoValues;
	}

	public int queryPartyContTypeInfoCount(long partyId) throws Exception {
		if (partyId <= 0) {
			// 输入参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxPartyContTypeInfoValue.S_PartyId).append(" = :partyId ");
		paraMap.put("partyId", Long.valueOf(partyId));
		return getCmxPartyDAO().queryPartyContTypeInfoCount(condition.toString(), paraMap);
	}

	public void saveIndivPartyHobby(IBOCmxIndivPartyHobbyValue[] extValues) throws Exception {
		getCmxPartyDAO().saveIndivPartyHobby(extValues);
	}

	public void savePartyContTypeInfo(IBOCmxPartyContTypeInfoValue[] extValues) throws Exception {
		getCmxPartyDAO().savePartyContTypeInfo(extValues);
	}

	public IBOCmxPartyContTypeInfoValue[] queryContTypeInfoBycustId(long custId) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
		IContactValue[] contactValues = CmServiceFactory.getContactSV().queryCustContactsByCustId(custId, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(contactValues)) {
			if (contactValues.length == 1) {
				condition.append(" AND ").append(IContactValue.S_PartyId).append(" = ").append(contactValues[0].getPartyId());
			} else {
				condition.append(" AND PARTY_ID IN ( ");
				for (int i = 0; i < contactValues.length; i++) {
					if (i == contactValues.length - 1) {
						condition.append(contactValues[i].getPartyId()).append(" )");
					} else {
						condition.append(contactValues[i].getPartyId()).append(", ");
					}
				}
			}
		}
		return getCmxPartyDAO().queryPartyContTypeInfo(null, condition.toString(), null, -1, -1);
	}

	public void saveIndivPartyHobby(IBOCmxIndivPartyHobbyValue extValues) throws Exception {
		getCmxPartyDAO().savePartyHobby(extValues);
	}

	public IBOCmxIndivPartyHobbyValue[] queryPartyHobbyBypartyId(long partyId, int hobbyType, int[] bobbyId) throws Exception {
		if (partyId <= 0) {
			return null;
		}
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxIndivPartyHobbyValue.S_PartyId).append(" = :partyId ");
		paraMap.put("partyId", Long.valueOf(partyId));
		if (hobbyType >= 0) {
			condition.append(" AND ").append(IBOCmxIndivPartyHobbyValue.S_HobbyType).append(" = :hobbyType ");
			paraMap.put("hobbyType", Long.valueOf(hobbyType));
		}
		if (bobbyId.length > 0) {
			condition.append(" AND ").append(IBOCmxIndivPartyHobbyValue.S_HobbyId).append(" in ( ");
			for (int i = 0; i < bobbyId.length; i++) {
				if (i == 0) {
					condition.append(bobbyId[i]);
					continue;
				}
				condition.append(" , ").append(bobbyId[i]);
			}
			condition.append(" ) ");
		}
		IBOCmxIndivPartyHobbyValue[] iboCmxIndivPartyHobbyValues = getCmxPartyDAO().queryIndivPartyHobby(null, condition.toString(), paraMap, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(iboCmxIndivPartyHobbyValues)) {
			return iboCmxIndivPartyHobbyValues;
		}
		return null;
	}
}
