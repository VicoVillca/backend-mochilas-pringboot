package com.mochilas.demoMochilas.controller;

import com.mochilas.demoMochilas.entity.Role;
import com.mochilas.demoMochilas.exception.EntityNotFoundException;
import com.mochilas.demoMochilas.service.RoleServiceImpl;
import java.util.List;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/roles")
@AllArgsConstructor
public class RoleController {

  private RoleServiceImpl roleService;

  @GetMapping
  public ResponseEntity<List<Role>> getAll() {
    return ResponseEntity.status(HttpStatus.OK).body(roleService.getAll());
  }

  @GetMapping("/name/{name}")
  public ResponseEntity<Role> getRoleByName(@PathVariable String name) {
    return ResponseEntity.status(HttpStatus.OK).body(roleService.getRoleByName(name));
  }

  @PostMapping
  public ResponseEntity<?> Insert(@RequestBody Role role) {
    System.out.println("Hola");
    return roleService.insert(role);
  }
}
