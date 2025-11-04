package com;

import com.temenos.t24.AA_APPLY_PROPERTY_CONTROL_OPTION_cl;
import com.temenos.t24.component_AA_Fees_12_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_Interest_16_cl;
import com.temenos.t24.component_AA_PeriodicCharges_22_cl;
import com.temenos.t24.component_AA_PricingRules_19_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.t24.component_ST_CompanyCreation_22_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaApplyPropertyControlOption extends AA_APPLY_PROPERTY_CONTROL_OPTION_cl {

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
    public component_AA_PeriodicCharges_22_cl getAA_PeriodicCharges() {
        
        return super.getAA_PeriodicCharges();
    }

    @Override
    public component_AA_PricingRules_19_cl getAA_PricingRules() {
        
        return super.getAA_PricingRules();
    }

    @Override
    public component_AA_ProductFramework_23_cl getAA_ProductFramework() {
        
        return super.getAA_ProductFramework();
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
    public jVar invoke(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4) {
        
        return super.invoke(arg0, arg1, arg2, arg3, arg4);
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
    protected int lbl_DETERMINE_REGIONAL_PRICING() {
        
        return super.lbl_DETERMINE_REGIONAL_PRICING();
    }

    @Override
    protected int lbl_EVALUATE_CHARGE() {
        
        return super.lbl_EVALUATE_CHARGE();
    }

    @Override
    protected int lbl_EVALUATE_INTEREST() {
        
        return super.lbl_EVALUATE_INTEREST();
    }

    @Override
    protected int lbl_EVALUATE_PERIODIC_CHARGES() {
        
        return super.lbl_EVALUATE_PERIODIC_CHARGES();
    }

    @Override
    protected int lbl_EVALUATE_PRICING_COND() {
        
        return super.lbl_EVALUATE_PRICING_COND();
    }

    @Override
    protected int lbl_EVALUATE_PRICING_RULES() {
        
        return super.lbl_EVALUATE_PRICING_RULES();
    }

    @Override
    protected int lbl_INITIALISE() {
        
        return super.lbl_INITIALISE();
    }

    @Override
    protected int lbl_LOAD_CHARGE_FIELDS() {
        
        return super.lbl_LOAD_CHARGE_FIELDS();
    }

    @Override
    protected int lbl_LOAD_INT_FIELDS() {
        
        return super.lbl_LOAD_INT_FIELDS();
    }

    @Override
    protected int lbl_LOAD_PERIODIC_CHARGES_FIELDS() {
        
        return super.lbl_LOAD_PERIODIC_CHARGES_FIELDS();
    }

    @Override
    protected int lbl_LOAD_PRICING_RULES_FIELDS() {
        
        return super.lbl_LOAD_PRICING_RULES_FIELDS();
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
    public void stack(AA_APPLY_PROPERTY_CONTROL_OPTION_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
