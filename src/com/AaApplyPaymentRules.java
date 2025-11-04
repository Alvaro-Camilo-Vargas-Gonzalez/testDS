package com;

import com.temenos.t24.AA_APPLY_PAYMENT_RULES_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Interest_16_cl;
import com.temenos.t24.component_AA_Overdue_15_cl;
import com.temenos.t24.component_AA_Participant_19_cl;
import com.temenos.t24.component_AA_PaymentRules_19_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_PayoutRules_18_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AA_Tax_11_cl;
import com.temenos.t24.component_AC_BalanceUpdates_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaApplyPaymentRules extends AA_APPLY_PAYMENT_RULES_cl {

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
    public component_AA_Participant_19_cl getAA_Participant() {
        
        return super.getAA_Participant();
    }

    @Override
    public component_AA_PaymentRules_19_cl getAA_PaymentRules() {
        
        return super.getAA_PaymentRules();
    }

    @Override
    public component_AA_PaymentSchedule_22_cl getAA_PaymentSchedule() {
        
        return super.getAA_PaymentSchedule();
    }

    @Override
    public component_AA_PayoutRules_18_cl getAA_PayoutRules() {
        
        return super.getAA_PayoutRules();
    }

    @Override
    public component_AA_ProductFramework_23_cl getAA_ProductFramework() {
        
        return super.getAA_ProductFramework();
    }

    @Override
    public component_AA_Tax_11_cl getAA_Tax() {
        
        return super.getAA_Tax();
    }

    @Override
    public component_AC_BalanceUpdates_21_cl getAC_BalanceUpdates() {
        
        return super.getAC_BalanceUpdates();
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
            Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14,
            Object arg15, Object arg16) {
        
        return super.invoke(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14,
                arg15, arg16);
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
    protected int lbl_CHECK_FORWARD_ACTIVITY_EXISTS() {
        
        return super.lbl_CHECK_FORWARD_ACTIVITY_EXISTS();
    }

    @Override
    protected int lbl_CHECK_REPAY_REQD() {
        
        return super.lbl_CHECK_REPAY_REQD();
    }

    @Override
    protected int lbl_CHECK_REQD_INFO() {
        
        return super.lbl_CHECK_REQD_INFO();
    }

    @Override
    protected int lbl_CHECK_RESIDUAL_ENABLED() {
        
        return super.lbl_CHECK_RESIDUAL_ENABLED();
    }

    @Override
    protected int lbl_DETERMINE_SAME_DAY_PROCESS() {
        
        return super.lbl_DETERMINE_SAME_DAY_PROCESS();
    }

    @Override
    protected int lbl_DETERMINE_TAX_PAYMENT_PROPERTY() {
        
        return super.lbl_DETERMINE_TAX_PAYMENT_PROPERTY();
    }

    @Override
    protected int lbl_GET_ACCOUNT_DETAILS() {
        
        return super.lbl_GET_ACCOUNT_DETAILS();
    }

    @Override
    protected int lbl_GET_BILL_DETAILS() {
        
        return super.lbl_GET_BILL_DETAILS();
    }

    @Override
    protected int lbl_GET_CURRENT_PROPERTY_BALANCE() {
        
        return super.lbl_GET_CURRENT_PROPERTY_BALANCE();
    }

    @Override
    protected int lbl_GET_PROPERTY_BALANCE() {
        
        return super.lbl_GET_PROPERTY_BALANCE();
    }

    @Override
    protected int lbl_GET_PROPERTY_CLASS() {
        
        return super.lbl_GET_PROPERTY_CLASS();
    }

    @Override
    protected int lbl_GET_REQUIRED_BALANCES() {
        
        return super.lbl_GET_REQUIRED_BALANCES();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_INITIALISE_TEMP_CHARGE_INT_VALUES() {
        
        return super.lbl_INITIALISE_TEMP_CHARGE_INT_VALUES();
    }

    @Override
    protected int lbl_INSERT_PROPERTY_DETAILS() {
        
        return super.lbl_INSERT_PROPERTY_DETAILS();
    }

    @Override
    protected int lbl_INSERT_TAX_PROPERTY_DETAILS() {
        
        return super.lbl_INSERT_TAX_PROPERTY_DETAILS();
    }

    @Override
    protected int lbl_LOAD_REQUIRED_BALANCE() {
        
        return super.lbl_LOAD_REQUIRED_BALANCE();
    }

    @Override
    protected int lbl_PERFORM_SORT_FOR_BILL_DETAILS() {
        
        return super.lbl_PERFORM_SORT_FOR_BILL_DETAILS();
    }

    @Override
    protected int lbl_PROCESS_ACC_BALANCE_TAX() {
        
        return super.lbl_PROCESS_ACC_BALANCE_TAX();
    }

    @Override
    protected int lbl_PROCESS_BANK_BILLED_BALANCES() {
        
        return super.lbl_PROCESS_BANK_BILLED_BALANCES();
    }

    @Override
    protected int lbl_PROCESS_BANK_BILL_DATE_BALANCES() {
        
        return super.lbl_PROCESS_BANK_BILL_DATE_BALANCES();
    }

    @Override
    protected int lbl_PROCESS_BANK_CURRENT_BALANCES() {
        
        return super.lbl_PROCESS_BANK_CURRENT_BALANCES();
    }

    @Override
    protected int lbl_PROCESS_BILLS_BY_DATE() {
        
        return super.lbl_PROCESS_BILLS_BY_DATE();
    }

    @Override
    protected int lbl_PROCESS_BILLS_BY_PROPERTY() {
        
        return super.lbl_PROCESS_BILLS_BY_PROPERTY();
    }

    @Override
    protected int lbl_PROCESS_BILL_BALANCES() {
        
        return super.lbl_PROCESS_BILL_BALANCES();
    }

    @Override
    protected int lbl_PROCESS_CURRENT_BALANCES() {
        
        return super.lbl_PROCESS_CURRENT_BALANCES();
    }

    @Override
    protected int lbl_PROCESS_PAY_IN_ADVANCE_BALANCE() {
        
        return super.lbl_PROCESS_PAY_IN_ADVANCE_BALANCE();
    }

    @Override
    protected int lbl_PROCESS_REPAY_PROPERTY() {
        
        return super.lbl_PROCESS_REPAY_PROPERTY();
    }

    @Override
    protected int lbl_PROCESS_SETTLEMENT_RULES() {
        
        return super.lbl_PROCESS_SETTLEMENT_RULES();
    }

    @Override
    protected int lbl_PROCESS_TAX_PROPERTY() {
        
        return super.lbl_PROCESS_TAX_PROPERTY();
    }

    @Override
    protected int lbl_REINITIALISE_TEMP_VAR() {
        
        return super.lbl_REINITIALISE_TEMP_VAR();
    }

    @Override
    protected int lbl_SAME_DAY_PROCESS_FOR_TAX() {
        
        return super.lbl_SAME_DAY_PROCESS_FOR_TAX();
    }

    @Override
    protected int lbl_SORT_BILL_BY_DATE_FOR_SAME_TAX() {
        
        return super.lbl_SORT_BILL_BY_DATE_FOR_SAME_TAX();
    }

    @Override
    protected int lbl_SORT_BILL_BY_PROPERTY_FOR_SAME_TAX() {
        
        return super.lbl_SORT_BILL_BY_PROPERTY_FOR_SAME_TAX();
    }

    @Override
    protected int lbl_SORT_BILL_ORDER() {
        
        return super.lbl_SORT_BILL_ORDER();
    }

    @Override
    protected int lbl_SORT_SAME_DAY_FOR_TAX() {
        
        return super.lbl_SORT_SAME_DAY_FOR_TAX();
    }

    @Override
    protected int lbl_STORE_CHARGE_INTEREST_BILLS() {
        
        return super.lbl_STORE_CHARGE_INTEREST_BILLS();
    }

    @Override
    protected int lbl_STORE_TEMP_BILL_VALUES() {
        
        return super.lbl_STORE_TEMP_BILL_VALUES();
    }

    @Override
    protected int lbl_UPDATE_CHARGE_TAX_TO_BILL() {
        
        return super.lbl_UPDATE_CHARGE_TAX_TO_BILL();
    }

    @Override
    protected int lbl_UPDATE_INTEREST_TAX_TO_BILL() {
        
        return super.lbl_UPDATE_INTEREST_TAX_TO_BILL();
    }

    @Override
    protected int lbl_UPDATE_PROPERTY_LIST() {
        
        return super.lbl_UPDATE_PROPERTY_LIST();
    }

    @Override
    protected int lbl_UPDATE_SORTED_BILL() {
        
        return super.lbl_UPDATE_SORTED_BILL();
    }

    @Override
    protected int lbl_UPDATE_STORED_CHARGE_INT_BILLS() {
        
        return super.lbl_UPDATE_STORED_CHARGE_INT_BILLS();
    }

    @Override
    protected int lbl_UPDATE_TAX_PROPERTY_LIST() {
        
        return super.lbl_UPDATE_TAX_PROPERTY_LIST();
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
    public void stack(AA_APPLY_PAYMENT_RULES_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
