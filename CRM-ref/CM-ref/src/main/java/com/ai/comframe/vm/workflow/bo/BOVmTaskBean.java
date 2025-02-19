//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.ai.comframe.vm.workflow.bo;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.comframe.vm.workflow.ivalues.IBOVmTaskValue;

import java.sql.Timestamp;

public class BOVmTaskBean extends DataContainer implements DataContainerInterface, IBOVmTaskValue {
    private static String m_boName = "com.ai.comframe.vm.workflow.bo.BOVmTask";
    public static final String S_LockStaffId = "LOCK_STAFF_ID";
    public static final String S_DecisionResult = "DECISION_RESULT";
    public static final String S_State = "STATE";
    public static final String S_TaskBaseType = "TASK_BASE_TYPE";
    public static final String S_EngineWorkflowId = "ENGINE_WORKFLOW_ID";
    public static final String S_StateDate = "STATE_DATE";
    public static final String S_WarningTimes = "WARNING_TIMES";
    public static final String S_TaskId = "TASK_ID";
    public static final String S_FinishDate = "FINISH_DATE";
    public static final String S_QueueId = "QUEUE_ID";
    public static final String S_EngineTaskId = "ENGINE_TASK_ID";
    public static final String S_TaskType = "TASK_TYPE";
    public static final String S_LastTaskId = "LAST_TASK_ID";
    public static final String S_DestTaskTemplateId = "DEST_TASK_TEMPLATE_ID";
    public static final String S_WorkflowId = "WORKFLOW_ID";
    public static final String S_Duration = "DURATION";
    public static final String S_TaskStaffId = "TASK_STAFF_ID";
    public static final String S_WarningDate = "WARNING_DATE";
    public static final String S_ExeFinishDate = "EXE_FINISH_DATE";
    public static final String S_TaskTemplateId = "TASK_TEMPLATE_ID";
    public static final String S_Description = "DESCRIPTION";
    public static final String S_StationId = "STATION_ID";
    public static final String S_DestType = "DEST_TYPE";
    public static final String S_Label = "LABEL";
    public static final String S_IsCurrentTask = "IS_CURRENT_TASK";
    public static final String S_ErrorMessage = "ERROR_MESSAGE";
    public static final String S_LockDate = "LOCK_DATE";
    public static final String S_TenantId = "TENANT_ID";
    public static final String S_RegionId = "REGION_ID";
    public static final String S_RemanentWorkflowCount = "REMANENT_WORKFLOW_COUNT";
    public static final String S_CreateDate = "CREATE_DATE";
    public static final String S_TaskTag = "TASK_TAG";
    public static final String S_FinishStaffId = "FINISH_STAFF_ID";
    public static final String S_ChildWorkflowCount = "CHILD_WORKFLOW_COUNT";
    public static ObjectType S_TYPE = null;

    public BOVmTaskBean() throws AIException {
        super(S_TYPE);
    }

    public static ObjectType getObjectTypeStatic() throws AIException {
        return S_TYPE;
    }

    public void setObjectType(ObjectType value) throws AIException {
        throw new AIException("Cannot reset ObjectType");
    }

    public void initLockStaffId(String value) {
        this.initProperty("LOCK_STAFF_ID", value);
    }

    public void setLockStaffId(String value) {
        this.set("LOCK_STAFF_ID", value);
    }

    public void setLockStaffIdNull() {
        this.set("LOCK_STAFF_ID", (Object)null);
    }

    public String getLockStaffId() {
        return DataType.getAsString(this.get("LOCK_STAFF_ID"));
    }

    public String getLockStaffIdInitialValue() {
        return DataType.getAsString(this.getOldObj("LOCK_STAFF_ID"));
    }

    public void initDecisionResult(String value) {
        this.initProperty("DECISION_RESULT", value);
    }

    public void setDecisionResult(String value) {
        this.set("DECISION_RESULT", value);
    }

    public void setDecisionResultNull() {
        this.set("DECISION_RESULT", (Object)null);
    }

    public String getDecisionResult() {
        return DataType.getAsString(this.get("DECISION_RESULT"));
    }

    public String getDecisionResultInitialValue() {
        return DataType.getAsString(this.getOldObj("DECISION_RESULT"));
    }

    public void initState(int value) {
        this.initProperty("STATE", new Integer(value));
    }

    public void setState(int value) {
        this.set("STATE", new Integer(value));
    }

    public void setStateNull() {
        this.set("STATE", (Object)null);
    }

