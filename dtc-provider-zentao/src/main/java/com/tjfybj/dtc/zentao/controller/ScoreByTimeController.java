package com.tjfybj.dtc.zentao.controller;

import com.tfjybj.dtc.commons.bo.CommonResult;
import com.tfjybj.dtc.commons.model.ScoreByTimeModel;
import com.tjfybj.dtc.zentao.service.IScoreByTimeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @Description
 * @Author fu yuanyuan
 * @CreateDate 2020/11/21 11:26
 * @UpdateUser fu yuanyuan
 * @UpdateDate 2020/11/21 11:26
 * @UpdateRemark
 */
@RestController
@RequestMapping("/ScoreByTimeController")
@Api(tags = "查询分数Controller")
public class ScoreByTimeController {

    @Resource
    private IScoreByTimeService scoreByTimeService;

    @ApiOperation("查询一段时间内个人禅道积分汇总")
    @GetMapping("/queryScoreByTime")
    public CommonResult queryScoreByTime(@RequestParam(value = "projectId", required = false) Integer projectId, @RequestParam(value = "days") Integer days) {
        if (projectId == null) {
            List<ScoreByTimeModel> scoreByTimeModelList = scoreByTimeService.queryScoreByTime(days);
            if (CollectionUtils.isEmpty(scoreByTimeModelList)) {
                return CommonResult.build(CommonResult.RESULE_DATA_NONE, "查询为空");
            } else {
                return CommonResult.build(CommonResult.SUCCESS, "查询成功", scoreByTimeModelList);
            }
        } else {
            List<ScoreByTimeModel> scoreByTimeModelList = scoreByTimeService.queryScoreByProAndTime(projectId, days);
            if (CollectionUtils.isEmpty(scoreByTimeModelList)) {
                return CommonResult.build(CommonResult.RESULE_DATA_NONE, "查询为空");
            } else {
                return CommonResult.build(CommonResult.SUCCESS, "查询成功", scoreByTimeModelList);
            }
        }
    }
}
