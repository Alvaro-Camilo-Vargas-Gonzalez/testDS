package com;

import com.temenos.t24.AA_ACTIVITY_CHARGES_CALCULATE_COMM_cl;
import com.temenos.t24.component_AA_ActivityCharges_22_cl;
import com.temenos.t24.component_AA_AgentCommission_22_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_AG_Framework_17_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_ST_ExchangeRate_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaActivityChargesCalculateComm extends AA_ACTIVITY_CHARGES_CALCULATE_COMM_cl {

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
    public component_AA_ActivityCharges_22_cl getAA_ActivityCharges() {
        
        return super.getAA_ActivityCharges();
    }

    @Override
    public component_AA_AgentCommission_22_cl getAA_AgentCommission() {
        
        return super.getAA_AgentCommission();
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
    public component_AF_Framework_17_cl getAF_Framework() {
        
        return super.getAF_Framework();
    }

    @Override
    public component_AG_Framework_17_cl getAG_Framework() {
        
        return super.getAG_Framework();
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
    protected int lbl_CHECK_ACTIVITY_CHARGES() {
        
        return super.lbl_CHECK_ACTIVITY_CHARGES();
    }

    @Override
    protected int lbl_CHECK_PROPERTY_TYPE() {
        
        return super.lbl_CHECK_PROPERTY_TYPE();
    }

    @Override
    protected int lbl_CONVERT_FM_TO_ASTERISK() {
        
        return super.lbl_CONVERT_FM_TO_ASTERISK();
    }

    @Override
    protected int lbl_CONVERT_VM_TO_FM() {
        
        return super.lbl_CONVERT_VM_TO_FM();
    }

    @Override
    protected int lbl_CUMULATE_CONTEXT() {
        
        return super.lbl_CUMULATE_CONTEXT();
    }

    @Override
    protected int lbl_DELETE_CHARGE_DETAILS() {
        
        return super.lbl_DELETE_CHARGE_DETAILS();
    }

    @Override
    protected int lbl_GET_REQUIRED_POSITION() {
        
        return super.lbl_GET_REQUIRED_POSITION();
    }

    @Override
    protected int lbl_GET_TOTAL_TXN_AMOUNT() {
        
        return super.lbl_GET_TOTAL_TXN_AMOUNT();
    }

    @Override
    protected int lbl_HANDLE_ERRORS() {
        
        return super.lbl_HANDLE_ERRORS();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_PROCESS_ACTION() {
        
        return super.lbl_PROCESS_ACTION();
    }

    @Override
    protected int lbl_PROCESS_ACTIVITY_CHARGES() {
        
        return super.lbl_PROCESS_ACTIVITY_CHARGES();
    }

    @Override
    protected int lbl_PROCESS_DELETE_ACTION() {
        
        return super.lbl_PROCESS_DELETE_ACTION();
    }

    @Override
    protected int lbl_PROCESS_INPUT_ACTION() {
        
        return super.lbl_PROCESS_INPUT_ACTION();
    }

    @Override
    protected int lbl_UPDATE_AGENT_COMMISSION() {
        
        return super.lbl_UPDATE_AGENT_COMMISSION();
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
    public void stack(AA_ACTIVITY_CHARGES_CALCULATE_COMM_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
