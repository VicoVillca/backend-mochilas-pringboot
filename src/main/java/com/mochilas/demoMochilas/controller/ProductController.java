package com.mochilas.demoMochilas.controller;

import com.mochilas.demoMochilas.dto.ProductDto;
import com.mochilas.demoMochilas.entity.Category;
import com.mochilas.demoMochilas.entity.Product;
import com.mochilas.demoMochilas.service.ProductServiceImpl;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductController {

  private ProductServiceImpl productService;

  @GetMapping
  public ResponseEntity<List<Product>> getAll() {
    List<Product> productos = productService.getAll();
    return ResponseEntity.status(HttpStatus.OK).body(productos);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Product> getById(@PathVariable UUID id) {
    return ResponseEntity.status(HttpStatus.OK).body(productService.getById(id));
  }

  @PostMapping
  public ResponseEntity<Product> Insert(@RequestBody ProductDto productDto) {
    return ResponseEntity.status(HttpStatus.CREATED).body(productService.Insert(productDto));
  }
  @PutMapping("/{id}")
  public  ResponseEntity<Product>update(@PathVariable UUID id, @RequestBody ProductDto productDto){
    return ResponseEntity.status(HttpStatus.OK).body(productService.Update(id,productDto));
  }
  @GetMapping("/category/{id}")
  public ResponseEntity<List<Product>>getProductsByCategory(@PathVariable UUID id){

    return ResponseEntity.status(HttpStatus.OK).body(productService.ProductsByCategory(id));
  }

  @GetMapping("/category_page/{id}")
  public ResponseEntity<List<Product>>getProductsByCategory_page(@PathVariable UUID id, @RequestParam int page,@RequestParam int size){
    Pageable pageable = PageRequest.of(page, size);

    return ResponseEntity.status(HttpStatus.OK).body(productService.ProductsByCategory(id, pageable));
  }

}
