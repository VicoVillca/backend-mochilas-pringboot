package com.mochilas.demoMochilas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "mochila")
public class Mochila {
  @Id
  @GeneratedValue
  @Getter
  @Setter
  private UUID ID;

  @Getter @Setter
  private String nombre;

  @Getter @Setter
  private String descripcion;

  @Getter @Setter
  private String marca;

  @Getter @Setter
  private double precio;

  @Getter @Setter
  private Long cantidad;

}
