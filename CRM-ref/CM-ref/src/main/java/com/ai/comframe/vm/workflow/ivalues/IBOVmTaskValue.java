package com.ai.comframe.vm.workflow.ivalues;

import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;

public interface IBOVmTaskValue extends DataStructInterface {
    String S_LockStaffId = "LOCK_STAFF_ID";
    String S_DecisionResult = "DECISION_RESULT";
    String S_State = "STATE";
    String S_TaskBaseType = "TASK_BASE_TYPE";
    String S_EngineWorkflowId = "ENGINE_WORKFLOW_ID";
    String S_StateDate = "STATE_DATE";
    String S_WarningTimes = "WARNING_TIMES";
    String S_TaskId = "TASK_ID";
    String S_FinishDate = "FINISH_DATE";
    String S_QueueId = "QUEUE_ID";
    String S_EngineTaskId = "ENGINE_TASK_ID";
    String S_TaskType = "TASK_TYPE";
    String S_LastTaskId = "LAST_TASK_ID";
    String S_DestTaskTemplateId = "DEST_TASK_TEMPLATE_ID";
    String S_WorkflowId = "WORKFLOW_ID";
    String S_Duration = "DURATION";
    String S_TaskStaffId = "TASK_STAFF_ID";
    String S_WarningDate = "WARNING_DATE";
    String S_ExeFinishDate = "EXE_FINISH_DATE";
    String S_TaskTemplateId = "TASK_TEMPLATE_ID";
    String S_Description = "DESCRIPTION";
    String S_StationId = "STATION_ID";
    String S_DestType = "DEST_TYPE";
    String S_Label = "LABEL";
    String S_IsCurrentTask = "IS_CURRENT_TASK";
    String S_ErrorMessage = "ERROR_MESSAGE";
    String S_LockDate = "LOCK_DATE";
    String S_TenantId = "TENANT_ID";
    String S_RegionId = "REGION_ID";
    String S_RemanentWorkflowCount = "REMANENT_WORKFLOW_COUNT";
    String S_CreateDate = "CREATE_DATE";
    String S_TaskTag = "TASK_TAG";
    String S_FinishStaffId = "FINISH_STAFF_ID";
    String S_ChildWorkflowCount = "CHILD_WORKFLOW_COUNT";

    String getLockStaffId();

    String getDecisionResult();

    int getState();

    String getTaskBaseType();

    String getEngineWorkflowId();

    Timestamp getStateDate();

    int getWarningTimes();

    String getTaskId();

    Timestamp getFinishDate();

    String getQueueId();

    String getEngineTaskId();

    String getTaskType();

    String getLastTaskId();

    long getDestTaskTemplateId();

    String getWorkflowId();

    long getDuration();

    String getTaskStaffId();

    Timestamp getWarningDate();

    Timestamp getExeFinishDate();

    long getTaskTemplateId();

    String getDescription();

    String getStationId();

    String getDestType();

    String getLabel();

    String getIsCurrentTask();

    String getErrorMessage();

    Timestamp getLockDate();

    String getTenantId();

    String getRegionId();

    long getRemanentWorkflowCount();

    Timestamp getCreateDate();

    String getTaskTag();

    String getFinishStaffId();

    long getChildWorkflowCount();

    void setLockStaffId(String var1);

    void setDecisionResult(String var1);

    void setState(int var1);

    void setTaskBaseType(String var1);

    void setEngineWorkflowId(String var1);

    void setStateDate(Timestamp var1);

    void setWarningTimes(int var1);

    void setTaskId(String var1);

    void setFinishDate(Timestamp var1);

    void setQueueId(String var1);

    void setEngineTaskId(String var1);

    void setTaskType(String var1);

    void setLastTaskId(String var1);

    void setDestTaskTemplateId(long var1);

    void setWorkflowId(String var1);

    void setDuration(long var1);

    void setTaskStaffId(String var1);

    void setWarningDate(Timestamp var1);

    void setExeFinishDate(Timestamp var1);

    void setTaskTemplateId(long var1);

    void setDescription(String var1);

    void setStationId(String var1);

    void setDestType(String var1);

    void setLabel(String var1);

    void setIsCurrentTask(String var1);

    void setErrorMessage(String var1);

    void setLockDate(Timestamp var1);

    void setTenantId(String var1);

    void setRegionId(String var1);

    void setRemanentWorkflowCount(long var1);

    void setCreateDate(Timestamp var1);

    void setTaskTag(String var1);

    void setFinishStaffId(String var1);

    void setChildWorkflowCount(long var1);
}
