package com.mochilas.demoMochilas.controller;

import com.mochilas.demoMochilas.entity.Libro;
import com.mochilas.demoMochilas.repository.LibroRepository;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/libro")
@AllArgsConstructor
public class LibroController {

  private LibroRepository libroRepository;

  @GetMapping
  public List<Libro> getAll(){
    return libroRepository.findAll();
  }

  @PostMapping
  public Libro Insert(@RequestBody Libro libro){
    return libroRepository.save(libro);
  }

  @PutMapping("/{id}")
  public Libro Update(@PathVariable UUID id, @RequestBody Libro libro){
    Libro libroFound= libroRepository.findById(id).get();
    libroFound.setNombre(libro.getNombre());
    libroFound.setDescripcion(libro.getDescripcion());
    return libroRepository.save(libroFound);
  }
  @DeleteMapping("/{id}")
  public void delete(@PathVariable UUID id){
    libroRepository.deleteById(id);
  }
}
