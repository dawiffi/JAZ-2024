package com.example.champions_app;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-27T15:51:18+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class ChampionMapperImpl implements ChampionMapper {

    @Override
    public Champion toEntity(ChampionCreateRequest request) {
        if ( request == null ) {
            return null;
        }

        Champion champion = new Champion();

        if ( request.getName() != null ) {
            champion.setName( request.getName() );
        }
        if ( request.getRegion() != null ) {
            champion.setRegion( request.getRegion() );
        }
        if ( request.getRole() != null ) {
            champion.setRole( request.getRole() );
        }
        if ( request.getType() != null ) {
            champion.setType( request.getType() );
        }
        if ( request.getDamage_type() != null ) {
            champion.setDamage_type( request.getDamage_type() );
        }

        return champion;
    }

    @Override
    public ChampionResponse toResponse(Champion champion) {
        if ( champion == null ) {
            return null;
        }

        ChampionResponse championResponse = new ChampionResponse();

        if ( champion.getId() != null ) {
            championResponse.setId( champion.getId() );
        }
        if ( champion.getName() != null ) {
            championResponse.setName( champion.getName() );
        }
        if ( champion.getRole() != null ) {
            championResponse.setRole( champion.getRole() );
        }
        if ( champion.getRegion() != null ) {
            championResponse.setRegion( champion.getRegion() );
        }
        if ( champion.getDamage_type() != null ) {
            championResponse.setDamage_type( champion.getDamage_type() );
        }

        return championResponse;
    }

    @Override
    public Champion toUpdate(Champion champion, ChampionUpdateRequest request) {
        if ( request == null ) {
            return champion;
        }

        if ( request.getName() != null ) {
            champion.setName( request.getName() );
        }
        else {
            champion.setName( null );
        }
        if ( request.getRegion() != null ) {
            champion.setRegion( request.getRegion() );
        }
        else {
            champion.setRegion( null );
        }
        if ( request.getRole() != null ) {
            champion.setRole( request.getRole() );
        }
        else {
            champion.setRole( null );
        }
        if ( request.getType() != null ) {
            champion.setType( request.getType() );
        }
        else {
            champion.setType( null );
        }
        if ( request.getDamage_type() != null ) {
            champion.setDamage_type( request.getDamage_type() );
        }
        else {
            champion.setDamage_type( null );
        }

        return champion;
    }
}
