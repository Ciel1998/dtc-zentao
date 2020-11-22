package com.tjfybj.dtc.zentao.service.impl;

import com.tfjybj.dtc.commons.model.TaskModel;
import com.tfjybj.dtc.commons.utils.MakeIdUtil;
import com.tjfybj.dtc.zentao.mapper.TaskMapper;
import com.tjfybj.dtc.zentao.service.TaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2020/11/21 10:24
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
@Service
public class TaskServiceImpl implements TaskService {
    TaskModel taskModel;
    @Resource
    private TaskMapper taskMapper;
    MakeIdUtil makeIdUtil = new MakeIdUtil(1, 1, 1);
    /**
     * User:
     * Date: 2020/11/15
     * Description:
     **/
    @Override
    public List<TaskModel>  task() {
        //得到任务列表
        List<TaskModel> taskList = taskMapper.task();
//        List
//        for (TaskModel task : taskList) {
//            taskModel.setId(makeIdUtil.nextId());
//            taskModel.setUser_name(task.getUser_name());
//            taskModel.setDescription(task.getDescription());
//        }
        return taskList;
    }
}
