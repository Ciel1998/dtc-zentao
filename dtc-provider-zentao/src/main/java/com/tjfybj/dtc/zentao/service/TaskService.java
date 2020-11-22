package com.tjfybj.dtc.zentao.service;

import com.tfjybj.dtc.commons.model.ResultModel;

import java.text.ParseException;
import java.util.List;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2020/11/21 10:26
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
public interface TaskService {
    List<ResultModel> task(String beginDate , String endDate) throws ParseException;
}
