package com;

import com.temenos.t24.AA_ACCOUNT_RECORD_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Accounting_18_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AC_AccountOpening_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_Interface_17_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_EB_Template_16_cl;
import com.temenos.t24.component_ST_CompanyCreation_22_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountRecord extends AA_ACCOUNT_RECORD_cl {

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
    public component_AA_Framework_17_cl getAA_Framework() {
        
        return super.getAA_Framework();
    }

    @Override
    public component_AA_ProductFramework_23_cl getAA_ProductFramework() {
        
        return super.getAA_ProductFramework();
    }

    @Override
    public component_AC_AccountOpening_21_cl getAC_AccountOpening() {
        
        return super.getAC_AccountOpening();
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
    public component_EB_Interface_17_cl getEB_Interface() {
        
        return super.getEB_Interface();
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
    public jVar invoke(Object... arg0) {
        
        return super.invoke(arg0);
    }

    @Override
    public jVar invoke(Object arg0) {
        
        return super.invoke(arg0);
    }

    @Override
    public void keepMoving() {
        
        super.keepMoving();
    }

    @Override
    protected int lbl_ALLOCATE_ACCOUNT_NUMBER() {
        
        return super.lbl_ALLOCATE_ACCOUNT_NUMBER();
    }

    @Override
    protected int lbl_CHECK_ACCOUNT_EXISTS() {
        
        return super.lbl_CHECK_ACCOUNT_EXISTS();
    }

    @Override
    protected int lbl_CHECK_EXTERNAL_FINANCIAL() {
        
        return super.lbl_CHECK_EXTERNAL_FINANCIAL();
    }

    @Override
    protected int lbl_DISABLE_ACCOUNT_FIELDS() {
        
        return super.lbl_DISABLE_ACCOUNT_FIELDS();
    }

    @Override
    protected int lbl_DISABLE_BALANCE_NETTING_FIELDS() {
        
        return super.lbl_DISABLE_BALANCE_NETTING_FIELDS();
    }

    @Override
    protected int lbl_DISABLE_OFFER_FIELDS() {
        
        return super.lbl_DISABLE_OFFER_FIELDS();
    }

    @Override
    protected int lbl_DO_NEW_ARRANGEMENT_CHECKS() {
        
        return super.lbl_DO_NEW_ARRANGEMENT_CHECKS();
    }

    @Override
    protected int lbl_DisableFieldsMCA() {
        
        return super.lbl_DisableFieldsMCA();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_MAKE_FIELDS_NOINPUT() {
        
        return super.lbl_MAKE_FIELDS_NOINPUT();
    }

    @Override
    protected int lbl_MAKE_LINK_AC_NUMBER_NOINPUT() {
        
        return super.lbl_MAKE_LINK_AC_NUMBER_NOINPUT();
    }

    @Override
    protected int lbl_PROCESS_RECORD() {
        
        return super.lbl_PROCESS_RECORD();
    }

    @Override
    protected int lbl_UPDATE_RULE_TYPE() {
        
        return super.lbl_UPDATE_RULE_TYPE();
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
    public void stack(AA_ACCOUNT_RECORD_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
