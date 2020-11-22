package com.tfjybj.dtc.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2020/11/22 10:46
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultModel {
    private Long id;
    //操作人
    private String name;
    //任务名
    private String task;
    private String status;
    private String updateTime;
}
