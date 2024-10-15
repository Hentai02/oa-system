package org.example.oasystem.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.oasystem.model.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> getEmployeeByConditions(@Param("id") Integer id,
                                           @Param("name") String name,
                                           @Param("department")String department);

    Integer insertEmployee(Employee employee);

    Integer updateEmployee(Employee employee);

    Integer deleteEmployee(@Param("id") Integer id);
}
