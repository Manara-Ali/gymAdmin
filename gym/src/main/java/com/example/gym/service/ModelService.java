package com.example.gym.service;

import com.example.gym.model.Model;
import com.example.gym.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

// Specify this class as a Service class
@Service
public class ModelService {

    // Inject the repository into this class
    @Autowired

    // Create a new instance of the repository
    ModelRepository modelRepository;

    // Use the CRUD methods from the repository

    // Retrieve all the items in our database
    public Iterable<Model> getItems() {
        return modelRepository.findAll();
    }

    // Retrieve a single item
    public Model getItemById(Long id) {
        return modelRepository.findById(id).get();
    }

    // Create new item in our database
    public Model createItem(Model item) {
        return modelRepository.save(item);
    }

    // Update an existing item
    public Model updateItem(Model item) {
        return modelRepository.save(item);
    }

    // Delete an existing item
    public HttpStatus deleteItem(Long id) {
        modelRepository.deleteById(id);
        return HttpStatus.OK;
    }

}
