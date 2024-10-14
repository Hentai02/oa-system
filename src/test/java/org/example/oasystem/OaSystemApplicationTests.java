package org.example.oasystem;

import org.example.oasystem.model.Employee;
import org.example.oasystem.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@AutoConfigureMockMvc
class OaSystemApplicationTests {


    @Autowired
    private EmployeeService employeeService;

    @Test
    void testGetEmployees() {
        Employee employeeById = employeeService.getEmployeeByConditions(2,null,null,null);
        System.out.printf(employeeById.toString());
        assertNotNull(employeeById);
    }

    @Test
    void contextLoads() {
        assertNotNull(this);
    }

}
