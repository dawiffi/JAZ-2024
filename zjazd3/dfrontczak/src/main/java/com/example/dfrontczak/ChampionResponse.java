package com.example.dfrontczak;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class ChampionResponse {
    private Long id;
    private String name;
    private String role;
    private String region;
    private String damage_type;
}
