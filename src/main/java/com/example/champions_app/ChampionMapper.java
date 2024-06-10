package com.example.champions_app;

import com.baeldung.openapi.model.ChampionCreateRequest;
import com.baeldung.openapi.model.ChampionResponse;
import com.baeldung.openapi.model.ChampionUpdateRequest;
import com.example.champions_app.model.Champion;
import org.mapstruct.*;

@Mapper(
        componentModel = "spring",
        builder = @Builder(disableBuilder = true)
)
public interface ChampionMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "damage_type", ignore = true)
    Champion toEntity(ChampionCreateRequest request);

    @Mapping(target = "damageType", ignore = true)
    ChampionResponse toResponse(Champion champion);

    @Mapping(target = "damage_type", ignore = true)
    @Mapping(target = "id", ignore = true)
    Champion toUpdate(@MappingTarget Champion champion, ChampionUpdateRequest request);

}
