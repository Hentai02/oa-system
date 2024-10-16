package org.example.oasystem.model;

@Deprecated
public enum GenderEnum {
    MALE("男"),
    FEMALE("女");

    private final String value;

    GenderEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // 通过数据库中的性别字符串值获取枚举
    public static GenderEnum fromValue(String value) {
        for (GenderEnum gender : GenderEnum.values()) {
            if (gender.getValue().equals(value)) {
                return gender;
            }
        }
        throw new IllegalArgumentException("未知的性别: " + value);
    }
}