    public int getState() {
        return DataType.getAsInt(this.get("STATE"));
    }

    public int getStateInitialValue() {
        return DataType.getAsInt(this.getOldObj("STATE"));
    }

    public void initTaskBaseType(String value) {
        this.initProperty("TASK_BASE_TYPE", value);
    }

    public void setTaskBaseType(String value) {
        this.set("TASK_BASE_TYPE", value);
    }

    public void setTaskBaseTypeNull() {
        this.set("TASK_BASE_TYPE", (Object)null);
    }

    public String getTaskBaseType() {
        return DataType.getAsString(this.get("TASK_BASE_TYPE"));
    }

    public String getTaskBaseTypeInitialValue() {
        return DataType.getAsString(this.getOldObj("TASK_BASE_TYPE"));
    }

    public void initEngineWorkflowId(String value) {
        this.initProperty("ENGINE_WORKFLOW_ID", value);
    }

    public void setEngineWorkflowId(String value) {
        this.set("ENGINE_WORKFLOW_ID", value);
    }

    public void setEngineWorkflowIdNull() {
        this.set("ENGINE_WORKFLOW_ID", (Object)null);
    }

    public String getEngineWorkflowId() {
        return DataType.getAsString(this.get("ENGINE_WORKFLOW_ID"));
    }

    public String getEngineWorkflowIdInitialValue() {
        return DataType.getAsString(this.getOldObj("ENGINE_WORKFLOW_ID"));
    }

    public void initStateDate(Timestamp value) {
        this.initProperty("STATE_DATE", value);
    }

    public void setStateDate(Timestamp value) {
        this.set("STATE_DATE", value);
    }

    public void setStateDateNull() {
        this.set("STATE_DATE", (Object)null);
    }

    public Timestamp getStateDate() {
        return DataType.getAsDateTime(this.get("STATE_DATE"));
    }

    public Timestamp getStateDateInitialValue() {
        return DataType.getAsDateTime(this.getOldObj("STATE_DATE"));
    }

    public void initWarningTimes(int value) {
        this.initProperty("WARNING_TIMES", new Integer(value));
    }

    public void setWarningTimes(int value) {
        this.set("WARNING_TIMES", new Integer(value));
    }

    public void setWarningTimesNull() {
        this.set("WARNING_TIMES", (Object)null);
    }

    public int getWarningTimes() {
        return DataType.getAsInt(this.get("WARNING_TIMES"));
    }

    public int getWarningTimesInitialValue() {
        return DataType.getAsInt(this.getOldObj("WARNING_TIMES"));
    }

    public void initTaskId(String value) {
        this.initProperty("TASK_ID", value);
    }

    public void setTaskId(String value) {
        this.set("TASK_ID", value);
    }

    public void setTaskIdNull() {
        this.set("TASK_ID", (Object)null);
    }

    public String getTaskId() {
        return DataType.getAsString(this.get("TASK_ID"));
    }

    public String getTaskIdInitialValue() {
        return DataType.getAsString(this.getOldObj("TASK_ID"));
    }

    public void initFinishDate(Timestamp value) {
        this.initProperty("FINISH_DATE", value);
    }

    public void setFinishDate(Timestamp value) {
        this.set("FINISH_DATE", value);
    }

    public void setFinishDateNull() {
        this.set("FINISH_DATE", (Object)null);
    }

    public Timestamp getFinishDate() {
        return DataType.getAsDateTime(this.get("FINISH_DATE"));
    }

    public Timestamp getFinishDateInitialValue() {
        return DataType.getAsDateTime(this.getOldObj("FINISH_DATE"));
    }

    public void initQueueId(String value) {
        this.initProperty("QUEUE_ID", value);
    }

    public void setQueueId(String value) {
        this.set("QUEUE_ID", value);
    }

    public void setQueueIdNull() {
        this.set("QUEUE_ID", (Object)null);
    }

    public String getQueueId() {
        return DataType.getAsString(this.get("QUEUE_ID"));
    }

    public String getQueueIdInitialValue() {
        return DataType.getAsString(this.getOldObj("QUEUE_ID"));
    }

    public void initEngineTaskId(String value) {
        this.initProperty("ENGINE_TASK_ID", value);
    }

    public void setEngineTaskId(String value) {
        this.set("ENGINE_TASK_ID", value);
    }

    public void setEngineTaskIdNull() {
        this.set("ENGINE_TASK_ID", (Object)null);
    }

