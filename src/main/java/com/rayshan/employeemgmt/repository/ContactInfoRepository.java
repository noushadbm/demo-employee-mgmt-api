package com.rayshan.employeemgmt.repository;

import com.rayshan.employeemgmt.entities.ContactInfo;
import com.rayshan.employeemgmt.entities.ContactInfoKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactInfoRepository extends JpaRepository<ContactInfo, ContactInfoKey> {
}
