package org.example.oasystem.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.oasystem.model.Employee;

@Mapper
public interface EmployeeMapper {

    Employee getEmployeeByConditions(@Param("employeeId") Integer employeeId,
                                     @Param("name") String name,
                                     @Param("department")String department);
}
