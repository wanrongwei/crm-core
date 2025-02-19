package com.asiainfo.crm.cm.customer.group.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BoCmGroupAccountingBean extends DataContainer implements DataContainerInterface,IBoCmGroupAccountingValue{

  private static String  m_boName = "com.asiainfo.crm.cm.customer.group.bo.BoCmGroupAccounting";



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

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BoCmGroupAccountingBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //此种数据容器不能重置业务对象类型
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

  public void initDegreeOfLiquidity2(String value){
     this.initProperty(S_DegreeOfLiquidity2,value);
  }
  public  void setDegreeOfLiquidity2(String value){
     this.set(S_DegreeOfLiquidity2,value);
  }
  public  void setDegreeOfLiquidity2Null(){
     this.set(S_DegreeOfLiquidity2,null);
  }

  public String getDegreeOfLiquidity2(){
       return DataType.getAsString(this.get(S_DegreeOfLiquidity2));
  
  }
  public String getDegreeOfLiquidity2InitialValue(){
        return DataType.getAsString(this.getOldObj(S_DegreeOfLiquidity2));
      }

  public void initFixedAssetsTurnoverRate(String value){
     this.initProperty(S_FixedAssetsTurnoverRate,value);
  }
  public  void setFixedAssetsTurnoverRate(String value){
     this.set(S_FixedAssetsTurnoverRate,value);
  }
  public  void setFixedAssetsTurnoverRateNull(){
     this.set(S_FixedAssetsTurnoverRate,null);
  }

  public String getFixedAssetsTurnoverRate(){
       return DataType.getAsString(this.get(S_FixedAssetsTurnoverRate));
  
  }
  public String getFixedAssetsTurnoverRateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FixedAssetsTurnoverRate));
      }

  public void initSafetyMargin(String value){
     this.initProperty(S_SafetyMargin,value);
  }
  public  void setSafetyMargin(String value){
     this.set(S_SafetyMargin,value);
  }
  public  void setSafetyMarginNull(){
     this.set(S_SafetyMargin,null);
  }

  public String getSafetyMargin(){
       return DataType.getAsString(this.get(S_SafetyMargin));
  
  }
  public String getSafetyMarginInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SafetyMargin));
      }

  public void initFinancialRevenue(String value){
     this.initProperty(S_FinancialRevenue,value);
  }
  public  void setFinancialRevenue(String value){
     this.set(S_FinancialRevenue,value);
  }
  public  void setFinancialRevenueNull(){
     this.set(S_FinancialRevenue,null);
  }

  public String getFinancialRevenue(){
       return DataType.getAsString(this.get(S_FinancialRevenue));
  
  }
  public String getFinancialRevenueInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FinancialRevenue));
      }

  public void initMortgages(String value){
     this.initProperty(S_Mortgages,value);
  }
  public  void setMortgages(String value){
     this.set(S_Mortgages,value);
  }
  public  void setMortgagesNull(){
     this.set(S_Mortgages,null);
  }

  public String getMortgages(){
       return DataType.getAsString(this.get(S_Mortgages));
  
  }
  public String getMortgagesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Mortgages));
      }

  public void initListedOnStockExchange(String value){
     this.initProperty(S_ListedOnStockExchange,value);
  }
  public  void setListedOnStockExchange(String value){
     this.set(S_ListedOnStockExchange,value);
  }
  public  void setListedOnStockExchangeNull(){
     this.set(S_ListedOnStockExchange,null);
  }

  public String getListedOnStockExchange(){
       return DataType.getAsString(this.get(S_ListedOnStockExchange));
  
  }
  public String getListedOnStockExchangeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ListedOnStockExchange));
      }

  public void initCreateOrgId(long value){
     this.initProperty(S_CreateOrgId,new Long(value));
  }
  public  void setCreateOrgId(long value){
     this.set(S_CreateOrgId,new Long(value));
  }
  public  void setCreateOrgIdNull(){
     this.set(S_CreateOrgId,null);
  }

  public long getCreateOrgId(){
        return DataType.getAsLong(this.get(S_CreateOrgId));
  
  }
  public long getCreateOrgIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreateOrgId));
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

  public void initEquity(String value){
     this.initProperty(S_Equity,value);
  }
  public  void setEquity(String value){
     this.set(S_Equity,value);
  }
  public  void setEquityNull(){
     this.set(S_Equity,null);
  }

  public String getEquity(){
       return DataType.getAsString(this.get(S_Equity));
  
  }
  public String getEquityInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Equity));
      }

  public void initRiscGroup(String value){
     this.initProperty(S_RiscGroup,value);
  }
  public  void setRiscGroup(String value){
     this.set(S_RiscGroup,value);
  }
  public  void setRiscGroupNull(){
     this.set(S_RiscGroup,null);
  }

  public String getRiscGroup(){
       return DataType.getAsString(this.get(S_RiscGroup));
  
  }
  public String getRiscGroupInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RiscGroup));
      }

  public void initAssetsTurnoverRate(String value){
     this.initProperty(S_AssetsTurnoverRate,value);
  }
  public  void setAssetsTurnoverRate(String value){
     this.set(S_AssetsTurnoverRate,value);
  }
  public  void setAssetsTurnoverRateNull(){
     this.set(S_AssetsTurnoverRate,null);
  }

  public String getAssetsTurnoverRate(){
       return DataType.getAsString(this.get(S_AssetsTurnoverRate));
  
  }
  public String getAssetsTurnoverRateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AssetsTurnoverRate));
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

  public void initNetProfitYearly(String value){
     this.initProperty(S_NetProfitYearly,value);
  }
  public  void setNetProfitYearly(String value){
     this.set(S_NetProfitYearly,value);
  }
  public  void setNetProfitYearlyNull(){
     this.set(S_NetProfitYearly,null);
  }

  public String getNetProfitYearly(){
       return DataType.getAsString(this.get(S_NetProfitYearly));
  
  }
  public String getNetProfitYearlyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_NetProfitYearly));
      }

  public void initRevenue(String value){
     this.initProperty(S_Revenue,value);
  }
  public  void setRevenue(String value){
     this.set(S_Revenue,value);
  }
  public  void setRevenueNull(){
     this.set(S_Revenue,null);
  }

  public String getRevenue(){
       return DataType.getAsString(this.get(S_Revenue));
  
  }
  public String getRevenueInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Revenue));
      }

  public void initImmatConstructionActivities(String value){
     this.initProperty(S_ImmatConstructionActivities,value);
  }
  public  void setImmatConstructionActivities(String value){
     this.set(S_ImmatConstructionActivities,value);
  }
  public  void setImmatConstructionActivitiesNull(){
     this.set(S_ImmatConstructionActivities,null);
  }

  public String getImmatConstructionActivities(){
       return DataType.getAsString(this.get(S_ImmatConstructionActivities));
  
  }
  public String getImmatConstructionActivitiesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ImmatConstructionActivities));
      }

  public void initEarnings(String value){
     this.initProperty(S_Earnings,value);
  }
  public  void setEarnings(String value){
     this.set(S_Earnings,value);
  }
  public  void setEarningsNull(){
     this.set(S_Earnings,null);
  }

  public String getEarnings(){
       return DataType.getAsString(this.get(S_Earnings));
  
  }
  public String getEarningsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Earnings));
      }

  public void initShortTermDebt(String value){
     this.initProperty(S_ShortTermDebt,value);
  }
  public  void setShortTermDebt(String value){
     this.set(S_ShortTermDebt,value);
  }
  public  void setShortTermDebtNull(){
     this.set(S_ShortTermDebt,null);
  }

  public String getShortTermDebt(){
       return DataType.getAsString(this.get(S_ShortTermDebt));
  
  }
  public String getShortTermDebtInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ShortTermDebt));
      }

  public void initMatConstructionActivities(String value){
     this.initProperty(S_MatConstructionActivities,value);
  }
  public  void setMatConstructionActivities(String value){
     this.set(S_MatConstructionActivities,value);
  }
  public  void setMatConstructionActivitiesNull(){
     this.set(S_MatConstructionActivities,null);
  }

  public String getMatConstructionActivities(){
       return DataType.getAsString(this.get(S_MatConstructionActivities));
  
  }
  public String getMatConstructionActivitiesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_MatConstructionActivities));
      }

  public void initSubordinaryLoanCapital(String value){
     this.initProperty(S_SubordinaryLoanCapital,value);
  }
  public  void setSubordinaryLoanCapital(String value){
     this.set(S_SubordinaryLoanCapital,value);
  }
  public  void setSubordinaryLoanCapitalNull(){
     this.set(S_SubordinaryLoanCapital,null);
  }

  public String getSubordinaryLoanCapital(){
       return DataType.getAsString(this.get(S_SubordinaryLoanCapital));
  
  }
  public String getSubordinaryLoanCapitalInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SubordinaryLoanCapital));
      }

  public void initCash(String value){
     this.initProperty(S_Cash,value);
  }
  public  void setCash(String value){
     this.set(S_Cash,value);
  }
  public  void setCashNull(){
     this.set(S_Cash,null);
  }

  public String getCash(){
       return DataType.getAsString(this.get(S_Cash));
  
  }
  public String getCashInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Cash));
      }

  public void initStatusBalance(String value){
     this.initProperty(S_StatusBalance,value);
  }
  public  void setStatusBalance(String value){
     this.set(S_StatusBalance,value);
  }
  public  void setStatusBalanceNull(){
     this.set(S_StatusBalance,null);
  }

  public String getStatusBalance(){
       return DataType.getAsString(this.get(S_StatusBalance));
  
  }
  public String getStatusBalanceInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StatusBalance));
      }

  public void initExtraordinaryItems(String value){
     this.initProperty(S_ExtraordinaryItems,value);
  }
  public  void setExtraordinaryItems(String value){
     this.set(S_ExtraordinaryItems,value);
  }
  public  void setExtraordinaryItemsNull(){
     this.set(S_ExtraordinaryItems,null);
  }

  public String getExtraordinaryItems(){
       return DataType.getAsString(this.get(S_ExtraordinaryItems));
  
  }
  public String getExtraordinaryItemsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ExtraordinaryItems));
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

  public void initProfitBeforeTax(String value){
     this.initProperty(S_ProfitBeforeTax,value);
  }
  public  void setProfitBeforeTax(String value){
     this.set(S_ProfitBeforeTax,value);
  }
  public  void setProfitBeforeTaxNull(){
     this.set(S_ProfitBeforeTax,null);
  }

  public String getProfitBeforeTax(){
       return DataType.getAsString(this.get(S_ProfitBeforeTax));
  
  }
  public String getProfitBeforeTaxInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ProfitBeforeTax));
      }

  public void initDegreeOfLiquidityi(String value){
     this.initProperty(S_DegreeOfLiquidityi,value);
  }
  public  void setDegreeOfLiquidityi(String value){
     this.set(S_DegreeOfLiquidityi,value);
  }
  public  void setDegreeOfLiquidityiNull(){
     this.set(S_DegreeOfLiquidityi,null);
  }

  public String getDegreeOfLiquidityi(){
       return DataType.getAsString(this.get(S_DegreeOfLiquidityi));
  
  }
  public String getDegreeOfLiquidityiInitialValue(){
        return DataType.getAsString(this.getOldObj(S_DegreeOfLiquidityi));
      }

  public void initEmployees(String value){
     this.initProperty(S_Employees,value);
  }
  public  void setEmployees(String value){
     this.set(S_Employees,value);
  }
  public  void setEmployeesNull(){
     this.set(S_Employees,null);
  }

  public String getEmployees(){
       return DataType.getAsString(this.get(S_Employees));
  
  }
  public String getEmployeesInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Employees));
      }

  public void initFinanceItems(String value){
     this.initProperty(S_FinanceItems,value);
  }
  public  void setFinanceItems(String value){
     this.set(S_FinanceItems,value);
  }
  public  void setFinanceItemsNull(){
     this.set(S_FinanceItems,null);
  }

  public String getFinanceItems(){
       return DataType.getAsString(this.get(S_FinanceItems));
  
  }
  public String getFinanceItemsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FinanceItems));
      }

  public void initSolvencyAtio(String value){
     this.initProperty(S_SolvencyAtio,value);
  }
  public  void setSolvencyAtio(String value){
     this.set(S_SolvencyAtio,value);
  }
  public  void setSolvencyAtioNull(){
     this.set(S_SolvencyAtio,null);
  }

  public String getSolvencyAtio(){
       return DataType.getAsString(this.get(S_SolvencyAtio));
  
  }
  public String getSolvencyAtioInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SolvencyAtio));
      }

  public void initLongTermDebt(String value){
     this.initProperty(S_LongTermDebt,value);
  }
  public  void setLongTermDebt(String value){
     this.set(S_LongTermDebt,value);
  }
  public  void setLongTermDebtNull(){
     this.set(S_LongTermDebt,null);
  }

  public String getLongTermDebt(){
       return DataType.getAsString(this.get(S_LongTermDebt));
  
  }
  public String getLongTermDebtInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LongTermDebt));
      }

  public void initSaleryGrade(String value){
     this.initProperty(S_SaleryGrade,value);
  }
  public  void setSaleryGrade(String value){
     this.set(S_SaleryGrade,value);
  }
  public  void setSaleryGradeNull(){
     this.set(S_SaleryGrade,null);
  }

  public String getSaleryGrade(){
       return DataType.getAsString(this.get(S_SaleryGrade));
  
  }
  public String getSaleryGradeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_SaleryGrade));
      }

  public void initFiscalYear(String value){
     this.initProperty(S_FiscalYear,value);
  }
  public  void setFiscalYear(String value){
     this.set(S_FiscalYear,value);
  }
  public  void setFiscalYearNull(){
     this.set(S_FiscalYear,null);
  }

  public String getFiscalYear(){
       return DataType.getAsString(this.get(S_FiscalYear));
  
  }
  public String getFiscalYearInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FiscalYear));
      }

  public void initLandAndBuildings(String value){
     this.initProperty(S_LandAndBuildings,value);
  }
  public  void setLandAndBuildings(String value){
     this.set(S_LandAndBuildings,value);
  }
  public  void setLandAndBuildingsNull(){
     this.set(S_LandAndBuildings,null);
  }

  public String getLandAndBuildings(){
       return DataType.getAsString(this.get(S_LandAndBuildings));
  
  }
  public String getLandAndBuildingsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_LandAndBuildings));
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

  public void initRegionId(String value){
     this.initProperty(S_RegionId,value);
  }
  public  void setRegionId(String value){
     this.set(S_RegionId,value);
  }
  public  void setRegionIdNull(){
     this.set(S_RegionId,null);
  }

  public String getRegionId(){
       return DataType.getAsString(this.get(S_RegionId));
  
  }
  public String getRegionIdInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RegionId));
      }

  public void initCreateOpId(long value){
     this.initProperty(S_CreateOpId,new Long(value));
  }
  public  void setCreateOpId(long value){
     this.set(S_CreateOpId,new Long(value));
  }
  public  void setCreateOpIdNull(){
     this.set(S_CreateOpId,null);
  }

  public long getCreateOpId(){
        return DataType.getAsLong(this.get(S_CreateOpId));
  
  }
  public long getCreateOpIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_CreateOpId));
      }

  public void initGrossProfit(String value){
     this.initProperty(S_GrossProfit,value);
  }
  public  void setGrossProfit(String value){
     this.set(S_GrossProfit,value);
  }
  public  void setGrossProfitNull(){
     this.set(S_GrossProfit,null);
  }

  public String getGrossProfit(){
       return DataType.getAsString(this.get(S_GrossProfit));
  
  }
  public String getGrossProfitInitialValue(){
        return DataType.getAsString(this.getOldObj(S_GrossProfit));
      }

  public void initOrdResPerEmployee(String value){
     this.initProperty(S_OrdResPerEmployee,value);
  }
  public  void setOrdResPerEmployee(String value){
     this.set(S_OrdResPerEmployee,value);
  }
  public  void setOrdResPerEmployeeNull(){
     this.set(S_OrdResPerEmployee,null);
  }

  public String getOrdResPerEmployee(){
       return DataType.getAsString(this.get(S_OrdResPerEmployee));
  
  }
  public String getOrdResPerEmployeeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OrdResPerEmployee));
      }

  public void initFixedAssetsPerEmployee(String value){
     this.initProperty(S_FixedAssetsPerEmployee,value);
  }
  public  void setFixedAssetsPerEmployee(String value){
     this.set(S_FixedAssetsPerEmployee,value);
  }
  public  void setFixedAssetsPerEmployeeNull(){
     this.set(S_FixedAssetsPerEmployee,null);
  }

  public String getFixedAssetsPerEmployee(){
       return DataType.getAsString(this.get(S_FixedAssetsPerEmployee));
  
  }
  public String getFixedAssetsPerEmployeeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FixedAssetsPerEmployee));
      }

  public void initCoverage(String value){
     this.initProperty(S_Coverage,value);
  }
  public  void setCoverage(String value){
     this.set(S_Coverage,value);
  }
  public  void setCoverageNull(){
     this.set(S_Coverage,null);
  }

  public String getCoverage(){
       return DataType.getAsString(this.get(S_Coverage));
  
  }
  public String getCoverageInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Coverage));
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

  public void initProvisions(String value){
     this.initProperty(S_Provisions,value);
  }
  public  void setProvisions(String value){
     this.set(S_Provisions,value);
  }
  public  void setProvisionsNull(){
     this.set(S_Provisions,null);
  }

  public String getProvisions(){
       return DataType.getAsString(this.get(S_Provisions));
  
  }
  public String getProvisionsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Provisions));
      }

  public void initCapacityGrade(String value){
     this.initProperty(S_CapacityGrade,value);
  }
  public  void setCapacityGrade(String value){
     this.set(S_CapacityGrade,value);
  }
  public  void setCapacityGradeNull(){
     this.set(S_CapacityGrade,null);
  }

  public String getCapacityGrade(){
       return DataType.getAsString(this.get(S_CapacityGrade));
  
  }
  public String getCapacityGradeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CapacityGrade));
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

  public void initOperatingMargin(String value){
     this.initProperty(S_OperatingMargin,value);
  }
  public  void setOperatingMargin(String value){
     this.set(S_OperatingMargin,value);
  }
  public  void setOperatingMarginNull(){
     this.set(S_OperatingMargin,null);
  }

  public String getOperatingMargin(){
       return DataType.getAsString(this.get(S_OperatingMargin));
  
  }
  public String getOperatingMarginInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OperatingMargin));
      }

  public void initTradeCreditors(String value){
     this.initProperty(S_TradeCreditors,value);
  }
  public  void setTradeCreditors(String value){
     this.set(S_TradeCreditors,value);
  }
  public  void setTradeCreditorsNull(){
     this.set(S_TradeCreditors,null);
  }

  public String getTradeCreditors(){
       return DataType.getAsString(this.get(S_TradeCreditors));
  
  }
  public String getTradeCreditorsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_TradeCreditors));
      }

  public void initCreditPeriodCredit(String value){
     this.initProperty(S_CreditPeriodCredit,value);
  }
  public  void setCreditPeriodCredit(String value){
     this.set(S_CreditPeriodCredit,value);
  }
  public  void setCreditPeriodCreditNull(){
     this.set(S_CreditPeriodCredit,null);
  }

  public String getCreditPeriodCredit(){
       return DataType.getAsString(this.get(S_CreditPeriodCredit));
  
  }
  public String getCreditPeriodCreditInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CreditPeriodCredit));
      }

  public void initReturnOnAssets(String value){
     this.initProperty(S_ReturnOnAssets,value);
  }
  public  void setReturnOnAssets(String value){
     this.set(S_ReturnOnAssets,value);
  }
  public  void setReturnOnAssetsNull(){
     this.set(S_ReturnOnAssets,null);
  }

  public String getReturnOnAssets(){
       return DataType.getAsString(this.get(S_ReturnOnAssets));
  
  }
  public String getReturnOnAssetsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ReturnOnAssets));
      }

  public void initCreditMaxCurrency(String value){
     this.initProperty(S_CreditMaxCurrency,value);
  }
  public  void setCreditMaxCurrency(String value){
     this.set(S_CreditMaxCurrency,value);
  }
  public  void setCreditMaxCurrencyNull(){
     this.set(S_CreditMaxCurrency,null);
  }

  public String getCreditMaxCurrency(){
       return DataType.getAsString(this.get(S_CreditMaxCurrency));
  
  }
  public String getCreditMaxCurrencyInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CreditMaxCurrency));
      }

  public void initFixedSsets(String value){
     this.initProperty(S_FixedSsets,value);
  }
  public  void setFixedSsets(String value){
     this.set(S_FixedSsets,value);
  }
  public  void setFixedSsetsNull(){
     this.set(S_FixedSsets,null);
  }

  public String getFixedSsets(){
       return DataType.getAsString(this.get(S_FixedSsets));
  
  }
  public String getFixedSsetsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FixedSsets));
      }

  public void initPublicationDate(String value){
     this.initProperty(S_PublicationDate,value);
  }
  public  void setPublicationDate(String value){
     this.set(S_PublicationDate,value);
  }
  public  void setPublicationDateNull(){
     this.set(S_PublicationDate,null);
  }

  public String getPublicationDate(){
       return DataType.getAsString(this.get(S_PublicationDate));
  
  }
  public String getPublicationDateInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PublicationDate));
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

  public void initCreditMaxAmount(String value){
     this.initProperty(S_CreditMaxAmount,value);
  }
  public  void setCreditMaxAmount(String value){
     this.set(S_CreditMaxAmount,value);
  }
  public  void setCreditMaxAmountNull(){
     this.set(S_CreditMaxAmount,null);
  }

  public String getCreditMaxAmount(){
       return DataType.getAsString(this.get(S_CreditMaxAmount));
  
  }
  public String getCreditMaxAmountInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CreditMaxAmount));
      }

  public void initNetGainsPerEmployee(String value){
     this.initProperty(S_NetGainsPerEmployee,value);
  }
  public  void setNetGainsPerEmployee(String value){
     this.set(S_NetGainsPerEmployee,value);
  }
  public  void setNetGainsPerEmployeeNull(){
     this.set(S_NetGainsPerEmployee,null);
  }

  public String getNetGainsPerEmployee(){
       return DataType.getAsString(this.get(S_NetGainsPerEmployee));
  
  }
  public String getNetGainsPerEmployeeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_NetGainsPerEmployee));
      }

  public void initAccountRemark(String value){
     this.initProperty(S_AccountRemark,value);
  }
  public  void setAccountRemark(String value){
     this.set(S_AccountRemark,value);
  }
  public  void setAccountRemarkNull(){
     this.set(S_AccountRemark,null);
  }

  public String getAccountRemark(){
       return DataType.getAsString(this.get(S_AccountRemark));
  
  }
  public String getAccountRemarkInitialValue(){
        return DataType.getAsString(this.getOldObj(S_AccountRemark));
      }

  public void initFinancialExpenditure(String value){
     this.initProperty(S_FinancialExpenditure,value);
  }
  public  void setFinancialExpenditure(String value){
     this.set(S_FinancialExpenditure,value);
  }
  public  void setFinancialExpenditureNull(){
     this.set(S_FinancialExpenditure,null);
  }

  public String getFinancialExpenditure(){
       return DataType.getAsString(this.get(S_FinancialExpenditure));
  
  }
  public String getFinancialExpenditureInitialValue(){
        return DataType.getAsString(this.getOldObj(S_FinancialExpenditure));
      }

  public void initPrimResPerEmployee(String value){
     this.initProperty(S_PrimResPerEmployee,value);
  }
  public  void setPrimResPerEmployee(String value){
     this.set(S_PrimResPerEmployee,value);
  }
  public  void setPrimResPerEmployeeNull(){
     this.set(S_PrimResPerEmployee,null);
  }

  public String getPrimResPerEmployee(){
       return DataType.getAsString(this.get(S_PrimResPerEmployee));
  
  }
  public String getPrimResPerEmployeeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_PrimResPerEmployee));
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

  public void initStaffCosts(String value){
     this.initProperty(S_StaffCosts,value);
  }
  public  void setStaffCosts(String value){
     this.set(S_StaffCosts,value);
  }
  public  void setStaffCostsNull(){
     this.set(S_StaffCosts,null);
  }

  public String getStaffCosts(){
       return DataType.getAsString(this.get(S_StaffCosts));
  
  }
  public String getStaffCostsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_StaffCosts));
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

  public void initCapitalGrade(String value){
     this.initProperty(S_CapitalGrade,value);
  }
  public  void setCapitalGrade(String value){
     this.set(S_CapitalGrade,value);
  }
  public  void setCapitalGradeNull(){
     this.set(S_CapitalGrade,null);
  }

  public String getCapitalGrade(){
       return DataType.getAsString(this.get(S_CapitalGrade));
  
  }
  public String getCapitalGradeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CapitalGrade));
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

  public void initOperatingProfit(String value){
     this.initProperty(S_OperatingProfit,value);
  }
  public  void setOperatingProfit(String value){
     this.set(S_OperatingProfit,value);
  }
  public  void setOperatingProfitNull(){
     this.set(S_OperatingProfit,null);
  }

  public String getOperatingProfit(){
       return DataType.getAsString(this.get(S_OperatingProfit));
  
  }
  public String getOperatingProfitInitialValue(){
        return DataType.getAsString(this.getOldObj(S_OperatingProfit));
      }

  public void initRatingCode(String value){
     this.initProperty(S_RatingCode,value);
  }
  public  void setRatingCode(String value){
     this.set(S_RatingCode,value);
  }
  public  void setRatingCodeNull(){
     this.set(S_RatingCode,null);
  }

  public String getRatingCode(){
       return DataType.getAsString(this.get(S_RatingCode));
  
  }
  public String getRatingCodeInitialValue(){
        return DataType.getAsString(this.getOldObj(S_RatingCode));
      }

  public void initCurrentAssets(String value){
     this.initProperty(S_CurrentAssets,value);
  }
  public  void setCurrentAssets(String value){
     this.set(S_CurrentAssets,value);
  }
  public  void setCurrentAssetsNull(){
     this.set(S_CurrentAssets,null);
  }

  public String getCurrentAssets(){
       return DataType.getAsString(this.get(S_CurrentAssets));
  
  }
  public String getCurrentAssetsInitialValue(){
        return DataType.getAsString(this.getOldObj(S_CurrentAssets));
      }

  public void initLastYearEmployees(long value){
     this.initProperty(S_LastYearEmployees,new Long(value));
  }
  public  void setLastYearEmployees(long value){
     this.set(S_LastYearEmployees,new Long(value));
  }
  public  void setLastYearEmployeesNull(){
     this.set(S_LastYearEmployees,null);
  }

  public long getLastYearEmployees(){
        return DataType.getAsLong(this.get(S_LastYearEmployees));
  
  }
  public long getLastYearEmployeesInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_LastYearEmployees));
      }

  public void initZeroTurnover(String value){
     this.initProperty(S_ZeroTurnover,value);
  }
  public  void setZeroTurnover(String value){
     this.set(S_ZeroTurnover,value);
  }
  public  void setZeroTurnoverNull(){
     this.set(S_ZeroTurnover,null);
  }

  public String getZeroTurnover(){
       return DataType.getAsString(this.get(S_ZeroTurnover));
  
  }
  public String getZeroTurnoverInitialValue(){
        return DataType.getAsString(this.getOldObj(S_ZeroTurnover));
      }

  public void initDepreciation(String value){
     this.initProperty(S_Depreciation,value);
  }
  public  void setDepreciation(String value){
     this.set(S_Depreciation,value);
  }
  public  void setDepreciationNull(){
     this.set(S_Depreciation,null);
  }

  public String getDepreciation(){
       return DataType.getAsString(this.get(S_Depreciation));
  
  }
  public String getDepreciationInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Depreciation));
      }


 
 }

