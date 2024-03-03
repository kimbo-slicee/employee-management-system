package com.spring.employeemanager.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String employeeName;
    private String email;
    private String jobTitle;
    private String phone;
    private String imagUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    @Override
    public String toString(){
        return "Employee={" +
                "id:"+id+
                "name:"+employeeName+
                "jobTitle:"+jobTitle+
                "phone:"+phone+
                "imagUrl:" + imagUrl + '}';
    }


}

