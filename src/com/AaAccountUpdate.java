package com;

import com.temenos.t24.AA_ACCOUNT_UPDATE_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Limit_13_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AC_AccountOpening_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_DataAccess_17_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_IC_Config_14_cl;
import com.temenos.t24.component_IN_IbanAPI_12_cl;
import com.temenos.t24.component_LI_Config_14_cl;
import com.temenos.t24.component_LI_LimitTransaction_23_cl;
import com.temenos.t24.component_ST_CompanyCreation_22_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountUpdate extends AA_ACCOUNT_UPDATE_cl {

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
    public int INSERT__I__CustomerService__Parent() {
        
        return super.INSERT__I__CustomerService__Parent();
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
    public component_AA_Framework_17_cl getAA_Framework() {
        
        return super.getAA_Framework();
    }

    @Override
    public component_AA_Limit_13_cl getAA_Limit() {
        
        return super.getAA_Limit();
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
    public component_EB_ErrorProcessing_22_cl getEB_ErrorProcessing() {
        
        return super.getEB_ErrorProcessing();
    }

    @Override
    public component_EB_SystemTables_19_cl getEB_SystemTables() {
        
        return super.getEB_SystemTables();
    }

    @Override
    public component_IC_Config_14_cl getIC_Config() {
        
        return super.getIC_Config();
    }

    @Override
    public component_IN_IbanAPI_12_cl getIN_IbanAPI() {
        
        return super.getIN_IbanAPI();
    }

    @Override
    public String getImportBasic() {
        
        return super.getImportBasic();
    }

    @Override
    public component_LI_Config_14_cl getLI_Config() {
        
        return super.getLI_Config();
    }

    @Override
    public component_LI_LimitTransaction_23_cl getLI_LimitTransaction() {
        
        return super.getLI_LimitTransaction();
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
    protected int lbl_ADL_REC() {
        
        return super.lbl_ADL_REC();
    }

    @Override
    protected int lbl_CHECK_REFER_LIMIT() {
        
        return super.lbl_CHECK_REFER_LIMIT();
    }

    @Override
    protected int lbl_CREATE_ACCOUNT_DEBIT_LIMIT() {
        
        return super.lbl_CREATE_ACCOUNT_DEBIT_LIMIT();
    }

    @Override
    protected int lbl_GET_ACCOUNT_NUMBER() {
        
        return super.lbl_GET_ACCOUNT_NUMBER();
    }

    @Override
    protected int lbl_GET_ALT_ACCT_ID() {
        
        return super.lbl_GET_ALT_ACCT_ID();
    }

    @Override
    protected int lbl_GET_IBAN_NUMBER() {
        
        return super.lbl_GET_IBAN_NUMBER();
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
    protected int lbl_POPULATE_IBAN() {
        
        return super.lbl_POPULATE_IBAN();
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
    protected int lbl_PROCESS_DELETE_REVERSE_ACTION() {
        
        return super.lbl_PROCESS_DELETE_REVERSE_ACTION();
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
    protected int lbl_REMOVE_LIMIT_UPDATE() {
        
        return super.lbl_REMOVE_LIMIT_UPDATE();
    }

    @Override
    protected int lbl_SET_ACTIVITY_DETAILS() {
        
        return super.lbl_SET_ACTIVITY_DETAILS();
    }

    @Override
    protected int lbl_UPDATE_ACCOUNT() {
        
        return super.lbl_UPDATE_ACCOUNT();
    }

    @Override
    protected int lbl_UPDATE_ACCOUNT_DETAILS() {
        
        return super.lbl_UPDATE_ACCOUNT_DETAILS();
    }

    @Override
    protected int lbl_UPDATE_ACC_DEB_LIMIT_DATES() {
        
        return super.lbl_UPDATE_ACC_DEB_LIMIT_DATES();
    }

    @Override
    protected int lbl_UPDATE_ANNIVERSARY_DATE() {
        
        return super.lbl_UPDATE_ANNIVERSARY_DATE();
    }

    @Override
    protected int lbl_UPDATE_LIMIT_ACCOUNT() {
        
        return super.lbl_UPDATE_LIMIT_ACCOUNT();
    }

    @Override
    protected int lbl_UPDATE_LINK_TO_LIMIT() {
   
        return super.lbl_UPDATE_LINK_TO_LIMIT();
    }

    @Override
    protected int lbl_WRITE_ACCOUNT_RECORD() {
        
        return super.lbl_WRITE_ACCOUNT_RECORD();
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
    public void stack(AA_ACCOUNT_UPDATE_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
