package org.example.oasystem.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.oasystem.model.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    Integer insertEmployee(Employee employee);
    Integer deleteEmployee(@Param("id") Integer id);
    Integer updateEmployee(Employee employee);
    List<Employee> getAllEmployee();
    List<Employee> getEmployeeById(@Param("id") Integer id);
    List<Employee> getEmployeeByName(@Param("name") String name);
    List<Employee> getEmployeeByDepartment(@Param("department") String department);






}
