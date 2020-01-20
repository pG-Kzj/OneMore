package com.onemore.portal.enums;

/**
 * 返回类的枚举
 *
 * @author kzj
 */
public enum ResultEnum {
    //这里是可以自己定义的，方便与前端交互即可
    UNKNOWN_ERROR(-1, "未知错误"),
    SUCCESS(10000, "成功"),
    USER_NOT_EXIST(404, "数据不存在"),
    USER_IS_EXISTS(2, "数据已存在"),
    DATA_IS_NULL(3, "数据为空"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
