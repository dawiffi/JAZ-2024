package com.example.dfrontczak;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Champion {
    @Id
    private Long id;
    private String name;
    private String region;
    private String role;
    private String type;
    private String damage_type;
}
