package org.example.oasystem.model;


import java.time.LocalDate;
import java.time.LocalDateTime;
/*id：自增的主键，用于唯一标识每一位员工。
name：员工的姓名，不能为空。
gender：员工的性别，可以是 ENUM 类型（如：男、女）。
birth_date：员工的出生日期，不能为空。
hire_date：员工的入职日期，不能为空。
position：员工的职位，选填。
department：员工所在的部门，选填。
phone：员工的联系电话，选填。
email：员工的电子邮件，必须唯一。
status：记录员工的状态，默认为“在职”。
created_at：记录创建时间，用于追踪记录的创建时间。
updated_at：记录最后更新时间，用于审计和数据管理。*/
public class Employee {

  private Integer id;
  private String name;
  private GenderEnum gender;
  private LocalDate birthDate;
  private LocalDate hireDate;
  private String position;
  private String department;
  private String phone;
  private String email;
  private String address;
  private EmployeeStatusEnum status;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }


  public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }


  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public EmployeeStatusEnum getStatus() {
    return status;
  }

  public void setStatus(EmployeeStatusEnum status) {
    this.status = status;
  }


  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", gender=" + gender +
            ", birthDate=" + birthDate +
            ", hireDate=" + hireDate +
            ", position='" + position + '\'' +
            ", department='" + department + '\'' +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            ", address='" + address + '\'' +
            ", status=" + status +
            ", createdAt=" + createdAt +
            ", updatedAt=" + updatedAt +
            '}';
  }
}
