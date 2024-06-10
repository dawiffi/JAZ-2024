package com.example.champions_app;

import com.baeldung.openapi.api.*;
import com.baeldung.openapi.model.ChampionCreateRequest;
import com.baeldung.openapi.model.ChampionResponse;
import com.baeldung.openapi.model.ChampionUpdateRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequiredArgsConstructor

public class ChampionController implements ChampionControllerApi{
    private final ChampionService service;

    @PostMapping("/addChampion")
    public ResponseEntity<ChampionResponse> addChampion(@Valid @RequestBody ChampionCreateRequest request) {
          return ResponseEntity.ok(service.addChampion(request));
      }

    @GetMapping("/getAllChampions")
       public ResponseEntity<List<ChampionResponse>> getAllChampions() {
            return ResponseEntity.ok(service.getAllChampions());
        }

    @GetMapping("/getChampion/{id}")
    public ResponseEntity<ChampionResponse> getChampion(@PathVariable Long id) {
        ChampionResponse response = service.getChampion(id);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/updateChampion/{id}")
    public ResponseEntity<ChampionResponse> updateChampion(@Valid @PathVariable Long id, @RequestBody ChampionUpdateRequest request){
        return ResponseEntity.ok(service.updateChampion(id, request));
    }

    @DeleteMapping("/deleteChampion/{id}")
    public ResponseEntity<Void> deleteChampion(@PathVariable Long id){
        service.deleteChampion(id);
        return ResponseEntity.ok().build();
    }
}
