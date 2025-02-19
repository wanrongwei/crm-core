package  com.asiainfo.crm.cm.dk.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOCmCustPutOnRecordValue extends DataStructInterface{

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


public long getCustId();

public long getOrgId();

public String getFornavne();

public String getExt20();

public String getRemarks();

public String getBeskedtype();

public String getNavn();

public String getRegionid();

public String getExt15();

public String getExt14();

public String getExt17();

public String getExt16();

public String getExt11();

public String getExt10();

public String getExt13();

public String getExt12();

public String getExt19();

public Timestamp getExpireDate();

public String getExt18();

public String getEfternavn();

public Timestamp getDoneDate();

public String getBeskedId();

public String getKode();

public String getDato();

public String getBynavn();

public String getFoedselsdato();

public String getAdresseBeskyttet();

public Timestamp getCreateDate();

public Timestamp getEffectiveDate();

public String getKreditadvarselAendretdato();

public long getOpId();

public String getState();

public String getCprstatus();

public String getAdresseUdenlandsk();

public String getStamkortnr();

public long getDoneCode();

public String getPostnr();

public String getKreditadvarsel();

public String getExt1();

public String getExt2();

public String getExt3();

public String getExt4();

public String getExt5();

public String getExt6();

public String getAdresseVejnr();

public String getExt7();

public String getExt8();

public String getExt9();

public String getHusnrFranr();

public String getVej();


public  void setCustId(long value);

public  void setOrgId(long value);

public  void setFornavne(String value);

public  void setExt20(String value);

public  void setRemarks(String value);

public  void setBeskedtype(String value);

public  void setNavn(String value);

public  void setRegionid(String value);

public  void setExt15(String value);

public  void setExt14(String value);

public  void setExt17(String value);

public  void setExt16(String value);

public  void setExt11(String value);

public  void setExt10(String value);

public  void setExt13(String value);

public  void setExt12(String value);

public  void setExt19(String value);

public  void setExpireDate(Timestamp value);

public  void setExt18(String value);

public  void setEfternavn(String value);

public  void setDoneDate(Timestamp value);

public  void setBeskedId(String value);

public  void setKode(String value);

public  void setDato(String value);

public  void setBynavn(String value);

public  void setFoedselsdato(String value);

public  void setAdresseBeskyttet(String value);

public  void setCreateDate(Timestamp value);

public  void setEffectiveDate(Timestamp value);

public  void setKreditadvarselAendretdato(String value);

public  void setOpId(long value);

public  void setState(String value);

public  void setCprstatus(String value);

public  void setAdresseUdenlandsk(String value);

public  void setStamkortnr(String value);

public  void setDoneCode(long value);

public  void setPostnr(String value);

public  void setKreditadvarsel(String value);

public  void setExt1(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setExt4(String value);

public  void setExt5(String value);

public  void setExt6(String value);

public  void setAdresseVejnr(String value);

public  void setExt7(String value);

public  void setExt8(String value);

public  void setExt9(String value);

public  void setHusnrFranr(String value);

public  void setVej(String value);
}
