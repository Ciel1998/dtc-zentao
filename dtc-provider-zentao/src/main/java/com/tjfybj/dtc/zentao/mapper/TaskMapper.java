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
    List<TaskModel> task();
}
