package org.example.oasystem.service;

import org.apache.ibatis.annotations.Param;
import org.example.oasystem.mapper.EmployeeMapper;
import org.example.oasystem.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    private EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeService(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }


    public List<Employee> getEmployeeByConditions(Integer employeeId,
                                                  String name,
                                                  String department){
        return employeeMapper.getEmployeeByConditions(employeeId, name, department);
    }

    public Integer insertEmployee(Employee employee){
        return employeeMapper.insertEmployee(employee);
    }

    public Integer updateEmployee(Employee employee){
        return employeeMapper.updateEmployee(employee);
    }

    public Integer deleteEmployee(@Param("employeeId") Integer employeeId){
        return employeeMapper.deleteEmployee(employeeId);
    }

//    public List<Employee> getAllEmployees() {
//        return employeeMapper.findAll();
//    }
//
//    public Employee getEmployeeById(Integer employeeId) {
//        return employeeMapper.getEmployeeById(employeeId);
//    }
//
//    public int addEmployee(Employee employee) {
//        return employeeMapper.insertEmployee(employee);
//    }
}
