package com.example.dfrontczak;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ChampionService {
    private final ChampionRepository repository;

    private final ChampionMapper mapper;

    public ChampionResponse addChampion(ChampionCreateRequest request) {
        Champion entity = mapper.toEntity(request);
        Champion saved = repository.save(entity);

        return mapper.toResponse(saved);
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

        return mapper.toResponse(saved);
    }

    public ChampionResponse updateChampion(Long id, ChampionUpdateRequest request){
        Champion champion = repository.getReferenceById(id);
        Champion update = mapper.toUpdate(champion, request);
        Champion saved = repository.save(update);

        return mapper.toResponse(saved);
    }

    public void deleteChampion(Long id){
        repository.deleteById(id);
    }
}
