package com.mochilas.demoMochilas.controller;

import com.mochilas.demoMochilas.entity.Category;
import com.mochilas.demoMochilas.service.CategoryServiceImpl;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categories")
@AllArgsConstructor
public class CategoryController {

  private CategoryServiceImpl categoryService;

  @GetMapping
  public ResponseEntity<List<Category>> getAll() {
    List<Category> category_list = categoryService.getAll();
    return ResponseEntity.status(HttpStatus.OK).body(category_list);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Category> getById(@PathVariable UUID id) {
    Category category_found = categoryService.getById(id);
    //el estado create 201 es cuando se crea un nuevo elemento
    return ResponseEntity.status(HttpStatus.CREATED).body(category_found);
  }
}
