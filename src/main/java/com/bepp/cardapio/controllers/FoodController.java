package com.bepp.cardapio.controllers;

import com.bepp.cardapio.food.Food;
import com.bepp.cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {

    @Autowired
    private FoodRepository repository;


    @GetMapping
    public List<Food> getAllFoods() {

        List<Food> foodsList = repository.findAll();

        return foodsList;
    }

}
