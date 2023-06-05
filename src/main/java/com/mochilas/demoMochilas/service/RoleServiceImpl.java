package com.mochilas.demoMochilas.service;

import com.mochilas.demoMochilas.dto.ErrorDto;
import com.mochilas.demoMochilas.entity.Role;
import com.mochilas.demoMochilas.exception.EntityNotFoundException;
import com.mochilas.demoMochilas.repository.RoleRepository;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {

  private RoleRepository roleRepository;

  @Override
  public List<Role> getAll() {
    return roleRepository.findAll();
  }

  @Override
  public Role getRoleByName(String name) {
    return roleRepository.BuscarPorNombre(name);
  }


  @Override
  public ResponseEntity<?> insert(Role role) {
    Role role_find = roleRepository.BuscarNombre(role.getName());
    if (role_find != null) {
      ErrorDto error = new ErrorDto(HttpStatus.CONFLICT.value(), "Role Name Already Exists",
          "Role with name " + role.getName() + " already exists.");
      System.out.println(error.toString());
      return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
    } else {
      return ResponseEntity.status(HttpStatus.CREATED).body(roleRepository.save(role));
    }
  }
}
