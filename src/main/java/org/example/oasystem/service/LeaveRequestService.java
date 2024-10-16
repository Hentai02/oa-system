package org.example.oasystem.service;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.oasystem.mapper.LeaveRequestMapper;
import org.example.oasystem.model.LeaveRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveRequestService {

    private final LeaveRequestMapper leaveRequestMapper;

    public LeaveRequestService(LeaveRequestMapper leaveRequestMapper) {
        this.leaveRequestMapper = leaveRequestMapper;
    }

    public void insertLeaveRequest(LeaveRequest leaveRequest) {
        this.leaveRequestMapper.insertLeaveRequest(leaveRequest);
    }

    public void deleteLeaveRequest(Integer id) {
        this.leaveRequestMapper.deleteLeaveRequest(id);
    }

    public void updateLeaveRequest(LeaveRequest leaveRequest) {
        this.leaveRequestMapper.updateLeaveRequest(leaveRequest);
    }

    public List<LeaveRequest> getAllLeaveRequest() {
        return this.leaveRequestMapper.getAllLeaveRequest();
    }

    public LeaveRequest getLeaveRequestById(Integer id) {
        return this.leaveRequestMapper.getLeaveRequestById(id);
    }
}