    public String getEngineTaskId() {
        return DataType.getAsString(this.get("ENGINE_TASK_ID"));
    }

    public String getEngineTaskIdInitialValue() {
        return DataType.getAsString(this.getOldObj("ENGINE_TASK_ID"));
    }

    public void initTaskType(String value) {
        this.initProperty("TASK_TYPE", value);
    }

    public void setTaskType(String value) {
        this.set("TASK_TYPE", value);
    }

    public void setTaskTypeNull() {
        this.set("TASK_TYPE", (Object)null);
    }

    public String getTaskType() {
        return DataType.getAsString(this.get("TASK_TYPE"));
    }

    public String getTaskTypeInitialValue() {
        return DataType.getAsString(this.getOldObj("TASK_TYPE"));
    }

    public void initLastTaskId(String value) {
        this.initProperty("LAST_TASK_ID", value);
    }

    public void setLastTaskId(String value) {
        this.set("LAST_TASK_ID", value);
    }

    public void setLastTaskIdNull() {
        this.set("LAST_TASK_ID", (Object)null);
    }

    public String getLastTaskId() {
        return DataType.getAsString(this.get("LAST_TASK_ID"));
    }

    public String getLastTaskIdInitialValue() {
        return DataType.getAsString(this.getOldObj("LAST_TASK_ID"));
    }

    public void initDestTaskTemplateId(long value) {
        this.initProperty("DEST_TASK_TEMPLATE_ID", new Long(value));
    }

    public void setDestTaskTemplateId(long value) {
        this.set("DEST_TASK_TEMPLATE_ID", new Long(value));
    }

    public void setDestTaskTemplateIdNull() {
        this.set("DEST_TASK_TEMPLATE_ID", (Object)null);
    }

    public long getDestTaskTemplateId() {
        return DataType.getAsLong(this.get("DEST_TASK_TEMPLATE_ID"));
    }

    public long getDestTaskTemplateIdInitialValue() {
        return DataType.getAsLong(this.getOldObj("DEST_TASK_TEMPLATE_ID"));
    }

    public void initWorkflowId(String value) {
        this.initProperty("WORKFLOW_ID", value);
    }

    public void setWorkflowId(String value) {
        this.set("WORKFLOW_ID", value);
    }

    public void setWorkflowIdNull() {
        this.set("WORKFLOW_ID", (Object)null);
    }

    public String getWorkflowId() {
        return DataType.getAsString(this.get("WORKFLOW_ID"));
    }

    public String getWorkflowIdInitialValue() {
        return DataType.getAsString(this.getOldObj("WORKFLOW_ID"));
    }

    public void initDuration(long value) {
        this.initProperty("DURATION", new Long(value));
    }

    public void setDuration(long value) {
        this.set("DURATION", new Long(value));
    }

    public void setDurationNull() {
        this.set("DURATION", (Object)null);
    }

    public long getDuration() {
        return DataType.getAsLong(this.get("DURATION"));
    }

    public long getDurationInitialValue() {
        return DataType.getAsLong(this.getOldObj("DURATION"));
    }

    public void initTaskStaffId(String value) {
        this.initProperty("TASK_STAFF_ID", value);
    }

    public void setTaskStaffId(String value) {
        this.set("TASK_STAFF_ID", value);
    }

    public void setTaskStaffIdNull() {
        this.set("TASK_STAFF_ID", (Object)null);
    }

    public String getTaskStaffId() {
        return DataType.getAsString(this.get("TASK_STAFF_ID"));
    }

    public String getTaskStaffIdInitialValue() {
        return DataType.getAsString(this.getOldObj("TASK_STAFF_ID"));
    }

    public void initWarningDate(Timestamp value) {
        this.initProperty("WARNING_DATE", value);
    }

    public void setWarningDate(Timestamp value) {
        this.set("WARNING_DATE", value);
    }

    public void setWarningDateNull() {
        this.set("WARNING_DATE", (Object)null);
    }

    public Timestamp getWarningDate() {
        return DataType.getAsDateTime(this.get("WARNING_DATE"));
    }

    public Timestamp getWarningDateInitialValue() {
        return DataType.getAsDateTime(this.getOldObj("WARNING_DATE"));
    }

    public void initExeFinishDate(Timestamp value) {
        this.initProperty("EXE_FINISH_DATE", value);
    }

    public void setExeFinishDate(Timestamp value) {
        this.set("EXE_FINISH_DATE", value);
    }

