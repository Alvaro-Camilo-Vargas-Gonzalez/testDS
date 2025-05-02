package com;

import java.util.List;

import com.temenos.api.TBoolean;
import com.temenos.api.TString;
import com.temenos.api.TStructure;
import com.temenos.api.TValidationResponse;
import com.temenos.t24.api.complex.eb.servicehook.ServiceControl;
import com.temenos.t24.api.complex.eb.servicehook.TransactionData;
import com.temenos.t24.api.complex.eb.templatehook.AutomaticAuthorisationContext;
import com.temenos.t24.api.complex.eb.templatehook.ErrorText;
import com.temenos.t24.api.complex.eb.templatehook.InputValue;
import com.temenos.t24.api.complex.eb.templatehook.LookupRecordAmendment;
import com.temenos.t24.api.complex.eb.templatehook.TransactionContext;

public class RecordLifecycle extends com.temenos.t24.api.hook.system.RecordLifecycle {

    @SuppressWarnings("deprecation")
    /*
    @Target(value={CONSTRUCTOR, FIELD, METHOD, PARAMETER, TYPE, LOCAL_VARIABLE})
    @Retention(value=SOURCE)
    
    Indicates that the named compiler warnings should be suppressed in the annotated element (and in all program elements contained in the annotated element). Note that the set of warnings suppressed in a given element is a superset of the warnings suppressed in all containing elements. For example, if you annotate a class to suppress one warning and annotate a method to suppress another, both warnings will be suppressed in the method. 

    As a matter of style, programmers should always use this annotation on the most deeply nested element where it is effective. If you want to suppress a warning in a particular method, you should annotate that method rather than its class.
    Since:1.5Author:Josh Bloch @jls4.8 Raw Types@jls4.12.2 Variables of Reference Type@jls5.1.9 Unchecked Conversion@jls5.5.2 Checked Casts and Unchecked Casts@jls9.6.3.5 @SuppressWarnings
    */
    @Override
    /*
    @Target(value={METHOD})
    @Retention(value=SOURCE)

    Indicates that a method declaration is intended to override a method declaration in a super type. If a method is annotated with this annotation type compilers are required to generate an error message unless at least one of the following conditions hold: 
    •The method does override or implement a method declared in a super type. 
    •The method has a signature that is override-equivalent to that of any public method declared in Object. 
    Since:1.5Author:Peter von der AhéJoshua Bloch@jls9.6.1.4 @Override
    */
    public void updateCoreRecord(String application, String currentRecordId, TStructure currentRecord,
            TStructure unauthorisedRecord, TStructure liveRecord, List<String> versionNames, TBoolean isZeroAuth,
            List<String> currentRecordIds, List<TStructure> currentRecords, TransactionContext transactionContext) {
    /*
    void com.testRtnDS.updateCoreRecord(String application, String currentRecordId, TStructure currentRecord, TStructure unauthorisedRecord, 
    TStructure liveRecord, List<String> versionNames, TBoolean isZeroAuth, List<String> currentRecordIds, List<TStructure> currentRecords, 
    TransactionContext transactionContext)

    @SuppressWarnings(value={"deprecation"})
    @Override

    This interface enables the implementer to define one or more records to be input during the current transaction using the specified 
    versions and ids.
    If no version is specified then no action will be taken. 
    This interface is invoked when a record is authorised.
    The EB.API hooks used by this interface are EB.TABLE.PROCEDURES.BEF.AUTH.HOOK and VERSION.BEFORE.AUTH.RTN.HOOK.
    The T24 fields specifying this hook are the BEF.AUTH.PROC field in EB.TABLE.PROCEDURES and BEFORE.AUTH.RTN in VERSION and VERSION.CONTROL.
    If an exception is thrown in the implementing class it will be treated as an error.

    Overrides: updateCoreRecord(...) in RecordLifecycle
    Parameters:application String : The name of the application to which the record belongs.
    currentRecordId String : The id of the record being processed.
    currentRecord TStructure : The record being processed - the implementation must specify the record type.
    unauthorisedRecord TStructure : The last unauthorised version of the record being processed - the implementation must specify the record type.
    liveRecord TStructure : The last live version of the record being processed - the implementation must specify the record type.
    versionNames List : The Version names to be processed.
    isZeroAuth TBoolean : Returns true if it is Zero auth otherwise false.
    currentRecordIds List : The id's of the record to be processed.
    currentRecords List : The records to be processed.
    transactionContext com.temenos.t24.api.complex.eb.templatehook.TransactionContext : Transaction related variables.
    */
        super.updateCoreRecord(application, currentRecordId, currentRecord, unauthorisedRecord, liveRecord, versionNames,
                isZeroAuth, currentRecordIds, currentRecords, transactionContext);
    }

    @Override
    public String getTransactionMessage(String application, String currentRecordId, TStructure currentRecord,
            String timeStamp, String systemTransactionMessage, TransactionContext transactionContext) {
        /*
        
        */
        return super.getTransactionMessage(application, currentRecordId, currentRecord, timeStamp, systemTransactionMessage,
                transactionContext);
    }

