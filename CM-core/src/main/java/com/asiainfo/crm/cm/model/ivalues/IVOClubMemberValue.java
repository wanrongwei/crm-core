/**
 * 
 */
package com.asiainfo.crm.cm.model.ivalues;


/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-1-8 下午9:39:43
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-1-8     Xiaohu           v1.0.0               修改原因<br>
 */
public interface IVOClubMemberValue extends IValueObject {

	long getClubId();

	IClubValue getClub() throws Exception;

	IClubMemberValue getClubMember() throws Exception;

	ICustomerValue getCustomer() throws Exception;

	long getMemberId();

	IPartyValue getParty() throws Exception;

	long setClub(IClubValue clubValue) throws Exception;

	long setClubMember(IClubMemberValue clubMemberValue) throws Exception;

	long setCustomer(ICustomerValue customerValue) throws Exception;

	long setParty(IPartyValue partyValue) throws Exception;

	IClubMemberCardValue[] getClubMemberCards() throws Exception;

	long setClubMemberCard(IClubMemberCardValue memberCardValue) throws Exception;

	IClubMemberCardValue removeClubMemberCard(IClubMemberCardValue memberCardValue) throws Exception;

	IClubServiceAdjustValue[] getClubServiceAdjusts() throws Exception;

	long setClubServiceAdjust(IClubServiceAdjustValue serviceAdjustValue) throws Exception;

	IClubServiceAdjustValue removeClubServiceAdjust(IClubServiceAdjustValue serviceAdjustValue) throws Exception;

	IClubServiceRecValue[] getClubServiceRecs() throws Exception;

	long setClubServiceRec(IClubServiceRecValue serviceRecValue) throws Exception;

	IClubServiceRecValue removeClubServiceRec(IClubServiceRecValue serviceRecValue) throws Exception;

	IClubActionRecValue[] getClubActionRecs() throws Exception;

	long setClubActionRec(IClubActionRecValue actionRecValue) throws Exception;

	IClubActionRecValue removeClubActionRec(IClubActionRecValue actionRecValue) throws Exception;

	boolean hasActivityRecords() throws Exception;

	boolean hasMemberCards() throws Exception;

	boolean hasServiceRecords() throws Exception;

	boolean hasServiceAdjusts() throws Exception;
}
