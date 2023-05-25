package com.mochilas.demoMochilas.repository;

import com.mochilas.demoMochilas.entity.Libro;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, UUID> {

}
