package com.rayshan.employeemgmt.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name="contact_info")
public class ContactInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Pattern(regexp = "^R|O|I$")
    private String contactType;

    @Digits(integer = 20, fraction = 0, message = "Should be a number with maximum 20 digits.")
    private String contactNumber;

    public ContactInfo(String contactType, String contactNumber) {
        this.contactType = contactType;
        this.contactNumber = contactNumber;
    }

    public ContactInfo(){}
}
