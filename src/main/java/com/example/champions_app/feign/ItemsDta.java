package com.example.champions_app.feign;

import lombok.Data;

import java.util.UUID;

@Data
public class ItemsDta {
    UUID id;
    String name;
    String description;
    Double cost;
}
