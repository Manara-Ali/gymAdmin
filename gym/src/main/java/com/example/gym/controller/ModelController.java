package com.example.gym.controller;

import com.example.gym.model.Model;
import com.example.gym.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

// Bypass CORS error
@CrossOrigin

// Specify this class as a controller class
@RestController

// Provide the endpoint to our api
@RequestMapping("/gym")
public class ModelController {
    // Inject our repository into this class
    @Autowired

    // Create a new instance of the service class
    ModelService modelService;

    // Use the CRUD method to do the mapping
    @GetMapping
    public Iterable<Model> getItems() {
        return modelService.getItems();
    }

    @PostMapping
    public Model createItem(@RequestBody Model item) {
        return modelService.createItem(item);
    }

    @PatchMapping
    public Model updateItem(@RequestBody Model item) {
        return modelService.updateItem(item);
    }

    @GetMapping("/{id}")
    public Model getItemById(@PathVariable Long id) {
        return modelService.getItemById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteItem(@PathVariable Long id) {
        return modelService.deleteItem(id);
    }
}
