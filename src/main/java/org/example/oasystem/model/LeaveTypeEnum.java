package org.example.oasystem.model;

public enum LeaveTypeEnum {
    A("事假"),
    B("病假"),
    C("年假"),
    OTHER("其他");

    private final String value;

    LeaveTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // 通过数据库中的状态字符串值获取枚举
    public static LeaveTypeEnum fromValue(String value) {
        for (LeaveTypeEnum status : LeaveTypeEnum.values()) {
            if (status.getValue().equals(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("未知的状态: " + value);
    }
}

