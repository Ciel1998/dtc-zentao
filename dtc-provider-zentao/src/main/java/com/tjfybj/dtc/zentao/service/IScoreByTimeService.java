package com.tjfybj.dtc.zentao.service;

import com.tfjybj.dtc.commons.model.ScoreByTimeModel;

import java.util.List;

/**
 * @version 1.0
 * @Description
 * @Author fu yuanyuan
 * @CreateDate 2020/11/21 11:27
 * @UpdateUser fu yuanyuan
 * @UpdateDate 2020/11/21 11:27
 * @UpdateRemark
 */
public interface IScoreByTimeService {

    List<ScoreByTimeModel> queryScoreByTime(Integer projectId,Integer days);
}
