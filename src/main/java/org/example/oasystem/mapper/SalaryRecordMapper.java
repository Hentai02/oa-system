package org.example.oasystem.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.oasystem.model.SalaryRecord;

import java.util.List;

@Mapper
public interface SalaryRecordMapper {

    void insertSalaryRecord(SalaryRecord salaryRecord);

    void deleteSalaryRecord(Integer id);

    void updateSalaryRecord(SalaryRecord salaryRecord);

    SalaryRecord getSalaryRecordById(Integer id);

    List<SalaryRecord> getAllSalaryRecord();
}
