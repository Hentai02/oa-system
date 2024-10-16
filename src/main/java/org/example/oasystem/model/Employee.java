package org.example.oasystem.model;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

  private Integer id;           // 员工的唯一标识符
  private String name;          // 员工姓名
  private String gender;        // 员工性别
  private LocalDate birthDate;  // 出生日期
  private LocalDate hireDate;   // 入职日期
  private String position;      // 职位
  private String department;    // 部门
  private String phone;         // 联系电话
  private String email;         // 电子邮件
  private String address;       // 居住地址
  private String status;        // 员工状态（如在职、离职等）
  private LocalDateTime createdAt; // 记录创建时间
  private LocalDateTime updatedAt; // 记录最后更新时间

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


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
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


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
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
