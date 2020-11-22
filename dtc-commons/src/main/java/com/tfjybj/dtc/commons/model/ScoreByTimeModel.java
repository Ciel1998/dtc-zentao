package com.tfjybj.dtc.commons.model;

import lombok.Data;

/**
 * @version 1.0
 * @Description
 * @Author fu yuanyuan
 * @CreateDate 2020/11/21 11:29
 * @UpdateUser fu yuanyuan
 * @UpdateDate 2020/11/21 11:29
 * @UpdateRemark
 */
@Data
public class ScoreByTimeModel {
    private String id;
    private String userName;
    private String projectId;
    private String projectName;
    private Integer score;
}
