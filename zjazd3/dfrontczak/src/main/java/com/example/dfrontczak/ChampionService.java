package com.example.dfrontczak;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ChampionService {
    private final ChampionRepository repository;

    public ChampionResponse addChampion(ChampionCreateRequest request) {
        Champion newChampion = new Champion();
        newChampion.setName(request.getName());
        newChampion.setRole(request.getRole());
        newChampion.setRegion(request.getRegion());

        Champion saved = repository.save(newChampion);

        ChampionResponse response = new ChampionResponse();
        response.setId(saved.getId());
        response.setName(saved.getName());

        return response;
    }

    public List<ChampionResponse> getAllChampions(){
        return repository
                .findAll()
                .stream()
                .map(c -> new ChampionResponse(c.getId(),c.getName(),c.getRole(),c.getRegion(),c.getDamage_type()))
                .collect(Collectors.toList());
    }

    public ChampionResponse getChampion(Long id){
        Champion saved = repository.getReferenceById(id);

        ChampionResponse response = new ChampionResponse();
        response.setId(saved.getId());
        response.setName(saved.getName());
        response.setRole(saved.getRole());
        response.setRegion(saved.getRegion());
        response.setDamage_type(saved.getDamage_type());

        return response;
    }

    public ChampionResponse updateChampion(Long id, ChampionUpdateRequest request){
        Champion champion = repository.getReferenceById(id);
        champion.setName(request.getName());
        champion.setRole(request.getRole());

        ChampionResponse response = new ChampionResponse();
        response.setId(champion.getId());
        response.setName(champion.getName());
        response.setRole(champion.getRole());

        return response;
    }

    public void deleteChampion(Long id){
        repository.deleteById(id);
    }
}
