package com.tjfybj.dtc.zentao.service.impl;

import com.tfjybj.dtc.commons.model.ScoreByTimeModel;
import com.tjfybj.dtc.zentao.mapper.ScoreByTimeMapper;
import com.tjfybj.dtc.zentao.service.IScoreByTimeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
@Service
public class ScoreByTimeServiceImpl implements IScoreByTimeService {

    @Resource
    private ScoreByTimeMapper scoreByTimeMapper;

    @Override
    public List<ScoreByTimeModel> queryScoreByTime(Integer projectId,Integer days) {
        List<ScoreByTimeModel> scoreByTimeModelList = scoreByTimeMapper.queryScoreByTime(projectId,days);
        return scoreByTimeModelList;
    }
}
