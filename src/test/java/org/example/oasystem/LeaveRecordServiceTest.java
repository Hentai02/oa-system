package org.example.oasystem;

import org.example.oasystem.model.LeaveRecord;
import org.example.oasystem.model.LeaveStatusEnum;
import org.example.oasystem.model.LeaveTypeEnum;
import org.example.oasystem.service.LeaveRecordService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
public class LeaveRecordServiceTest {

    @Autowired
    private LeaveRecordService leaveRecordService;

    @Test
    void testInsertLeaveRecord(){
        // 创建新的请假记录
        LeaveRecord leaveRecord = new LeaveRecord();
        leaveRecord.setEmployeeId(1); // 假设员工ID为1
        leaveRecord.setLeaveType(LeaveTypeEnum.A); // 假设请假类型为年假
        leaveRecord.setLeaveStartDate(LocalDate.now()); // 开始日期为今天
        leaveRecord.setLeaveEndDate(LocalDate.now()); // 结束日期为今天（可以根据业务需求修改）
        leaveRecord.setReason("年度休假"); // 假设请假理由是年度休假
        leaveRecord.setStatus(LeaveStatusEnum.REVIEW); // 状态为审批中

        // 插入请假记录
        leaveRecordService.insertLeaveRecord(leaveRecord);

        // 插入后ID应该自动生成
        assertNotNull(leaveRecord.getId(), "插入失败，ID没有生成");

        System.out.println("插入成功，请假记录ID: " + leaveRecord.getId());
    }

    @Test
    public void testUpdateLeaveRecord() {
        // 先插入一条新的请假记录用于测试
        LeaveRecord leaveRecord = new LeaveRecord();
        leaveRecord.setEmployeeId(11); // 假设员工ID为1
        leaveRecord.setLeaveType(LeaveTypeEnum.A); // 假设请假类型为年假
        leaveRecord.setLeaveStartDate(LocalDate.now()); // 开始日期
        leaveRecord.setLeaveEndDate(LocalDate.now()); // 结束日期
        leaveRecord.setReason("年度休假"); // 原因
        leaveRecord.setStatus(LeaveStatusEnum.REVIEW); // 状态

        // 插入记录到数据库
        leaveRecordService.insertLeaveRecord(leaveRecord);
        assertNotNull(leaveRecord.getId(), "插入失败，ID没有生成");

        // 修改插入的请假记录的部分字段
        leaveRecord.setLeaveType(LeaveTypeEnum.OTHER); // 修改请假类型
        leaveRecord.setReason("生病休假"); // 修改请假原因
        leaveRecord.setStatus(LeaveStatusEnum.SUCCESS); // 修改状态为批准

        // 执行更新操作
        leaveRecordService.updateLeaveRecord(leaveRecord);

    }

    @Test
    public void testGetLeaveRecordById() {
        // 先插入一条新的请假记录用于测试
        LeaveRecord leaveRecord = new LeaveRecord();
        leaveRecord.setEmployeeId(1); // 假设员工ID为1
        leaveRecord.setLeaveType(LeaveTypeEnum.A); // 假设请假类型为年假
        leaveRecord.setLeaveStartDate(LocalDate.now()); // 开始日期
        leaveRecord.setLeaveEndDate(LocalDate.now()); // 结束日期
        leaveRecord.setReason("年度休假"); // 请假原因
        leaveRecord.setStatus(LeaveStatusEnum.REVIEW); // 请假状态

        // 插入这条记录
        leaveRecordService.insertLeaveRecord(leaveRecord);
        assertNotNull(leaveRecord.getId(), "插入失败，ID没有生成");

        // 查询插入的请假记录
        LeaveRecord fetchedRecord = leaveRecordService.getLeaveRecordById(leaveRecord.getId());

        // 验证查询结果是否正确
        assertNotNull(fetchedRecord, "查询结果为空");
        assertEquals(leaveRecord.getId(), fetchedRecord.getId(), "ID不匹配");
        assertEquals(leaveRecord.getEmployeeId(), fetchedRecord.getEmployeeId(), "员工ID不匹配");
        assertEquals(leaveRecord.getLeaveType(), fetchedRecord.getLeaveType(), "请假类型不匹配");
        assertEquals(leaveRecord.getReason(), fetchedRecord.getReason(), "请假原因不匹配");
        assertEquals(leaveRecord.getStatus(), fetchedRecord.getStatus(), "请假状态不匹配");

        // 打印输出以验证
        System.out.println("查询成功，请假记录ID: " + fetchedRecord.getId());
    }

    @Test
    public void testGetLeaveRecordsByEmployeeId() {
        List<LeaveRecord> leaveRecordsByEmployeeId = leaveRecordService.getLeaveRecordsByEmployeeId(1);
        System.out.println(leaveRecordsByEmployeeId.size());
    }

    @Test
    public void testDeleteLeaveRecord() {
        leaveRecordService.deleteLeaveRecord(18);
    }
}
