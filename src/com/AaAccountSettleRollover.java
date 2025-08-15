package com;

import com.temenos.t24.AA_ACCOUNT_SETTLE_ROLLOVER_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Accounting_18_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Participant_19_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AA_SplitsMerges_19_cl;
import com.temenos.t24.component_AC_SoftAccounting_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccountSettleRollover extends AA_ACCOUNT_SETTLE_ROLLOVER_cl {

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
    public component_AA_Participant_19_cl getAA_Participant() {
        
        return super.getAA_Participant();
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
    public component_AA_SplitsMerges_19_cl getAA_SplitsMerges() {
        
        return super.getAA_SplitsMerges();
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
    protected int lbl_AddToEventList() {
        
        return super.lbl_AddToEventList();
    }

    @Override
    protected int lbl_BuildAccountingUpdates() {
        
        return super.lbl_BuildAccountingUpdates();
    }

    @Override
    protected int lbl_GetAccountDetails() {
        
        return super.lbl_GetAccountDetails();
    }

    @Override
    protected int lbl_GetBalanceType() {
        
        return super.lbl_GetBalanceType();
    }

    @Override
    protected int lbl_GetBill() {
        
        return super.lbl_GetBill();
    }

    @Override
    protected int lbl_GetBillAmount() {
        
        return super.lbl_GetBillAmount();
    }

    @Override
    protected int lbl_GetBillDetails() {
        
        return super.lbl_GetBillDetails();
    }

    @Override
    protected int lbl_GetDueAmount() {
        
        return super.lbl_GetDueAmount();
    }

    @Override
    protected int lbl_GetEventType() {
        
        return super.lbl_GetEventType();
    }

    @Override
    protected int lbl_GetParticipantDetails() {
        
        return super.lbl_GetParticipantDetails();
    }

    @Override
    protected int lbl_GetTargetArrangement() {
        
        return super.lbl_GetTargetArrangement();
    }

    @Override
    protected int lbl_GetTargetArrangementAccountNumber() {
        
        return super.lbl_GetTargetArrangementAccountNumber();
    }

    @Override
    protected int lbl_GetTargetArrangementDetails() {
        
        return super.lbl_GetTargetArrangementDetails();
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
    protected int lbl_ProcessAccountDetails() {
        
        return super.lbl_ProcessAccountDetails();
    }

    @Override
    protected int lbl_ProcessAccountingUpdates() {
        
        return super.lbl_ProcessAccountingUpdates();
    }

    @Override
    protected int lbl_ProcessAction() {
        
        return super.lbl_ProcessAction();
    }

    @Override
    protected int lbl_ProcessActivityBalances() {
        
        return super.lbl_ProcessActivityBalances();
    }

    @Override
    protected int lbl_ProcessAuthAction() {
        
        return super.lbl_ProcessAuthAction();
    }

    @Override
    protected int lbl_ProcessDeleteAction() {
        
        return super.lbl_ProcessDeleteAction();
    }

    @Override
    protected int lbl_ProcessInputAction() {
        
        return super.lbl_ProcessInputAction();
    }

    @Override
    protected int lbl_ProcessParticipantsAction() {
        
        return super.lbl_ProcessParticipantsAction();
    }

    @Override
    protected int lbl_ProcessReverseAction() {
        
        return super.lbl_ProcessReverseAction();
    }

    @Override
    protected int lbl_RaiseSuspenseEntries() {
        
        return super.lbl_RaiseSuspenseEntries();
    }

    @Override
    protected int lbl_SetActivityDetails() {
        
        return super.lbl_SetActivityDetails();
    }

    @Override
    protected int lbl_UpdateAccountDetails() {
        
        return super.lbl_UpdateAccountDetails();
    }

    @Override
    protected int lbl_UpdateActivityBalances() {
        
        return super.lbl_UpdateActivityBalances();
    }

    @Override
    protected int lbl_UpdateBillRepaymentAmounts() {
        
        return super.lbl_UpdateBillRepaymentAmounts();
    }

    @Override
    protected int lbl_UpdateBillStatus() {
        
        return super.lbl_UpdateBillStatus();
    }

    @Override
    protected int lbl_WriteActivityBalances() {
        
        return super.lbl_WriteActivityBalances();
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
    public void stack(AA_ACCOUNT_SETTLE_ROLLOVER_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
