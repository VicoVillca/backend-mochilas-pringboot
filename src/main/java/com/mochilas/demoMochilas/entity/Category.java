package com.mochilas.demoMochilas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "categories")
public class Category {
  @Id
  @GeneratedValue
  private UUID id;

  @Column(length = 35, nullable = false)
  private String name;

  @Column(length = 125)
  private String description;
}
