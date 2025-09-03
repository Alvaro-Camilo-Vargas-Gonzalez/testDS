package com;

import com.temenos.t24.AA_ACTIVITY_CHARGES_VALIDATE_cl;
import com.temenos.t24.component_AA_ActivityCharges_22_cl;
import com.temenos.t24.component_AA_Dormancy_16_cl;
import com.temenos.t24.component_AA_Fees_12_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Participant_19_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_EB_Template_16_cl;
import com.temenos.t24.component_ST_CompanyCreation_22_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaActivityChargesValidate extends AA_ACTIVITY_CHARGES_VALIDATE_cl {

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
    public component_AA_ActivityCharges_22_cl getAA_ActivityCharges() {
        
        return super.getAA_ActivityCharges();
    }

    @Override
    public component_AA_Dormancy_16_cl getAA_Dormancy() {
        
        return super.getAA_Dormancy();
    }

    @Override
    public component_AA_Fees_12_cl getAA_Fees() {
        
        return super.getAA_Fees();
    }

    @Override
    public component_AA_Framework_17_cl getAA_Framework() {
        
        return super.getAA_Framework();
    }

    @Override
    public component_AA_Participant_19_cl getAA_Participant() {
        
        return super.getAA_Participant();
    }

    @Override
    public component_AA_ProductFramework_23_cl getAA_ProductFramework() {
        
        return super.getAA_ProductFramework();
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
    public component_EB_ErrorProcessing_22_cl getEB_ErrorProcessing() {
        
        return super.getEB_ErrorProcessing();
    }

    @Override
    public component_EB_SystemTables_19_cl getEB_SystemTables() {
        
        return super.getEB_SystemTables();
    }

    @Override
    public component_EB_Template_16_cl getEB_Template() {
        
        return super.getEB_Template();
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
    public jVar invoke(Object... arg0) {
        
        return super.invoke(arg0);
    }

    @Override
    public void keepMoving() {
        
        super.keepMoving();
    }

    @Override
    protected int lbl_ARRANGEMENT_CROSSVAL() {
        
        return super.lbl_ARRANGEMENT_CROSSVAL();
    }

    @Override
    protected int lbl_ARRANGEMENT_DEFAULTS() {
        
        return super.lbl_ARRANGEMENT_DEFAULTS();
    }

    @Override
    protected int lbl_AUTH_CROSSVAL() {
        
        return super.lbl_AUTH_CROSSVAL();
    }

    @Override
    protected int lbl_CHECK_CHARGE_PROPERTY() {
        
        return super.lbl_CHECK_CHARGE_PROPERTY();
    }

    @Override
    protected int lbl_CHECK_EPP_PRODUCT_INSTALLED() {
        
        return super.lbl_CHECK_EPP_PRODUCT_INSTALLED();
    }

    @Override
    protected int lbl_CHECK_NOLOG_ACTIVITY() {
        
        return super.lbl_CHECK_NOLOG_ACTIVITY();
    }

    @Override
    protected int lbl_CHECK_RESTRICTLOG_ACTIVITY() {
        
        return super.lbl_CHECK_RESTRICTLOG_ACTIVITY();
    }

    @Override
    protected int lbl_COMMON_CROSSVAL() {
        
        return super.lbl_COMMON_CROSSVAL();
    }

    @Override
    protected int lbl_CommonValidation() {
        
        return super.lbl_CommonValidation();
    }

    @Override
    protected int lbl_DEFAULT_ACTIVITY_ID() {
        
        return super.lbl_DEFAULT_ACTIVITY_ID();
    }

    @Override
    protected int lbl_DESIGNER_CROSSVAL() {
        
        return super.lbl_DESIGNER_CROSSVAL();
    }

    @Override
    protected int lbl_DESIGNER_DEFAULTS() {
        
        return super.lbl_DESIGNER_DEFAULTS();
    }

    @Override
    protected int lbl_GET_FROM_CHARGE_PROPERTY() {
        
        return super.lbl_GET_FROM_CHARGE_PROPERTY();
    }

    @Override
    protected int lbl_GET_PARTICIPANTS_COMMON() {
        
        return super.lbl_GET_PARTICIPANTS_COMMON();
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
    protected int lbl_PROCESS_CROSSVAL() {
        
        return super.lbl_PROCESS_CROSSVAL();
    }

    @Override
    protected int lbl_REAL_CROSSVAL() {
        
        return super.lbl_REAL_CROSSVAL();
    }

    @Override
    protected int lbl_VALIDATE_ACTIVITY_CHARGE() {
        
        return super.lbl_VALIDATE_ACTIVITY_CHARGE();
    }

    @Override
    protected int lbl_VALIDATE_CHARGE_AUTO_SETTLE() {
        
        return super.lbl_VALIDATE_CHARGE_AUTO_SETTLE();
    }

    @Override
    protected int lbl_VALIDATE_PARTICIPANT_CHARGE() {
        
        return super.lbl_VALIDATE_PARTICIPANT_CHARGE();
    }

    @Override
    protected int lbl_VALIDATE_SETTLE_ACTIVITY() {
        
        return super.lbl_VALIDATE_SETTLE_ACTIVITY();
    }

    @Override
    protected int lbl_ValidateBundleHierarchy() {
        
        return super.lbl_ValidateBundleHierarchy();
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
    public void stack(AA_ACTIVITY_CHARGES_VALIDATE_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
