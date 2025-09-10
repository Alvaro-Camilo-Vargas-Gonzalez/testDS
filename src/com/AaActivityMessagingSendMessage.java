package com;

import com.temenos.t24.AA_ACTIVITY_MESSAGING_SEND_MESSAGE_cl;
import com.temenos.t24.component_AA_ActivityMessaging_24_cl;
import com.temenos.t24.component_AA_Customer_16_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Interest_16_cl;
import com.temenos.t24.component_AA_Participant_19_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AA_ShareTransfer_20_cl;
import com.temenos.t24.component_AC_AccountOpening_21_cl;
import com.temenos.t24.component_AC_Fees_12_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_DE_API_9_cl;
import com.temenos.t24.component_DE_Outward_15_cl;
import com.temenos.t24.component_EB_API_9_cl;
import com.temenos.t24.component_EB_Delivery_16_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_MDLPTY_Party_13_cl;
import com.temenos.t24.component_ST_CompanyCreation_22_cl;
import com.temenos.t24.component_ST_Config_14_cl;
import com.temenos.t24.component_ST_Customer_16_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaActivityMessagingSendMessage extends AA_ACTIVITY_MESSAGING_SEND_MESSAGE_cl {

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
    public component_AA_ActivityMessaging_24_cl getAA_ActivityMessaging() {
        
        return super.getAA_ActivityMessaging();
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
    public component_AA_ShareTransfer_20_cl getAA_ShareTransfer() {
        
        return super.getAA_ShareTransfer();
    }

    @Override
    public component_AC_AccountOpening_21_cl getAC_AccountOpening() {
        
        return super.getAC_AccountOpening();
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
    public component_DE_API_9_cl getDE_API() {
        
        return super.getDE_API();
    }

    @Override
    public component_DE_Outward_15_cl getDE_Outward() {
        
        return super.getDE_Outward();
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
    public component_EB_Delivery_16_cl getEB_Delivery() {
        
        return super.getEB_Delivery();
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
    public component_ST_CompanyCreation_22_cl getST_CompanyCreation() {
        
        return super.getST_CompanyCreation();
    }

    @Override
    public component_ST_Config_14_cl getST_Config() {
        
        return super.getST_Config();
    }

    @Override
    public component_ST_Customer_16_cl getST_Customer() {
        
        return super.getST_Customer();
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
    protected int lbl_BUILD_AANEW_HANDOFF() {
        
        return super.lbl_BUILD_AANEW_HANDOFF();
    }

    @Override
    protected int lbl_BUILD_ADVANCE_HANDOFF_DATA() {
        
        return super.lbl_BUILD_ADVANCE_HANDOFF_DATA();
    }

    @Override
    protected int lbl_BUILD_INTEREST_ACCRUAL_DETAILS() {
        
        return super.lbl_BUILD_INTEREST_ACCRUAL_DETAILS();
    }

    @Override
    protected int lbl_BUILD_INTEREST_ACCRUAL_HANDOFF() {
        
        return super.lbl_BUILD_INTEREST_ACCRUAL_HANDOFF();
    }

    @Override
    protected int lbl_CALL_EB_HANDOFF() {
        
        return super.lbl_CALL_EB_HANDOFF();
    }

    @Override
    protected int lbl_CHECK_AA_ACTIVITY() {
        
        return super.lbl_CHECK_AA_ACTIVITY();
    }

    @Override
    protected int lbl_CHECK_ACTIVITY_PRESENT() {
        
        return super.lbl_CHECK_ACTIVITY_PRESENT();
    }

    @Override
    protected int lbl_CHECK_REPLAY() {
        
        return super.lbl_CHECK_REPLAY();
    }

    @Override
    protected int lbl_CHECK_REQUIRED_APPLICATION() {
        
        return super.lbl_CHECK_REQUIRED_APPLICATION();
    }

    @Override
    protected int lbl_CHECK_UPDATE_FLAG() {
        
        return super.lbl_CHECK_UPDATE_FLAG();
    }

    @Override
    protected int lbl_FORM_CURR_PROPERTY_DETAILS() {
        
        return super.lbl_FORM_CURR_PROPERTY_DETAILS();
    }

    @Override
    protected int lbl_FORM_DELIVERY_MESSAGES() {
        
        return super.lbl_FORM_DELIVERY_MESSAGES();
    }

    @Override
    protected int lbl_GET_ACCOUNT_RECORD() {
        
        return super.lbl_GET_ACCOUNT_RECORD();
    }

    @Override
    protected int lbl_GET_CURR_PROPERTY_RECORD() {
        
        return super.lbl_GET_CURR_PROPERTY_RECORD();
    }

    @Override
    protected int lbl_GET_CUSTOMER_RECORD() {
        
        return super.lbl_GET_CUSTOMER_RECORD();
    }

    @Override
    protected int lbl_GET_EXTERNAL_ACCT_NO() {
        
        return super.lbl_GET_EXTERNAL_ACCT_NO();
    }

    @Override
    protected int lbl_GET_FACILITY_AND_DEAL_DETS() {
        
        return super.lbl_GET_FACILITY_AND_DEAL_DETS();
    }

    @Override
    protected int lbl_GET_FWD_RECORD_DETAILS() {
        
        return super.lbl_GET_FWD_RECORD_DETAILS();
    }

    @Override
    protected int lbl_GET_MASTER_ARRANGEMENT() {
        
        return super.lbl_GET_MASTER_ARRANGEMENT();
    }

    @Override
    protected int lbl_GET_NEXT_CHANGE_ACTIVITY_DATE() {
        
        return super.lbl_GET_NEXT_CHANGE_ACTIVITY_DATE();
    }

    @Override
    protected int lbl_GET_OLD_RECORD_DETAILS() {
        
        return super.lbl_GET_OLD_RECORD_DETAILS();
    }

    @Override
    protected int lbl_GET_PARTICIPANTS_LIST() {
        
        return super.lbl_GET_PARTICIPANTS_LIST();
    }

    @Override
    protected int lbl_GET_PARTICIPANT_DETAILS() {
        
        return super.lbl_GET_PARTICIPANT_DETAILS();
    }

    @Override
    protected int lbl_GET_PROJECT_ACCRUALS() {
        
        return super.lbl_GET_PROJECT_ACCRUALS();
    }

    @Override
    protected int lbl_HANDLE_ERROR() {
        
        return super.lbl_HANDLE_ERROR();
    }

    @Override
    protected int lbl_HANDOFF_INTEREST_ACCRUALS() {
        
        return super.lbl_HANDOFF_INTEREST_ACCRUALS();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_PARTICIPANTS_ACTION() {
        
        return super.lbl_PARTICIPANTS_ACTION();
    }

    @Override
    protected int lbl_POPULATE_HANDOFF() {
        
        return super.lbl_POPULATE_HANDOFF();
    }

    @Override
    protected int lbl_POPULATE_RECORD_1() {
        
        return super.lbl_POPULATE_RECORD_1();
    }

    @Override
    protected int lbl_POPULATE_RECORD_2() {
        
        return super.lbl_POPULATE_RECORD_2();
    }

    @Override
    protected int lbl_POPULATE_RECORD_3() {
        
        return super.lbl_POPULATE_RECORD_3();
    }

    @Override
    protected int lbl_POPULATE_RECORD_4() {
        
        return super.lbl_POPULATE_RECORD_4();
    }

    @Override
    protected int lbl_POPULATE_RECORD_5() {
        
        return super.lbl_POPULATE_RECORD_5();
    }

    @Override
    protected int lbl_POPULATE_RECORD_6() {
        
        return super.lbl_POPULATE_RECORD_6();
    }

    @Override
    protected int lbl_POPULATE_RECORD_7_AND_ABOVE() {
        
        return super.lbl_POPULATE_RECORD_7_AND_ABOVE();
    }

    @Override
    protected int lbl_POPULATE_REM_RECORDS() {
        
        return super.lbl_POPULATE_REM_RECORDS();
    }

    @Override
    protected int lbl_POPULATE_SWIFT_HANDOFF_RECORDS() {
        
        return super.lbl_POPULATE_SWIFT_HANDOFF_RECORDS();
    }

    @Override
    protected int lbl_POPULATE_USER_HANDOFF() {
        
        return super.lbl_POPULATE_USER_HANDOFF();
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
    protected int lbl_PROCESS_REVERSE_AUTHORISE_ACTION() {
        
        return super.lbl_PROCESS_REVERSE_AUTHORISE_ACTION();
    }

    @Override
    protected int lbl_PROCESS_SHARE_TRANSFER() {
        
        return super.lbl_PROCESS_SHARE_TRANSFER();
    }

    @Override
    protected int lbl_SET_ACTIVITY_DETAILS() {
        
        return super.lbl_SET_ACTIVITY_DETAILS();
    }

    @Override
    protected int lbl_STORE_CURR_PARTICIPANT_DETAILS() {
        
        return super.lbl_STORE_CURR_PARTICIPANT_DETAILS();
    }

    @Override
    protected int lbl_STORE_CURR_PARTICIPANT_OLD_DETAILS() {
        
        return super.lbl_STORE_CURR_PARTICIPANT_OLD_DETAILS();
    }

    @Override
    protected int lbl_STORE_PROPERTY_DETAILS() {
        
        return super.lbl_STORE_PROPERTY_DETAILS();
    }

    @Override
    protected int lbl_STORE_TRANS_PROPERTY_DETAILS() {
        
        return super.lbl_STORE_TRANS_PROPERTY_DETAILS();
    }

    @Override
    protected int lbl_UPDATE_ARRANGEMENT() {
        
        return super.lbl_UPDATE_ARRANGEMENT();
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
    public void stack(AA_ACTIVITY_MESSAGING_SEND_MESSAGE_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
