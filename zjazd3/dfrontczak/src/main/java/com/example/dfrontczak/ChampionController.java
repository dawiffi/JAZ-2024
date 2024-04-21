package com.example.dfrontczak;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ChampionController {
    private final ChampionService service;

    @PostMapping("/addChampion")
    public ChampionResponse createChampion(@RequestBody ChampionCreateRequest request){
        return service.addChampion(request);
    }

    @GetMapping("/getChampions")
    public List<ChampionResponse> getChampions(){
        return service.getAllChampions();
    }

    @GetMapping("/getChampion/{id}")
    public ChampionResponse getChampion(@PathVariable Long id){
        return service.getChampion(id);
    }

    @PutMapping("/updateChampion/{id}")
    public ChampionResponse updateChampion(@PathVariable Long id, @RequestBody ChampionUpdateRequest request){
        return service.updateChampion(id, request);
    }

    @DeleteMapping("/deleteChampion/{id}")
    public void deleteChampion(@PathVariable Long id){
        service.deleteChampion(id);
    }
}
