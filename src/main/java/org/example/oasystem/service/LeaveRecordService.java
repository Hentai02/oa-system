package org.example.oasystem.service;

import org.example.oasystem.mapper.LeaveRecordMapper;
import org.example.oasystem.model.LeaveRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveRecordService {

    private final LeaveRecordMapper leaveRecordMapper;

    public LeaveRecordService(LeaveRecordMapper leaveRecordMapper) {
        this.leaveRecordMapper = leaveRecordMapper;
    }

    public void insertLeaveRecord(LeaveRecord leaveRecord){
        leaveRecordMapper.insertLeaveRecord(leaveRecord);
    }

    public LeaveRecord getLeaveRecordById(Integer id){
        return leaveRecordMapper.getLeaveRecordById(id);
    }

    public List<LeaveRecord> getLeaveRecordsByEmployeeId(Integer employeeId){
        return leaveRecordMapper.getLeaveRecordsByEmployeeId(employeeId);
    }

    public void updateLeaveRecord(LeaveRecord leaveRecord){
        leaveRecordMapper.updateLeaveRecord(leaveRecord);
    }

    public void deleteLeaveRecord(Integer id){
        leaveRecordMapper.deleteLeaveRecord(id);
    }
}
