package org.example.oasystem.controller;

import org.example.oasystem.model.SalaryRecord;
import org.example.oasystem.service.SalaryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salary")
public class SalaryRecordController {


    private final SalaryRecordService salaryRecordService;

    @Autowired
    public SalaryRecordController(SalaryRecordService salaryRecordService) {
        this.salaryRecordService = salaryRecordService;
    }

    @PostMapping("/add")
    public ResponseEntity<SalaryRecord> insertSalaryRecord(@RequestBody SalaryRecord salaryRecord) {
        salaryRecordService.insertSalaryRecord(salaryRecord);
        return ResponseEntity.ok(salaryRecord);
    }

    @PutMapping("/update")
    public ResponseEntity<SalaryRecord> updateSalaryRecord(@RequestBody SalaryRecord salaryRecord) {
        salaryRecordService.updateSalaryRecord(salaryRecord);
        return ResponseEntity.ok(salaryRecord);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSalaryRecord(@PathVariable Integer id) {
        salaryRecordService.deleteSalaryRecord(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalaryRecord> getSalaryRecordById(@PathVariable Integer id) {
        SalaryRecord salaryRecord = salaryRecordService.getSalaryRecordById(id);
        return ResponseEntity.ok(salaryRecord);
    }

    @GetMapping("/all")
    public ResponseEntity<List<SalaryRecord>> getAllSalaryRecords() {
        List<SalaryRecord> salaryRecords = salaryRecordService.getAllSalaryRecord();
        return ResponseEntity.ok(salaryRecords);
    }
}
