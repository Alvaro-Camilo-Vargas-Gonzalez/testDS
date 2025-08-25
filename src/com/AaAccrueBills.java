package com;

import com.temenos.t24.AA_ACCRUE_BILLS_cl;
import com.temenos.t24.component_AA_ChargeOff_16_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Interest_16_cl;
import com.temenos.t24.component_AA_Overdue_15_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AC_Fees_12_cl;
import com.temenos.t24.component_EB_API_9_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccrueBills extends AA_ACCRUE_BILLS_cl {

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
    public component_AA_ChargeOff_16_cl getAA_ChargeOff() {
        
        return super.getAA_ChargeOff();
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
    public component_AA_Overdue_15_cl getAA_Overdue() {
        
        return super.getAA_Overdue();
    }

    @Override
    public component_AA_PaymentSchedule_22_cl getAA_PaymentSchedule() {
        
        return super.getAA_PaymentSchedule();
    }

    @Override
    public component_AC_Fees_12_cl getAC_Fees() {
        
        return super.getAC_Fees();
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
            Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13) {
        
        return super.invoke(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
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
    protected int lbl_ADJUST_ROUND_NEXT_CONTRIBUTOR() {
        
        return super.lbl_ADJUST_ROUND_NEXT_CONTRIBUTOR();
    }

    @Override
    protected int lbl_CALCULATE_ACCRUALS() {
        
        return super.lbl_CALCULATE_ACCRUALS();
    }

    @Override
    protected int lbl_CHECK_FOR_CHARGEOFF() {
        
        return super.lbl_CHECK_FOR_CHARGEOFF();
    }

    @Override
    protected int lbl_EXTRACT_BILL_ACCRUE_SUSPENSE_AMOUNT() {
        
        return super.lbl_EXTRACT_BILL_ACCRUE_SUSPENSE_AMOUNT();
    }

    @Override
    protected int lbl_FIND_CONTRIBUTION_BILL() {
        
        return super.lbl_FIND_CONTRIBUTION_BILL();
    }

    @Override
    protected int lbl_GET_BILLS() {
        
        return super.lbl_GET_BILLS();
    }

    @Override
    protected int lbl_GET_BILL_DETAILS() {
        
        return super.lbl_GET_BILL_DETAILS();
    }

    @Override
    protected int lbl_GET_BILL_PROPERTY_AMOUNT() {
        
        return super.lbl_GET_BILL_PROPERTY_AMOUNT();
    }

    @Override
    protected int lbl_GET_CORRECT_BILL() {
        
        return super.lbl_GET_CORRECT_BILL();
    }

    @Override
    protected int lbl_GET_EXACT_BILL_ADJUST_AMOUNT() {
        
        return super.lbl_GET_EXACT_BILL_ADJUST_AMOUNT();
    }

    @Override
    protected int lbl_GET_LAST_ACCRUE_POS() {
        
        return super.lbl_GET_LAST_ACCRUE_POS();
    }

    @Override
    protected int lbl_GET_OUTSTANDING_RC_BILL_AMOUNT() {
        
        return super.lbl_GET_OUTSTANDING_RC_BILL_AMOUNT();
    }

    @Override
    protected int lbl_GET_PROPERTY_ADJUST_AMOUNT() {
        
        return super.lbl_GET_PROPERTY_ADJUST_AMOUNT();
    }

    @Override
    protected int lbl_GET_RC_BILL_AMOUNT() {
        
        return super.lbl_GET_RC_BILL_AMOUNT();
    }

    @Override
    protected int lbl_GET_RC_DETAILS() {
        
        return super.lbl_GET_RC_DETAILS();
    }

    @Override
    protected int lbl_GET_REPAID_SUSPEND_AMOUNTS() {
        
        return super.lbl_GET_REPAID_SUSPEND_AMOUNTS();
    }

    @Override
    protected int lbl_GET_SUSPENDED_PORTION() {
        
        return super.lbl_GET_SUSPENDED_PORTION();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_MODIFY_BILL_DETAILS() {
        
        return super.lbl_MODIFY_BILL_DETAILS();
    }

    @Override
    protected int lbl_PERFORM_ACCRUALS_BY_BILLS() {
        
        return super.lbl_PERFORM_ACCRUALS_BY_BILLS();
    }

    @Override
    protected int lbl_PERFORM_OLD_ROUNDING_ADJUSTMENT() {
        
        return super.lbl_PERFORM_OLD_ROUNDING_ADJUSTMENT();
    }

    @Override
    protected int lbl_PERFORM_ROUNDING_ADJUSTMENT() {
        
        return super.lbl_PERFORM_ROUNDING_ADJUSTMENT();
    }

    @Override
    protected int lbl_PROCESS_ACTION() {
        
        return super.lbl_PROCESS_ACTION();
    }

    @Override
    protected int lbl_PROCESS_DELETE_ACTION() {
        
        return super.lbl_PROCESS_DELETE_ACTION();
    }

    @Override
    protected int lbl_PROCESS_DELETE_ACTION_BILL() {
        
        return super.lbl_PROCESS_DELETE_ACTION_BILL();
    }

    @Override
    protected int lbl_PROCESS_INPUT_ACTION() {
        
        return super.lbl_PROCESS_INPUT_ACTION();
    }

    @Override
    protected int lbl_PROCESS_INPUT_ACTION_BILL() {
        
        return super.lbl_PROCESS_INPUT_ACTION_BILL();
    }

    @Override
    protected int lbl_PROCESS_RESTORE_ACTION_BILL() {
        
        return super.lbl_PROCESS_RESTORE_ACTION_BILL();
    }

    @Override
    protected int lbl_RESOLVE_PROCESS_TYPE() {
        
        return super.lbl_RESOLVE_PROCESS_TYPE();
    }

    @Override
    protected int lbl_ROUND_AMOUNT() {
        
        return super.lbl_ROUND_AMOUNT();
    }

    @Override
    protected int lbl_UPDATE_ACTUAL_BILL_ADJUST_AMOUNT() {
        
        return super.lbl_UPDATE_ACTUAL_BILL_ADJUST_AMOUNT();
    }

    @Override
    protected int lbl_UPDATE_BILL_DETAILS() {
        
        return super.lbl_UPDATE_BILL_DETAILS();
    }

    @Override
    protected int lbl_UPDATE_PRIN_DATA() {
        
        return super.lbl_UPDATE_PRIN_DATA();
    }

    @Override
    protected int lbl_WRITE_BILL_DETAILS() {
        
        return super.lbl_WRITE_BILL_DETAILS();
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
    public void stack(AA_ACCRUE_BILLS_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
