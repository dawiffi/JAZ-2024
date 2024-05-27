package com.example.champions_app;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class ChampionUpdateRequest {
    private String name;
    private String role;
    private String region;
    private String type;
    private String damage_type;
}
