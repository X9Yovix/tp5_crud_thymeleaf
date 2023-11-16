package com.tekup.crud_thymeleaf.repository;

import com.tekup.crud_thymeleaf.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
}
