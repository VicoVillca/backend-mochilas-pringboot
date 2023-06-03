package com.mochilas.demoMochilas.service;

import com.mochilas.demoMochilas.dto.ProductDto;
import com.mochilas.demoMochilas.entity.Product;
import java.util.List;
import java.util.UUID;

public interface ProductService {
  List<Product> getAll();
  Product Insert(ProductDto productDto);

  Product getById(UUID id);
}
