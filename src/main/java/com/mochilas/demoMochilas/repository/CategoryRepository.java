package com.mochilas.demoMochilas.repository;

import com.mochilas.demoMochilas.entity.Category;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, UUID> {

}
