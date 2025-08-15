package com;

import com.temenos.t24.AA_ACCOUNT_SHARE_TRANSFER_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Accounting_18_cl;
import com.temenos.t24.component_AA_ChargeOff_16_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Participant_19_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AA_ShareTransfer_20_cl;
import com.temenos.t24.component_AC_BalanceUpdates_21_cl;
import com.temenos.t24.component_AC_SoftAccounting_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_ST_Customer_16_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountShareTransfer extends AA_ACCOUNT_SHARE_TRANSFER_cl {

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
    public component_AA_ChargeOff_16_cl getAA_ChargeOff() {
        
        return super.getAA_ChargeOff();
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
    public component_AA_ShareTransfer_20_cl getAA_ShareTransfer() {
        
        return super.getAA_ShareTransfer();
    }

    @Override
    public component_AC_BalanceUpdates_21_cl getAC_BalanceUpdates() {
        
        return super.getAC_BalanceUpdates();
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
    protected int lbl_ADD_TO_EVENT_LIST() {
        
        return super.lbl_ADD_TO_EVENT_LIST();
    }

    @Override
    protected int lbl_BUILD_ACCOUNTING_UPDATES() {
        
        return super.lbl_BUILD_ACCOUNTING_UPDATES();
    }

    @Override
    protected int lbl_CALCULATE_ACCOUNTING_SIGN() {
        
        return super.lbl_CALCULATE_ACCOUNTING_SIGN();
    }

    @Override
    protected int lbl_CHECK_CHARGEOFF_STATUS() {
        
        return super.lbl_CHECK_CHARGEOFF_STATUS();
    }

    @Override
    protected int lbl_CUR_ACCOUNTING_UPDATES() {
        
        return super.lbl_CUR_ACCOUNTING_UPDATES();
    }

    @Override
    protected int lbl_FORM_ADDITIONAL_INFO_FOR_BOOK() {
        
        return super.lbl_FORM_ADDITIONAL_INFO_FOR_BOOK();
    }

    @Override
    protected int lbl_GET_BALANCE_TYPE() {
        
        return super.lbl_GET_BALANCE_TYPE();
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
    protected int lbl_MAIN_PROCESS() {
        
        return super.lbl_MAIN_PROCESS();
    }

    @Override
    protected int lbl_PROCESS_ACCOUNTING_UPDATES() {
        
        return super.lbl_PROCESS_ACCOUNTING_UPDATES();
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
    protected int lbl_RAISE_BUYER_ENTRIES() {
        
        return super.lbl_RAISE_BUYER_ENTRIES();
    }

    @Override
    protected int lbl_RAISE_SELLER_ENTRIES() {
        
        return super.lbl_RAISE_SELLER_ENTRIES();
    }

    @Override
    protected int lbl_SET_ACTIVITY_DETAILS() {
        
        return super.lbl_SET_ACTIVITY_DETAILS();
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
    public void stack(AA_ACCOUNT_SHARE_TRANSFER_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
