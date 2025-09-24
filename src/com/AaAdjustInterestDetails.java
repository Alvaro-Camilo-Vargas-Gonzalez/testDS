package com;

import com.temenos.t24.AA_ADJUST_INTEREST_DETAILS_cl;
import com.temenos.t24.component_AA_Accounting_18_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Interest_16_cl;
import com.temenos.t24.component_AA_PaymentSchedule_22_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AC_Fees_12_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAdjustInterestDetails extends AA_ADJUST_INTEREST_DETAILS_cl {

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
    public component_AA_Accounting_18_cl getAA_Accounting() {
        
        return super.getAA_Accounting();
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
    public component_AA_PaymentSchedule_22_cl getAA_PaymentSchedule() {
        
        return super.getAA_PaymentSchedule();
    }

    @Override
    public component_AA_ProductFramework_23_cl getAA_ProductFramework() {
        
        return super.getAA_ProductFramework();
    }

    @Override
    public component_AC_Fees_12_cl getAC_Fees() {
        
        return super.getAC_Fees();
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
    public jVar invoke(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6) {
        
        return super.invoke(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
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
    protected int lbl_CHECK_ACCRUAL_DATA() {
        
        return super.lbl_CHECK_ACCRUAL_DATA();
    }

    @Override
    protected int lbl_CHECK_PROPERTY() {
        
        return super.lbl_CHECK_PROPERTY();
    }

    @Override
    protected int lbl_DO_ADJUSTMENTS() {
        
        return super.lbl_DO_ADJUSTMENTS();
    }

    @Override
    protected int lbl_DO_ADJUST_BY_BILL() {
        
        return super.lbl_DO_ADJUST_BY_BILL();
    }

    @Override
    protected int lbl_GET_ACCRUAL_PARAM() {
        
        return super.lbl_GET_ACCRUAL_PARAM();
    }

    @Override
    protected int lbl_GET_BILLS() {
        
        return super.lbl_GET_BILLS();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_PROCESS_ADJUSTMENTS() {
        
        return super.lbl_PROCESS_ADJUSTMENTS();
    }

    @Override
    protected int lbl_SPLIT_ACCRUALS() {
        
        return super.lbl_SPLIT_ACCRUALS();
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
    public void stack(AA_ADJUST_INTEREST_DETAILS_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
