package com;

import com.temenos.t24.AA_ACCOUNT_VALIDATE_BUNDLE_HIERARCHY_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_BundleHierarchy_22_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_ProductBundle_20_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AA_ProductManagement_24_cl;
import com.temenos.t24.component_AC_AccountOpening_21_cl;
import com.temenos.t24.component_AC_SoftAccounting_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_ST_CompanyCreation_22_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountValidateBundleHierarchy extends AA_ACCOUNT_VALIDATE_BUNDLE_HIERARCHY_cl {

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
    public component_AA_ProductBundle_20_cl getAA_ProductBundle() {
        
        return super.getAA_ProductBundle();
    }

    @Override
    public component_AA_ProductFramework_23_cl getAA_ProductFramework() {
        
        return super.getAA_ProductFramework();
    }

    @Override
    public component_AA_ProductManagement_24_cl getAA_ProductManagement() {
        
        return super.getAA_ProductManagement();
    }

    @Override
    public component_AC_AccountOpening_21_cl getAC_AccountOpening() {
        
        return super.getAC_AccountOpening();
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
    public jVar invoke(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4) {
        
        return super.invoke(arg0, arg1, arg2, arg3, arg4);
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
    protected int lbl_AppendError() {
        
        return super.lbl_AppendError();
    }

    @Override
    protected int lbl_BuildBundleHierarchyFields() {
        
        return super.lbl_BuildBundleHierarchyFields();
    }

    @Override
    protected int lbl_CheckValidationRequired() {
        
        return super.lbl_CheckValidationRequired();
    }

    @Override
    protected int lbl_FindLinkBundleId() {
        
        return super.lbl_FindLinkBundleId();
    }

    @Override
    protected int lbl_GetProcessingMode() {
        
        return super.lbl_GetProcessingMode();
    }

    @Override
    protected int lbl_GetProductLine() {
        
        return super.lbl_GetProductLine();
    }

    @Override
    protected int lbl_Initialise() {
        
        return super.lbl_Initialise();
    }

    @Override
    protected int lbl_LoadRequiredDetails() {
        
        return super.lbl_LoadRequiredDetails();
    }

    @Override
    protected int lbl_RESTORE_COMPANY() {
        
        return super.lbl_RESTORE_COMPANY();
    }

    @Override
    protected int lbl_RaiseError() {
        
        return super.lbl_RaiseError();
    }

    @Override
    protected int lbl_SAVE_COMPANY() {
        
        return super.lbl_SAVE_COMPANY();
    }

    @Override
    protected int lbl_ValidateBalanceTreatment() {
        
        return super.lbl_ValidateBalanceTreatment();
    }

    @Override
    protected int lbl_ValidateBalanceType() {
        
        return super.lbl_ValidateBalanceType();
    }

    @Override
    protected int lbl_ValidateBundleArrangement() {
        
        return super.lbl_ValidateBundleArrangement();
    }

    @Override
    protected int lbl_ValidateLinkAccountNumber() {
        
        return super.lbl_ValidateLinkAccountNumber();
    }

    @Override
    protected int lbl_ValidateMultiCurrency() {
        
        return super.lbl_ValidateMultiCurrency();
    }

    @Override
    protected int lbl_ValidateParentAccount() {
        
        return super.lbl_ValidateParentAccount();
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
    public void stack(AA_ACCOUNT_VALIDATE_BUNDLE_HIERARCHY_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
