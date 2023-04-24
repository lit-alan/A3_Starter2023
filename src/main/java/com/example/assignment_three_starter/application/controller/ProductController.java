package com.example.assignment_three_starter.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {

    @GetMapping()
    public ResponseEntity<String> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body("GET ALL");
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<String> getOne(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body("GET PRODUCT BY ID " + id);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<String> getOne(@PathVariable String name) {
        return ResponseEntity.status(HttpStatus.OK).body("GET PRODUCT BY NAME " + name);
    }

     @DeleteMapping()
     public ResponseEntity<String> delete() {
        return ResponseEntity.status(HttpStatus.OK).body("Deleted");
     }

    @PostMapping()
    public ResponseEntity<String> add() {
        return ResponseEntity.status(HttpStatus.CREATED).body("Added");
    }

    @PutMapping()
    public ResponseEntity<String> edit() {
        return ResponseEntity.status(HttpStatus.OK).body("Edited");
    }
}