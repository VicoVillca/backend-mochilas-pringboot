package com.mochilas.demoMochilas.service;

import com.mochilas.demoMochilas.dto.ProductDto;
import com.mochilas.demoMochilas.entity.Product;


import java.util.List;
import java.util.UUID;
import org.springframework.data.domain.Pageable;

public interface ProductService {
  List<Product> getAll();
  Product Insert(ProductDto productDto);

  Product Update(UUID id,ProductDto productDto);
  Product getById(UUID id);

  List<Product> ProductsByCategory(UUID id);

  List<Product> ProductsByCategory(UUID id, Pageable pageable);
}
