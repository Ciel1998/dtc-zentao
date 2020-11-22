package com.tjfybj.dtc.zentao.mapper;

import com.tfjybj.dtc.commons.model.ScoreByTimeModel;
import org.apache.ibatis.annotations.Mapper;

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
@Mapper
public interface ScoreByTimeMapper {
    List<ScoreByTimeModel> queryScoreByTime(Integer projectId,Integer days);
}
