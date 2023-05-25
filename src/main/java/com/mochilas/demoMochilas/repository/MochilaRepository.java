package com.mochilas.demoMochilas.repository;

import com.mochilas.demoMochilas.entity.Mochila;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MochilaRepository  extends JpaRepository<Mochila, UUID> {

}
