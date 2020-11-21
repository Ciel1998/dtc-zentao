package com.tjfybj.dtc.zentao.service.impl;

import com.tjfybj.dtc.zentao.mapper.TaskMapper;
import com.tjfybj.dtc.zentao.service.TaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

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
    @Resource
    private TaskMapper taskMapper;

    /**
     * User:
     * Date: 2020/11/15
     * Description:
     **/
    @Override
    public Integer task() {
        Integer integer = taskMapper.task();

        return integer;
    }
}
