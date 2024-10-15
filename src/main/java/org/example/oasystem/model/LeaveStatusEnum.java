package org.example.oasystem.model;

public enum LeaveStatusEnum {
    REVIEW("待审核"),
    SUCCESS("通过"),
    REJECT("拒绝");

    private final String value;

    LeaveStatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // 通过数据库中的状态字符串值获取枚举
    public static LeaveStatusEnum fromValue(String value) {
        for (LeaveStatusEnum status : LeaveStatusEnum.values()) {
            if (status.getValue().equals(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("未知的状态: " + value);
    }
}

