package org.example.oasystem.service;

import org.example.oasystem.mapper.SalaryRecordMapper;
import org.example.oasystem.model.SalaryRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryRecordService {


    private final SalaryRecordMapper salaryRecordMapper;

    @Autowired
    public SalaryRecordService(SalaryRecordMapper salaryRecordMapper) {
        this.salaryRecordMapper = salaryRecordMapper;
    }

    public void insertSalaryRecord(SalaryRecord salaryRecord) {
        salaryRecordMapper.insertSalaryRecord(salaryRecord);
    }

    public void updateSalaryRecord(SalaryRecord salaryRecord) {
        salaryRecordMapper.updateSalaryRecord(salaryRecord);
    }

    public void deleteSalaryRecord(Integer id) {
        salaryRecordMapper.deleteSalaryRecord(id);
    }

    public SalaryRecord getSalaryRecordById(Integer id) {
        return salaryRecordMapper.getSalaryRecordById(id);
    }

    public List<SalaryRecord> getAllSalaryRecord() {
        return salaryRecordMapper.getAllSalaryRecord();
    }
}
