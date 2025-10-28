package com;

import com.temenos.t24.AA_ALLOCATE_PAYMENT_AMOUNT_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Overdue_15_cl;
import com.temenos.t24.component_AA_PaymentRules_19_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AA_RestructureRules_23_cl;
import com.temenos.t24.component_AA_Tax_11_cl;
import com.temenos.t24.component_AC_BalanceUpdates_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_API_9_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_ST_ExchangeRate_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAllocatePaymentAmount extends AA_ALLOCATE_PAYMENT_AMOUNT_cl {

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
    public component_AA_Framework_17_cl getAA_Framework() {
        
        return super.getAA_Framework();
    }

    @Override
    public component_AA_Overdue_15_cl getAA_Overdue() {
        
        return super.getAA_Overdue();
    }

    @Override
    public component_AA_PaymentRules_19_cl getAA_PaymentRules() {
        
        return super.getAA_PaymentRules();
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
    public component_AA_RestructureRules_23_cl getAA_RestructureRules() {
        
        return super.getAA_RestructureRules();
    }

    @Override
    public component_AA_Tax_11_cl getAA_Tax() {
        
        return super.getAA_Tax();
    }

    @Override
    public component_AC_BalanceUpdates_21_cl getAC_BalanceUpdates() {
        
        return super.getAC_BalanceUpdates();
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
    public component_ST_ExchangeRate_19_cl getST_ExchangeRate() {
        
        return super.getST_ExchangeRate();
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
            Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14,
            Object arg15, Object arg16, Object arg17, Object arg18, Object arg19, Object arg20, Object arg21,
            Object arg22, Object arg23, Object arg24) {
        
        return super.invoke(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14,
                arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22, arg23, arg24);
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
    protected int lbl_ALLOCATE_PROPERTY_AMOUNT() {
        
        return super.lbl_ALLOCATE_PROPERTY_AMOUNT();
    }

    @Override
    protected int lbl_APPLY_PAYMENT_RULES() {
        
        return super.lbl_APPLY_PAYMENT_RULES();
    }

    @Override
    protected int lbl_CALCULATE_REPAY_AMT() {
        
        return super.lbl_CALCULATE_REPAY_AMT();
    }

    @Override
    protected int lbl_CHECK_REQD_INFO() {
        
        return super.lbl_CHECK_REQD_INFO();
    }

    @Override
    protected int lbl_CHECK_TAX_PROPERTY() {
        
        return super.lbl_CHECK_TAX_PROPERTY();
    }

    @Override
    protected int lbl_EXTRACT_REQD_INFO() {
        
        return super.lbl_EXTRACT_REQD_INFO();
    }

    @Override
    protected int lbl_GET_ACCOUNT_PROPERTY() {
        
        return super.lbl_GET_ACCOUNT_PROPERTY();
    }

    @Override
    protected int lbl_GET_PROPERTY_AMOUNT() {
        
        return super.lbl_GET_PROPERTY_AMOUNT();
    }

    @Override
    protected int lbl_GET_REPAY_AMOUNT_LCY() {
        
        return super.lbl_GET_REPAY_AMOUNT_LCY();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_INSERT_PROPERTY_DETAILS() {
        
        return super.lbl_INSERT_PROPERTY_DETAILS();
    }

    @Override
    protected int lbl_PROCESS_REPAYMENT_AMOUNT() {
        
        return super.lbl_PROCESS_REPAYMENT_AMOUNT();
    }

    @Override
    protected int lbl_SORT_BILLS_BASED_ON_TYPE() {
        
        return super.lbl_SORT_BILLS_BASED_ON_TYPE();
    }

    @Override
    protected int lbl_UPDATE_DISBURSEMENT_AMOUNT() {
        
        return super.lbl_UPDATE_DISBURSEMENT_AMOUNT();
    }

    @Override
    protected int lbl_UPDATE_PROPERTY_AMT() {
        
        return super.lbl_UPDATE_PROPERTY_AMT();
    }

    @Override
    protected int lbl_UPDATE_REMAINDER_AMOUNT() {
        
        return super.lbl_UPDATE_REMAINDER_AMOUNT();
    }

    @Override
    protected int lbl_UPDATE_REPAYMENT_AMOUNT() {
        
        return super.lbl_UPDATE_REPAYMENT_AMOUNT();
    }

    @Override
    protected int lbl_UPDATE_TAX_PROPERTY() {
        
        return super.lbl_UPDATE_TAX_PROPERTY();
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
    public void stack(AA_ALLOCATE_PAYMENT_AMOUNT_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
