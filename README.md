技术：
    微服务架构
    swich case
    关键字
 
 public class ZentaoConstant {

    /**
     * 创建任务
     */
    public static final String TASK_OPEN = "wait";

    /**
     * 开始任务
     */
    public static final String TASK_START = "doing";

    /**
     * 完成任务
     */
    public static final String TASK_COMPLETE = "done";

    /**
     * 关闭任务
     */
    public static final String TASK_CLOSE = "closed";

    /**
     * 取消任务
     */
    public static final String TASK_CANCEL = "cancel";

    switch case
}
调用

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
                ...
