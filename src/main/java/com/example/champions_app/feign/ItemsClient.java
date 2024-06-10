package com.example.champions_app.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.baeldung.openapi.model.ItemsResponse;

import java.util.UUID;

@FeignClient(name = "items", url = "localhost:8081")
public interface ItemsClient {
    @GetMapping("/item/{id}")
    ResponseEntity<ItemsResponse> getItem(@PathVariable("id") UUID itemId);
}

