package com.mochilas.demoMochilas.mapper;

import com.mochilas.demoMochilas.dto.ProductDto;
import com.mochilas.demoMochilas.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
  public Product toDTO(ProductDto productDto){
    Product product = new Product();
    product.setName(productDto.getName());
    product.setDescription(productDto.getDescription());
    product.setImage_url(productDto.getImage_url());
    product.setPrice(productDto.getPrice());
    product.setStock(productDto.getStock());
    product.setActive(productDto.getActive());
    return product;
  }
}
