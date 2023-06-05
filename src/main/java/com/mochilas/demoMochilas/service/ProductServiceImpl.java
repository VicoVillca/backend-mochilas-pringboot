package com.mochilas.demoMochilas.service;

import com.mochilas.demoMochilas.dto.ProductDto;
import com.mochilas.demoMochilas.entity.Category;
import com.mochilas.demoMochilas.entity.Product;
import com.mochilas.demoMochilas.exception.EntityNotFoundException;
import com.mochilas.demoMochilas.mapper.ProductMapper;
import com.mochilas.demoMochilas.repository.CategoryRepository;
import com.mochilas.demoMochilas.repository.ProductRepository;


import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

  private ProductRepository productRepository;
  private CategoryRepository categoryRepository;
  private ProductMapper productMapper;

  @Override
  public List<Product> getAll() {
    return productRepository.findAll();
  }

  @Override
  public Product Insert(ProductDto productDto) {
    Product product = productMapper.toDTO(productDto);
    Category category = categoryRepository.findById(productDto.getCategory_id()).get();
    product.setCategory(category);
    return productRepository.save(product);
  }

  @Override
  public Product Update(UUID id, ProductDto productDto) {
    Product product_find = productRepository.findById(id).get();
    Product product = productMapper.toDTOUpdate(product_find,productDto);
    Category category = categoryRepository.findById(productDto.getCategory_id()).get();
    product.setCategory(category);
    return productRepository.save(product);
  }

  @Override
  public Product getById(UUID id) {
    return productRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Product", id));
  }

  @Override
  public List<Product> ProductsByCategory(UUID id) {
    return productRepository.ProductsByCategory(id);
  }

  @Override
  public List<Product> ProductsByCategory(UUID id, Pageable pageable) {

    return productRepository.findAllByCategory(id, pageable);
  }


}
