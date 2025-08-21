package com;

import com.temenos.t24.AA_ACCOUNTING_ACTIVITY_ALLOCATE_cl;
import com.temenos.t24.component_AA_Accounting_18_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AA_Settlement_18_cl;
import com.temenos.t24.component_AC_AccountOpening_21_cl;
import com.temenos.t24.component_AC_EntryCreation_20_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_CQ_ChqSubmit_16_cl;
import com.temenos.t24.component_DD_Contract_16_cl;
import com.temenos.t24.component_EB_API_9_cl;
import com.temenos.t24.component_EB_Display_15_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_Interface_17_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_ST_CompanyCreation_22_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountingActivityAllocate extends AA_ACCOUNTING_ACTIVITY_ALLOCATE_cl {

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
    public component_AF_Framework_17_cl getAF_Framework() {
        
        return super.getAF_Framework();
    }

    @Override
    public String getBASICName() {
        
        return super.getBASICName();
    }

    @Override
    public component_CQ_ChqSubmit_16_cl getCQ_ChqSubmit() {
        
        return super.getCQ_ChqSubmit();
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
    public component_EB_Display_15_cl getEB_Display() {
        
        return super.getEB_Display();
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
    public jVar invoke(Object arg0, Object arg1, Object arg2, Object arg3) {
        
        return super.invoke(arg0, arg1, arg2, arg3);
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
    protected int lbl_CHECK_INDIRECT_CHEQUE() {
        
        return super.lbl_CHECK_INDIRECT_CHEQUE();
    }

    @Override
    protected int lbl_CONSOLIDATE_ACTIVITIES() {
        
        return super.lbl_CONSOLIDATE_ACTIVITIES();
    }

    @Override
    protected int lbl_DETERMINE_ACTIVITIES() {
        
        return super.lbl_DETERMINE_ACTIVITIES();
    }

    @Override
    protected int lbl_DETERMINE_TRANSACTION_SIGN() {
        
        return super.lbl_DETERMINE_TRANSACTION_SIGN();
    }

    @Override
    protected int lbl_DO_CHQ_PROCESSING() {
        
        return super.lbl_DO_CHQ_PROCESSING();
    }

    @Override
    protected int lbl_DO_DD_PROCESSING() {
        
        return super.lbl_DO_DD_PROCESSING();
    }

    @Override
    protected int lbl_GET_ACTIVITY() {
        
        return super.lbl_GET_ACTIVITY();
    }

    @Override
    protected int lbl_GET_ARRANGEMENT_ACTIVITY_REFERENCE() {
        
        return super.lbl_GET_ARRANGEMENT_ACTIVITY_REFERENCE();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_READ_ACT_RECORD() {
        
        return super.lbl_READ_ACT_RECORD();
    }

    @Override
    protected int lbl_UPDATE_ENTRY() {
        
        return super.lbl_UPDATE_ENTRY();
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
    public void stack(AA_ACCOUNTING_ACTIVITY_ALLOCATE_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
