package com.mochilas.demoMochilas.service;

import com.mochilas.demoMochilas.dto.ProductDto;
import com.mochilas.demoMochilas.entity.Category;
import com.mochilas.demoMochilas.entity.Product;
import com.mochilas.demoMochilas.exception.EntityNotFundException;
import com.mochilas.demoMochilas.mapper.ProductMapper;
import com.mochilas.demoMochilas.repository.CategoryRepository;
import com.mochilas.demoMochilas.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
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
  public Product getById(UUID id) {
    return productRepository.findById(id)
        .orElseThrow(() -> new EntityNotFundException("Product", id));
  }

}
