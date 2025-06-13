package com;

import com.temenos.t24.AA_ACCOUNT_CLOSURE_VALIDATE_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AC_AccountClosure_21_cl;
import com.temenos.t24.component_AC_AccountOpening_21_cl;
import com.temenos.t24.component_AC_BalanceUpdates_21_cl;
import com.temenos.t24.component_AC_HighVolume_17_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_API_9_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_OverrideProcessing_25_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountClosureValidate extends AA_ACCOUNT_CLOSURE_VALIDATE_cl {

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
    public component_AA_Framework_17_cl getAA_Framework() {
        
        return super.getAA_Framework();
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
    public component_AC_AccountClosure_21_cl getAC_AccountClosure() {
        
        return super.getAC_AccountClosure();
    }

    @Override
    public component_AC_AccountOpening_21_cl getAC_AccountOpening() {
        
        return super.getAC_AccountOpening();
    }

    @Override
    public component_AC_BalanceUpdates_21_cl getAC_BalanceUpdates() {
        
        return super.getAC_BalanceUpdates();
    }

    @Override
    public component_AC_HighVolume_17_cl getAC_HighVolume() {
        
        return super.getAC_HighVolume();
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
    public component_EB_API_9_cl getEB_API() {
        
        return super.getEB_API();
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
    protected int lbl_CHECK_CLOSURE_BILL() {
        
        return super.lbl_CHECK_CLOSURE_BILL();
    }

    @Override
    protected int lbl_CHECK_DEPENDENT_RECORD_EXISTS() {
        
        return super.lbl_CHECK_DEPENDENT_RECORD_EXISTS();
    }

    @Override
    protected int lbl_CHECK_DUE_PAY_BILLS() {
        
        return super.lbl_CHECK_DUE_PAY_BILLS();
    }

    @Override
    protected int lbl_CHECK_FINAL_ACCOUNT_CLOSURE() {
        
        return super.lbl_CHECK_FINAL_ACCOUNT_CLOSURE();
    }

    @Override
    protected int lbl_CHECK_FWD_BALANCES() {
        
        return super.lbl_CHECK_FWD_BALANCES();
    }

    @Override
    protected int lbl_CHECK_FWD_ENTRIES() {
        
        return super.lbl_CHECK_FWD_ENTRIES();
    }

    @Override
    protected int lbl_CHECK_RETROSPECT_IN_COB_LIST() {
        
        return super.lbl_CHECK_RETROSPECT_IN_COB_LIST();
    }

    @Override
    protected int lbl_CHECK_SETTLEMENT_ACCOUNT() {
        
        return super.lbl_CHECK_SETTLEMENT_ACCOUNT();
    }

    @Override
    protected int lbl_CHECK_UNAUTH_ENTRIES() {
        
        return super.lbl_CHECK_UNAUTH_ENTRIES();
    }

    @Override
    protected int lbl_CHK_ACCT_CLOSURE_PARAMETERS() {
        
        return super.lbl_CHK_ACCT_CLOSURE_PARAMETERS();
    }

    @Override
    protected int lbl_FILTER_BILL_IDS() {
        
        return super.lbl_FILTER_BILL_IDS();
    }

    @Override
    protected int lbl_GET_BILL_DETAILS() {
        
        return super.lbl_GET_BILL_DETAILS();
    }

    @Override
    protected int lbl_GET_BILL_REFERENCES() {
        
        return super.lbl_GET_BILL_REFERENCES();
    }

    @Override
    protected int lbl_GET_FWD_BALANCES() {
        
        return super.lbl_GET_FWD_BALANCES();
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
    protected int lbl_PROCESS_ACTION() {
        
        return super.lbl_PROCESS_ACTION();
    }

    @Override
    protected int lbl_PROCESS_AUTH_ACTION() {
        
        return super.lbl_PROCESS_AUTH_ACTION();
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
    public void stack(AA_ACCOUNT_CLOSURE_VALIDATE_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
