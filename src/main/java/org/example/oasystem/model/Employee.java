package org.example.oasystem.model;


import java.time.LocalDate;

public class Employee {

  private long employeeId;
  private String name;
  private GenderEnum gender;
  private LocalDate birthDate;
  private LocalDate hireDate;
  private String position;
  private String department;
  private String phone;
  private String email;
  private String address;
  private String education;
  private String workExperience;
  private String skills;
  private double salary;


  public long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(long employeeId) {
    this.employeeId = employeeId;
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


  public String getEducation() {
    return education;
  }

  public void setEducation(String education) {
    this.education = education;
  }


  public String getWorkExperience() {
    return workExperience;
  }

  public void setWorkExperience(String workExperience) {
    this.workExperience = workExperience;
  }


  public String getSkills() {
    return skills;
  }

  public void setSkills(String skills) {
    this.skills = skills;
  }


  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "employeeId=" + employeeId +
            ", name='" + name + '\'' +
            ", gender=" + gender +
            ", birthDate=" + birthDate +
            ", hireDate=" + hireDate +
            ", position='" + position + '\'' +
            ", department='" + department + '\'' +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            ", address='" + address + '\'' +
            ", education='" + education + '\'' +
            ", workExperience='" + workExperience + '\'' +
            ", skills='" + skills + '\'' +
            ", salary=" + salary +
            '}';
  }
}
