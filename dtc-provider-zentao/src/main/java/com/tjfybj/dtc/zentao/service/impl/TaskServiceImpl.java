package com.tjfybj.dtc.zentao.service.impl;

import com.tfjybj.dtc.commons.model.ResultModel;
import com.tfjybj.dtc.commons.model.TaskModel;
import com.tfjybj.dtc.commons.utils.MakeIdUtil;
import com.tfjybj.dtc.commons.utils.ZentaoConstant;
import com.tjfybj.dtc.zentao.mapper.TaskMapper;
import com.tjfybj.dtc.zentao.service.TaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    @Resource
    private TaskMapper taskMapper;
    MakeIdUtil makeIdUtil = new MakeIdUtil(1, 1, 1);
    /**
     * User:
     * Date: 2020/11/15
     * Description:
     **/
    @Override
    public List<ResultModel> task(String beginDate, String endDate) throws ParseException {
        List<TaskModel> taskList = taskMapper.task(beginDate, endDate);
        List<ResultModel> resultModelList = new ArrayList<>();
        for (TaskModel task : taskList) {
            ResultModel resultModel = new ResultModel();
            switch (task.getStatus()) {
                case ZentaoConstant.TASK_OPEN:
                    resultModel.setId(makeIdUtil.nextId());
                    //从数据库中查询中文名称
                    String userName = taskMapper.selectUserName(task.getOpenedBy());
                    resultModel.setName(userName);
                    resultModel.setStatus("创建");
                    resultModel.setTask(task.getName());
                    resultModel.setUpdateTime(task.getOpenedDate());
                    resultModelList.add(resultModel);
                    break;
                case ZentaoConstant.TASK_START:
                    resultModel.setId(makeIdUtil.nextId());
                    //从数据库中查询中文名称
                    String getOpenedBy = taskMapper.selectUserName(task.getOpenedBy());
                    resultModel.setName(getOpenedBy);
                    resultModel.setStatus("开启");
                    resultModel.setTask(task.getName());
                    resultModel.setUpdateTime(task.getRealStarted());
                    resultModelList.add(resultModel);
                    break;
                case ZentaoConstant.TASK_COMPLETE:
                    resultModel.setId(makeIdUtil.nextId());
                    //从数据库中查询中文名称
                    String getFinishedBy = taskMapper.selectUserName(task.getFinishedBy());
                    resultModel.setName(getFinishedBy);
                    resultModel.setStatus("完成");
                    resultModel.setTask(task.getName());
                    resultModel.setUpdateTime(task.getFinishedDate());
                    resultModelList.add(resultModel);
                    break;
                case ZentaoConstant.TASK_CLOSE:
                    resultModel.setId(makeIdUtil.nextId());
                    //从数据库中查询中文名称
                    String getClosedBy = taskMapper.selectUserName(task.getClosedBy());
                    //操作人
                    resultModel.setName(getClosedBy);
                    resultModel.setStatus("关闭");
                    resultModel.setTask(task.getName());
                    resultModel.setUpdateTime(task.getClosedDate());
                    resultModelList.add(resultModel);
                    break;
                case ZentaoConstant.TASK_CANCEL:
                    resultModel.setId(makeIdUtil.nextId());
                    //从数据库中查询中文名称
                    String getCanceledBy = taskMapper.selectUserName(task.getCanceledBy());
                    resultModel.setName(getCanceledBy);
                    resultModel.setStatus("取消");
                    resultModel.setTask(task.getName());
                    resultModel.setUpdateTime(task.getCanceledDate());
                    resultModelList.add(resultModel);
                    break;
            }
        }
        return resultModelList;
    }
}


//          if (task.getStatus().trim() == "wait") {
//                resultModel.setId(makeIdUtil.nextId());
//                resultModel.setName(task.getOpenedBy());
//                resultModel.setStatus("创建");
//                resultModel.setTask(task.getName());
//                resultModel.setUpdateTime(task.getOpenedDate());
//            } else if (task.getStatus().trim() == "doing") {
//                resultModel.setId(makeIdUtil.nextId());
//                resultModel.setName(task.getOpenedBy());
//                resultModel.setStatus("开启");
//                resultModel.setTask(task.getName());
//                resultModel.setUpdateTime(task.getRealStarted());
//            } else if (task.getStatus().trim() == "done") {
//                resultModel.setId(makeIdUtil.nextId());
//                resultModel.setName(task.getFinishedBy());
//                resultModel.setStatus("完成");
//                resultModel.setTask(task.getName());
//                resultModel.setUpdateTime(task.getFinishedDate());
//            } else if (task.getStatus().trim() == "cancel") {
//                resultModel.setId(makeIdUtil.nextId());
//                resultModel.setName(task.getCanceledBy());
//                resultModel.setStatus("取消");
//                resultModel.setTask(task.getName());
////                Date d1= formatter.parse(task.getCanceledDate());
//                resultModel.setUpdateTime(task.getCanceledDate());
//            } else if (task.getStatus().trim() == "closed") {
//                resultModel.setId(makeIdUtil.nextId());
//                //操作人
//                resultModel.setName(task.getClosedBy());
//                resultModel.setStatus("关闭");
//                resultModel.setTask(task.getName());
//                resultModel.setUpdateTime(task.getClosedDate());
////            }
//                resultModelList.add(resultModel);
//            }