package com.tjfybj.dtc.zentao.mapper;

import com.tfjybj.dtc.commons.model.TaskModel;
import org.apache.ibatis.annotations.Mapper;

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
@Mapper
public interface TaskMapper {
    //根据时间，查询任务详情
    List<TaskModel> task(String beginDate , String endDate);
    //从数据库中，查询中文名
    String selectUserName(String englishName);
}
