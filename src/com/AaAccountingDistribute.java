package com;

import com.temenos.t24.AA_ACCOUNTING_DISTRIBUTE_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Accounting_18_cl;
import com.temenos.t24.component_AA_Dormancy_16_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AC_AccountOpening_21_cl;
import com.temenos.t24.component_AC_Config_14_cl;
import com.temenos.t24.component_AC_EntryCreation_20_cl;
import com.temenos.t24.component_AC_HighVolume_17_cl;
import com.temenos.t24.component_EB_DataAccess_17_cl;
import com.temenos.t24.component_EB_Security_16_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_ST_CompanyCreation_22_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountingDistribute extends AA_ACCOUNTING_DISTRIBUTE_cl {

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
    public component_AA_Dormancy_16_cl getAA_Dormancy() {
        
        return super.getAA_Dormancy();
    }

    @Override
    public component_AA_Framework_17_cl getAA_Framework() {
        
        return super.getAA_Framework();
    }

    @Override
    public component_AC_AccountOpening_21_cl getAC_AccountOpening() {
        
        return super.getAC_AccountOpening();
    }

    @Override
    public component_AC_Config_14_cl getAC_Config() {
        
        return super.getAC_Config();
    }

    @Override
    public component_AC_EntryCreation_20_cl getAC_EntryCreation() {
        
        return super.getAC_EntryCreation();
    }

    @Override
    public component_AC_HighVolume_17_cl getAC_HighVolume() {
        
        return super.getAC_HighVolume();
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
    public component_EB_DataAccess_17_cl getEB_DataAccess() {
        
        return super.getEB_DataAccess();
    }

    @Override
    public component_EB_Security_16_cl getEB_Security() {
        
        return super.getEB_Security();
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
    protected int lbl_CHECK_PROCESS_AA_ACCOUNT() {
        
        return super.lbl_CHECK_PROCESS_AA_ACCOUNT();
    }

    @Override
    protected int lbl_CREATE_NEW_ENTRY() {
        
        return super.lbl_CREATE_NEW_ENTRY();
    }

    @Override
    protected int lbl_FORWARD_DATED_ACCOUNTING() {
        
        return super.lbl_FORWARD_DATED_ACCOUNTING();
    }

    @Override
    protected int lbl_GET_AC_BALANCE_TYPE() {
        
        return super.lbl_GET_AC_BALANCE_TYPE();
    }

    @Override
    protected int lbl_GET_SUSPENSE_ACCOUNT() {
        
        return super.lbl_GET_SUSPENSE_ACCOUNT();
    }

    @Override
    protected int lbl_INITIALIZE() {
        
        return super.lbl_INITIALIZE();
    }

    @Override
    protected int lbl_LOCK_RECORD() {
        
        return super.lbl_LOCK_RECORD();
    }

    @Override
    protected int lbl_PROCESS_AA_ACCOUNTING() {
        
        return super.lbl_PROCESS_AA_ACCOUNTING();
    }

    @Override
    protected int lbl_RAISE_DORMANCY_OVERRIDE() {
    
        return super.lbl_RAISE_DORMANCY_OVERRIDE();
    }

    @Override
    protected int lbl_READ_ACCOUNT() {
        
        return super.lbl_READ_ACCOUNT();
    }

    @Override
    protected int lbl_TECHNICAL_LOAN_ENTRY() {
        
        return super.lbl_TECHNICAL_LOAN_ENTRY();
    }

    @Override
    protected int lbl_UPDATE_BALANCE_TYPE() {
        
        return super.lbl_UPDATE_BALANCE_TYPE();
    }

    @Override
    protected int lbl_UPDATE_ITEM_REF() {
        
        return super.lbl_UPDATE_ITEM_REF();
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
    public void stack(AA_ACCOUNTING_DISTRIBUTE_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
