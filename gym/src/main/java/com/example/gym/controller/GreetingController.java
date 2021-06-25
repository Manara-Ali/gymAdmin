package com.example.gym.controller;

import com.example.gym.model.Greetings;
import com.example.gym.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

// Bypass CORS error
@CrossOrigin

// Specify this class as a controller class
@RestController

// Provide the endpoint to our api
@RequestMapping("/greetings")
public class GreetingController {
    // Inject our repository into this class
    @Autowired

    // Create a new instance of the service class
    GreetingService greetingService;

    // Use the CRUD method to do the mapping
    @GetMapping
    public Iterable<Greetings> getItems() {
        return greetingService.getItems();
    }

    @PostMapping
    public Greetings createItem(@RequestBody Greetings item) {
        return greetingService.createItem(item);
    }

    @PatchMapping
    public Greetings updateItem(@RequestBody Greetings item) {
        return greetingService.updateItem(item);
    }

    @GetMapping("/{id}")
    public Greetings getItemById(@PathVariable Long id) {
        return greetingService.getItemById(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteItem(@PathVariable Long id) {
        return greetingService.deleteItem(id);
    }
}



