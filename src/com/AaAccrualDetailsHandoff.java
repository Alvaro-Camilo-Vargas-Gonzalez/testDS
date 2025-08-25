package com;

import com.temenos.t24.AA_ACCRUAL_DETAILS_HANDOFF_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Accounting_18_cl;
import com.temenos.t24.component_AA_AgentCommission_22_cl;
import com.temenos.t24.component_AA_Customer_16_cl;
import com.temenos.t24.component_AA_Fees_12_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Interest_16_cl;
import com.temenos.t24.component_AA_Officers_16_cl;
import com.temenos.t24.component_AA_Participant_19_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_PeriodicCharges_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AA_Reporting_17_cl;
import com.temenos.t24.component_AA_TermAmount_17_cl;
import com.temenos.t24.component_AC_AccountOpening_21_cl;
import com.temenos.t24.component_AC_Fees_12_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_ST_CompanyCreation_22_cl;
import com.temenos.t24.component_ST_CustomerService_22_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAccrualDetailsHandoff extends AA_ACCRUAL_DETAILS_HANDOFF_cl {

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
    public component_AA_AgentCommission_22_cl getAA_AgentCommission() {
        
        return super.getAA_AgentCommission();
    }

    @Override
    public component_AA_Customer_16_cl getAA_Customer() {
        
        return super.getAA_Customer();
    }

    @Override
    public component_AA_Fees_12_cl getAA_Fees() {
        
        return super.getAA_Fees();
    }

    @Override
    public component_AA_Framework_17_cl getAA_Framework() {
        
        return super.getAA_Framework();
    }

    @Override
    public component_AA_Interest_16_cl getAA_Interest() {
        
        return super.getAA_Interest();
    }

    @Override
    public component_AA_Officers_16_cl getAA_Officers() {
        
        return super.getAA_Officers();
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
    public component_AA_PeriodicCharges_22_cl getAA_PeriodicCharges() {
        
        return super.getAA_PeriodicCharges();
    }

    @Override
    public component_AA_ProductFramework_23_cl getAA_ProductFramework() {
        
        return super.getAA_ProductFramework();
    }

    @Override
    public component_AA_Reporting_17_cl getAA_Reporting() {
        
        return super.getAA_Reporting();
    }

    @Override
    public component_AA_TermAmount_17_cl getAA_TermAmount() {
        
        return super.getAA_TermAmount();
    }

    @Override
    public component_AC_AccountOpening_21_cl getAC_AccountOpening() {
        
        return super.getAC_AccountOpening();
    }

    @Override
    public component_AC_Fees_12_cl getAC_Fees() {
        
        return super.getAC_Fees();
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
    public component_ST_CustomerService_22_cl getST_CustomerService() {
        
        return super.getST_CustomerService();
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
    public jVar invoke(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6,
            Object arg7, Object arg8, Object arg9, Object arg10, Object arg11) {
        
        return super.invoke(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
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
    protected int lbl_BUILD_AMENDMENT_DETAILS() {
        
        return super.lbl_BUILD_AMENDMENT_DETAILS();
    }

    @Override
    protected int lbl_BUILD_NEW_AMORT_DETAILS() {
        
        return super.lbl_BUILD_NEW_AMORT_DETAILS();
    }

    @Override
    protected int lbl_CALCULATE_ACCRUAL_END_DATE() {
        
        return super.lbl_CALCULATE_ACCRUAL_END_DATE();
    }

    @Override
    protected int lbl_CALCULATE_AMORT_PERIOD() {
        
        return super.lbl_CALCULATE_AMORT_PERIOD();
    }

    @Override
    protected int lbl_CALCULATE_LOCAL_CCY_AMOUNT() {
        
        return super.lbl_CALCULATE_LOCAL_CCY_AMOUNT();
    }

    @Override
    protected int lbl_CHECK_ACCRUAL_ID() {
        
        return super.lbl_CHECK_ACCRUAL_ID();
    }

    @Override
    protected int lbl_CHECK_ACCRUAL_STATUS() {
        
        return super.lbl_CHECK_ACCRUAL_STATUS();
    }

    @Override
    protected int lbl_CHECK_CLOSURE_REVERSAL() {
        
        return super.lbl_CHECK_CLOSURE_REVERSAL();
    }

    @Override
    protected int lbl_CHECK_MATURITY() {
        
        return super.lbl_CHECK_MATURITY();
    }

    @Override
    protected int lbl_CHECK_PROCESSING_MODE() {
        
        return super.lbl_CHECK_PROCESSING_MODE();
    }

    @Override
    protected int lbl_CHECK_RENEWAL() {
        
        return super.lbl_CHECK_RENEWAL();
    }

    @Override
    protected int lbl_CHECK_REQD_INFO() {
        
        return super.lbl_CHECK_REQD_INFO();
    }

    @Override
    protected int lbl_CHECK_SUSPENSION() {
        
        return super.lbl_CHECK_SUSPENSION();
    }

    @Override
    protected int lbl_DETERMINE_ACCRUAL_PROCESS() {
        
        return super.lbl_DETERMINE_ACCRUAL_PROCESS();
    }

    @Override
    protected int lbl_DETERMINE_AMORT_PROCESS() {
        
        return super.lbl_DETERMINE_AMORT_PROCESS();
    }

    @Override
    protected int lbl_GET_ACCOUNTING_DETAILS() {
        
        return super.lbl_GET_ACCOUNTING_DETAILS();
    }

    @Override
    protected int lbl_GET_ACCOUNT_RECORD() {
        
        return super.lbl_GET_ACCOUNT_RECORD();
    }

    @Override
    protected int lbl_GET_ACCRUAL_CONCAT() {
        
        return super.lbl_GET_ACCRUAL_CONCAT();
    }

    @Override
    protected int lbl_GET_ACCRUAL_FREQUENCY() {
        
        return super.lbl_GET_ACCRUAL_FREQUENCY();
    }

    @Override
    protected int lbl_GET_ACCRUAL_FREQUENCY_RECORD() {
        
        return super.lbl_GET_ACCRUAL_FREQUENCY_RECORD();
    }

    @Override
    protected int lbl_GET_ACCRUAL_RECORD() {
        
        return super.lbl_GET_ACCRUAL_RECORD();
    }

    @Override
    protected int lbl_GET_ACC_PROPERTY_RECORD() {
        
        return super.lbl_GET_ACC_PROPERTY_RECORD();
    }

    @Override
    protected int lbl_GET_AGENT_FINANCIAL_DETS() {
        
        return super.lbl_GET_AGENT_FINANCIAL_DETS();
    }

    @Override
    protected int lbl_GET_AMORT_DETAILS() {
        
        return super.lbl_GET_AMORT_DETAILS();
    }

    @Override
    protected int lbl_GET_CHARGE_IDENTIFIER() {
        
        return super.lbl_GET_CHARGE_IDENTIFIER();
    }

    @Override
    protected int lbl_GET_INTERNAL_BOOKING() {
        
        return super.lbl_GET_INTERNAL_BOOKING();
    }

    @Override
    protected int lbl_GET_OFFCIERS_PROPERTY_RECORD() {
        
        return super.lbl_GET_OFFCIERS_PROPERTY_RECORD();
    }

    @Override
    protected int lbl_GET_OFFICERS_AND_ACC_RECORD() {
        
        return super.lbl_GET_OFFICERS_AND_ACC_RECORD();
    }

    @Override
    protected int lbl_GET_PARTICIPANT_DETAILS() {
        
        return super.lbl_GET_PARTICIPANT_DETAILS();
    }

    @Override
    protected int lbl_GET_REPROTING_RECORD() {
        
        return super.lbl_GET_REPROTING_RECORD();
    }

    @Override
    protected int lbl_GetAccrualPeriodEndDate() {
        
        return super.lbl_GetAccrualPeriodEndDate();
    }

    @Override
    protected int lbl_GetAgentFinancialDetails() {
        
        return super.lbl_GetAgentFinancialDetails();
    }

    @Override
    protected int lbl_GetNewAgentFinDetails() {
        
        return super.lbl_GetNewAgentFinDetails();
    }

    @Override
    protected int lbl_HANDLE_CANCLE_AMORT_PROCESS() {
        
        return super.lbl_HANDLE_CANCLE_AMORT_PROCESS();
    }

    @Override
    protected int lbl_HANDOFF_AMORT_DETAILS() {
        
        return super.lbl_HANDOFF_AMORT_DETAILS();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_PROCESS_ACCRUALS() {
        
        return super.lbl_PROCESS_ACCRUALS();
    }

    @Override
    protected int lbl_PROCESS_ADJUSTMENT_DETAILS() {
        
        return super.lbl_PROCESS_ADJUSTMENT_DETAILS();
    }

    @Override
    protected int lbl_PROCESS_AMENDMENT_DETAILS() {
        
        return super.lbl_PROCESS_AMENDMENT_DETAILS();
    }

    @Override
    protected int lbl_PROCESS_NEW_HANDOFF() {
        
        return super.lbl_PROCESS_NEW_HANDOFF();
    }

    @Override
    protected int lbl_UPDATE_ACCOUNT_DETAILS() {
        
        return super.lbl_UPDATE_ACCOUNT_DETAILS();
    }

    @Override
    protected int lbl_UPDATE_AMORT_PERIOD() {
        
        return super.lbl_UPDATE_AMORT_PERIOD();
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
    public void stack(AA_ACCRUAL_DETAILS_HANDOFF_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
