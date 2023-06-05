package com.mochilas.demoMochilas.service;

import com.mochilas.demoMochilas.entity.Role;
import java.util.List;
import org.springframework.http.ResponseEntity;

public interface RoleService {
  List<Role> getAll();
  Role getRoleByName(String name);

  ResponseEntity<?> insert(Role role);
}
