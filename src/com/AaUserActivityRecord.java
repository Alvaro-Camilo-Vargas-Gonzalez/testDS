package com;

import java.util.List;

import org.json.JSONObject;

import com.temenos.api.DynTreeWalker;
import com.temenos.api.T24TypesConvertibleHelper.FIELD_TYPE;
import com.temenos.api.TStructure;
import com.temenos.t24.api.records.aauseractivity.ActivityNameClass;

public class AaUserActivityRecord extends com.temenos.t24.api.records.aauseractivity.AaUserActivityRecord {

    @Override
    protected String _getLocRefKey() {
        
        return super._getLocRefKey();
    }

    @Override
    protected String _getTableName() {
        
        return super._getTableName();
    }

    @Override
    protected void _initialise(String arg0) {
        
        super._initialise(arg0);
    }

    @Override
    public List<String> getInputter() {
        
        return super.getInputter();
    }

    @Override
    public String getRecordStatus() {
        
        return super.getRecordStatus();
    }

    @Override
    public String getInputter(int idx) {
        
        return super.getInputter(idx);
    }

    @Override
    public String getCurrNo() {
        
        return super.getCurrNo();
    }

    @Override
    public List<String> getDateTime() {
        
        return super.getDateTime();
    }

    @Override
    public String getDeptCode() {
        
        return super.getDeptCode();
    }

    @Override
    public void addActivityName(ActivityNameClass param) {
        
        super.addActivityName(param);
    }

    @Override
    protected JSONObject asJSONObject() {
        
        return super.asJSONObject();
    }

    @Override
    public String getAuditorCode() {
        
        return super.getAuditorCode();
    }

    @Override
    public void clearActivityName() {
        
        super.clearActivityName();
    }

    @Override
    public String getAuditDateTime() {
        
        return super.getAuditDateTime();
    }

    @Override
    public String getAuthoriser() {
        
        return super.getAuthoriser();
    }

    @Override
    public String getDateTime(int idx) {
        
        return super.getDateTime(idx);
    }

    @Override
    public ActivityNameClass getActivityName(int idx) {
        
        return super.getActivityName(idx);
    }

    @Override
    public List<ActivityNameClass> getActivityName() {
        
        return super.getActivityName();
    }

    @Override
    public String getCoCode() {
        
        return super.getCoCode();
    }

    @Override
    protected boolean hasNextInsertion() {
        
        return super.hasNextInsertion();
    }

    @Override
    protected com.temenos.t24.api.records.aauseractivity.AaUserActivityRecord init(DynTreeWalker arg0, boolean arg1,
            int arg2) {
        
        return super.init(arg0, arg1, arg2);
    }

    @Override
    protected com.temenos.t24.api.records.aauseractivity.AaUserActivityRecord initInsertion(DynTreeWalker arg0,
            boolean arg1, int arg2) {
        
        return super.initInsertion(arg0, arg1, arg2);
    }

    @Override
    public void insertActivityName(ActivityNameClass param, int pos) {
        
        super.insertActivityName(param, pos);
    }

    @Override
    protected boolean isNull() {
        
        return super.isNull();
    }

    @Override
    protected void moveNextInsertion(int arg0) {
        
        super.moveNextInsertion(arg0);
    }

    @Override
    protected void nextInsertion() {
        
        super.nextInsertion();
    }

    @Override
    public void removeActivityName(int idx) {
        
        super.removeActivityName(idx);
    }

    @Override
    protected void reset() {
        
        super.reset();
    }

    @Override
    public void setActivityName(ActivityNameClass param, int idx) {
        
        super.setActivityName(param, idx);
    }

    @Override
    protected com.temenos.t24.api.records.aauseractivity.AaUserActivityRecord setDynArray(String arg0) {
        
        return super.setDynArray(arg0);
    }

    @Override
    protected void setFieldType(FIELD_TYPE arg0) {
        
        super.setFieldType(arg0);
    }

    @Override
    protected com.temenos.t24.api.records.aauseractivity.AaUserActivityRecord setJSON(java.lang.Object arg0,
            Class arg1) {
        
        return super.setJSON(arg0, arg1);
    }

    @Override
    protected com.temenos.t24.api.records.aauseractivity.AaUserActivityRecord setJSONString(String arg0, Class arg1) {
        
        return super.setJSONString(arg0, arg1);
    }

    @Override
    protected void setPointer(JSONObject arg0) {
        
        super.setPointer(arg0);
    }

    @Override
    protected String toDynArray() {
        
        return super.toDynArray();
    }

    @Override
    protected String toDynArray(char arg0) {
        
        return super.toDynArray(arg0);
    }

    @Override
    protected String toDynArrayXX(char arg0) {
        
        return super.toDynArrayXX(arg0);
    }

    @Override
    protected String toJSONString() {
        
        return super.toJSONString();
    }

    @Override
    protected String toJson(char arg0, String arg1) {
        
        return super.toJson(arg0, arg1);
    }

    @Override
    protected String toJson(String arg0) {
        
        return super.toJson(arg0);
    }

    @Override
    protected String toJson(StringBuilder arg0, DynTreeWalker arg1, boolean arg2) {
        
        return super.toJson(arg0, arg1, arg2);
    }

    @Override
    protected void toJson(StringBuilder arg0) {
        
        super.toJson(arg0);
    }

    @Override
    protected JSONObject toJsonObject(String arg0) {
        
        return super.toJsonObject(arg0);
    }

    @Override
    public String toString() {
        
        return super.toString();
    }

    @Override
    public TStructure toStructure() {
        
        return super.toStructure();
    }

}
