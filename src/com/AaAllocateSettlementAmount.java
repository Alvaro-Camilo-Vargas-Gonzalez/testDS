package com;

import com.temenos.t24.AA_ALLOCATE_SETTLEMENT_AMOUNT_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Settlement_18_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_ST_ExchangeRate_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAllocateSettlementAmount extends AA_ALLOCATE_SETTLEMENT_AMOUNT_cl {

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
    public component_AA_Settlement_18_cl getAA_Settlement() {
        
        return super.getAA_Settlement();
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
            Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13) {
        
        return super.invoke(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
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
    protected int lbl_CONVERT_ACCT_OD_BAL() {
        
        return super.lbl_CONVERT_ACCT_OD_BAL();
    }

    @Override
    protected int lbl_DUE_CONVERTED_ALLOCATION() {
        
        return super.lbl_DUE_CONVERTED_ALLOCATION();
    }

    @Override
    protected int lbl_EVALUATE_SETTLE_RULES() {
        
        return super.lbl_EVALUATE_SETTLE_RULES();
    }

    @Override
    protected int lbl_FIND_ALLOC_AMT_SETTLE_OPTION() {
        
        return super.lbl_FIND_ALLOC_AMT_SETTLE_OPTION();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_PROCESS_EXCHANGE_RATE() {
        
        return super.lbl_PROCESS_EXCHANGE_RATE();
    }

    @Override
    protected int lbl_PROCESS_FULL_SETTLEMENT() {
        
        return super.lbl_PROCESS_FULL_SETTLEMENT();
    }

    @Override
    protected int lbl_PROCESS_NONE_SETTLEMENT() {
        
        return super.lbl_PROCESS_NONE_SETTLEMENT();
    }

    @Override
    protected int lbl_PROCESS_PARTIAL_SETTLEMENT() {
        
        return super.lbl_PROCESS_PARTIAL_SETTLEMENT();
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
    public void stack(AA_ALLOCATE_SETTLEMENT_AMOUNT_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
