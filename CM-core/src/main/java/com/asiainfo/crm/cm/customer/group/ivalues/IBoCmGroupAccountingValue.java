package com.asiainfo.crm.cm.customer.group.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBoCmGroupAccountingValue extends DataStructInterface{

  public final static  String S_CustId = "CUST_ID";
  public final static  String S_OrgId = "ORG_ID";
  public final static  String S_DegreeOfLiquidity2 = "DEGREE_OF_LIQUIDITY2";
  public final static  String S_FixedAssetsTurnoverRate = "FIXED_ASSETS_TURNOVER_RATE";
  public final static  String S_SafetyMargin = "SAFETY_MARGIN";
  public final static  String S_FinancialRevenue = "FINANCIAL_REVENUE";
  public final static  String S_Mortgages = "MORTGAGES";
  public final static  String S_ListedOnStockExchange = "LISTED_ON_STOCK_EXCHANGE";
  public final static  String S_CreateOrgId = "CREATE_ORG_ID";
  public final static  String S_ExpireDate = "EXPIRE_DATE";
  public final static  String S_Equity = "EQUITY";
  public final static  String S_RiscGroup = "RISC_GROUP";
  public final static  String S_AssetsTurnoverRate = "ASSETS_TURNOVER_RATE";
  public final static  String S_DoneDate = "DONE_DATE";
  public final static  String S_NetProfitYearly = "NET_PROFIT_YEARLY";
  public final static  String S_Revenue = "REVENUE";
  public final static  String S_ImmatConstructionActivities = "IMMAT_CONSTRUCTION_ACTIVITIES";
  public final static  String S_Earnings = "EARNINGS";
  public final static  String S_ShortTermDebt = "SHORT_TERM_DEBT";
  public final static  String S_MatConstructionActivities = "MAT_CONSTRUCTION_ACTIVITIES";
  public final static  String S_SubordinaryLoanCapital = "SUBORDINARY_LOAN_CAPITAL";
  public final static  String S_Cash = "CASH";
  public final static  String S_StatusBalance = "STATUS_BALANCE";
  public final static  String S_ExtraordinaryItems = "EXTRAORDINARY_ITEMS";
  public final static  String S_CreateDate = "CREATE_DATE";
  public final static  String S_ProfitBeforeTax = "PROFIT_BEFORE_TAX";
  public final static  String S_DegreeOfLiquidityi = "DEGREE_OF_LIQUIDITYI";
  public final static  String S_Employees = "EMPLOYEES";
  public final static  String S_FinanceItems = "FINANCE_ITEMS";
  public final static  String S_SolvencyAtio = "SOLVENCY_ATIO";
  public final static  String S_LongTermDebt = "LONG_TERM_DEBT";
  public final static  String S_SaleryGrade = "SALERY_GRADE";
  public final static  String S_FiscalYear = "FISCAL_YEAR";
  public final static  String S_LandAndBuildings = "LAND_AND_BUILDINGS";
  public final static  String S_EffectiveDate = "EFFECTIVE_DATE";
  public final static  String S_RegionId = "REGION_ID";
  public final static  String S_CreateOpId = "CREATE_OP_ID";
  public final static  String S_GrossProfit = "GROSS_PROFIT";
  public final static  String S_OrdResPerEmployee = "ORD_RES_PER_EMPLOYEE";
  public final static  String S_FixedAssetsPerEmployee = "FIXED_ASSETS_PER_EMPLOYEE";
  public final static  String S_Coverage = "COVERAGE";
  public final static  String S_OpId = "OP_ID";
  public final static  String S_Provisions = "PROVISIONS";
  public final static  String S_CapacityGrade = "CAPACITY_GRADE";
  public final static  String S_State = "STATE";
  public final static  String S_OperatingMargin = "OPERATING_MARGIN";
  public final static  String S_TradeCreditors = "TRADE_CREDITORS";
  public final static  String S_CreditPeriodCredit = "CREDIT_PERIOD_CREDIT";
  public final static  String S_ReturnOnAssets = "RETURN_ON_ASSETS";
  public final static  String S_CreditMaxCurrency = "CREDIT_MAX_CURRENCY";
  public final static  String S_FixedSsets = "FIXED_SSETS";
  public final static  String S_PublicationDate = "PUBLICATION_DATE";
  public final static  String S_DoneCode = "DONE_CODE";
  public final static  String S_CreditMaxAmount = "CREDIT_MAX_AMOUNT";
  public final static  String S_NetGainsPerEmployee = "NET_GAINS_PER_EMPLOYEE";
  public final static  String S_AccountRemark = "ACCOUNT_REMARK";
  public final static  String S_FinancialExpenditure = "FINANCIAL_EXPENDITURE";
  public final static  String S_PrimResPerEmployee = "PRIM_RES_PER_EMPLOYEE";
  public final static  String S_Ext1 = "EXT1";
  public final static  String S_StaffCosts = "STAFF_COSTS";
  public final static  String S_Ext2 = "EXT2";
  public final static  String S_Ext3 = "EXT3";
  public final static  String S_Ext4 = "EXT4";
  public final static  String S_CapitalGrade = "CAPITAL_GRADE";
  public final static  String S_Ext5 = "EXT5";
  public final static  String S_OperatingProfit = "OPERATING_PROFIT";
  public final static  String S_RatingCode = "RATING_CODE";
  public final static  String S_CurrentAssets = "CURRENT_ASSETS";
  public final static  String S_LastYearEmployees = "LAST_YEAR_EMPLOYEES";
  public final static  String S_ZeroTurnover = "ZERO_TURNOVER";
  public final static  String S_Depreciation = "DEPRECIATION";


public long getCustId();

public long getOrgId();

public String getDegreeOfLiquidity2();

public String getFixedAssetsTurnoverRate();

public String getSafetyMargin();

public String getFinancialRevenue();

public String getMortgages();

public String getListedOnStockExchange();

public long getCreateOrgId();

public Timestamp getExpireDate();

public String getEquity();

public String getRiscGroup();

public String getAssetsTurnoverRate();

public Timestamp getDoneDate();

public String getNetProfitYearly();

public String getRevenue();

public String getImmatConstructionActivities();

public String getEarnings();

public String getShortTermDebt();

public String getMatConstructionActivities();

public String getSubordinaryLoanCapital();

public String getCash();

public String getStatusBalance();

public String getExtraordinaryItems();

public Timestamp getCreateDate();

public String getProfitBeforeTax();

public String getDegreeOfLiquidityi();

public String getEmployees();

public String getFinanceItems();

public String getSolvencyAtio();

public String getLongTermDebt();

public String getSaleryGrade();

public String getFiscalYear();

public String getLandAndBuildings();

public Timestamp getEffectiveDate();

public String getRegionId();

public long getCreateOpId();

public String getGrossProfit();

public String getOrdResPerEmployee();

public String getFixedAssetsPerEmployee();

public String getCoverage();

public long getOpId();

public String getProvisions();

public String getCapacityGrade();

public String getState();

public String getOperatingMargin();

public String getTradeCreditors();

public String getCreditPeriodCredit();

public String getReturnOnAssets();

public String getCreditMaxCurrency();

public String getFixedSsets();

public String getPublicationDate();

public long getDoneCode();

public String getCreditMaxAmount();

public String getNetGainsPerEmployee();

public String getAccountRemark();

public String getFinancialExpenditure();

public String getPrimResPerEmployee();

public String getExt1();

public String getStaffCosts();

public String getExt2();

public String getExt3();

public String getExt4();

public String getCapitalGrade();

public String getExt5();

public String getOperatingProfit();

public String getRatingCode();

public String getCurrentAssets();

public long getLastYearEmployees();

public String getZeroTurnover();

public String getDepreciation();


public  void setCustId(long value);

public  void setOrgId(long value);

public  void setDegreeOfLiquidity2(String value);

public  void setFixedAssetsTurnoverRate(String value);

public  void setSafetyMargin(String value);

public  void setFinancialRevenue(String value);

public  void setMortgages(String value);

public  void setListedOnStockExchange(String value);

public  void setCreateOrgId(long value);

public  void setExpireDate(Timestamp value);

public  void setEquity(String value);

public  void setRiscGroup(String value);

public  void setAssetsTurnoverRate(String value);

public  void setDoneDate(Timestamp value);

public  void setNetProfitYearly(String value);

public  void setRevenue(String value);

public  void setImmatConstructionActivities(String value);

public  void setEarnings(String value);

public  void setShortTermDebt(String value);

public  void setMatConstructionActivities(String value);

public  void setSubordinaryLoanCapital(String value);

public  void setCash(String value);

public  void setStatusBalance(String value);

public  void setExtraordinaryItems(String value);

public  void setCreateDate(Timestamp value);

public  void setProfitBeforeTax(String value);

public  void setDegreeOfLiquidityi(String value);

public  void setEmployees(String value);

public  void setFinanceItems(String value);

public  void setSolvencyAtio(String value);

public  void setLongTermDebt(String value);

public  void setSaleryGrade(String value);

public  void setFiscalYear(String value);

public  void setLandAndBuildings(String value);

public  void setEffectiveDate(Timestamp value);

public  void setRegionId(String value);

public  void setCreateOpId(long value);

public  void setGrossProfit(String value);

public  void setOrdResPerEmployee(String value);

public  void setFixedAssetsPerEmployee(String value);

public  void setCoverage(String value);

public  void setOpId(long value);

public  void setProvisions(String value);

public  void setCapacityGrade(String value);

public  void setState(String value);

public  void setOperatingMargin(String value);

public  void setTradeCreditors(String value);

public  void setCreditPeriodCredit(String value);

public  void setReturnOnAssets(String value);

public  void setCreditMaxCurrency(String value);

public  void setFixedSsets(String value);

public  void setPublicationDate(String value);

public  void setDoneCode(long value);

public  void setCreditMaxAmount(String value);

public  void setNetGainsPerEmployee(String value);

public  void setAccountRemark(String value);

public  void setFinancialExpenditure(String value);

public  void setPrimResPerEmployee(String value);

public  void setExt1(String value);

public  void setStaffCosts(String value);

public  void setExt2(String value);

public  void setExt3(String value);

public  void setExt4(String value);

public  void setCapitalGrade(String value);

public  void setExt5(String value);

public  void setOperatingProfit(String value);

public  void setRatingCode(String value);

public  void setCurrentAssets(String value);

public  void setLastYearEmployees(long value);

public  void setZeroTurnover(String value);

public  void setDepreciation(String value);
}
