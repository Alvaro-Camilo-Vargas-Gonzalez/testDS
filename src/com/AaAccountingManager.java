package com;

import com.temenos.t24.AA_ACCOUNTING_MANAGER_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Accounting_18_cl;
import com.temenos.t24.component_AA_Customer_16_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Officers_16_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AA_TermAmount_17_cl;
import com.temenos.t24.component_AC_EntryCreation_20_cl;
import com.temenos.t24.component_AC_SoftAccounting_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_BF_ConBalanceUpdates_23_cl;
import com.temenos.t24.component_EB_DataAccess_17_cl;
import com.temenos.t24.component_EB_Service_15_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_EB_TransactionControl_25_cl;
import com.temenos.t24.component_MDLPTY_Party_13_cl;
import com.temenos.t24.component_ST_ExchangeRate_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountingManager extends AA_ACCOUNTING_MANAGER_cl {

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
    public component_AA_Customer_16_cl getAA_Customer() {
        
        return super.getAA_Customer();
    }

    @Override
    public component_AA_Framework_17_cl getAA_Framework() {
        
        return super.getAA_Framework();
    }

    @Override
    public component_AA_Officers_16_cl getAA_Officers() {
        
        return super.getAA_Officers();
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
    public component_AC_EntryCreation_20_cl getAC_EntryCreation() {
        
        return super.getAC_EntryCreation();
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
    public component_BF_ConBalanceUpdates_23_cl getBF_ConBalanceUpdates() {
        
        return super.getBF_ConBalanceUpdates();
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
    public component_EB_DataAccess_17_cl getEB_DataAccess() {
        
        return super.getEB_DataAccess();
    }

    @Override
    public component_EB_Service_15_cl getEB_Service() {
        
        return super.getEB_Service();
    }

    @Override
    public component_EB_SystemTables_19_cl getEB_SystemTables() {
        
        return super.getEB_SystemTables();
    }

    @Override
    public component_EB_TransactionControl_25_cl getEB_TransactionControl() {
        
        return super.getEB_TransactionControl();
    }

    @Override
    public String getImportBasic() {
        
        return super.getImportBasic();
    }

    @Override
    public component_MDLPTY_Party_13_cl getMDLPTY_Party() {
        
        return super.getMDLPTY_Party();
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
    public jVar invoke(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5) {
        
        return super.invoke(arg0, arg1, arg2, arg3, arg4, arg5);
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
    protected int lbl_ADD_ENTRIES() {
        
        return super.lbl_ADD_ENTRIES();
    }

    @Override
    protected int lbl_AMOUNT_CONVERSION() {
        
        return super.lbl_AMOUNT_CONVERSION();
    }

    @Override
    protected int lbl_BUILD_BASE_INFO() {
        
        return super.lbl_BUILD_BASE_INFO();
    }

    @Override
    protected int lbl_BUILD_ENTRIES() {
        
        return super.lbl_BUILD_ENTRIES();
    }

    @Override
    protected int lbl_BUILD_EVENT_INFO() {
        
        return super.lbl_BUILD_EVENT_INFO();
    }

    @Override
    protected int lbl_CALL_ACCOUNTING() {
        
        return super.lbl_CALL_ACCOUNTING();
    }

    @Override
    protected int lbl_CALL_SOFT_ACCOUNTING() {
        
        return super.lbl_CALL_SOFT_ACCOUNTING();
    }

    @Override
    protected int lbl_CHECK_ARGUMENTS() {
        
        return super.lbl_CHECK_ARGUMENTS();
    }

    @Override
    protected int lbl_CHECK_CONTEXT_VALUES() {
        
        return super.lbl_CHECK_CONTEXT_VALUES();
    }

    @Override
    protected int lbl_CHECK_EVENT_INFO() {
        
        return super.lbl_CHECK_EVENT_INFO();
    }

    @Override
    protected int lbl_CHECK_PARENT_TXN_PROCESS() {
        
        return super.lbl_CHECK_PARENT_TXN_PROCESS();
    }

    @Override
    protected int lbl_CHECK_TRANSACTION_CODES() {
        
        return super.lbl_CHECK_TRANSACTION_CODES();
    }

    @Override
    protected int lbl_DETERMINE_ACCOUNTING_MODE() {
        
        return super.lbl_DETERMINE_ACCOUNTING_MODE();
    }

    @Override
    protected int lbl_DO_SECONDARY_CHECKS() {
        
        return super.lbl_DO_SECONDARY_CHECKS();
    }

    @Override
    protected int lbl_EXCHANGE_RATE() {
        
        return super.lbl_EXCHANGE_RATE();
    }

    @Override
    protected int lbl_GET_ACCOUNTING_DETAILS() {
        
        return super.lbl_GET_ACCOUNTING_DETAILS();
    }

    @Override
    protected int lbl_GET_LOCAL_EQUIVALENT() {
        
        return super.lbl_GET_LOCAL_EQUIVALENT();
    }

    @Override
    protected int lbl_GET_PROPERTY_RECORD() {
        
        return super.lbl_GET_PROPERTY_RECORD();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_POPULATE_ADDTIONAL_EVENT_DATA() {
        
        return super.lbl_POPULATE_ADDTIONAL_EVENT_DATA();
    }

    @Override
    protected int lbl_PROCESS_ACCOUNTING() {
        
        return super.lbl_PROCESS_ACCOUNTING();
    }

    @Override
    protected int lbl_PROCESS_DIRECT_ACCOUNTING() {
        
        return super.lbl_PROCESS_DIRECT_ACCOUNTING();
    }

    @Override
    protected int lbl_UPDATE_ACCOUNTING_DETAILS() {
        
        return super.lbl_UPDATE_ACCOUNTING_DETAILS();
    }

    @Override
    protected int lbl_UPDATE_LOCAL_REF() {
        
        return super.lbl_UPDATE_LOCAL_REF();
    }

    @Override
    protected int lbl_UPDATE_OUR_REFERENCE() {
        
        return super.lbl_UPDATE_OUR_REFERENCE();
    }

    @Override
    protected int lbl_UPDATE_RULE_ID() {
        
        return super.lbl_UPDATE_RULE_ID();
    }

    @Override
    protected int lbl_VALIDATE_TARGET_CLASS() {
        
        return super.lbl_VALIDATE_TARGET_CLASS();
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
    public void stack(AA_ACCOUNTING_MANAGER_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
