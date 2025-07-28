package com;

import com.temenos.t24.AA_ACCOUNT_HIERARCHY_VALIDATE_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_BundleHierarchy_22_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AC_AccountOpening_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountHierachyValidate extends AA_ACCOUNT_HIERARCHY_VALIDATE_cl {

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
    public component_AA_BundleHierarchy_22_cl getAA_BundleHierarchy() {
        
        return super.getAA_BundleHierarchy();
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
    public jVar getDataStructureFields(java.lang.Object arg0) {
        
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
    public jVar invoke(java.lang.Object arg0, java.lang.Object arg1, java.lang.Object arg2, java.lang.Object arg3,
            java.lang.Object arg4, java.lang.Object arg5) {
        
        return super.invoke(arg0, arg1, arg2, arg3, arg4, arg5);
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
    protected int lbl_BUNDLE_ARRANGEMENT_VALIDATE() {
        
        return super.lbl_BUNDLE_ARRANGEMENT_VALIDATE();
    }

    @Override
    protected int lbl_CHANGE_PARENT_VALIDATE() {
        
        return super.lbl_CHANGE_PARENT_VALIDATE();
    }

    @Override
    protected int lbl_CHECK_ACCOUNT_NATURE() {
        
        return super.lbl_CHECK_ACCOUNT_NATURE();
    }

    @Override
    protected int lbl_GET_ALL_ACTIVE_POOL_ACCOUNTS() {
        
        return super.lbl_GET_ALL_ACTIVE_POOL_ACCOUNTS();
    }

    @Override
    protected int lbl_GET_ARRANGEMENT_DETAILS() {
        
        return super.lbl_GET_ARRANGEMENT_DETAILS();
    }

    @Override
    protected int lbl_GET_BUNDLE_ACCOUNT_DETAILS() {
        
        return super.lbl_GET_BUNDLE_ACCOUNT_DETAILS();
    }

    @Override
    protected int lbl_GET_BUNDLE_HIERARCHY_RECORD() {
        
        return super.lbl_GET_BUNDLE_HIERARCHY_RECORD();
    }

    @Override
    protected int lbl_GET_LINK_AC_ACCOUNT_DETAILS() {
        
        return super.lbl_GET_LINK_AC_ACCOUNT_DETAILS();
    }

    @Override
    protected int lbl_GET_PARENT_ACCOUNT_DETAILS() {
        
        return super.lbl_GET_PARENT_ACCOUNT_DETAILS();
    }

    @Override
    protected int lbl_GET_PARENT_BUNDLE_REFERENCE() {
        
        return super.lbl_GET_PARENT_BUNDLE_REFERENCE();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_LINK_AC_ACCOUNT_VALIDATE() {
        
        return super.lbl_LINK_AC_ACCOUNT_VALIDATE();
    }

    @Override
    protected int lbl_PARENT_ACCOUNT_VALIDATE() {
        
        return super.lbl_PARENT_ACCOUNT_VALIDATE();
    }

    @Override
    protected int lbl_PROCESS_CROSSVAL() {
        
        return super.lbl_PROCESS_CROSSVAL();
    }

    @Override
    protected int lbl_RAISE_ERROR() {
        
        return super.lbl_RAISE_ERROR();
    }

    @Override
    protected int lbl_VALIDATE_PARENT_CHILD_RELATION() {
        
        return super.lbl_VALIDATE_PARENT_CHILD_RELATION();
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
    public void stack(AA_ACCOUNT_HIERARCHY_VALIDATE_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
