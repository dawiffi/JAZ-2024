package com.example.dfrontczak;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class ChampionCreateRequest {
    private String name;
    private String role;
    private String region;
    private String type;
    private String damage_type;
}
