package com.tjfybj.dtc.zentao.controller;

import com.tfjybj.dtc.commons.bo.CommonResult;
import com.tjfybj.dtc.zentao.service.TaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
        Integer integer = taskService.task();
        if (integer > 0) {
            return CommonResult.success("success");
        }
        return CommonResult.build(CommonResult.RESULE_DATA_NONE, "查询为空");
    }
}