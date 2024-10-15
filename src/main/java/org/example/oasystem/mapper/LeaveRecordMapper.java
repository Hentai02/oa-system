package org.example.oasystem.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.oasystem.model.LeaveRecord;

import java.util.List;

@Mapper
public interface LeaveRecordMapper {

    void insertLeaveRecord(LeaveRecord leaveRecord);

    LeaveRecord getLeaveRecordById(Integer id);

    List<LeaveRecord> getLeaveRecordsByEmployeeId(Integer employeeId);

    void updateLeaveRecord(LeaveRecord leaveRecord);

    void deleteLeaveRecord(Integer id);
}
