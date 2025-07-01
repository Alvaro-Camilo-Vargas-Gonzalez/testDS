package com;

import com.temenos.t24.AA_ACCOUNT_CREDIT_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Accounting_18_cl;
import com.temenos.t24.component_AA_BalanceMaintenance_25_cl;
import com.temenos.t24.component_AA_ChargeOff_16_cl;
import com.temenos.t24.component_AA_Customer_16_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Limit_13_cl;
import com.temenos.t24.component_AA_Participant_19_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AA_TermAmount_17_cl;
import com.temenos.t24.component_AC_BalanceUpdates_21_cl;
import com.temenos.t24.component_AC_SoftAccounting_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_DataAccess_17_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_OverrideProcessing_25_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_LI_Config_14_cl;
import com.temenos.t24.component_LI_LimitTransaction_23_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountCredit extends AA_ACCOUNT_CREDIT_cl {

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
    public component_AA_BalanceMaintenance_25_cl getAA_BalanceMaintenance() {
        
        return super.getAA_BalanceMaintenance();
    }

    @Override
    public component_AA_ChargeOff_16_cl getAA_ChargeOff() {
        
        return super.getAA_ChargeOff();
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
    public component_AA_Limit_13_cl getAA_Limit() {
        
        return super.getAA_Limit();
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
    public component_AA_TermAmount_17_cl getAA_TermAmount() {
        
        return super.getAA_TermAmount();
    }

    @Override
    public component_AC_BalanceUpdates_21_cl getAC_BalanceUpdates() {
        
        return super.getAC_BalanceUpdates();
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
    public component_EB_DataAccess_17_cl getEB_DataAccess() {
        
        return super.getEB_DataAccess();
    }

    @Override
    public component_EB_ErrorProcessing_22_cl getEB_ErrorProcessing() {
        
        return super.getEB_ErrorProcessing();
    }

    @Override
    public component_EB_OverrideProcessing_25_cl getEB_OverrideProcessing() {
        
        return super.getEB_OverrideProcessing();
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
    public component_LI_Config_14_cl getLI_Config() {
        
        return super.getLI_Config();
    }

    @Override
    public component_LI_LimitTransaction_23_cl getLI_LimitTransaction() {
        
        return super.getLI_LimitTransaction();
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
    protected int lbl_BUILD_CHARGEOFF_ACCOUNTING_UPDATES() {
        
        return super.lbl_BUILD_CHARGEOFF_ACCOUNTING_UPDATES();
    }

    @Override
    protected int lbl_CALL_PROCESS_ACCOUNT_DETAILS() {
        
        return super.lbl_CALL_PROCESS_ACCOUNT_DETAILS();
    }

    @Override
    protected int lbl_CHECK_ACCOUNT_ADJUSTMENT() {
        
        return super.lbl_CHECK_ACCOUNT_ADJUSTMENT();
    }

    @Override
    protected int lbl_CHECK_CONTRACT_STYLE_LIMIT() {
        
        return super.lbl_CHECK_CONTRACT_STYLE_LIMIT();
    }

    @Override
    protected int lbl_CHECK_TAKEOVER_ARR() {
        
        return super.lbl_CHECK_TAKEOVER_ARR();
    }

    @Override
    protected int lbl_CHECK_TO_PROCESS_ADJ() {
        
        return super.lbl_CHECK_TO_PROCESS_ADJ();
    }

    @Override
    protected int lbl_FULL_CHARGEOFF_ENTRIES() {
        
        return super.lbl_FULL_CHARGEOFF_ENTRIES();
    }

    @Override
    protected int lbl_GET_ACTIVITY_BALANCES_DETAIL() {
        
        return super.lbl_GET_ACTIVITY_BALANCES_DETAIL();
    }

    @Override
    protected int lbl_GET_ADJUSTMENT_EVENT_TYPE() {
        
        return super.lbl_GET_ADJUSTMENT_EVENT_TYPE();
    }

    @Override
    protected int lbl_GET_BALANCE_AMOUNT() {
        
        return super.lbl_GET_BALANCE_AMOUNT();
    }

    @Override
    protected int lbl_GET_BALANCE_TYPE() {
        
        return super.lbl_GET_BALANCE_TYPE();
    }

    @Override
    protected int lbl_GET_CHARGEOFF_BALANCE() {
        
        return super.lbl_GET_CHARGEOFF_BALANCE();
    }

    @Override
    protected int lbl_GET_EVENT_TYPES() {
        
        return super.lbl_GET_EVENT_TYPES();
    }

    @Override
    protected int lbl_GET_PARTICIPANT_DETAILS() {
        
        return super.lbl_GET_PARTICIPANT_DETAILS();
    }

    @Override
    protected int lbl_GET_PRINCIPAL_BALANCE() {
        
        return super.lbl_GET_PRINCIPAL_BALANCE();
    }

    @Override
    protected int lbl_GET_SUB_TYPE() {
        
        return super.lbl_GET_SUB_TYPE();
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
    protected int lbl_ONLINE_INCREASE() {
        
        return super.lbl_ONLINE_INCREASE();
    }

    @Override
    protected int lbl_PROCESS_ACCOUNTING_UPDATES() {
        
        return super.lbl_PROCESS_ACCOUNTING_UPDATES();
    }

    @Override
    protected int lbl_PROCESS_ACCOUNT_ADJUSTMENTS() {
        
        return super.lbl_PROCESS_ACCOUNT_ADJUSTMENTS();
    }

    @Override
    protected int lbl_PROCESS_ACCOUNT_CREDIT() {
        
        return super.lbl_PROCESS_ACCOUNT_CREDIT();
    }

    @Override
    protected int lbl_PROCESS_ACCOUNT_DETAILS() {
        
        return super.lbl_PROCESS_ACCOUNT_DETAILS();
    }

    @Override
    protected int lbl_PROCESS_ACTION() {
        
        return super.lbl_PROCESS_ACTION();
    }

    @Override
    protected int lbl_PROCESS_AUTHORISE_ACTION() {
        
        return super.lbl_PROCESS_AUTHORISE_ACTION();
    }

    @Override
    protected int lbl_PROCESS_BALANCE_TYPES() {
        
        return super.lbl_PROCESS_BALANCE_TYPES();
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
    protected int lbl_PROCESS_PARTICIPANT_ACTION() {
        
        return super.lbl_PROCESS_PARTICIPANT_ACTION();
    }

    @Override
    protected int lbl_PROCESS_REVERSE_ACTION() {
        
        return super.lbl_PROCESS_REVERSE_ACTION();
    }

    @Override
    protected int lbl_READ_LIMIT_RECORD() {
        
        return super.lbl_READ_LIMIT_RECORD();
    }

    @Override
    protected int lbl_REVERSE_ACCOUNT_DETAILS() {
        
        return super.lbl_REVERSE_ACCOUNT_DETAILS();
    }

    @Override
    protected int lbl_REVERSE_LIMIT_AMOUNT() {
        
        return super.lbl_REVERSE_LIMIT_AMOUNT();
    }

    @Override
    protected int lbl_SET_ACTIVITY_DETAILS() {
        
        return super.lbl_SET_ACTIVITY_DETAILS();
    }

    @Override
    protected int lbl_SET_UPDATE_ACCOUNT_FLAG() {
        
        return super.lbl_SET_UPDATE_ACCOUNT_FLAG();
    }

    @Override
    protected int lbl_UPDATE_ACCOUNT_DETAILS() {
        
        return super.lbl_UPDATE_ACCOUNT_DETAILS();
    }

    @Override
    protected int lbl_UPDATE_ONLINE_LIMIT() {
        
        return super.lbl_UPDATE_ONLINE_LIMIT();
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
    public void stack(AA_ACCOUNT_CREDIT_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
