package org.example.oasystem.controller;

import org.example.oasystem.model.BaseResponse;
import org.example.oasystem.model.LeaveRequest;
import org.example.oasystem.service.LeaveRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/leave")
public class LeaveRequestController {

    private final LeaveRequestService leaveRequestService;

    @Autowired
    public LeaveRequestController(LeaveRequestService leaveRequestService) {
        this.leaveRequestService = leaveRequestService;
    }

    @PostMapping("/insertLeaveRequest.do")
    public BaseResponse<Void> insertLeaveRequest(LeaveRequest leaveRequest) {
        leaveRequestService.insertLeaveRequest(leaveRequest);
        return BaseResponse.success();
    }

    @PostMapping("/getAllLeaveRequest.do")
    public BaseResponse<List<LeaveRequest>> getAllLeaveRequest() {
        List<LeaveRequest> data = leaveRequestService.getAllLeaveRequest();
        return BaseResponse.success(data);
    }
}
