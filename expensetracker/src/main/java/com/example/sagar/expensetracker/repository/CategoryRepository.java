package com.example.sagar.expensetracker.repository;

import com.example.sagar.expensetracker.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName (String name);

}
