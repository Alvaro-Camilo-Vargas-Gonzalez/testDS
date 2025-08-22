package com;

import com.temenos.t24.AA_ACCOUNTING_VALIDATE_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Accounting_18_cl;
import com.temenos.t24.component_AA_Fees_12_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AC_AccountOpening_21_cl;
import com.temenos.t24.component_AC_Config_14_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_EB_Template_16_cl;
import com.temenos.t24.component_EB_Utility_15_cl;
import com.temenos.t24.component_MDLREF_ReferenceData_20_cl;
import com.temenos.t24.component_ST_Config_14_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountingValidate extends AA_ACCOUNTING_VALIDATE_cl {

    @Override
    protected void CB(int arg0) {
        
        super.CB(arg0);
    }

    @Override
    public void CLEAR() {
        
        super.CLEAR();
    }

    @Override
    protected void GOSUB(int arg0, boolean arg1) {
        
        super.GOSUB(arg0, arg1);
    }

    @Override
    protected void GOSUB(int arg0) {
        
        super.GOSUB(arg0);
    }

    @Override
    public void create() {
        
        super.create();
    }

    @Override
    public component_AA_Account_15_cl getAA_Account() {
        
        return super.getAA_Account();
    }

    @Override
    public component_AA_Accounting_18_cl getAA_Accounting() {
        
        return super.getAA_Accounting();
    }

    @Override
    public component_AA_Fees_12_cl getAA_Fees() {
        
        return super.getAA_Fees();
    }

    @Override
    public component_AA_Framework_17_cl getAA_Framework() {
        
        return super.getAA_Framework();
    }

    @Override
    public component_AA_ProductFramework_23_cl getAA_ProductFramework() {
        
        return super.getAA_ProductFramework();
    }

    @Override
    public component_AC_AccountOpening_21_cl getAC_AccountOpening() {
        
        return super.getAC_AccountOpening();
    }

    @Override
    public component_AC_Config_14_cl getAC_Config() {
        
        return super.getAC_Config();
    }

    @Override
    public component_AF_Framework_17_cl getAF_Framework() {
        
        return super.getAF_Framework();
    }

    @Override
    public String getBASICName() {
        
        return super.getBASICName();
    }

    @Override
    public String getCompileInfo() {
        
        return super.getCompileInfo();
    }

    @Override
    public String[] getComponentList() {
        
        return super.getComponentList();
    }

    @Override
    public jVar getDataStructureFields(Object arg0) {
        
        return super.getDataStructureFields(arg0);
    }

    @Override
    public jVar getDataStructureNames() {
        
        return super.getDataStructureNames();
    }

    @Override
    public component_EB_ErrorProcessing_22_cl getEB_ErrorProcessing() {
        
        return super.getEB_ErrorProcessing();
    }

    @Override
    public component_EB_SystemTables_19_cl getEB_SystemTables() {
        
        return super.getEB_SystemTables();
    }

    @Override
    public component_EB_Template_16_cl getEB_Template() {
        
        return super.getEB_Template();
    }

    @Override
    public component_EB_Utility_15_cl getEB_Utility() {
        
        return super.getEB_Utility();
    }

    @Override
    public String getImportBasic() {
        
        return super.getImportBasic();
    }

    @Override
    public component_MDLREF_ReferenceData_20_cl getMDLREF_ReferenceData() {
        
        return super.getMDLREF_ReferenceData();
    }

    @Override
    public int getNbLines() {
        
        return super.getNbLines();
    }

    @Override
    public String getPackageBasic() {
        
        return super.getPackageBasic();
    }

    @Override
    public String[] getParamList() {
        
        return super.getParamList();
    }

    @Override
    public jVar[] getParams() {
        
        return super.getParams();
    }

    @Override
    public String getPathFileNameBasic() {
        
        return super.getPathFileNameBasic();
    }

    @Override
    public String getReplacementInfo() {
        
        return super.getReplacementInfo();
    }

    @Override
    public component_ST_Config_14_cl getST_Config() {
        
        return super.getST_Config();
    }

    @Override
    public String[] getVarList() {
        
        return super.getVarList();
    }

    @Override
    public String getVarValue(String arg0) {
        
        return super.getVarValue(arg0);
    }

    @Override
    public String getVersion() {
        
        return super.getVersion();
    }

    @Override
    public void init(jSession arg0) {
        
        super.init(arg0);
    }

    @Override
    public jVar invoke() {
        
        return super.invoke();
    }

    @Override
    public jVar invoke(Object... arg0) {
        
        return super.invoke(arg0);
    }

    @Override
    public void keepMoving() {
        
        super.keepMoving();
    }

    @Override
    protected int lbl_ARRANGEMENT_CROSSVAL() {
        
        return super.lbl_ARRANGEMENT_CROSSVAL();
    }

    @Override
    protected int lbl_AUTH_CROSSVAL() {
        
        return super.lbl_AUTH_CROSSVAL();
    }

    @Override
    protected int lbl_CHECK_CHARGEOFF_CATEGORY() {
        
        return super.lbl_CHECK_CHARGEOFF_CATEGORY();
    }

    @Override
    protected int lbl_COMMON_CROSSVAL() {
        
        return super.lbl_COMMON_CROSSVAL();
    }

    @Override
    protected int lbl_DELETE_CROSSVAL() {
        
        return super.lbl_DELETE_CROSSVAL();
    }

    @Override
    protected int lbl_DESIGNER_CROSSVAL() {
        
        return super.lbl_DESIGNER_CROSSVAL();
    }

    @Override
    protected int lbl_DO_VALIDATIONS() {
        
        return super.lbl_DO_VALIDATIONS();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_LOAD_PROPERTY_CLASS() {
        
        return super.lbl_LOAD_PROPERTY_CLASS();
    }

    @Override
    protected int lbl_LOAD_REQUIRED_PARAMETERS() {
        
        return super.lbl_LOAD_REQUIRED_PARAMETERS();
    }

    @Override
    protected int lbl_PROCESS_CROSSVAL() {
        
        return super.lbl_PROCESS_CROSSVAL();
    }

    @Override
    protected int lbl_REAL_CROSSVAL() {
        
        return super.lbl_REAL_CROSSVAL();
    }

    @Override
    protected int lbl_REVERSE_CROSSVAL() {
        
        return super.lbl_REVERSE_CROSSVAL();
    }

    @Override
    protected int lbl_VALIDATE_ACCOUNT_CLASS() {
        
        return super.lbl_VALIDATE_ACCOUNT_CLASS();
    }

    @Override
    protected int lbl_VALIDATE_ACCRUAL_AMORT_ATTRIBUTES() {
        
        return super.lbl_VALIDATE_ACCRUAL_AMORT_ATTRIBUTES();
    }

    @Override
    protected int lbl_VALIDATE_ACCRUAL_PERIOD() {
        
        return super.lbl_VALIDATE_ACCRUAL_PERIOD();
    }

    @Override
    protected int lbl_VALIDATE_ACCT_RULE() {
        
        return super.lbl_VALIDATE_ACCT_RULE();
    }

    @Override
    protected int lbl_VALIDATE_BOOKING_COMPANY() {
        
        return super.lbl_VALIDATE_BOOKING_COMPANY();
    }

    @Override
    protected int lbl_VALIDATE_CATEGORY() {
        
        return super.lbl_VALIDATE_CATEGORY();
    }

    @Override
    protected int lbl_VALIDATE_CATEGORY_ATTRIBUTES() {
        
        return super.lbl_VALIDATE_CATEGORY_ATTRIBUTES();
    }

    @Override
    protected int lbl_VALIDATE_CHARGEOFF_ATTRIBUTES() {
        
        return super.lbl_VALIDATE_CHARGEOFF_ATTRIBUTES();
    }

    @Override
    protected int lbl_VALIDATE_CHARGEOFF_CATEGORY() {
        
        return super.lbl_VALIDATE_CHARGEOFF_CATEGORY();
    }

    @Override
    protected int lbl_VALIDATE_CHARGE_CATEGORY() {
        
        return super.lbl_VALIDATE_CHARGE_CATEGORY();
    }

    @Override
    protected int lbl_VALIDATE_CONSOLIDATION_ATTRIBUTES() {
        
        return super.lbl_VALIDATE_CONSOLIDATION_ATTRIBUTES();
    }

    @Override
    protected int lbl_VALIDATE_INFO_PROPERTY() {
        
        return super.lbl_VALIDATE_INFO_PROPERTY();
    }

    @Override
    protected int lbl_VALIDATE_INTEREST_CATEGORY() {
        
        return super.lbl_VALIDATE_INTEREST_CATEGORY();
    }

    @Override
    protected int lbl_VALIDATE_INTERNAL_BOOKING_ACCOUNT() {
        
        return super.lbl_VALIDATE_INTERNAL_BOOKING_ACCOUNT();
    }

    @Override
    protected int lbl_VALIDATE_INTERNAL_CATEGORY() {
        
        return super.lbl_VALIDATE_INTERNAL_CATEGORY();
    }

    @Override
    protected int lbl_VALIDATE_NON_CUSTOMER_INTEREST_PROPERTY() {
        
        return super.lbl_VALIDATE_NON_CUSTOMER_INTEREST_PROPERTY();
    }

    @Override
    protected int lbl_VALIDATE_NON_CUST_SETTLE_CATEGORY() {
        
        return super.lbl_VALIDATE_NON_CUST_SETTLE_CATEGORY();
    }

    @Override
    protected int lbl_VALIDATE_SKIM_PROPERTIES() {
        
        return super.lbl_VALIDATE_SKIM_PROPERTIES();
    }

    @Override
    protected int lbl_VALIDATE_WAIVING_CATEGORY() {
        
        return super.lbl_VALIDATE_WAIVING_CATEGORY();
    }

    @Override
    protected int main() {
        
        return super.main();
    }

    @Override
    public void move() {
        
        super.move();
    }

    @Override
    public void release() {
        
        super.release();
    }

    @Override
    public void reset() {
        
        super.reset();
    }

    @Override
    public String setVarValue(String arg0, String arg1) {
        
        return super.setVarValue(arg0, arg1);
    }

    @Override
    public void stack(AA_ACCOUNTING_VALIDATE_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
