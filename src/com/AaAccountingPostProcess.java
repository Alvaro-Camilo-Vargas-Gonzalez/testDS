package com;

import com.temenos.t24.AA_ACCOUNTING_POST_PROCESS_cl;
import com.temenos.t24.component_AA_Accounting_18_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AA_Settlement_18_cl;
import com.temenos.t24.component_AC_AccountOpening_21_cl;
import com.temenos.t24.component_AC_EntryCreation_20_cl;
import com.temenos.t24.component_CQ_ChqConfig_16_cl;
import com.temenos.t24.component_DD_Contract_16_cl;
import com.temenos.t24.component_EB_API_9_cl;
import com.temenos.t24.component_EB_CMM_9_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_Service_15_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_EB_Versions_16_cl;
import com.temenos.t24.component_MDLREF_ReferenceData_20_cl;
import com.temenos.t24.component_ST_CompanyCreation_22_cl;
import com.temenos.t24.component_ST_Config_14_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountingPostProcess extends AA_ACCOUNTING_POST_PROCESS_cl {

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
    public component_AA_Accounting_18_cl getAA_Accounting() {
        
        return super.getAA_Accounting();
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
    public component_AA_Settlement_18_cl getAA_Settlement() {
        
        return super.getAA_Settlement();
    }

    @Override
    public component_AC_AccountOpening_21_cl getAC_AccountOpening() {
        
        return super.getAC_AccountOpening();
    }

    @Override
    public component_AC_EntryCreation_20_cl getAC_EntryCreation() {
        
        return super.getAC_EntryCreation();
    }

    @Override
    public String getBASICName() {
        
        return super.getBASICName();
    }

    @Override
    public component_CQ_ChqConfig_16_cl getCQ_ChqConfig() {
        
        return super.getCQ_ChqConfig();
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
    public component_DD_Contract_16_cl getDD_Contract() {
        
        return super.getDD_Contract();
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
    public component_EB_CMM_9_cl getEB_CMM() {
        
        return super.getEB_CMM();
    }

    @Override
    public component_EB_ErrorProcessing_22_cl getEB_ErrorProcessing() {
        
        return super.getEB_ErrorProcessing();
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
    public component_EB_Versions_16_cl getEB_Versions() {
        
        return super.getEB_Versions();
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
    public component_ST_CompanyCreation_22_cl getST_CompanyCreation() {
        
        return super.getST_CompanyCreation();
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
    public jVar invoke(Object arg0, Object arg1) {
        
        return super.invoke(arg0, arg1);
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
    protected int lbl_ADD_AMOUNTS() {
        
        return super.lbl_ADD_AMOUNTS();
    }

    @Override
    protected int lbl_ADD_REVERSAL() {
        
        return super.lbl_ADD_REVERSAL();
    }

    @Override
    protected int lbl_CALL_PROCESS_ARR_ACTIVITY() {
        
        return super.lbl_CALL_PROCESS_ARR_ACTIVITY();
    }

    @Override
    protected int lbl_CHECK_AAA_ID_FOUND() {
        
        return super.lbl_CHECK_AAA_ID_FOUND();
    }

    @Override
    protected int lbl_CHECK_ALREADY_PROCESSED_AAA() {
        
        return super.lbl_CHECK_ALREADY_PROCESSED_AAA();
    }

    @Override
    protected int lbl_CHECK_CURRENT_DATED_TRANSACTION() {
        
        return super.lbl_CHECK_CURRENT_DATED_TRANSACTION();
    }

    @Override
    protected int lbl_CONSOLIDATE_AMOUNTS() {
        
        return super.lbl_CONSOLIDATE_AMOUNTS();
    }

    @Override
    protected int lbl_CREATE_ACTIVITY_RECORDS() {
        
        return super.lbl_CREATE_ACTIVITY_RECORDS();
    }

    @Override
    protected int lbl_DETERMINE_FUNCTION() {
        
        return super.lbl_DETERMINE_FUNCTION();
    }

    @Override
    protected int lbl_GET_ACTIVITY_ID() {
        
        return super.lbl_GET_ACTIVITY_ID();
    }

    @Override
    protected int lbl_GET_ARRANGEMENT_DETAILS() {
        
        return super.lbl_GET_ARRANGEMENT_DETAILS();
    }

    @Override
    protected int lbl_GET_CHQ_TXN_CODE() {
        
        return super.lbl_GET_CHQ_TXN_CODE();
    }

    @Override
    protected int lbl_GET_DD_TXN_CODE() {
        
        return super.lbl_GET_DD_TXN_CODE();
    }

    @Override
    protected int lbl_GET_TXN_ID() {
        
        return super.lbl_GET_TXN_ID();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_LOG_EXCEPTION() {
        
        return super.lbl_LOG_EXCEPTION();
    }

    @Override
    protected int lbl_MANAGE_COMMON() {
        
        return super.lbl_MANAGE_COMMON();
    }

    @Override
    protected int lbl_PROCESS_ACTIVITY() {
        
        return super.lbl_PROCESS_ACTIVITY();
    }

    @Override
    protected int lbl_PROCESS_ARRANGEMENT() {
        
        return super.lbl_PROCESS_ARRANGEMENT();
    }

    @Override
    protected int lbl_RESTORE_COMPANY() {
        
        return super.lbl_RESTORE_COMPANY();
    }

    @Override
    protected int lbl_REVERSE_ORDER_ACTIVITY() {
        
        return super.lbl_REVERSE_ORDER_ACTIVITY();
    }

    @Override
    protected int lbl_RUNNING_UNDER_INTRADAY_PROCESSING() {
        
        return super.lbl_RUNNING_UNDER_INTRADAY_PROCESSING();
    }

    @Override
    protected int lbl_STORE_COMPANY() {
        
        return super.lbl_STORE_COMPANY();
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
    public void stack(AA_ACCOUNTING_POST_PROCESS_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
