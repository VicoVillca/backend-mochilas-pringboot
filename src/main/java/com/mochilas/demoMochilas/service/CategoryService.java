package com.mochilas.demoMochilas.service;

import com.mochilas.demoMochilas.entity.Category;
import java.util.List;
import java.util.UUID;

public interface CategoryService {
  List<Category> getAll();
  Category getById(UUID id);
}
