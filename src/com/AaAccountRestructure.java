package com;

import com.temenos.t24.AA_ACCOUNT_RESTRUCTURE_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Accounting_18_cl;
import com.temenos.t24.component_AA_BundleHierarchy_22_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AC_API_9_cl;
import com.temenos.t24.component_AC_AccountOpening_21_cl;
import com.temenos.t24.component_AC_BalanceUpdates_21_cl;
import com.temenos.t24.component_AC_SoftAccounting_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_API_9_cl;
import com.temenos.t24.component_EB_DataAccess_17_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_RE_ConBalanceUpdates_23_cl;
import com.temenos.t24.component_ST_ExchangeRate_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountRestructure extends AA_ACCOUNT_RESTRUCTURE_cl {

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
    public component_AA_BundleHierarchy_22_cl getAA_BundleHierarchy() {
        
        return super.getAA_BundleHierarchy();
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
    public component_AC_API_9_cl getAC_API() {
        
        return super.getAC_API();
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
    public component_EB_DataAccess_17_cl getEB_DataAccess() {
        
        return super.getEB_DataAccess();
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
    public component_RE_ConBalanceUpdates_23_cl getRE_ConBalanceUpdates() {
        
        return super.getRE_ConBalanceUpdates();
    }

    @Override
    public String getReplacementInfo() {
        
        return super.getReplacementInfo();
    }

    @Override
    public component_ST_ExchangeRate_19_cl getST_ExchangeRate() {
        
        return super.getST_ExchangeRate();
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
    protected int lbl_ADD_TO_EVENT_LIST() {
        
        return super.lbl_ADD_TO_EVENT_LIST();
    }

    @Override
    protected int lbl_BUILD_ACCOUNTING_UPDATES() {
        
        return super.lbl_BUILD_ACCOUNTING_UPDATES();
    }

    @Override
    protected int lbl_BUILD_NEW_PARENT_ENTRY() {
        
        return super.lbl_BUILD_NEW_PARENT_ENTRY();
    }

    @Override
    protected int lbl_BUILD_OLD_PARENT_ENTRY() {
        
        return super.lbl_BUILD_OLD_PARENT_ENTRY();
    }

    @Override
    protected int lbl_DERIVE_CASH_LADDER() {
        
        return super.lbl_DERIVE_CASH_LADDER();
    }

    @Override
    protected int lbl_GET_ACCOUNT_BALANCES() {
        
        return super.lbl_GET_ACCOUNT_BALANCES();
    }

    @Override
    protected int lbl_GET_AC_BALANCE_TYPE() {
        
        return super.lbl_GET_AC_BALANCE_TYPE();
    }

    @Override
    protected int lbl_GET_CCY_LIST() {
        
        return super.lbl_GET_CCY_LIST();
    }

    @Override
    protected int lbl_GET_EVENT_TYPES() {
        
        return super.lbl_GET_EVENT_TYPES();
    }

    @Override
    protected int lbl_GET_LOCAL_EQUIVALENT() {
        
        return super.lbl_GET_LOCAL_EQUIVALENT();
    }

    @Override
    protected int lbl_GET_MID_CONVERTED_AMOUNTS() {
        
        return super.lbl_GET_MID_CONVERTED_AMOUNTS();
    }

    @Override
    protected int lbl_GET_OLD_PARENT() {
        
        return super.lbl_GET_OLD_PARENT();
    }

    @Override
    protected int lbl_GetChildAccounts() {
        
        return super.lbl_GetChildAccounts();
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
    protected int lbl_MOVE_CASH_LADDER() {
        
        return super.lbl_MOVE_CASH_LADDER();
    }

    @Override
    protected int lbl_PROCESS_ACCOUNTING_UPDATES() {
        
        return super.lbl_PROCESS_ACCOUNTING_UPDATES();
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
    protected int lbl_PROCESS_INPUT_ACTION() {
        
        return super.lbl_PROCESS_INPUT_ACTION();
    }

    @Override
    protected int lbl_RELEASE_ACCOUNTS() {
        
        return super.lbl_RELEASE_ACCOUNTS();
    }

    @Override
    protected int lbl_REPLAY_AC_LOCKED_EVENTS() {
        
        return super.lbl_REPLAY_AC_LOCKED_EVENTS();
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
    public void stack(AA_ACCOUNT_RESTRUCTURE_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
