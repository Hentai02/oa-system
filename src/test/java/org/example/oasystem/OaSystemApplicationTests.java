package org.example.oasystem;

import org.example.oasystem.model.Employee;
import org.example.oasystem.model.GenderEnum;
import org.example.oasystem.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@AutoConfigureMockMvc
class OaSystemApplicationTests {


    @Autowired
    private EmployeeService employeeService;

    @Test
    void testGetEmployeeByConditions() {
        List<Employee> employeeById = employeeService.getEmployeeByConditions(null,null,null);
        System.out.printf(employeeById.toString());
        assertNotNull(employeeById);
    }

    @Test
    void testInsertEmployee() {
        Employee newEmployee = new Employee();
        newEmployee.setName("张三");
        newEmployee.setGender(GenderEnum.FEMALE);
        newEmployee.setBirthDate(LocalDate.of(1990,10,14)); // 生日设置为 1990-01-01
        newEmployee.setHireDate(LocalDate.now()); // 当前日期作为入职日期
        newEmployee.setPosition("开发工程师");
        newEmployee.setDepartment("技术部");
        newEmployee.setPhone("12345678901");
        newEmployee.setEmail("zhangsan@example.com");
        newEmployee.setAddress("北京市某某区某某街道");
        newEmployee.setEducation("本科");
        newEmployee.setWorkExperience("3年");
        newEmployee.setSkills("Java, MySQL");
        newEmployee.setSalary(12000.0);

        employeeService.insertEmployee(newEmployee);
        assertNotNull(newEmployee.getEmployeeId());
        System.out.printf(String.valueOf(newEmployee.getEmployeeId()));
    }

    @Test
    void testUpdateEmployee() {
        Employee employee = employeeService.getEmployeeByConditions(20, null, null).get(0);
        employee.setAddress("合并E及处罚金额为你付出六十九");
        employee.setGender(GenderEnum.MALE);
        employee.setBirthDate(LocalDate.now());
        Integer updated = employeeService.updateEmployee(employee);
        assertNotNull(updated);
        System.out.println(updated);

    }

    @Test
    void testDeleteEmployee() {
        Integer deleted = employeeService.deleteEmployee(22);
        assertNotNull(deleted);
        System.out.println(deleted);
    }

    @Test
    void contextLoads() {
        assertNotNull(this);
    }

}