    public void setExeFinishDateNull() {
        this.set("EXE_FINISH_DATE", (Object)null);
    }

    public Timestamp getExeFinishDate() {
        return DataType.getAsDateTime(this.get("EXE_FINISH_DATE"));
    }

    public Timestamp getExeFinishDateInitialValue() {
        return DataType.getAsDateTime(this.getOldObj("EXE_FINISH_DATE"));
    }

    public void initTaskTemplateId(long value) {
        this.initProperty("TASK_TEMPLATE_ID", new Long(value));
    }

    public void setTaskTemplateId(long value) {
        this.set("TASK_TEMPLATE_ID", new Long(value));
    }

    public void setTaskTemplateIdNull() {
        this.set("TASK_TEMPLATE_ID", (Object)null);
    }

    public long getTaskTemplateId() {
        return DataType.getAsLong(this.get("TASK_TEMPLATE_ID"));
    }

    public long getTaskTemplateIdInitialValue() {
        return DataType.getAsLong(this.getOldObj("TASK_TEMPLATE_ID"));
    }

    public void initDescription(String value) {
        this.initProperty("DESCRIPTION", value);
    }

    public void setDescription(String value) {
        this.set("DESCRIPTION", value);
    }

    public void setDescriptionNull() {
        this.set("DESCRIPTION", (Object)null);
    }

    public String getDescription() {
        return DataType.getAsString(this.get("DESCRIPTION"));
    }

    public String getDescriptionInitialValue() {
        return DataType.getAsString(this.getOldObj("DESCRIPTION"));
    }

    public void initStationId(String value) {
        this.initProperty("STATION_ID", value);
    }

    public void setStationId(String value) {
        this.set("STATION_ID", value);
    }

    public void setStationIdNull() {
        this.set("STATION_ID", (Object)null);
    }

    public String getStationId() {
        return DataType.getAsString(this.get("STATION_ID"));
    }

    public String getStationIdInitialValue() {
        return DataType.getAsString(this.getOldObj("STATION_ID"));
    }

    public void initDestType(String value) {
        this.initProperty("DEST_TYPE", value);
    }

    public void setDestType(String value) {
        this.set("DEST_TYPE", value);
    }

    public void setDestTypeNull() {
        this.set("DEST_TYPE", (Object)null);
    }

    public String getDestType() {
        return DataType.getAsString(this.get("DEST_TYPE"));
    }

    public String getDestTypeInitialValue() {
        return DataType.getAsString(this.getOldObj("DEST_TYPE"));
    }

    public void initLabel(String value) {
        this.initProperty("LABEL", value);
    }

    public void setLabel(String value) {
        this.set("LABEL", value);
    }

    public void setLabelNull() {
        this.set("LABEL", (Object)null);
    }

    public String getLabel() {
        return DataType.getAsString(this.get("LABEL"));
    }

    public String getLabelInitialValue() {
        return DataType.getAsString(this.getOldObj("LABEL"));
    }

    public void initIsCurrentTask(String value) {
        this.initProperty("IS_CURRENT_TASK", value);
    }

    public void setIsCurrentTask(String value) {
        this.set("IS_CURRENT_TASK", value);
    }

    public void setIsCurrentTaskNull() {
        this.set("IS_CURRENT_TASK", (Object)null);
    }

    public String getIsCurrentTask() {
        return DataType.getAsString(this.get("IS_CURRENT_TASK"));
    }

    public String getIsCurrentTaskInitialValue() {
        return DataType.getAsString(this.getOldObj("IS_CURRENT_TASK"));
    }

    public void initErrorMessage(String value) {
        this.initProperty("ERROR_MESSAGE", value);
    }

    public void setErrorMessage(String value) {
        this.set("ERROR_MESSAGE", value);
    }

    public void setErrorMessageNull() {
        this.set("ERROR_MESSAGE", (Object)null);
    }

    public String getErrorMessage() {
        return DataType.getAsString(this.get("ERROR_MESSAGE"));
    }

    public String getErrorMessageInitialValue() {
        return DataType.getAsString(this.getOldObj("ERROR_MESSAGE"));
    }

    public void initLockDate(Timestamp value) {
        this.initProperty("LOCK_DATE", value);
    }

    public void setLockDate(Timestamp value) {
        this.set("LOCK_DATE", value);
    }

    public void setLockDateNull() {
        this.set("LOCK_DATE", (Object)null);
    }

