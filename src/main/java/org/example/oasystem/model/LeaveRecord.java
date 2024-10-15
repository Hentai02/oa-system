package org.example.oasystem.model;


import java.time.LocalDate;
import java.time.LocalDateTime;
/*id：自增的主键，用于唯一标识每一条请假记录。
employee_id：外键，指向员工表中的员工ID，关联员工信息。
leave_start_date：请假开始日期，不能为空。
leave_end_date：请假结束日期，不能为空。
leave_type：请假类型，例如事假、病假、年假等，可以根据具体需要定义更多类型。
reason：记录请假原因，可为空。
status：记录请假申请的状态，默认值为“待审核”，可以根据审核结果更新为“通过”或“拒绝”。
created_at：记录创建的时间戳，便于追踪记录的创建时间。
updated_at：记录最后更新时间，用于审计和数据管理。*/
public class LeaveRecord {

  private Integer id;
  private Integer employeeId;
  private LocalDate leaveStartDate;
  private LocalDate leaveEndDate;
  private LeaveTypeEnum leaveType;
  private String reason;
  private LeaveStatusEnum status;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }


  public LocalDate getLeaveStartDate() {
    return leaveStartDate;
  }

  public void setLeaveStartDate(LocalDate leaveStartDate) {
    this.leaveStartDate = leaveStartDate;
  }


  public LocalDate getLeaveEndDate() {
    return leaveEndDate;
  }

  public void setLeaveEndDate(LocalDate leaveEndDate) {
    this.leaveEndDate = leaveEndDate;
  }


  public LeaveTypeEnum getLeaveType() {
    return leaveType;
  }

  public void setLeaveType(LeaveTypeEnum leaveType) {
    this.leaveType = leaveType;
  }


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  public LeaveStatusEnum getStatus() {
    return status;
  }

  public void setStatus(LeaveStatusEnum status) {
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

}
