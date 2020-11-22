package com.tjfybj.dtc.zentao.controller;

import com.tfjybj.dtc.commons.bo.CommonResult;
import com.tfjybj.dtc.commons.model.TaskModel;
import com.tjfybj.dtc.zentao.service.TaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2020/11/21 10:22
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
@RestController
@RequestMapping("/zentao")
@Api(tags = "任务Controller")
public class TaskController {
    @Resource
    private TaskService taskService;

    /**
     * User:
     * Date: 2020/11/15
     * Description:
     **/
    @GetMapping("/task")
    @ApiOperation("获取任务列表")
    public CommonResult practice() {
        List<TaskModel> stringList = taskService.task();
        if (stringList.size() > 0) {
            return CommonResult.success("success",stringList);
        } else {
            return CommonResult.build(CommonResult.RESULE_DATA_NONE, "查询为空~~~~");
        }
    }
}