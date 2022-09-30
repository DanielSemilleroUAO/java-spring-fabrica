package com.gonzalo.testgonzalo.controllers;

import com.gonzalo.testgonzalo.models.Fabrica;
import com.gonzalo.testgonzalo.repositories.FabricaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/v1/fabricas")
public class FabricaController {

    @Autowired
    private FabricaRepository fabricaRepository;

    @GetMapping
    public ResponseEntity<?> getAllFabricas(){
        return new ResponseEntity<>(fabricaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createFabrica(@RequestBody Fabrica fabrica){
        fabricaRepository.save(fabrica);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{idFabrica}")
    public ResponseEntity<?> getFabricaById(@PathVariable String idFabrica){
        return new ResponseEntity<>(fabricaRepository.findById(idFabrica), HttpStatus.OK);

    }

}
