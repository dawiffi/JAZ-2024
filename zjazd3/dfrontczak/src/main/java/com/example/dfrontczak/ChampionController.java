package com.example.dfrontczak;

import com.example.dfrontczak.swagger.client.api.ChampionsApi;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<ChampionResponse>> getChampions(){
        return ResponseEntity.ok(service.getAllChampions());
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
