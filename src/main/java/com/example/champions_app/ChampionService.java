package com.example.champions_app;

import com.baeldung.openapi.model.ChampionCreateRequest;
import com.baeldung.openapi.model.ChampionResponse;
import com.baeldung.openapi.model.ChampionUpdateRequest;
import com.example.champions_app.exceptions.BadChampionDamageTypeException;
import com.example.champions_app.exceptions.ChampionNotFoundException;
import com.example.champions_app.model.Champion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ChampionService {
    private final ChampionRepository repository;

    private final ChampionMapper mapper;

    public ChampionResponse addChampion(ChampionCreateRequest request) {
        verifyChampion(request);
        Champion champion = mapper.toEntity(request);
        Champion saved = repository.save(mapper.toEntity(request));

        return mapper.toResponse(saved);
    }

    public List<ChampionResponse> getAllChampions () {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    public ChampionResponse getChampion(Long id) {
        if (!repository.existsById(id))
            throw new ChampionNotFoundException("No Champion under the id: " + id);
        return mapper.toResponse(repository.getReferenceById(id));
    }

    public ChampionResponse updateChampion(Long id, ChampionUpdateRequest request) {
        if (!repository.existsById(id))
            throw new ChampionNotFoundException("No Champion under the id: " + id);
//      verifyChampion(request);
        Champion champion = repository.getReferenceById(id);
        champion.setName(request.getName());
        champion.setType(request.getType());
        champion.setRole(request.getRole());
        repository.save(champion);

        return mapper.toResponse(champion);
    }

    public void deleteChampion(Long id) {
        if (!repository.existsById(id))
            throw new ChampionNotFoundException("No Champion under the id: " + id);
        repository.deleteById(id);
    }

    private void verifyChampion(ChampionCreateRequest request) {
        if (!Objects.equals(request.getDamageType(), "AP") && !Objects.equals(request.getDamageType(), "AD"))
            throw new BadChampionDamageTypeException();
    }
}
