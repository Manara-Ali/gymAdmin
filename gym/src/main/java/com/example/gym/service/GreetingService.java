package com.example.gym.service;

import com.example.gym.model.Greetings;
import com.example.gym.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    // Inject the repository into this class
    @Autowired

    // Create a new instance of the repository
    GreetingRepository greetingRepository;

    // Use the CRUD methods from the repository

    // Retrieve all the items in our database
    public Iterable<Greetings> getItems() {
        return greetingRepository.findAll();
    }

    // Retrieve a single item
    public Greetings getItemById(Long id) {
        return greetingRepository.findById(id).get();
    }

    // Create new item in our database
    public Greetings createItem(Greetings item) {
        return greetingRepository.save(item);
    }

    // Update an existing item
    public Greetings updateItem(Greetings item) {
        return greetingRepository.save(item);
    }

    // Delete an existing item
    public HttpStatus deleteItem(Long id) {
        greetingRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
