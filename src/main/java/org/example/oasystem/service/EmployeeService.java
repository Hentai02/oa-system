package org.example.oasystem.service;

import org.example.oasystem.mapper.EmployeeMapper;
import org.example.oasystem.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    private EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeService(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }


    public Employee getEmployeeByConditions(Integer employeeId,String name,String department,String email){
        return employeeMapper.getEmployeeByConditions(employeeId, name, department);
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
