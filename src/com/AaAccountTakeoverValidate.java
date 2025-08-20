package com;

import com.temenos.t24.AA_ACCOUNT_TAKEOVER_VALIDATE_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AC_API_9_cl;
import com.temenos.t24.component_AC_AccountOpening_21_cl;
import com.temenos.t24.component_AC_BalanceUpdates_21_cl;
import com.temenos.t24.component_AC_HighVolume_17_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_API_9_cl;
import com.temenos.t24.component_EB_DataAccess_17_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_EB_Utility_15_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountTakeoverValidate extends AA_ACCOUNT_TAKEOVER_VALIDATE_cl {

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
    public component_AA_Framework_17_cl getAA_Framework() {
        
        return super.getAA_Framework();
    }

    @Override
    public component_AC_API_9_cl getAC_API() {
        
        return super.getAC_API();
    }

    @Override
    public component_AC_AccountOpening_21_cl getAC_AccountOpening() {
        
        return super.getAC_AccountOpening();
    }

    @Override
    public component_AC_BalanceUpdates_21_cl getAC_BalanceUpdates() {
        
        return super.getAC_BalanceUpdates();
    }

    @Override
    public component_AC_HighVolume_17_cl getAC_HighVolume() {
        
        return super.getAC_HighVolume();
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
    public component_EB_SystemTables_19_cl getEB_SystemTables() {
        
        return super.getEB_SystemTables();
    }

    @Override
    public component_EB_Utility_15_cl getEB_Utility() {
        
        return super.getEB_Utility();
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
    public jVar invoke(Object arg0, Object arg1, Object arg2) {
        
        return super.invoke(arg0, arg1, arg2);
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
    protected int lbl_CHECK_ACCOUNT_COMPENSATION() {
        
        return super.lbl_CHECK_ACCOUNT_COMPENSATION();
    }

    @Override
    protected int lbl_CHECK_ACCOUNT_OPEN_DATE() {
        
        return super.lbl_CHECK_ACCOUNT_OPEN_DATE();
    }

    @Override
    protected int lbl_CHECK_ACCR_BALANCE() {
        
        return super.lbl_CHECK_ACCR_BALANCE();
    }

    @Override
    protected int lbl_CHECK_AUTO_PAY_ACCOUNT() {
        
        return super.lbl_CHECK_AUTO_PAY_ACCOUNT();
    }

    @Override
    protected int lbl_CHECK_CHARGE_ACCOUNT() {
        
        return super.lbl_CHECK_CHARGE_ACCOUNT();
    }

    @Override
    protected int lbl_CHECK_HVT_ALL_ONE_PRODUCT() {
        
        return super.lbl_CHECK_HVT_ALL_ONE_PRODUCT();
    }

    @Override
    protected int lbl_CHECK_ICA_ACCOUNT_IND() {
        
        return super.lbl_CHECK_ICA_ACCOUNT_IND();
    }

    @Override
    protected int lbl_CHECK_INTEREST_LIQ_ACCT() {
        
        return super.lbl_CHECK_INTEREST_LIQ_ACCT();
    }

    @Override
    protected int lbl_CHECK_INT_LIQU_ACCT() {
        
        return super.lbl_CHECK_INT_LIQU_ACCT();
    }

    @Override
    protected int lbl_CHECK_LINK_ACCOUNTS() {
        
        return super.lbl_CHECK_LINK_ACCOUNTS();
    }

    @Override
    protected int lbl_CHECK_ONLINE_CLEARED_BALANCE() {
        
        return super.lbl_CHECK_ONLINE_CLEARED_BALANCE();
    }

    @Override
    protected int lbl_CHECK_PENDING_CLOSURE() {
        
        return super.lbl_CHECK_PENDING_CLOSURE();
    }

    @Override
    protected int lbl_CHECK_SUSPENSE_ACCOUNT() {
        
        return super.lbl_CHECK_SUSPENSE_ACCOUNT();
    }

    @Override
    protected int lbl_CHECK_UNAUTH_MOMENTS() {
        
        return super.lbl_CHECK_UNAUTH_MOMENTS();
    }

    @Override
    protected int lbl_CHECK_VALUE_DATE_BALANCE() {
        
        return super.lbl_CHECK_VALUE_DATE_BALANCE();
    }

    @Override
    protected int lbl_CHECK_WORKING_BALANCE() {
        
        return super.lbl_CHECK_WORKING_BALANCE();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_PROCESS_VALIDATE() {
        
        return super.lbl_PROCESS_VALIDATE();
    }

    @Override
    protected int lbl_ZERO_BALANCE_VALIDATE() {
        
        return super.lbl_ZERO_BALANCE_VALIDATE();
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
    public void stack(AA_ACCOUNT_TAKEOVER_VALIDATE_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
