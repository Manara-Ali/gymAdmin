package com.example.gym.repository;

import com.example.gym.model.Model;
import org.springframework.data.repository.CrudRepository;

public interface ModelRepository extends CrudRepository<Model, Long> {
}