    public Timestamp getLockDate() {
        return DataType.getAsDateTime(this.get("LOCK_DATE"));
    }

    public Timestamp getLockDateInitialValue() {
        return DataType.getAsDateTime(this.getOldObj("LOCK_DATE"));
    }

    public void initTenantId(String value) {
        this.initProperty("TENANT_ID", value);
    }

    public void setTenantId(String value) {
        this.set("TENANT_ID", value);
    }

    public void setTenantIdNull() {
        this.set("TENANT_ID", (Object)null);
    }

    public String getTenantId() {
        return DataType.getAsString(this.get("TENANT_ID"));
    }

    public String getTenantIdInitialValue() {
        return DataType.getAsString(this.getOldObj("TENANT_ID"));
    }

    public void initRegionId(String value) {
        this.initProperty("REGION_ID", value);
    }

    public void setRegionId(String value) {
        this.set("REGION_ID", value);
    }

    public void setRegionIdNull() {
        this.set("REGION_ID", (Object)null);
    }

    public String getRegionId() {
        return DataType.getAsString(this.get("REGION_ID"));
    }

    public String getRegionIdInitialValue() {
        return DataType.getAsString(this.getOldObj("REGION_ID"));
    }

    public void initRemanentWorkflowCount(long value) {
        this.initProperty("REMANENT_WORKFLOW_COUNT", new Long(value));
    }

    public void setRemanentWorkflowCount(long value) {
        this.set("REMANENT_WORKFLOW_COUNT", new Long(value));
    }

    public void setRemanentWorkflowCountNull() {
        this.set("REMANENT_WORKFLOW_COUNT", (Object)null);
    }

    public long getRemanentWorkflowCount() {
        return DataType.getAsLong(this.get("REMANENT_WORKFLOW_COUNT"));
    }

    public long getRemanentWorkflowCountInitialValue() {
        return DataType.getAsLong(this.getOldObj("REMANENT_WORKFLOW_COUNT"));
    }

    public void initCreateDate(Timestamp value) {
        this.initProperty("CREATE_DATE", value);
    }

    public void setCreateDate(Timestamp value) {
        this.set("CREATE_DATE", value);
    }

    public void setCreateDateNull() {
        this.set("CREATE_DATE", (Object)null);
    }

    public Timestamp getCreateDate() {
        return DataType.getAsDateTime(this.get("CREATE_DATE"));
    }

    public Timestamp getCreateDateInitialValue() {
        return DataType.getAsDateTime(this.getOldObj("CREATE_DATE"));
    }

    public void initTaskTag(String value) {
        this.initProperty("TASK_TAG", value);
    }

    public void setTaskTag(String value) {
        this.set("TASK_TAG", value);
    }

    public void setTaskTagNull() {
        this.set("TASK_TAG", (Object)null);
    }

    public String getTaskTag() {
        return DataType.getAsString(this.get("TASK_TAG"));
    }

    public String getTaskTagInitialValue() {
        return DataType.getAsString(this.getOldObj("TASK_TAG"));
    }

    public void initFinishStaffId(String value) {
        this.initProperty("FINISH_STAFF_ID", value);
    }

    public void setFinishStaffId(String value) {
        this.set("FINISH_STAFF_ID", value);
    }

    public void setFinishStaffIdNull() {
        this.set("FINISH_STAFF_ID", (Object)null);
    }

    public String getFinishStaffId() {
        return DataType.getAsString(this.get("FINISH_STAFF_ID"));
    }

    public String getFinishStaffIdInitialValue() {
        return DataType.getAsString(this.getOldObj("FINISH_STAFF_ID"));
    }

    public void initChildWorkflowCount(long value) {
        this.initProperty("CHILD_WORKFLOW_COUNT", new Long(value));
    }

    public void setChildWorkflowCount(long value) {
        this.set("CHILD_WORKFLOW_COUNT", new Long(value));
    }

    public void setChildWorkflowCountNull() {
        this.set("CHILD_WORKFLOW_COUNT", (Object)null);
    }

    public long getChildWorkflowCount() {
        return DataType.getAsLong(this.get("CHILD_WORKFLOW_COUNT"));
    }

    public long getChildWorkflowCountInitialValue() {
        return DataType.getAsLong(this.getOldObj("CHILD_WORKFLOW_COUNT"));
    }

    static {
        try {
            S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
        } catch (Exception var1) {
            throw new RuntimeException(var1);
        }
    }
}
