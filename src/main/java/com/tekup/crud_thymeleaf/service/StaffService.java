package com.tekup.crud_thymeleaf.service;

import com.tekup.crud_thymeleaf.entity.Staff;

import java.util.List;

public interface StaffService {
    public void addOrUpdateStaff(Staff staff);
    public List<Staff> getAllStaffs();
    public Staff staffById(Long id);
    public void deleteStaff(Long id);
}
