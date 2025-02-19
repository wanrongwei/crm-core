package com.asiainfo.crm.cm.dk.common.generated;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.FtpUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

public class AddressToCPR {

	private static final Log log = LogFactory.getLog(AddressToCPR.class);

	public void SendToCPR(String tenantId, String regionId) throws Exception {
		// 设置操作员信息
		UserInfoInterface userInfo = ServiceManager.getNewBlankUserInfo();
		userInfo.setTenantId(tenantId);
		userInfo.set("REGION_ID", regionId);
		ServiceManager.setServiceUserInfo(userInfo);

		ObjectFactory obj = new ObjectFactory();
		TelePhoneSubscriptionList list = obj.createTelePhoneSubscriptionList();
		TelephoneSubscriptionCollection collection = obj.createTelephoneSubscriptionCollection();
		// TelePhoneSubscriptionList
		list.setOrganizationName("sono Telenor");
		list.setSerialNumberIdentifier("Sono187.000000000000000");
		list.setLookupDateTime("2013-11-15 00:00:00");
		list.setSubscriptionListOfficialOnlyIndicator("TRUE");
		list.setSubscriptionListCompleteIndicator("FALSE");
		list.setTelephoneSubscriptionCollection(collection);
		// TelephoneSubscriptionCollection
		List<Object> tss = collection.getContent();
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		String now = TimeUtil.getYYYYMMDD(TimeUtil.addOrMinusMonth(new Date().getTime(), -1));
		Timestamp nowTime = CmCommonUtil.getSysDate();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String time = sdf.format(nowTime);
		IBOCmCustContactMediumValue[] values = service.queryCustContactMediumByDate(time);
		if (null != values && values.length > 0) {
			for (int i = 0; i < values.length; i++) {
				long addressId = values[i].getAddressId();
				long custId = values[i].getCustId();
				IAddressSV service1 = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
				address add = service1.getAddress(addressId, regionId);
				ICustomerValue value = null;
				try {
					value = service.queryCustomerByCustId(custId);
				} catch (Exception e) {
					log.info(e.getMessage(), e);
					e.printStackTrace();
					continue;
				}
				TelephoneSubscription ts = obj.createTelephoneSubscription();
				TelephoneSubscriber tsber = obj.createTelephoneSubscriber();
				PersonNameStructure pns = obj.createPersonNameStructure();
				Specification spe = obj.createSpecification();
				TelephoneSubscriptionAddress tsa = obj.createTelephoneSubscriptionAddress();
				SpecialInfo si = obj.createSpecialInfo();
				TransactionInfo ti = obj.createTransactionInfo();
				AddressComplete ac = obj.createAddressComplete();
				SecondaryPostalLabel spl = obj.createSecondaryPostalLabel();
				AddressAccess aa = obj.createAddressAccess();
				AddressPostal ap = obj.createAddressPostal();
				// TelephoneSubscription(TelephoneSubscriber,Specification)
				ts.setTelephoneSubscriber(tsber);
				ts.setSpecification(spe);
				// TelephoneSubscriber
				tsber.setAnonymousPrepaidIndicator("FALSE");
				tsber.setPersonNameStructure(pns);
				tsber.setTelephoneSubscriptionAddress(tsa);
				tsber.setTelephoneSubscriberProtectionCode("U");// N = Not secret, D = Deleted, H = confidential
																// (number) A = Address secret.
				// Specification
				spe.setDanishTelephoneNumberIdentifier(BigInteger.valueOf(36787445));
				spe.setSpecialInfo(si);
				spe.setTransactionInfo(ti);
				// PersonNameStructure
				if (null != value) {
					pns.setPersonGivenName(value.getFirstName());// first name
					pns.setPersonSurnameName(value.getLastName());// last name
				}
				// TelephoneSubscriptionAddress
				tsa.setAddressComplete(ac);
				tsa.setSecondaryPostalLabel(spl);
				// addressComplete
				ac.setAddressAccess(aa);
				ac.setAddressPostal(ap);
				// AddressAccess
				aa.setMunicipalityCode(BigInteger.valueOf(167));
				aa.setStreetCode(BigInteger.valueOf(945));
				aa.setStreetBuildingIdentifier(BigInteger.valueOf(1));
				// AddressPostal
				ap.setStreetName(add.getStreetName());
				ap.setStreetNameForAddressingName(add.getStreetName());
				ap.setStreetBuildingIdentifier(BigInteger.valueOf(1));
				// ap.setPostCodeIdentifier(BigInteger.valueOf(Integer.valueOf(add.getZipcode())));
				ap.setDistrictName(add.getApartment());
				// SpecialInfo
				si.setTelephoneServiceTypeCode("L");
				// TransactionInfo
				ti.setMovementChangeIndicator("TRUE");
				ti.setMovementTypeCode("SLET");
				ti.setMovementDate(BigInteger.valueOf(Integer.valueOf(now)));
				tss.add(ts);
			}
		}

		File file = new File("test.xml");
		// msh.marshal(list, file);
		FtpUtil fp = new FtpUtil("CM_FILE_FTP");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			fp.upload("address", fis, FtpUtil.BIN);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			e.printStackTrace();
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
	}
}
