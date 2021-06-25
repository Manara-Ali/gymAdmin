package com.example.gym.repository;

import com.example.gym.model.Greetings;
import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends CrudRepository<Greetings, Long>{
}
