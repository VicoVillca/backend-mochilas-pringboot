package com.mochilas.demoMochilas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter @Setter
public class Product {
  @Id
  @GeneratedValue
  private UUID id;

  @Column(length = 70, nullable = false)
  private String name;

  @Column(length = 125, nullable = false)
  private String description;

  @Column(length = 275, nullable = false)
  private String image_url;

  @Column(nullable = false)
  private Double price;

  @Column(nullable = false)
  private Integer stock;

  @Column(nullable = false)
  private Boolean active;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private Category category;

}
