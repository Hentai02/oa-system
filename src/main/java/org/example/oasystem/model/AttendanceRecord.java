package org.example.oasystem.model;


import java.time.LocalDate;
import java.time.LocalDateTime;
/*id：自增的主键，用于唯一标识每一条考勤记录。
employee_id：外键，指向员工表中的员工ID，关联员工信息。
check_in_time：员工上班打卡的具体时间，不能为空。
check_out_time：员工下班打卡的具体时间，可以为空，因为某些情况下员工可能未打下班卡。
check_date：记录的考勤日期，确保每条记录对应一个具体的日期。
status：记录员工的考勤状态，比如正常出勤、缺勤、迟到等，可以根据具体需要定义更多状态。
location：记录打卡的具体地点，方便后续的数据分析和审核。
device：记录员工使用的打卡设备，有助于分析打卡方式。
created_at：记录创建的时间戳，便于追踪记录的创建时间。
updated_at：记录最后更新时间，用于审计和数据管理。*/
public class AttendanceRecord {

  private Integer id;
  private Integer employeeId;
  private LocalDateTime checkInTime;
  private LocalDateTime checkOutTime;
  private LocalDate checkDate;
  private String status;
  private String location;
  private String device;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public LocalDate getCheckDate() {
    return checkDate;
  }

  public void setCheckDate(LocalDate checkDate) {
    this.checkDate = checkDate;
  }

  public LocalDateTime getCheckOutTime() {
    return checkOutTime;
  }

  public void setCheckOutTime(LocalDateTime checkOutTime) {
    this.checkOutTime = checkOutTime;
  }

  public LocalDateTime getCheckInTime() {
    return checkInTime;
  }

  public void setCheckInTime(LocalDateTime checkInTime) {
    this.checkInTime = checkInTime;
  }

  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}