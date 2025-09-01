package com.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CtrlProduct {
	@GetMapping("/category")
	public Category[] getCategories() {
        Category[] categories = {
            new Category(1, "Lentes", "Lts"),
            new Category(2, "Relojes", "Rljs"),
            new Category(3, "Carteras", "Ctrs"),
        };
        return categories;
	}
}

