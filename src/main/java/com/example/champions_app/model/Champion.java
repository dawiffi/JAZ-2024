package com.example.champions_app.model;

import com.example.champions_app.dictionary.DictionaryConstraint;
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
    @DictionaryConstraint("champion_type")
    private String type;
    private String damage_type;
}
