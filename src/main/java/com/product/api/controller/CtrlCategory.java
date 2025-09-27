	package com.product.api.controller;

import com.product.api.commons.dto.ApiResponse;
import com.product.api.dto.DtoCategoryIn;
import com.product.api.entity.Category;
import com.product.api.service.SvcCategory;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CtrlCategory {

    @Autowired
    private SvcCategory svc;

    @GetMapping("/category")
    public ResponseEntity<List<Category>> findAll() {
    	return ResponseEntity.ok(svc.findAll());
    }
    
    @GetMapping("/category/active")
    public ResponseEntity<List<Category>> findActive(){
    	return ResponseEntity.ok(svc.findActive());
    }
    
    @PostMapping("/category")
    public ResponseEntity<ApiResponse> create(@Valid @RequestBody DtoCategoryIn in) {
        return ResponseEntity.ok(svc.create(in));
    }

    @PutMapping("/category/{id}")
    public ResponseEntity<ApiResponse> update(@PathVariable Integer id, @Valid @RequestBody DtoCategoryIn in) {
        return ResponseEntity.ok(svc.update(in, id));
    }
    
    @PatchMapping("/category/{id}/enable")
    public ResponseEntity<ApiResponse> enable(@PathVariable Integer id) {
        return ResponseEntity.ok(svc.enable(id));
    }
    
    @PatchMapping("/category/{id}/disable")
    public ResponseEntity<ApiResponse> disable(@PathVariable Integer id) {
        return ResponseEntity.ok(svc.disable(id));
    }
}
