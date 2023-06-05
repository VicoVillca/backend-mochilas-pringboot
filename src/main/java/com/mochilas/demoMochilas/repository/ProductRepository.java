package com.mochilas.demoMochilas.repository;

import com.mochilas.demoMochilas.entity.Product;
import com.mochilas.demoMochilas.entity.Role;
import java.util.List;
import java.util.UUID;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
  @Query(value = "select * from products where category_id= ?1", nativeQuery = true)
  List<Product> ProductsByCategory(UUID id);

  List<Product> findAllByCategory(UUID id, Pageable pageable);
}
