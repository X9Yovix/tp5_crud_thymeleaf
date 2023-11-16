package com.tekup.crud_thymeleaf.service;

import com.tekup.crud_thymeleaf.entity.Staff;

import java.util.List;

public interface StaffService {
    public void addStaff(Staff staff);
    public List<Staff> getAllStaffs();
    public Staff staffById(Integer id);
    public void deleteStaff(Staff staff);
}
