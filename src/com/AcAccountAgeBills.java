package com;

import com.temenos.t24.AA_ACCOUNT_AGE_BILLS_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Accounting_18_cl;
import com.temenos.t24.component_AA_ChargeOff_16_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Overdue_15_cl;
import com.temenos.t24.component_AA_Participant_19_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AC_SoftAccounting_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AcAccountAgeBills extends AA_ACCOUNT_AGE_BILLS_cl {

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
    public component_AA_ChargeOff_16_cl getAA_ChargeOff() {
        
        return super.getAA_ChargeOff();
    }

    @Override
    public component_AA_Framework_17_cl getAA_Framework() {
        
        return super.getAA_Framework();
    }

    @Override
    public component_AA_Overdue_15_cl getAA_Overdue() {
        
        return super.getAA_Overdue();
    }

    @Override
    public component_AA_Participant_19_cl getAA_Participant() {
        
        return super.getAA_Participant();
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
    public component_AC_SoftAccounting_21_cl getAC_SoftAccounting() {
        
        return super.getAC_SoftAccounting();
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
    public jVar getDataStructureFields(java.lang.Object arg0) {
        
        return super.getDataStructureFields(arg0);
    }

    @Override
    public jVar getDataStructureNames() {
        
        return super.getDataStructureNames();
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
    public jVar invoke() {
        
        return super.invoke();
    }

    @Override
    public jVar invoke(java.lang.Object... arg0) {
        
        return super.invoke(arg0);
    }

    @Override
    public void keepMoving() {
        
        super.keepMoving();
    }

    @Override
    protected int lbl_ADD_TO_EVENT_LIST() {
        
        return super.lbl_ADD_TO_EVENT_LIST();
    }

    @Override
    protected int lbl_BUILD_ACCOUNTING_UPDATES() {
        
        return super.lbl_BUILD_ACCOUNTING_UPDATES();
    }

    @Override
    protected int lbl_CHECK_BALANCE_MOVEMENT() {
        
        return super.lbl_CHECK_BALANCE_MOVEMENT();
    }

    @Override
    protected int lbl_CHECK_CHARGEOFF_STATUS() {
        
        return super.lbl_CHECK_CHARGEOFF_STATUS();
    }

    @Override
    protected int lbl_CHECK_PROCESS_BILL() {
        
        return super.lbl_CHECK_PROCESS_BILL();
    }

    @Override
    protected int lbl_CHECK_PROPERTY_RECORD() {
        
        return super.lbl_CHECK_PROPERTY_RECORD();
    }

    @Override
    protected int lbl_CHECK_STATUS_IN_PREV_RECORD() {
        
        return super.lbl_CHECK_STATUS_IN_PREV_RECORD();
    }

    @Override
    protected int lbl_CONSTRUCT_BALANCE_TYPES() {
        
        return super.lbl_CONSTRUCT_BALANCE_TYPES();
    }

    @Override
    protected int lbl_DETERIMINE_MOVE_BALANCE() {
        
        return super.lbl_DETERIMINE_MOVE_BALANCE();
    }

    @Override
    protected int lbl_FORM_BASE_ENTRIES() {
        
        return super.lbl_FORM_BASE_ENTRIES();
    }

    @Override
    protected int lbl_GET_ACCOUNT_DETAILS() {
        
        return super.lbl_GET_ACCOUNT_DETAILS();
    }

    @Override
    protected int lbl_GET_AGEING_STATUS_IN_RECALCULATION() {
        
        return super.lbl_GET_AGEING_STATUS_IN_RECALCULATION();
    }

    @Override
    protected int lbl_GET_AGING_STATUS_IN() {
        
        return super.lbl_GET_AGING_STATUS_IN();
    }

    @Override
    protected int lbl_GET_BILL() {
        
        return super.lbl_GET_BILL();
    }

    @Override
    protected int lbl_GET_BILL_AMOUNTS() {
        
        return super.lbl_GET_BILL_AMOUNTS();
    }

    @Override
    protected int lbl_GET_BILL_DETAILS() {
        
        return super.lbl_GET_BILL_DETAILS();
    }

    @Override
    protected int lbl_GET_DUE_AMOUNTS() {
        
        return super.lbl_GET_DUE_AMOUNTS();
    }

    @Override
    protected int lbl_GET_EVENT_DATE() {
        
        return super.lbl_GET_EVENT_DATE();
    }

    @Override
    protected int lbl_GET_EVENT_TYPES() {
        
        return super.lbl_GET_EVENT_TYPES();
    }

    @Override
    protected int lbl_GET_MANUAL_AGING_STATUS_IN() {
        
        return super.lbl_GET_MANUAL_AGING_STATUS_IN();
    }

    @Override
    protected int lbl_GET_PARTICIPANT_DETAILS() {
        
        return super.lbl_GET_PARTICIPANT_DETAILS();
    }

    @Override
    protected int lbl_GET_PREVIOUS_BILL_AGE_STATUS() {
        
        return super.lbl_GET_PREVIOUS_BILL_AGE_STATUS();
    }

    @Override
    protected int lbl_GET_PREVIOUS_MOVE_BALANCE_AGE_STATUS() {
        
        return super.lbl_GET_PREVIOUS_MOVE_BALANCE_AGE_STATUS();
    }

    @Override
    protected int lbl_GET_PREVIOUS_OVERDUE_AGE_STATUS() {
        
        return super.lbl_GET_PREVIOUS_OVERDUE_AGE_STATUS();
    }

    @Override
    protected int lbl_GET_PREV_PROP_RECORD() {
        
        return super.lbl_GET_PREV_PROP_RECORD();
    }

    @Override
    protected int lbl_GET_PRIMARY_ACTIVITY_ID() {
        
        return super.lbl_GET_PRIMARY_ACTIVITY_ID();
    }

    @Override
    protected int lbl_HANDLE_ERROR() {
        
        return super.lbl_HANDLE_ERROR();
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
    protected int lbl_PROCESS_ACCOUNTING() {
        
        return super.lbl_PROCESS_ACCOUNTING();
    }

    @Override
    protected int lbl_PROCESS_ACTION() {
        
        return super.lbl_PROCESS_ACTION();
    }

    @Override
    protected int lbl_PROCESS_AUTH_ACTION() {
        
        return super.lbl_PROCESS_AUTH_ACTION();
    }

    @Override
    protected int lbl_PROCESS_BILL_ACCOUNTING() {
        
        return super.lbl_PROCESS_BILL_ACCOUNTING();
    }

    @Override
    protected int lbl_PROCESS_DELETE_ACTION() {
        
        return super.lbl_PROCESS_DELETE_ACTION();
    }

    @Override
    protected int lbl_PROCESS_INPUT_ACTION() {
        
        return super.lbl_PROCESS_INPUT_ACTION();
    }

    @Override
    protected int lbl_PROCESS_REVERSE_ACTION() {
        
        return super.lbl_PROCESS_REVERSE_ACTION();
    }

    @Override
    protected int lbl_SET_ACTIVITY_DETAILS() {
        
        return super.lbl_SET_ACTIVITY_DETAILS();
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
    public void stack(AA_ACCOUNT_AGE_BILLS_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
