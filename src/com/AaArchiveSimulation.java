package com;

import com.temenos.t24.AA_ARCHIVE_SIMULATION_cl;
import com.temenos.t24.component_AA_Account_15_cl;
import com.temenos.t24.component_AA_Framework_17_cl;
import com.temenos.t24.component_AA_ProductFramework_23_cl;
import com.temenos.t24.component_AC_AccountOpening_21_cl;
import com.temenos.t24.component_AF_Framework_17_cl;
import com.temenos.t24.component_DL_Foundation_18_cl;
import com.temenos.t24.component_EB_Archiving_17_cl;
import com.temenos.t24.component_EB_DataAccess_17_cl;
import com.temenos.t24.component_EB_ErrorProcessing_22_cl;
import com.temenos.t24.component_EB_Service_15_cl;
import com.temenos.t24.component_EB_SystemTables_19_cl;
import com.temenos.tafj.common.jSession;
import com.temenos.tafj.common.jVar;

public class AaArchiveSimulation extends AA_ARCHIVE_SIMULATION_cl {

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
    public component_AA_Framework_17_cl getAA_Framework() {
        
        return super.getAA_Framework();
    }

    @Override
    public component_AA_ProductFramework_23_cl getAA_ProductFramework() {
        
        return super.getAA_ProductFramework();
    }

    @Override
    public component_AC_AccountOpening_21_cl getAC_AccountOpening() {
        
        return super.getAC_AccountOpening();
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
    public component_DL_Foundation_18_cl getDL_Foundation() {
        
        return super.getDL_Foundation();
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
    public component_EB_Archiving_17_cl getEB_Archiving() {
        
        return super.getEB_Archiving();
    }

    @Override
    public component_EB_DataAccess_17_cl getEB_DataAccess() {
        
        return super.getEB_DataAccess();
    }

    @Override
    public component_EB_ErrorProcessing_22_cl getEB_ErrorProcessing() {
        
        return super.getEB_ErrorProcessing();
    }

    @Override
    public component_EB_Service_15_cl getEB_Service() {
        
        return super.getEB_Service();
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
    protected int lbl_ArchiveCapture() {
        
        return super.lbl_ArchiveCapture();
    }

    @Override
    protected int lbl_ArchiveCaptures() {
        
        return super.lbl_ArchiveCaptures();
    }

    @Override
    protected int lbl_ArchiveCommonFiles() {
        
        return super.lbl_ArchiveCommonFiles();
    }

    @Override
    protected int lbl_ArchiveRunner() {
        
        return super.lbl_ArchiveRunner();
    }

    @Override
    protected int lbl_ArchiveSimulation() {
        
        return super.lbl_ArchiveSimulation();
    }

    @Override
    protected int lbl_ArchiveSimulationCapture() {
        
        return super.lbl_ArchiveSimulationCapture();
    }

    @Override
    protected int lbl_ArchiveSimulationDetails() {
        
        return super.lbl_ArchiveSimulationDetails();
    }

    @Override
    protected int lbl_Archive_d_HisFiles() {
        
        return super.lbl_Archive_d_HisFiles();
    }

    @Override
    protected int lbl_Archive_d_NauFiles() {
        
        return super.lbl_Archive_d_NauFiles();
    }

    @Override
    protected int lbl_Archive_d_SimFiles() {
        
        return super.lbl_Archive_d_SimFiles();
    }

    @Override
    protected int lbl_CreateArcFile() {
        
        return super.lbl_CreateArcFile();
    }

    @Override
    protected int lbl_GetFileControl() {
        
        return super.lbl_GetFileControl();
    }

    @Override
    protected int lbl_GetFileHandle() {
        
        return super.lbl_GetFileHandle();
    }

    @Override
    protected int lbl_GetRunnerDetails() {
        
        return super.lbl_GetRunnerDetails();
    }

    @Override
    protected int lbl_GetSimulationDetails() {
        
        return super.lbl_GetSimulationDetails();
    }

    @Override
    protected int lbl_Initialise() {
        
        return super.lbl_Initialise();
    }

    @Override
    protected int lbl_ReleaseAlternateAccount() {
        
        return super.lbl_ReleaseAlternateAccount();
    }

    @Override
    protected int lbl_WriteDeletionProcess() {
        
        return super.lbl_WriteDeletionProcess();
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
    public void stack(AA_ARCHIVE_SIMULATION_cl arg0) {
        
        super.stack(arg0);
    }

    @Override
    public void stopMoving() {
        
        super.stopMoving();
    }

}
