package org.example.oasystem.service;

import org.apache.ibatis.annotations.Param;
import org.example.oasystem.mapper.EmployeeMapper;
import org.example.oasystem.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    private final EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeService(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }


    public List<Employee> getEmployeeById(Integer id){
        return employeeMapper.getEmployeeById(id);
    }

    public List<Employee> getEmployeeByName(String name){
        return employeeMapper.getEmployeeByName(name);
    }

    public List<Employee> getEmployeeByDepartment(String department){
        return employeeMapper.getEmployeeByDepartment(department);
    }

    public Integer insertEmployee(Employee employee){
        return employeeMapper.insertEmployee(employee);
    }

    public Integer updateEmployee(Employee employee){
        return employeeMapper.updateEmployee(employee);
    }

    public Integer deleteEmployee(Integer id){
        return employeeMapper.deleteEmployee(id);
    }

    public List<Employee> getAllEmployee(){
        return employeeMapper.getAllEmployee();
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