    @Override
    public void postUpdateRequest(String application, String currentRecordId, TStructure currentRecord,
            List<TransactionData> transactionData, List<TStructure> currentRecords,
            TransactionContext transactionContext) {
        /*
        
         */
        super.postUpdateRequest(application, currentRecordId, currentRecord, transactionData, currentRecords,
                transactionContext);
    }

    @Override
    public void defaultFieldValues(String application, String currentRecordId, TStructure currentRecord,
            TStructure unauthorisedRecord, TStructure liveRecord, TransactionContext transactionContext) {
        /*
        
         */
        super.defaultFieldValues(application, currentRecordId, currentRecord, unauthorisedRecord, liveRecord,
                transactionContext);
    }

    @Override
    public TValidationResponse validateRecord(String application, String currentRecordId, TStructure currentRecord,
            TStructure unauthorisedRecord, TStructure liveRecord, TransactionContext transactionContext) {
        /*
        
         */
        return super.validateRecord(application, currentRecordId, currentRecord, unauthorisedRecord, liveRecord,
                transactionContext);
    }

    @Override
    public void defaultFieldValuesOnHotField(String application, String currentRecordId, TStructure currentRecord,
            InputValue currentInputValue, TStructure unauthorisedRecord, TStructure liveRecord,
            TransactionContext transactionContext) {
        /*
        
         */
        super.defaultFieldValuesOnHotField(application, currentRecordId, currentRecord, currentInputValue, unauthorisedRecord,
                liveRecord, transactionContext);
    }

    @Override
    public void updateRecord(String application, String currentRecordId, TStructure currentRecord,
            TStructure unauthorisedRecord, TStructure liveRecord, TransactionContext transactionContext,
            List<com.temenos.t24.api.complex.eb.templatehook.TransactionData> transactionData,
            List<TStructure> currentRecords) {
        /*
        
         */
        super.updateRecord(application, currentRecordId, currentRecord, unauthorisedRecord, liveRecord, transactionContext,
                transactionData, currentRecords);
    }

    @SuppressWarnings("deprecation")
    @Override
    public TValidationResponse validateField(String application, String recordId, String fieldData, TStructure record) {
        /*
        
         */
        return super.validateField(application, recordId, fieldData, record);
    }

    @Override
    public String checkId(String currentRecordId, TransactionContext transactionContext) {
        /*
        
         */
        return super.checkId(currentRecordId, transactionContext);
    }

    @Override
    public TBoolean enableAutomaticAuthorisation(String application, String currentRecordId, TStructure currentRecord,
            TStructure unauthorisedRecord, TStructure liveRecord, TransactionContext transactionContext,
            AutomaticAuthorisationContext automaticAuthorisationContext) {
        /*
        
         */
        return super.enableAutomaticAuthorisation(application, currentRecordId, currentRecord, unauthorisedRecord, liveRecord,
                transactionContext, automaticAuthorisationContext);
    }

    @Override
    public List<LookupRecordAmendment> getLookupRecordAmendments(String application, String currentRecordId,
            TStructure currentRecord, TStructure liveRecord, TransactionContext transactionContext) {
        /*
        
         */
        return super.getLookupRecordAmendments(application, currentRecordId, currentRecord, liveRecord, transactionContext);
    }

    @Override
    public ServiceControl getServiceControlDetail(String application, String currentRecordId, TStructure currentRecord,
            TransactionContext transactionContext) {
        /*
        
         */
        return super.getServiceControlDetail(application, currentRecordId, currentRecord, transactionContext);
    }

    @Override
    public String formatDealSlip(String data, TStructure currentRecord, TransactionContext transactionContext) {
        /*
        
         */
        return super.formatDealSlip(data, currentRecord, transactionContext);
    }

    @SuppressWarnings("deprecation")
    @Override
    public TBoolean updateLookupTable(String application, String currentRecordId, TStructure currentRecord,
            TStructure liveRecord, TString lookupTableName, TString key, TString entryToDelete, TString entryToAdd,
            TBoolean sortAsNumber, TransactionContext transactionContext) {
        /*
        
         */
        return super.updateLookupTable(application, currentRecordId, currentRecord, liveRecord, lookupTableName, key,
                entryToDelete, entryToAdd, sortAsNumber, transactionContext);
    }

    @Override
    public TBoolean isOverrideAutoApprove(String application, String currentRecordId, TStructure currentRecord,
            TransactionContext transactionContext, ErrorText errorText) {
        /*
        
         */
        return super.isOverrideAutoApprove(application, currentRecordId, currentRecord, transactionContext, errorText);
    }

    @Override
    public void setOverrideComparisonValue(String overrideMessage, List<String> messageDetails,
            TString overrideComparisonValue, TransactionContext transactionContext) {
        /*
        
         */
        super.setOverrideComparisonValue(overrideMessage, messageDetails, overrideComparisonValue, transactionContext);
    }
    
}
