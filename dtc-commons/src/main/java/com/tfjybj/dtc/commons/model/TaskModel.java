package com.tfjybj.dtc.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2020/11/21 21:06
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskModel {
    //http://zentao.dmsd.tech/zentao/dev-db-zt_task.html 字段详解
    //任务名
    private String name;
    private String status;
    private String openedBy;
    private String openedDate;
    //指派人和实际开始人
    private String assignedTo;
    private String realStarted;
    private String finishedBy;
    private String finishedDate;
    private String canceledBy;
    private String canceledDate;
    private String closedBy;
    private String closedDate;
}