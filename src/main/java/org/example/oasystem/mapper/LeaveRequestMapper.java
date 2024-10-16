package org.example.oasystem.mapper;

import org.apache.ibatis.annotations.*;
import org.example.oasystem.model.LeaveRequest;

import java.util.List;

@Mapper
public interface LeaveRequestMapper {
    // 插入请假记录
    void insertLeaveRequest(LeaveRequest leaveRequest);

    // 根据ID删除请假记录
    void deleteLeaveRequest(@Param("id") Integer id);

    // 更新请假记录
    void updateLeaveRequest(LeaveRequest leaveRequest);

    // 查询所有请假记录// 引用XML中的resultMap
    List<LeaveRequest> getAllLeaveRequest();

    // 根据ID查询请假记录
    LeaveRequest getLeaveRequestById(@Param("id") Integer id);
}
