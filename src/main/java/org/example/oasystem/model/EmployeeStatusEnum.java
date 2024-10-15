package org.example.oasystem.model;

public enum EmployeeStatusEnum {
    ON_DUTY("在职"),
    LEAVE("离职"),
    VACATION("休假");

    private final String value;

    EmployeeStatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // 通过数据库中的状态字符串值获取枚举
    public static EmployeeStatusEnum fromValue(String value) {
        for (EmployeeStatusEnum status : EmployeeStatusEnum.values()) {
            if (status.getValue().equals(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("未知的状态: " + value);
    }
}

