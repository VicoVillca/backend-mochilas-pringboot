package com.mochilas.demoMochilas.controller;

import com.mochilas.demoMochilas.entity.Mochila;
import com.mochilas.demoMochilas.repository.MochilaRepository;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class MochilaController {

  private MochilaRepository mochilaRepository;

  @GetMapping
  public List<Mochila> getAll(){
    return mochilaRepository.findAll();
  }

  @PostMapping
  public Mochila guardar(@RequestBody Mochila mochila){
    return mochilaRepository.save(mochila);
  }

  @PutMapping("/{id}")
  public Mochila Modificar(@PathVariable UUID id, @RequestBody Mochila mochila){

    Mochila mochilaFund = mochilaRepository.findById(id).get();
    mochilaFund.setNombre(mochila.getNombre());
    mochilaFund.setDescripcion((mochila.getDescripcion()));
    mochilaFund.setMarca(mochila.getMarca());
    mochilaFund.setPrecio(mochila.getPrecio());
    mochilaFund.setCantidad(mochila.getCantidad());
     return mochilaRepository.save(mochilaFund);
  }

  @DeleteMapping("/{id}")
  public void Eliminar(@PathVariable UUID id){
    mochilaRepository.deleteById(id);

  }
}
