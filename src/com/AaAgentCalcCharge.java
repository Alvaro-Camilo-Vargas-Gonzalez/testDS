package com;

import com.temenos.t24.AA_AGENT_CALC_CHARGE_cl;
import com.temenos.t24.component_AA_AgentCommission_22_cl;
import com.temenos.t24.component_AA_Fees_12_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AA_ProductManagement_24_cl;
import com.temenos.t24.component_AC_BalanceUpdates_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_ST_ExchangeRate_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaAgentCalcCharge extends AA_AGENT_CALC_CHARGE_cl {

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
    public component_AA_AgentCommission_22_cl getAA_AgentCommission() {
        
        return super.getAA_AgentCommission();
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
    public component_AA_ProductFramework_23_cl getAA_ProductFramework() {
        
        return super.getAA_ProductFramework();
    }

    @Override
    public component_AA_ProductManagement_24_cl getAA_ProductManagement() {
        
        return super.getAA_ProductManagement();
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
            Object arg7, Object arg8, Object arg9) {
        
        return super.invoke(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
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
    protected int lbl_CALL_AA_COMMON_MANAGER() {
        
        return super.lbl_CALL_AA_COMMON_MANAGER();
    }

    @Override
    protected int lbl_CLEAR_COMMON() {
        
        return super.lbl_CLEAR_COMMON();
    }

    @Override
    protected int lbl_CONVERT_CROSS_CCY() {
        
        return super.lbl_CONVERT_CROSS_CCY();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_PROCESS() {
        
        return super.lbl_PROCESS();
    }

    @Override
    protected int lbl_RESTORE_COMMON() {
        
        return super.lbl_RESTORE_COMMON();
    }

    @Override
    protected int lbl_SAVE_COMMON() {
        
        return super.lbl_SAVE_COMMON();
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
    public void stack(AA_AGENT_CALC_CHARGE_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
