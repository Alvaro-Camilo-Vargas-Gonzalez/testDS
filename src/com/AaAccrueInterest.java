package com;

import com.temenos.t24.AA_ACCRUE_INTEREST_cl;
import com.temenos.t24.component_AA_Customer_16_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Interest_16_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AA_ProductManagement_24_cl;
import com.temenos.t24.component_AC_Fees_12_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_API_9_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccrueInterest extends AA_ACCRUE_INTEREST_cl {

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
    public component_AA_Customer_16_cl getAA_Customer() {
        
        return super.getAA_Customer();
    }

    @Override
    public component_AA_Framework_17_cl getAA_Framework() {
        
        return super.getAA_Framework();
    }

    @Override
    public component_AA_Interest_16_cl getAA_Interest() {
        
        return super.getAA_Interest();
    }

    @Override
    public component_AA_PaymentSchedule_22_cl getAA_PaymentSchedule() {
        
        return super.getAA_PaymentSchedule();
    }

    @Override
    public component_AA_ProductFramework_23_cl getAA_ProductFramework() {
        
        return super.getAA_ProductFramework();
    }

    @Override
    public component_AA_ProductManagement_24_cl getAA_ProductManagement() {
        
        return super.getAA_ProductManagement();
    }

    @Override
    public component_AC_Fees_12_cl getAC_Fees() {
        
        return super.getAC_Fees();
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
    public component_EB_API_9_cl getEB_API() {
        
        return super.getEB_API();
    }

    @Override
    public component_EB_SystemTables_19_cl getEB_SystemTables() {
        
        return super.getEB_SystemTables();
    }

    @Override
    public String getImportBasic() {
        
        return super.getImportBasic();
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
    public jVar invoke(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
            Object arg7, Object arg8, Object arg9, Object arg10, Object arg11) {
        
        return super.invoke(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
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
    protected int lbl_ADJUST_ACCRUED_INT() {
        
        return super.lbl_ADJUST_ACCRUED_INT();
    }

    @Override
    protected int lbl_BUILD_CALC_PERIOD() {
        
        return super.lbl_BUILD_CALC_PERIOD();
    }

    @Override
    protected int lbl_BUILD_INTEREST_DATA() {
        
        return super.lbl_BUILD_INTEREST_DATA();
    }

    @Override
    protected int lbl_BUILD_PREVIOUS_ACCRUALS() {
        
        return super.lbl_BUILD_PREVIOUS_ACCRUALS();
    }

    @Override
    protected int lbl_BUILD_PRINCIPAL_DATA() {
        
        return super.lbl_BUILD_PRINCIPAL_DATA();
    }

    @Override
    protected int lbl_CHECK_INTEREST_ACCRUALS() {
        
        return super.lbl_CHECK_INTEREST_ACCRUALS();
    }

    @Override
    protected int lbl_CHECK_START_DATE_END_DATE() {
        
        return super.lbl_CHECK_START_DATE_END_DATE();
    }

    @Override
    protected int lbl_COMPOUNDING_CALCULATIONS() {
        
        return super.lbl_COMPOUNDING_CALCULATIONS();
    }

    @Override
    protected int lbl_GET_ADJUST_ACCRUAL_DATA() {
        
        return super.lbl_GET_ADJUST_ACCRUAL_DATA();
    }

    @Override
    protected int lbl_GET_BASIC_DETAILS() {
        
        return super.lbl_GET_BASIC_DETAILS();
    }

    @Override
    protected int lbl_GET_LAST_PAYMENT_DATE() {
        
        return super.lbl_GET_LAST_PAYMENT_DATE();
    }

    @Override
    protected int lbl_GET_PREV_ACCRUED_INT() {
        
        return super.lbl_GET_PREV_ACCRUED_INT();
    }

    @Override
    protected int lbl_GET_REPAYMENT_DETAILS() {
        
        return super.lbl_GET_REPAYMENT_DETAILS();
    }

    @Override
    protected int lbl_GET_RESPITE_DATE_POS() {
        
        return super.lbl_GET_RESPITE_DATE_POS();
    }

    @Override
    protected int lbl_GET_SOURCE_BAL_TYPE() {
        
        return super.lbl_GET_SOURCE_BAL_TYPE();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_MAIN_PROCESS() {
        
        return super.lbl_MAIN_PROCESS();
    }

    @Override
    protected int lbl_PERFORM_ACCRUALS() {
        
        return super.lbl_PERFORM_ACCRUALS();
    }

    @Override
    protected int lbl_PERFORM_FINAL_CHECKS() {
        
        return super.lbl_PERFORM_FINAL_CHECKS();
    }

    @Override
    protected int lbl_PROCESS_ACCRUE_BILL() {
        
        return super.lbl_PROCESS_ACCRUE_BILL();
    }

    @Override
    protected int lbl_PROCESS_ACCRUE_INTEREST() {
        
        return super.lbl_PROCESS_ACCRUE_INTEREST();
    }

    @Override
    protected int lbl_PROCESS_FIXED_INTEREST() {
        
        return super.lbl_PROCESS_FIXED_INTEREST();
    }

    @Override
    protected int lbl_RESOLVE_TIER_SOURCE() {
        
        return super.lbl_RESOLVE_TIER_SOURCE();
    }

    @Override
    protected int lbl_SPLIT_ACCRUALS() {
        
        return super.lbl_SPLIT_ACCRUALS();
    }

    @Override
    protected int lbl_UPDATE_BUNDLE_PRIN_DATA() {
        
        return super.lbl_UPDATE_BUNDLE_PRIN_DATA();
    }

    @Override
    protected int lbl_VALIDATE_END_DATE() {
        
        return super.lbl_VALIDATE_END_DATE();
    }

    @Override
    protected int lbl_VALIDATE_START_DATE() {
        
        return super.lbl_VALIDATE_START_DATE();
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
    public void stack(AA_ACCRUE_INTEREST_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
