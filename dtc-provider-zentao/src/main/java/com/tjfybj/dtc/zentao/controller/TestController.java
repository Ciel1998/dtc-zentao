package com.tjfybj.dtc.zentao.controller;

import com.mysql.fabric.xmlrpc.base.Data;
import com.tfjybj.dtc.commons.bo.CommonResult;
import com.tjfybj.dtc.zentao.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2020/11/19 16:47
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
@RestController
@RequestMapping("/zentao")
@Api(tags = "测试Controller")
public class TestController {
    @Resource
    private TestService testService;

    /**
     * User:
     * Date: 2020/11/15
     * Description:
     **/
    @PostMapping("/test")
    @ApiOperation("从数据库")
    public CommonResult practice(@RequestParam(value = "upDate") Date upDate, @RequestParam(value = "endDate") Date endDate) {
        Integer integer = testService.test(upDate,endDate);
        if (integer > 0) {
            return CommonResult.success("success");
        }
        return CommonResult.build(CommonResult.RESULE_DATA_NONE, "查询为空");
    }

}

