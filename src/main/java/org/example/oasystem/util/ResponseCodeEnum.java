package org.example.oasystem.util;

public enum ResponseCodeEnum {
    SUCCESS(200, "Success"),
    ERROR(500, "Internal Server Error"),
    NOT_FOUND(404, "Not Found");

    private final int code;
    private final String message;

    ResponseCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

