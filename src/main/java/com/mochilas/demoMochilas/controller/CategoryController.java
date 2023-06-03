package com.mochilas.demoMochilas.controller;

import com.mochilas.demoMochilas.entity.Category;
import com.mochilas.demoMochilas.service.CategoryServiceImpl;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
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
  public List<Category> getAll(){
    return categoryService.getAll();
  }

  @GetMapping("/{id}")
  public Category getById(@PathVariable UUID id){
    return categoryService.getById(id);
  }
}
