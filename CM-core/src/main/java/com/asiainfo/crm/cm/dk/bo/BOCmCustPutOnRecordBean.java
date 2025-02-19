package com.asiainfo.crm.cm.dk.bo;


import java.sql.Timestamp;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmCustPutOnRecordValue;



public class BOCmCustPutOnRecordBean extends DataContainer implements DataContainerInterface,IBOCmCustPutOnRecordValue{

  private static String  m_boName = "com.asiainfo.crm.cm.dk.bo.BOCmCustPutOnRecord";



  public final static  String S_CustId = "CUST_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_Fornavne = "FORNAVNE";
  public final static  String S_Ext20 = "EXT20";
  public final static  String S_Remarks = "REMARKS";
  public final static  String S_Beskedtype = "BESKEDTYPE";
  public final static  String S_Navn = "NAVN";
  public final static  String S_Regionid = "REGIONID";
  public final static  String S_Ext15 = "EXT15";
  public final static  String S_Ext14 = "EXT14";
  public final static  String S_Ext17 = "EXT17";
  public final static  String S_Ext16 = "EXT16";
  public final static  String S_Ext11 = "EXT11";
  public final static  String S_Ext10 = "EXT10";
  public final static  String S_Ext13 = "EXT13";
  public final static  String S_Ext12 = "EXT12";
  public final static  String S_Ext19 = "EXT19";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_Ext18 = "EXT18";
  public final static  String S_Efternavn = "EFTERNAVN";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_BeskedId = "BESKED_ID";
  public final static  String S_Kode = "Kode";
  public final static  String S_Dato = "DATO";
  public final static  String S_Bynavn = "BYNAVN";
  public final static  String S_Foedselsdato = "FOEDSELSDATO";
  public final static  String S_AdresseBeskyttet = "ADRESSE_BESKYTTET";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_KreditadvarselAendretdato = "KREDITADVARSEL_AENDRETDATO";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_State = "STATE";
  public final static  String S_Cprstatus = "CPRSTATUS";
  public final static  String S_AdresseUdenlandsk = "ADRESSE_UDENLANDSK";
  public final static  String S_Stamkortnr = "STAMKORTNR";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_Postnr = "POSTNR";
  public final static  String S_Kreditadvarsel = "KREDITADVARSEL";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_Ext6 = "EXT6";
  public final static  String S_AdresseVejnr = "ADRESSE_VEJNR";
  public final static  String S_Ext7 = "EXT7";
  public final static  String S_Ext8 = "EXT8";
  public final static  String S_Ext9 = "EXT9";
  public final static  String S_HusnrFranr = "HUSNR_FRANR";
  public final static  String S_Vej = "VEJ";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOCmCustPutOnRecordBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此�??��??容�?��??��??�?�??��?�象类�??
   throw new AIException("Cannot reset ObjectType");
 }


  public void initCustId(long value){
     this.initProperty(S_CustId,new Long(value));
  }
  public  void setCustId(long value){
     this.set(S_CustId,new Long(value));
  }
  public  void setCustIdNull(){
     this.set(S_CustId,null);
  }

  public long getCustId(){
        return DataType.getAsLong(this.get(S_CustId));
  
  }
  public long getCustIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CustId));
      }

  public void initOrgId(long value){
     this.initProperty(S_OrgId,new Long(value));
  }
  public  void setOrgId(long value){
     this.set(S_OrgId,new Long(value));
  }
  public  void setOrgIdNull(){
     this.set(S_OrgId,null);
  }

  public long getOrgId(){
        return DataType.getAsLong(this.get(S_OrgId));
  
  }
  public long getOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OrgId));
      }

  public void initFornavne(String value){
     this.initProperty(S_Fornavne,value);
  }
  public  void setFornavne(String value){
     this.set(S_Fornavne,value);
  }
  public  void setFornavneNull(){
     this.set(S_Fornavne,null);
  }

  public String getFornavne(){
       return DataType.getAsString(this.get(S_Fornavne));
  
  }
  public String getFornavneInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Fornavne));
      }

  public void initExt20(String value){
     this.initProperty(S_Ext20,value);
  }
  public  void setExt20(String value){
     this.set(S_Ext20,value);
  }
  public  void setExt20Null(){
     this.set(S_Ext20,null);
  }

  public String getExt20(){
       return DataType.getAsString(this.get(S_Ext20));
  
  }
  public String getExt20InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext20));
      }

  public void initRemarks(String value){
     this.initProperty(S_Remarks,value);
  }
  public  void setRemarks(String value){
     this.set(S_Remarks,value);
  }
  public  void setRemarksNull(){
     this.set(S_Remarks,null);
  }

  public String getRemarks(){
       return DataType.getAsString(this.get(S_Remarks));
  
  }
  public String getRemarksInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Remarks));
      }

  public void initBeskedtype(String value){
     this.initProperty(S_Beskedtype,value);
  }
  public  void setBeskedtype(String value){
     this.set(S_Beskedtype,value);
  }
  public  void setBeskedtypeNull(){
     this.set(S_Beskedtype,null);
  }

  public String getBeskedtype(){
       return DataType.getAsString(this.get(S_Beskedtype));
  
  }
  public String getBeskedtypeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Beskedtype));
      }

  public void initNavn(String value){
     this.initProperty(S_Navn,value);
  }
  public  void setNavn(String value){
     this.set(S_Navn,value);
  }
  public  void setNavnNull(){
     this.set(S_Navn,null);
  }

  public String getNavn(){
       return DataType.getAsString(this.get(S_Navn));
  
  }
  public String getNavnInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Navn));
      }

  public void initRegionid(String value){
     this.initProperty(S_Regionid,value);
  }
  public  void setRegionid(String value){
     this.set(S_Regionid,value);
  }
  public  void setRegionidNull(){
     this.set(S_Regionid,null);
  }

  public String getRegionid(){
       return DataType.getAsString(this.get(S_Regionid));
  
  }
  public String getRegionidInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Regionid));
      }

  public void initExt15(String value){
     this.initProperty(S_Ext15,value);
  }
  public  void setExt15(String value){
     this.set(S_Ext15,value);
  }
  public  void setExt15Null(){
     this.set(S_Ext15,null);
  }

  public String getExt15(){
       return DataType.getAsString(this.get(S_Ext15));
  
  }
  public String getExt15InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext15));
      }

  public void initExt14(String value){
     this.initProperty(S_Ext14,value);
  }
  public  void setExt14(String value){
     this.set(S_Ext14,value);
  }
  public  void setExt14Null(){
     this.set(S_Ext14,null);
  }

  public String getExt14(){
       return DataType.getAsString(this.get(S_Ext14));
  
  }
  public String getExt14InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext14));
      }

  public void initExt17(String value){
     this.initProperty(S_Ext17,value);
  }
  public  void setExt17(String value){
     this.set(S_Ext17,value);
  }
  public  void setExt17Null(){
     this.set(S_Ext17,null);
  }

  public String getExt17(){
       return DataType.getAsString(this.get(S_Ext17));
  
  }
  public String getExt17InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext17));
      }

  public void initExt16(String value){
     this.initProperty(S_Ext16,value);
  }
  public  void setExt16(String value){
     this.set(S_Ext16,value);
  }
  public  void setExt16Null(){
     this.set(S_Ext16,null);
  }

  public String getExt16(){
       return DataType.getAsString(this.get(S_Ext16));
  
  }
  public String getExt16InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext16));
      }

  public void initExt11(String value){
     this.initProperty(S_Ext11,value);
  }
  public  void setExt11(String value){
     this.set(S_Ext11,value);
  }
  public  void setExt11Null(){
     this.set(S_Ext11,null);
  }

  public String getExt11(){
       return DataType.getAsString(this.get(S_Ext11));
  
  }
  public String getExt11InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext11));
      }

  public void initExt10(String value){
     this.initProperty(S_Ext10,value);
  }
  public  void setExt10(String value){
     this.set(S_Ext10,value);
  }
  public  void setExt10Null(){
     this.set(S_Ext10,null);
  }

  public String getExt10(){
       return DataType.getAsString(this.get(S_Ext10));
  
  }
  public String getExt10InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext10));
      }

  public void initExt13(String value){
     this.initProperty(S_Ext13,value);
  }
  public  void setExt13(String value){
     this.set(S_Ext13,value);
  }
  public  void setExt13Null(){
     this.set(S_Ext13,null);
  }

  public String getExt13(){
       return DataType.getAsString(this.get(S_Ext13));
  
  }
  public String getExt13InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext13));
      }

  public void initExt12(String value){
     this.initProperty(S_Ext12,value);
  }
  public  void setExt12(String value){
     this.set(S_Ext12,value);
  }
  public  void setExt12Null(){
     this.set(S_Ext12,null);
  }

  public String getExt12(){
       return DataType.getAsString(this.get(S_Ext12));
  
  }
  public String getExt12InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext12));
      }

  public void initExt19(String value){
     this.initProperty(S_Ext19,value);
  }
  public  void setExt19(String value){
     this.set(S_Ext19,value);
  }
  public  void setExt19Null(){
     this.set(S_Ext19,null);
  }

  public String getExt19(){
       return DataType.getAsString(this.get(S_Ext19));
  
  }
  public String getExt19InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext19));
      }

  public void initExpireDate(Timestamp value){
     this.initProperty(S_ExpireDate,value);
  }
  public  void setExpireDate(Timestamp value){
     this.set(S_ExpireDate,value);
  }
  public  void setExpireDateNull(){
     this.set(S_ExpireDate,null);
  }

  public Timestamp getExpireDate(){
        return DataType.getAsDateTime(this.get(S_ExpireDate));
  
  }
  public Timestamp getExpireDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_ExpireDate));
      }

  public void initExt18(String value){
     this.initProperty(S_Ext18,value);
  }
  public  void setExt18(String value){
     this.set(S_Ext18,value);
  }
  public  void setExt18Null(){
     this.set(S_Ext18,null);
  }

  public String getExt18(){
       return DataType.getAsString(this.get(S_Ext18));
  
  }
  public String getExt18InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext18));
      }

  public void initEfternavn(String value){
     this.initProperty(S_Efternavn,value);
  }
  public  void setEfternavn(String value){
     this.set(S_Efternavn,value);
  }
  public  void setEfternavnNull(){
     this.set(S_Efternavn,null);
  }

  public String getEfternavn(){
       return DataType.getAsString(this.get(S_Efternavn));
  
  }
  public String getEfternavnInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Efternavn));
      }

  public void initDoneDate(Timestamp value){
     this.initProperty(S_DoneDate,value);
  }
  public  void setDoneDate(Timestamp value){
     this.set(S_DoneDate,value);
  }
  public  void setDoneDateNull(){
     this.set(S_DoneDate,null);
  }

  public Timestamp getDoneDate(){
        return DataType.getAsDateTime(this.get(S_DoneDate));
  
  }
  public Timestamp getDoneDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_DoneDate));
      }

  public void initBeskedId(String value){
     this.initProperty(S_BeskedId,value);
  }
  public  void setBeskedId(String value){
     this.set(S_BeskedId,value);
  }
  public  void setBeskedIdNull(){
     this.set(S_BeskedId,null);
  }

  public String getBeskedId(){
       return DataType.getAsString(this.get(S_BeskedId));
  
  }
  public String getBeskedIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_BeskedId));
      }

  public void initKode(String value){
     this.initProperty(S_Kode,value);
  }
  public  void setKode(String value){
     this.set(S_Kode,value);
  }
  public  void setKodeNull(){
     this.set(S_Kode,null);
  }

  public String getKode(){
       return DataType.getAsString(this.get(S_Kode));
  
  }
  public String getKodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Kode));
      }

  public void initDato(String value){
     this.initProperty(S_Dato,value);
  }
  public  void setDato(String value){
     this.set(S_Dato,value);
  }
  public  void setDatoNull(){
     this.set(S_Dato,null);
  }

  public String getDato(){
       return DataType.getAsString(this.get(S_Dato));
  
  }
  public String getDatoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Dato));
      }

  public void initBynavn(String value){
     this.initProperty(S_Bynavn,value);
  }
  public  void setBynavn(String value){
     this.set(S_Bynavn,value);
  }
  public  void setBynavnNull(){
     this.set(S_Bynavn,null);
  }

  public String getBynavn(){
       return DataType.getAsString(this.get(S_Bynavn));
  
  }
  public String getBynavnInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Bynavn));
      }

  public void initFoedselsdato(String value){
     this.initProperty(S_Foedselsdato,value);
  }
  public  void setFoedselsdato(String value){
     this.set(S_Foedselsdato,value);
  }
  public  void setFoedselsdatoNull(){
     this.set(S_Foedselsdato,null);
  }

  public String getFoedselsdato(){
       return DataType.getAsString(this.get(S_Foedselsdato));
  
  }
  public String getFoedselsdatoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Foedselsdato));
      }

  public void initAdresseBeskyttet(String value){
     this.initProperty(S_AdresseBeskyttet,value);
  }
  public  void setAdresseBeskyttet(String value){
     this.set(S_AdresseBeskyttet,value);
  }
  public  void setAdresseBeskyttetNull(){
     this.set(S_AdresseBeskyttet,null);
  }

  public String getAdresseBeskyttet(){
       return DataType.getAsString(this.get(S_AdresseBeskyttet));
  
  }
  public String getAdresseBeskyttetInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AdresseBeskyttet));
      }

  public void initCreateDate(Timestamp value){
     this.initProperty(S_CreateDate,value);
  }
  public  void setCreateDate(Timestamp value){
     this.set(S_CreateDate,value);
  }
  public  void setCreateDateNull(){
     this.set(S_CreateDate,null);
  }

  public Timestamp getCreateDate(){
        return DataType.getAsDateTime(this.get(S_CreateDate));
  
  }
  public Timestamp getCreateDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_CreateDate));
      }

  public void initEffectiveDate(Timestamp value){
     this.initProperty(S_EffectiveDate,value);
  }
  public  void setEffectiveDate(Timestamp value){
     this.set(S_EffectiveDate,value);
  }
  public  void setEffectiveDateNull(){
     this.set(S_EffectiveDate,null);
  }

  public Timestamp getEffectiveDate(){
        return DataType.getAsDateTime(this.get(S_EffectiveDate));
  
  }
  public Timestamp getEffectiveDateInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_EffectiveDate));
      }

  public void initKreditadvarselAendretdato(String value){
     this.initProperty(S_KreditadvarselAendretdato,value);
  }
  public  void setKreditadvarselAendretdato(String value){
     this.set(S_KreditadvarselAendretdato,value);
  }
  public  void setKreditadvarselAendretdatoNull(){
     this.set(S_KreditadvarselAendretdato,null);
  }

  public String getKreditadvarselAendretdato(){
       return DataType.getAsString(this.get(S_KreditadvarselAendretdato));
  
  }
  public String getKreditadvarselAendretdatoInitialValue(){
        return DataType.getAsString(this.getOldObj(S_KreditadvarselAendretdato));
      }

  public void initOpId(long value){
     this.initProperty(S_OpId,new Long(value));
  }
  public  void setOpId(long value){
     this.set(S_OpId,new Long(value));
  }
  public  void setOpIdNull(){
     this.set(S_OpId,null);
  }

  public long getOpId(){
        return DataType.getAsLong(this.get(S_OpId));
  
  }
  public long getOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_OpId));
      }

  public void initState(String value){
     this.initProperty(S_State,value);
  }
  public  void setState(String value){
     this.set(S_State,value);
  }
  public  void setStateNull(){
     this.set(S_State,null);
  }

  public String getState(){
       return DataType.getAsString(this.get(S_State));
  
  }
  public String getStateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_State));
      }

  public void initCprstatus(String value){
     this.initProperty(S_Cprstatus,value);
  }
  public  void setCprstatus(String value){
     this.set(S_Cprstatus,value);
  }
  public  void setCprstatusNull(){
     this.set(S_Cprstatus,null);
  }

  public String getCprstatus(){
       return DataType.getAsString(this.get(S_Cprstatus));
  
  }
  public String getCprstatusInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Cprstatus));
      }

  public void initAdresseUdenlandsk(String value){
     this.initProperty(S_AdresseUdenlandsk,value);
  }
  public  void setAdresseUdenlandsk(String value){
     this.set(S_AdresseUdenlandsk,value);
  }
  public  void setAdresseUdenlandskNull(){
     this.set(S_AdresseUdenlandsk,null);
  }

  public String getAdresseUdenlandsk(){
       return DataType.getAsString(this.get(S_AdresseUdenlandsk));
  
  }
  public String getAdresseUdenlandskInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AdresseUdenlandsk));
      }

  public void initStamkortnr(String value){
     this.initProperty(S_Stamkortnr,value);
  }
  public  void setStamkortnr(String value){
     this.set(S_Stamkortnr,value);
  }
  public  void setStamkortnrNull(){
     this.set(S_Stamkortnr,null);
  }

  public String getStamkortnr(){
       return DataType.getAsString(this.get(S_Stamkortnr));
  
  }
  public String getStamkortnrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Stamkortnr));
      }

  public void initDoneCode(long value){
     this.initProperty(S_DoneCode,new Long(value));
  }
  public  void setDoneCode(long value){
     this.set(S_DoneCode,new Long(value));
  }
  public  void setDoneCodeNull(){
     this.set(S_DoneCode,null);
  }

  public long getDoneCode(){
        return DataType.getAsLong(this.get(S_DoneCode));
  
  }
  public long getDoneCodeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_DoneCode));
      }

  public void initPostnr(String value){
     this.initProperty(S_Postnr,value);
  }
  public  void setPostnr(String value){
     this.set(S_Postnr,value);
  }
  public  void setPostnrNull(){
     this.set(S_Postnr,null);
  }

  public String getPostnr(){
       return DataType.getAsString(this.get(S_Postnr));
  
  }
  public String getPostnrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Postnr));
      }

  public void initKreditadvarsel(String value){
     this.initProperty(S_Kreditadvarsel,value);
  }
  public  void setKreditadvarsel(String value){
     this.set(S_Kreditadvarsel,value);
  }
  public  void setKreditadvarselNull(){
     this.set(S_Kreditadvarsel,null);
  }

  public String getKreditadvarsel(){
       return DataType.getAsString(this.get(S_Kreditadvarsel));
  
  }
  public String getKreditadvarselInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Kreditadvarsel));
      }

  public void initExt1(String value){
     this.initProperty(S_Ext1,value);
  }
  public  void setExt1(String value){
     this.set(S_Ext1,value);
  }
  public  void setExt1Null(){
     this.set(S_Ext1,null);
  }

  public String getExt1(){
       return DataType.getAsString(this.get(S_Ext1));
  
  }
  public String getExt1InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext1));
      }

  public void initExt2(String value){
     this.initProperty(S_Ext2,value);
  }
  public  void setExt2(String value){
     this.set(S_Ext2,value);
  }
  public  void setExt2Null(){
     this.set(S_Ext2,null);
  }

  public String getExt2(){
       return DataType.getAsString(this.get(S_Ext2));
  
  }
  public String getExt2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext2));
      }

  public void initExt3(String value){
     this.initProperty(S_Ext3,value);
  }
  public  void setExt3(String value){
     this.set(S_Ext3,value);
  }
  public  void setExt3Null(){
     this.set(S_Ext3,null);
  }

  public String getExt3(){
       return DataType.getAsString(this.get(S_Ext3));
  
  }
  public String getExt3InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext3));
      }

  public void initExt4(String value){
     this.initProperty(S_Ext4,value);
  }
  public  void setExt4(String value){
     this.set(S_Ext4,value);
  }
  public  void setExt4Null(){
     this.set(S_Ext4,null);
  }

  public String getExt4(){
       return DataType.getAsString(this.get(S_Ext4));
  
  }
  public String getExt4InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext4));
      }

  public void initExt5(String value){
     this.initProperty(S_Ext5,value);
  }
  public  void setExt5(String value){
     this.set(S_Ext5,value);
  }
  public  void setExt5Null(){
     this.set(S_Ext5,null);
  }

  public String getExt5(){
       return DataType.getAsString(this.get(S_Ext5));
  
  }
  public String getExt5InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext5));
      }

  public void initExt6(String value){
     this.initProperty(S_Ext6,value);
  }
  public  void setExt6(String value){
     this.set(S_Ext6,value);
  }
  public  void setExt6Null(){
     this.set(S_Ext6,null);
  }

  public String getExt6(){
       return DataType.getAsString(this.get(S_Ext6));
  
  }
  public String getExt6InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext6));
      }

  public void initAdresseVejnr(String value){
     this.initProperty(S_AdresseVejnr,value);
  }
  public  void setAdresseVejnr(String value){
     this.set(S_AdresseVejnr,value);
  }
  public  void setAdresseVejnrNull(){
     this.set(S_AdresseVejnr,null);
  }

  public String getAdresseVejnr(){
       return DataType.getAsString(this.get(S_AdresseVejnr));
  
  }
  public String getAdresseVejnrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AdresseVejnr));
      }

  public void initExt7(String value){
     this.initProperty(S_Ext7,value);
  }
  public  void setExt7(String value){
     this.set(S_Ext7,value);
  }
  public  void setExt7Null(){
     this.set(S_Ext7,null);
  }

  public String getExt7(){
       return DataType.getAsString(this.get(S_Ext7));
  
  }
  public String getExt7InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext7));
      }

  public void initExt8(String value){
     this.initProperty(S_Ext8,value);
  }
  public  void setExt8(String value){
     this.set(S_Ext8,value);
  }
  public  void setExt8Null(){
     this.set(S_Ext8,null);
  }

  public String getExt8(){
       return DataType.getAsString(this.get(S_Ext8));
  
  }
  public String getExt8InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext8));
      }

  public void initExt9(String value){
     this.initProperty(S_Ext9,value);
  }
  public  void setExt9(String value){
     this.set(S_Ext9,value);
  }
  public  void setExt9Null(){
     this.set(S_Ext9,null);
  }

  public String getExt9(){
       return DataType.getAsString(this.get(S_Ext9));
  
  }
  public String getExt9InitialValue(){
        return DataType.getAsString(this.getOldObj(S_Ext9));
      }

  public void initHusnrFranr(String value){
     this.initProperty(S_HusnrFranr,value);
  }
  public  void setHusnrFranr(String value){
     this.set(S_HusnrFranr,value);
  }
  public  void setHusnrFranrNull(){
     this.set(S_HusnrFranr,null);
  }

  public String getHusnrFranr(){
       return DataType.getAsString(this.get(S_HusnrFranr));
  
  }
  public String getHusnrFranrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_HusnrFranr));
      }

  public void initVej(String value){
     this.initProperty(S_Vej,value);
  }
  public  void setVej(String value){
     this.set(S_Vej,value);
  }
  public  void setVejNull(){
     this.set(S_Vej,null);
  }

  public String getVej(){
       return DataType.getAsString(this.get(S_Vej));
  
  }
  public String getVejInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Vej));
      }


 
 }

