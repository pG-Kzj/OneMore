package com.onemore.portal.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.StringJoiner;

/**
 * @author kzj
 * 返回类
 */
@Getter
@Setter
public class Result<T> {

    private Integer code;
    private String msg;
    private T data;

    public Result() {
        super();
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Result.class.getSimpleName() + "[", "]")
                .add("code=" + code)
                .add("msg='" + msg + "'")
                .add("data=" + data)
                .toString();
    }
}
