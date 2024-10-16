package org.example.oasystem.model;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Deprecated
public class GenderEnumTypeHandler extends BaseTypeHandler<GenderEnum> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, GenderEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.getValue()); // 将枚举转为数据库中的值
    }

    @Override
    public GenderEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String value = rs.getString(columnName);
        return GenderEnum.fromValue(value); // 从数据库中的值转换为枚举
    }

    @Override
    public GenderEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String value = rs.getString(columnIndex);
        return GenderEnum.fromValue(value); // 从数据库中的值转换为枚举
    }

    @Override
    public GenderEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String value = cs.getString(columnIndex);
        return GenderEnum.fromValue(value); // 从数据库中的值转换为枚举
    }
}
