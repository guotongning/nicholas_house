package com.ning.nicholas_house.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/9/27 17:56
 */
@Data
@AllArgsConstructor
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(T data) {
        this.success();
        this.data = data;
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result<T> failure() {
        this.code = 0;
        this.msg = "failure";
        return this;
    }

    public Result<T> success() {
        this.code = 1;
        this.msg = "success";
        return this;
    }
}
