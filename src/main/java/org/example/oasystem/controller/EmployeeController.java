package org.example.oasystem.controller;


import org.example.oasystem.model.BaseResponse;
import org.example.oasystem.model.Employee;
import org.example.oasystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * 获取所有员工信息
     * @return
     */
    @PostMapping("/getAllEmployee.do")
    public BaseResponse<List<Employee>> getAllEmployee(){
        return BaseResponse.success(employeeService.getAllEmployee());
    }

    /**
     * 编辑员工信息
     * @param employee
     * @return
     */
    @PostMapping("/updateEmployee.do")
    public BaseResponse<Void> updateEmployee(@RequestBody Employee employee){
        int updatedCount = employeeService.updateEmployee(employee);
        if (updatedCount > 0) {
            return BaseResponse.success();
        } else {
            return BaseResponse.error();
        }
    }

    /**
     * 删除员工信息
     * @param id
     * @return
     */
    @PostMapping("/deleteEmployee.do")
    public BaseResponse<Void> deleteEmployee(@RequestParam Integer id){
        int deletedCount = employeeService.deleteEmployee(id);
        if (deletedCount > 0) {
            return BaseResponse.success();
        } else {
            return BaseResponse.error();
        }
    }

    /**
     * 录入员工信息
     * @param employee
     * @return
     */
    @PostMapping("/insertEmployee.do")
    public BaseResponse<Integer> insertEmployee(@RequestBody Employee employee){
        int insertedCount = employeeService.insertEmployee(employee);
        if (insertedCount > 0) {
            return BaseResponse.success(employee.getId());
        } else {
            return BaseResponse.error();
        }
    }

    // TODO: 提供员工信息的详细视图，允许管理员和员工查看个人及他人的基本信息。
}
