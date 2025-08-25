package com;

import com.temenos.t24.AA_ACCRUALS_INTEGRITY_CHECK_cl;
import com.temenos.t24.component_AA_Interest_16_cl;
import com.temenos.t24.component_AA_Participant_19_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_Util_12_cl;
import com.temenos.t24.component_AC_SoftAccounting_21_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccrualsIntegrityCheck extends AA_ACCRUALS_INTEGRITY_CHECK_cl {

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
    public int INSERT__I__AA_APP_COMMON() {
        
        return super.INSERT__I__AA_APP_COMMON();
    }

    @Override
    public int INSERT__I__COMMON() {
        
        return super.INSERT__I__COMMON();
    }

    @Override
    public int INSERT__I__EQUATE() {
        
        return super.INSERT__I__EQUATE();
    }

    @Override
    public int INSERT__I__F_AA_ACCOUNTING() {
        
        return super.INSERT__I__F_AA_ACCOUNTING();
    }

    @Override
    public int INSERT__I__F_AA_ACTIVITY_BALANCES() {
        
        return super.INSERT__I__F_AA_ACTIVITY_BALANCES();
    }

    @Override
    public int INSERT__I__F_AA_ACTIVITY_HISTORY() {
        
        return super.INSERT__I__F_AA_ACTIVITY_HISTORY();
    }

    @Override
    public int INSERT__I__F_AA_ARRANGEMENT() {
        
        return super.INSERT__I__F_AA_ARRANGEMENT();
    }

    @Override
    public int INSERT__I__F_AA_INTEREST() {
        
        return super.INSERT__I__F_AA_INTEREST();
    }

    @Override
    public int INSERT__I__F_AA_OVERDUE() {
        
        return super.INSERT__I__F_AA_OVERDUE();
    }

    @Override
    public int INSERT__I__F_AA_PAYMENT_SCHEDULE() {
        
        return super.INSERT__I__F_AA_PAYMENT_SCHEDULE();
    }

    @Override
    public int INSERT__I__F_AA_PRODUCT_DESIGNER() {
        
        return super.INSERT__I__F_AA_PRODUCT_DESIGNER();
    }

    @Override
    public int INSERT__I__F_AA_PROPERTY() {
        
        return super.INSERT__I__F_AA_PROPERTY();
    }

    @Override
    public int INSERT__I__F_AA_SCHEDULED_ACTIVITY() {
        
        return super.INSERT__I__F_AA_SCHEDULED_ACTIVITY();
    }

    @Override
    public int INSERT__I__F_AA_TERM_AMOUNT() {
        
        return super.INSERT__I__F_AA_TERM_AMOUNT();
    }

    @Override
    public int INSERT__I__F_ACCT_ACTIVITY() {
        
        return super.INSERT__I__F_ACCT_ACTIVITY();
    }

    @Override
    public void create() {
        
        super.create();
    }

    @Override
    public component_AA_Interest_16_cl getAA_Interest() {
        
        return super.getAA_Interest();
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
    public component_AA_Util_12_cl getAA_Util() {
        
        return super.getAA_Util();
    }

    @Override
    public component_AC_SoftAccounting_21_cl getAC_SoftAccounting() {
        
        return super.getAC_SoftAccounting();
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
    protected int lbl_CheckAccrualParameter() {
        
        return super.lbl_CheckAccrualParameter();
    }

    @Override
    protected int lbl_CheckBillProduceExits() {
        
        return super.lbl_CheckBillProduceExits();
    }

    @Override
    protected int lbl_DetermineOrOsamoutDiff() {
        
        return super.lbl_DetermineOrOsamoutDiff();
    }

    @Override
    protected int lbl_GetActivityAmount() {
        
        return super.lbl_GetActivityAmount();
    }

    @Override
    protected int lbl_GetRepaidAdjustWriteOffAmount() {
        
        return super.lbl_GetRepaidAdjustWriteOffAmount();
    }

    @Override
    protected int lbl_VALIDATE_ECB_SUSPEND_AMOUNT() {
        
        return super.lbl_VALIDATE_ECB_SUSPEND_AMOUNT();
    }

    @Override
    protected int lbl_addAdjustedSPAmount() {
        
        return super.lbl_addAdjustedSPAmount();
    }

    @Override
    protected int lbl_addAdjustmentAmount() {
        
        return super.lbl_addAdjustmentAmount();
    }

    @Override
    protected int lbl_addRepayAdjSPAmount() {
        
        return super.lbl_addRepayAdjSPAmount();
    }

    @Override
    protected int lbl_addSPAmount() {
        
        return super.lbl_addSPAmount();
    }

    @Override
    protected int lbl_checkAccBalance() {
        
        return super.lbl_checkAccBalance();
    }

    @Override
    protected int lbl_checkAccrualAmount() {
        
        return super.lbl_checkAccrualAmount();
    }

    @Override
    protected int lbl_checkAccruals() {
        
        return super.lbl_checkAccruals();
    }

    @Override
    protected int lbl_checkActivityClass() {
        
        return super.lbl_checkActivityClass();
    }

    @Override
    protected int lbl_checkBaseBalance() {
        
        return super.lbl_checkBaseBalance();
    }

    @Override
    protected int lbl_checkBills() {
        
        return super.lbl_checkBills();
    }

    @Override
    protected int lbl_checkChargeoff() {
        
        return super.lbl_checkChargeoff();
    }

    @Override
    protected int lbl_checkCoolingPeriod() {
        
        return super.lbl_checkCoolingPeriod();
    }

    @Override
    protected int lbl_checkEndDate() {
        
        return super.lbl_checkEndDate();
    }

    @Override
    protected int lbl_checkNegativeRates() {
        
        return super.lbl_checkNegativeRates();
    }

    @Override
    protected int lbl_checkNumPayments() {
        
        return super.lbl_checkNumPayments();
    }

    @Override
    protected int lbl_checkODBalance() {
        
        return super.lbl_checkODBalance();
    }

    @Override
    protected int lbl_checkPayoff() {
        
        return super.lbl_checkPayoff();
    }

    @Override
    protected int lbl_checkPeriodAmounts() {
        
        return super.lbl_checkPeriodAmounts();
    }

    @Override
    protected int lbl_checkStartDate() {
        
        return super.lbl_checkStartDate();
    }

    @Override
    protected int lbl_checkpreviousactualamount() {
        
        return super.lbl_checkpreviousactualamount();
    }

    @Override
    protected int lbl_doBillsAccrualsChecks() {
        
        return super.lbl_doBillsAccrualsChecks();
    }

    @Override
    protected int lbl_dochecks() {
        
        return super.lbl_dochecks();
    }

    @Override
    protected int lbl_getACCSPAmount() {
        
        return super.lbl_getACCSPAmount();
    }

    @Override
    protected int lbl_getAccountingCondition() {
        
        return super.lbl_getAccountingCondition();
    }

    @Override
    protected int lbl_getActivityBalances() {
        
        return super.lbl_getActivityBalances();
    }

    @Override
    protected int lbl_getActivityHistory() {
        
        return super.lbl_getActivityHistory();
    }

    @Override
    protected int lbl_getAdjustmentAmount() {
        
        return super.lbl_getAdjustmentAmount();
    }

    @Override
    protected int lbl_getArrangementRelativeDate() {
        
        return super.lbl_getArrangementRelativeDate();
    }

    @Override
    protected int lbl_getBaseBalance() {
        
        return super.lbl_getBaseBalance();
    }

    @Override
    protected int lbl_getBillaccrualsRecord() {
        
        return super.lbl_getBillaccrualsRecord();
    }

    @Override
    protected int lbl_getCorrectionDetails() {
        
        return super.lbl_getCorrectionDetails();
    }

    @Override
    protected int lbl_getInterestAccruals() {
        
        return super.lbl_getInterestAccruals();
    }

    @Override
    protected int lbl_getNextActivity() {
        
        return super.lbl_getNextActivity();
    }

    @Override
    protected int lbl_getOverdueCondition() {
        
        return super.lbl_getOverdueCondition();
    }

    @Override
    protected int lbl_getParticipantBalanceType() {
        
        return super.lbl_getParticipantBalanceType();
    }

    @Override
    protected int lbl_getPaymentBills() {
        
        return super.lbl_getPaymentBills();
    }

    @Override
    protected int lbl_getProjectionCorrectionDate() {
        
        return super.lbl_getProjectionCorrectionDate();
    }

    @Override
    protected int lbl_getPropertyRecord() {
        
        return super.lbl_getPropertyRecord();
    }

    @Override
    protected int lbl_getScheduleActivity() {
        
        return super.lbl_getScheduleActivity();
    }

    @Override
    protected int lbl_getScheduleCondition() {
        
        return super.lbl_getScheduleCondition();
    }

    @Override
    protected int lbl_getSourceBalType() {
        
        return super.lbl_getSourceBalType();
    }

    @Override
    protected int lbl_getSuspenseRepay() {
        
        return super.lbl_getSuspenseRepay();
    }

    @Override
    protected int lbl_getSystemAccrualAmount() {
        
        return super.lbl_getSystemAccrualAmount();
    }

    @Override
    protected int lbl_getTermAmountRecord() {
        
        return super.lbl_getTermAmountRecord();
    }

    @Override
    protected int lbl_getpropertyType() {
        
        return super.lbl_getpropertyType();
    }

    @Override
    protected int lbl_initialise() {
        
        return super.lbl_initialise();
    }

    @Override
    protected int lbl_processBill() {
        
        return super.lbl_processBill();
    }

    @Override
    protected int lbl_updateBillError() {
        
        return super.lbl_updateBillError();
    }

    @Override
    protected int lbl_updateErrordetails() {
        
        return super.lbl_updateErrordetails();
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
    public void stack(AA_ACCRUALS_INTEGRITY_CHECK_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
