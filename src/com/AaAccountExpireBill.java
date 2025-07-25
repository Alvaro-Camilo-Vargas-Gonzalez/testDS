package com;

import com.temenos.t24.AA_ACCOUNT_EXPIRE_BILL_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Accounting_18_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_NoticeWithdrawal_23_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AC_SoftAccounting_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountExpireBill extends AA_ACCOUNT_EXPIRE_BILL_cl {

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
    public component_AA_NoticeWithdrawal_23_cl getAA_NoticeWithdrawal() {
        
        return super.getAA_NoticeWithdrawal();
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
    public jVar getDataStructureFields(java.lang.Object arg0) {
        
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
    protected int lbl_BuildAccountingUpdates() {
        
        return super.lbl_BuildAccountingUpdates();
    }

    @Override
    protected int lbl_ExpireBill() {
        
        return super.lbl_ExpireBill();
    }

    @Override
    protected int lbl_GetBillDetailsRecord() {
        
        return super.lbl_GetBillDetailsRecord();
    }

    @Override
    protected int lbl_GetBillDueAmount() {
        
        return super.lbl_GetBillDueAmount();
    }

    @Override
    protected int lbl_GetEventType() {
        
        return super.lbl_GetEventType();
    }

    @Override
    protected int lbl_GetExpiringBills() {
        
        return super.lbl_GetExpiringBills();
    }

    @Override
    protected int lbl_GetPropertyBalance() {
        
        return super.lbl_GetPropertyBalance();
    }

    @Override
    protected int lbl_HandleError() {
        
        return super.lbl_HandleError();
    }

    @Override
    protected int lbl_Initialise() {
        
        return super.lbl_Initialise();
    }

    @Override
    protected int lbl_ProcessAccounting() {
        
        return super.lbl_ProcessAccounting();
    }

    @Override
    protected int lbl_ProcessAction() {
        
        return super.lbl_ProcessAction();
    }

    @Override
    protected int lbl_ProcessAuthoriseAction() {
        
        return super.lbl_ProcessAuthoriseAction();
    }

    @Override
    protected int lbl_ProcessInputAction() {
        
        return super.lbl_ProcessInputAction();
    }

    @Override
    protected int lbl_ProcessReverseAction() {
        
        return super.lbl_ProcessReverseAction();
    }

    @Override
    protected int lbl_SetActivitydetails() {
        
        return super.lbl_SetActivitydetails();
    }

    @Override
    protected int lbl_UpdateBillStatus() {
        
        return super.lbl_UpdateBillStatus();
    }

    @Override
    protected int lbl_WriteBillDetails() {
        
        return super.lbl_WriteBillDetails();
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
    public void stack(AA_ACCOUNT_EXPIRE_BILL_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
