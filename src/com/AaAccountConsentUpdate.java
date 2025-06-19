package com;

import com.temenos.t24.AA_ACCOUNT_CONSENT_UPDATE_cl;
import com.temenos.t24.component_AA_Customer_16_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_API_9_cl;
import com.temenos.t24.component_EB_DataAccess_17_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_Interface_17_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_PZ_Config_14_cl;
import com.temenos.t24.component_PZ_Consent_15_cl;
import com.temenos.t24.component_PZ_ModelBank_16_cl;
import com.temenos.t24.component_ST_CompanyCreation_22_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountConsentUpdate extends AA_ACCOUNT_CONSENT_UPDATE_cl {

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
    public component_EB_DataAccess_17_cl getEB_DataAccess() {
        
        return super.getEB_DataAccess();
    }

    @Override
    public component_EB_ErrorProcessing_22_cl getEB_ErrorProcessing() {
        
        return super.getEB_ErrorProcessing();
    }

    @Override
    public component_EB_Interface_17_cl getEB_Interface() {
        
        return super.getEB_Interface();
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
    public component_PZ_Config_14_cl getPZ_Config() {
        
        return super.getPZ_Config();
    }

    @Override
    public component_PZ_Consent_15_cl getPZ_Consent() {
        
        return super.getPZ_Consent();
    }

    @Override
    public component_PZ_ModelBank_16_cl getPZ_ModelBank() {
        
        return super.getPZ_ModelBank();
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
    protected int lbl_FETCH_COMPANY() {
        
        return super.lbl_FETCH_COMPANY();
    }

    @Override
    protected int lbl_FETCH_OLD_REC() {
        
        return super.lbl_FETCH_OLD_REC();
    }

    @Override
    protected int lbl_FORM_XREF_ID() {
        
        return super.lbl_FORM_XREF_ID();
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
    protected int lbl_SCHEDULE_CLOSURE_ACTIVITY() {
        
        return super.lbl_SCHEDULE_CLOSURE_ACTIVITY();
    }

    @Override
    protected int lbl_SCHEDULE_EXPIRY_ACTIVITY() {
        
        return super.lbl_SCHEDULE_EXPIRY_ACTIVITY();
    }

    @Override
    protected int lbl_SET_ACTIVITY_DETAILS() {
        
        return super.lbl_SET_ACTIVITY_DETAILS();
    }

    @Override
    protected int lbl_UPDATE_CONSENT_ID() {
        
        return super.lbl_UPDATE_CONSENT_ID();
    }

    @Override
    protected int lbl_UPDATE_CONSENT_XREF() {
        
        return super.lbl_UPDATE_CONSENT_XREF();
    }

    @Override
    protected int lbl_UPDATE_STATUS() {
        
        return super.lbl_UPDATE_STATUS();
    }

    @Override
    protected int lbl_updateConsentStatus() {
        
        return super.lbl_updateConsentStatus();
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
    public void stack(AA_ACCOUNT_CONSENT_UPDATE_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
