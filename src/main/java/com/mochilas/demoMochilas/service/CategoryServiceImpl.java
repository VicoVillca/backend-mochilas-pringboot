package com.mochilas.demoMochilas.service;

import com.mochilas.demoMochilas.entity.Category;
import com.mochilas.demoMochilas.exception.EntityNotFundException;
import com.mochilas.demoMochilas.repository.CategoryRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

  private CategoryRepository categoryRepository;

  @Override
  public List<Category> getAll() {
    return categoryRepository.findAll();
  }

  @Override
  public Category getById(UUID id) {
    return categoryRepository.findById(id)
        .orElseThrow(() -> new EntityNotFundException("Category", id));
  }
}
