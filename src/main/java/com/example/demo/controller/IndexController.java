package com.example.demo.controller;

import com.example.demo.domain.Category;
import com.example.demo.domain.UnitOfMeasure;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }


    @RequestMapping({"/", "", "/index"})
    public String getIndexPage(){
        Optional<Category> category = categoryRepository.getByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.getByDescription("Teaspoon");
        System.out.println("category id is: " + category.get().getId());
        System.out.println("unitOfMeasure id is: " + unitOfMeasure.get().getId());
        return "index";
    }
}
