package com.tfjybj.dtc.commons.bo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2020/11/19 16:18
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class CommonResult {
    /*   成功状态码  */
    public static final String SUCCESS = "0000";
    /*   请求失败状态码  */
    public static final String FAIL = "1111";

    /*   参数无效  */
    public static final String PARAM_IS_INVALID = "1001";
    /*   参数为空  */
    public static final String PARAM_IS_BLANK = "1002";
    /*   参数类型错误  */
    public static final String PARAM_TYPE_BIND_ERROR = "1003";
    /*   参数缺失  */
    public static final String PARAM_NOT_COMPLETE = "1004";

    /*   用户未登录  */
    public static final String USER_NOT_LOGGED_IN = "2001";
    /*   账号不存在或密码错误  */
    public static final String USER_ACCOUNT_ERROR = "2002";
    /*   用户密码错误   */
    public static final String USER_PWD_ERROR = "2003";
    /*   用户参数缺失   */
    public static final String USER_PARAM_NOT_EXIST = "2004";
    /*   账号已被禁用  */
    public static final String USER_ACCOUNT_FORBIDDEN = "2004";
    /*   用户不存在  */
    public static final String USER_NOT_EXIST = "2005";
    /*   用户已存在  */
    public static final String USER_HAS_EXISTED = "2006";

    /*   某业务出现问题  */
    public static final String SPECIFIED_QUESTIONED_USER_NOT_EXIST = "3001";

    /*   系统错误（系统繁忙，请稍后重试）  */
    public static final String SYSTEM_INNER_ERROR = "4001";

    /*   数据未找到  */
    public static final String RESULE_DATA_NONE = "5001";
    /*   数据有误  */
    public static final String DATA_IS_WRONG = "5002";
    /*   数据已存在  */
    public static final String DATA_ALREADY_EXISTED = "5003";

    /*   内部系统接口调用异常  */
    public static final String INTERFACE_INNER_INVOKE_ERROR = "6001";
    /*   外部系统接口调用异常  */
    public static final String INTERFACE_OUTTER_INVOKE_ERROR = "6002";
    /*   该接口禁止访问  */
    public static final String INTERFACE_FORBID_VISIT = "6003";
    /*   接口地址无效  */
    public static final String INTERFACE_ADDRESS_INVALID = "6004";
    /*   接口请求超时  */
    public static final String INTERFACE_REQUEST_TIMEOUT = "6005";
    /*   接口负载过高  */
    public static final String INTERFACE_EXCEED_LOAD = "6006";

    /*   无访问权限  */
    public static final String PERMISSION_NO_ACCESS = "7001";

    /*   文件为空  */
    public static final String FILE_IS_NULL = "8001";

    /*   文件解析不到格式  */
    public static final String FILE_NO_TYPE = "8002";

    /*   文件过大 */
    public static final String FILE_TOO_BIG = "8003";

    private static final long serialVersionUID = 1L;

    private String code;

    private String message;

    private Object data;

    private Exception exception;

    private long count;


    private CommonResult() {
        super();
    }

    private CommonResult(String code, String msg) {
        super();
        this.code = code;
        this.message = msg;
    }

    private CommonResult(String code, String msg, Object data) {
        super();
        this.code = code;
        this.message = msg;
        this.data = data;
    }

    private CommonResult(String code, String msg, long count, Object data) {
        super();
        this.code = code;
        this.message = msg;
        this.count = count;
        this.data = data;
    }

    private CommonResult(String code, String msg, Exception exception) {
        super();
        this.code = code;
        this.message = msg;
        this.exception = exception;
    }


    public static CommonResult build(String code, String msg, Object data) {
        return new CommonResult(code, msg, data);
    }

    public static CommonResult build(String code, String msg) {
        return new CommonResult(code, msg);
    }

    public static CommonResult build(String code, String msg, Exception e) {
        return new CommonResult(code, msg, e);
    }

    public static CommonResult build(String code, String msg, long count,
                                     Object data) {
        return new CommonResult(code, msg, count, data);
    }

    public static CommonResult success(String msg, Object data) {
        return new CommonResult(CommonResult.SUCCESS, msg, data);
    }

    public static CommonResult success(String msg) {
        return new CommonResult(CommonResult.SUCCESS, msg);
    }
}
