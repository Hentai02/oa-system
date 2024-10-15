package org.example.oasystem.model;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LeaveTypeEnumTypeHandler extends BaseTypeHandler<LeaveTypeEnum> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, LeaveTypeEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.getValue()); // 将枚举转换为字符串存入数据库
    }

    @Override
    public LeaveTypeEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String value = rs.getString(columnName);
        return value != null ? LeaveTypeEnum.fromValue(value) : null; // 从数据库读取字符串转换为枚举
    }

    @Override
    public LeaveTypeEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String value = rs.getString(columnIndex);
        return value != null ? LeaveTypeEnum.fromValue(value) : null; // 从数据库读取字符串转换为枚举
    }

    @Override
    public LeaveTypeEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String value = cs.getString(columnIndex);
        return value != null ? LeaveTypeEnum.fromValue(value) : null; // 从数据库读取字符串转换为枚举
    }
}

