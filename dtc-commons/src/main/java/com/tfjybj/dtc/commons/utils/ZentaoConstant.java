package com.tfjybj.dtc.commons.utils;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2020/11/22 14:17
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
public class ZentaoConstant {
    /**
     * TYPE_KEY_TASK = "task"
     */
    public static final String TYPE_KEY_TASK = "task";

    /**
     * TYPE_KEY_BUG = "bug"
     */
    public static final String TYPE_KEY_BUG = "bug";
    /**
     * 创建任务
     */
    public static final String TASK_OPEN = "wait";

    /**
     * 开始任务
     */
    public static final String TASK_START = "doing";

    /**
     * 完成任务
     */
    public static final String TASK_COMPLETE = "done";

    /**
     * 关闭任务
     */
    public static final String TASK_CLOSE = "closed";

    /**
     * 取消任务
     */
    public static final String TASK_CANCEL = "cancel";

    /**
     * 编辑任务
     */
    public static final String TASK_EDIT = "edited";

    /**
     * 激活任务
     */
    public static final String TASK_ACTIVE = "activated";

    /**
     * bug确认
     */
    public static final String BUG_CONFIRM = "bugconfirmed";

    /**
     * bug解决--待确认
     */
    public static final String BUG_RESOLVED = "resolved";

    /**
     * bug指派
     */
    public static final String BUG_ASSIGN = "assigned";

    /**
     * 任务延期Action
     */
    public static final String DELAY_ACTION = "task_delay";

    /**
     * 任务延期record_id
     */
    public static final String RECORD_ID_TASK_DELAY = "task_delay";

    /**
     * 今日事今日毕record_id
     */
    public static final String RECORD_ID_TASK_TODAY_DONE = "task_today_done";
    /**
     * 今日事今日毕record_id
     */
    public static final String RECORD_ID_BUG_TODAY_DONE = "bug_today_done";
    /**
     * 每日进步record_id
     */
    public static final String RECORD_ID_TASK_IMPROVE = "task_improve";
    /**
     * 每日进步record_id
     */
    public static final String RECORD_ID_BUG_IMPROVE = "bug_improve";
    /**
     * 每日进步record_id
     */
    public static final String RECORD_ID_TASK_TOP_MAN = "task_top_man";
    /**
     * 每日进步record_id
     */
    public static final String RECORD_ID_BUG_TOP_MAN = "bug_top_man";

    /**
     * 调用kernel的自动加分
     */
    public static final String EXEC_BONUS = "0";


}
