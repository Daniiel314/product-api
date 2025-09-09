package com.product.api.service;

import com.product.api.entity.Category;
import com.product.api.repository.RepoCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SvcCategoryImp implements SvcCategory {
	
	@Autowired
    RepoCategory repo;
	
    @Override
    public List<Category> getCategories() {
        return repo.getCategories(); 
    }
}
