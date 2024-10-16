package org.example.oasystem.model;

import org.example.oasystem.util.ResponseCodeEnum;

public class BaseResponse<T> {
    private int code;       // 状态码
    private String message;  // 消息或原因
    private T data;          // 数据

    // 构造函数
    public BaseResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // 无数据的构造函数
    public BaseResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    // 静态方法返回带数据的响应
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getMessage(), data);
    }

    // 静态方法返回带数据的响应
    public static <T> BaseResponse<T> success() {
        return new BaseResponse<>(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getMessage(), null);
    }

    // 静态方法返回不带数据的响应
    public static <T> BaseResponse<T> error(String message) {
        return new BaseResponse<>(ResponseCodeEnum.ERROR.getCode(), message, null);
    }

    public static <T> BaseResponse<T> error() {
        return new BaseResponse<>(ResponseCodeEnum.ERROR.getCode(), ResponseCodeEnum.ERROR.getMessage(), null);
    }

    // Getter 和 Setter
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

