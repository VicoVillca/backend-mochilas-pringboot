package com.mochilas.demoMochilas.repository;

import com.mochilas.demoMochilas.entity.Role;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, UUID> {
  //opcion 1:  Native Query
  @Query(value = "select * from roles where name= ?1", nativeQuery = true)
  Role BuscarNombre(String nombre);

  //opcion 2: JPQL
  @Query("select r from Role r where r.name= ?1")
  Role BuscarPorNombre(String nombre);

  //opcion 3:Query Methods
  Role findByName(String dame);
}
