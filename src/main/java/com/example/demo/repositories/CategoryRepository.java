package com.example.demo.repositories;

import com.example.demo.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> getByDescription(String description);
}
