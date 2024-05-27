package com.example.champions_app;

import com.baeldung.openapi.api.ChampionControllerApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequiredArgsConstructor
public class ChampionController implements ChampionControllerApi {
    private final ChampionService service;

    @PostMapping("/addChampion")
    public ResponseEntity<ChampionResponse> addChampion(@RequestBody ChampionCreateRequest request){
        return ResponseEntity.ok().body(service.addChampion(request));
    }

    @GetMapping("/getChampions")
    public ResponseEntity<ChampionResponse> getChampions(@RequestBody ChampionResponse request){
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/getChampion/{id}")
    public ResponseEntity<ChampionResponse> getChampionById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.getChampion(id));
    }

    @PutMapping("/updateChampion/{id}")
    public ResponseEntity<ChampionResponse> updateChampion(@PathVariable Long id, @RequestBody ChampionUpdateRequest request){
        return ResponseEntity.ok().body(service.updateChampion(id, request));
    }

    @DeleteMapping("/deleteChampion/{id}")
    public ResponseEntity<Void> deleteChampion(@PathVariable Long id){
        service.deleteChampion(id);
        return ResponseEntity.ok().build();
    }
}
