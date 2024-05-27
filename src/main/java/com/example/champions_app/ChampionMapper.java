package com.example.champions_app;
import com.baeldung.openapi.api.ChampionControllerApi;
import com.baeldung.openapi.api.*;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR,
        componentModel = "spring",
        builder = @Builder(disableBuilder = true),
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface ChampionMapper {

    @Mapping(target = "id", ignore = true)
    Champion toEntity(ChampionCreateRequest request);

    ChampionResponse toResponse(Champion champion);

    @Mapping(target = "id", ignore = true)
    Champion toUpdate(@MappingTarget Champion champion, ChampionUpdateRequest request);
}
