package com.rayshan.employeemgmt.entities;

import javax.persistence.*;

@Entity
@IdClass(ContactInfoKey.class)
@Table(name="contact_info")
public class ContactInfo {
    @Id
    private String id;
    @Id
    private String contactType;

    private String contactNumber;
}
