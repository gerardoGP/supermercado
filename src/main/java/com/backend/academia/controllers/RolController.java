package com.backend.academia.controllers;

import com.backend.academia.aggregates.request.RolRequest;
import com.backend.academia.entity.RolEntity;
import com.backend.academia.service.RolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rol/")
@RequiredArgsConstructor
public class RolController {

    private final RolService rolService;

    @GetMapping("/")
    public ResponseEntity<List<RolEntity>> all(){
        return ResponseEntity.ok(rolService.all());
    }
    @PostMapping("/")
    public ResponseEntity<RolEntity> store(@RequestBody RolRequest rolRequest){
        return ResponseEntity.ok(rolService.store(rolRequest));
    }
}
