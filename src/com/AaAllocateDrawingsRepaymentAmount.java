package com;

import com.temenos.t24.AA_ALLOCATE_DRAWINGS_REPAYMENT_AMOUNT_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Overdue_15_cl;
import com.temenos.t24.component_AA_PaymentPriority_22_cl;
import com.temenos.t24.component_AA_PaymentRules_19_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AA_Tax_11_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_API_9_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_ST_ExchangeRate_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAllocateDrawingsRepaymentAmount extends AA_ALLOCATE_DRAWINGS_REPAYMENT_AMOUNT_cl {

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
    public component_AA_PaymentPriority_22_cl getAA_PaymentPriority() {
        
        return super.getAA_PaymentPriority();
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
    public component_AA_Tax_11_cl getAA_Tax() {
        
        return super.getAA_Tax();
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
            Object arg15, Object arg16, Object arg17, Object arg18) {
        
        return super.invoke(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14,
                arg15, arg16, arg17, arg18);
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
    protected int lbl_AllocatePropertyAmount() {
        
        return super.lbl_AllocatePropertyAmount();
    }

    @Override
    protected int lbl_CalculateRepayAmt() {
        
        return super.lbl_CalculateRepayAmt();
    }

    @Override
    protected int lbl_CheckTaxProperty() {
        
        return super.lbl_CheckTaxProperty();
    }

    @Override
    protected int lbl_ExtractReqdInfo() {
        
        return super.lbl_ExtractReqdInfo();
    }

    @Override
    protected int lbl_GetPropertyAmount() {
        
        return super.lbl_GetPropertyAmount();
    }

    @Override
    protected int lbl_GetRepayAmountLcy() {
        
        return super.lbl_GetRepayAmountLcy();
    }

    @Override
    protected int lbl_Initialise() {
        
        return super.lbl_Initialise();
    }

    @Override
    protected int lbl_InsertPropertyDetails() {
        
        return super.lbl_InsertPropertyDetails();
    }

    @Override
    protected int lbl_ProcessAction() {
        
        return super.lbl_ProcessAction();
    }

    @Override
    protected int lbl_ProcessRepaymentAmount() {
        
        return super.lbl_ProcessRepaymentAmount();
    }

    @Override
    protected int lbl_UpdatePropertyAmt() {
        
        return super.lbl_UpdatePropertyAmt();
    }

    @Override
    protected int lbl_UpdateRemainderAmount() {
        
        return super.lbl_UpdateRemainderAmount();
    }

    @Override
    protected int lbl_UpdateRepaymentAmount() {
        
        return super.lbl_UpdateRepaymentAmount();
    }

    @Override
    protected int lbl_UpdateTaxProperty() {
        
        return super.lbl_UpdateTaxProperty();
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
    public void stack(AA_ALLOCATE_DRAWINGS_REPAYMENT_AMOUNT_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
