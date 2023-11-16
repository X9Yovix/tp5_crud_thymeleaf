package com.tekup.crud_thymeleaf.service;

import com.tekup.crud_thymeleaf.entity.Staff;
import com.tekup.crud_thymeleaf.repository.StaffRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StaffServiceImp implements StaffService {
    private final StaffRepository staffRepository;

    @Override
    public void addOrUpdateStaff(Staff staff) {
        if (staff.getId() == null) {
            staffRepository.save(staff);
        } else {
            Staff element = staffRepository.findById(staff.getId()).get();
            element.setId(staff.getId());
            element.setName(staff.getName());
            element.setEmail(staff.getEmail());
            staffRepository.save(element);
        }
    }

    @Override
    public List<Staff> getAllStaffs() {
        return staffRepository.findAll();
    }

    @Override
    public Staff staffById(Long id) {
        return staffRepository.findById(id).get();
    }

    @Override
    public void deleteStaff(Staff staff) {
        staffRepository.delete(staff);
    }
}
