package com.rayshan.employeemgmt.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class ContactInfoKey implements Serializable {
    private String id;
    private String contactType;
}
