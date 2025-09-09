package com.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CtrlProduct {
    @GetMapping
    public Category[] getCategories() {
        Category[] categories = {
            new Category(1, "Lentes", "Lts", 1),
            new Category(2, "Relojes", "Rljs", 1),
            new Category(3, "Carteras", "Ctrs", 1),
        };
        return categories;
    }
}

