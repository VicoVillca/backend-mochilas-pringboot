package com.mochilas.demoMochilas.dto;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductDto {

  private UUID id;

  private String name;

  private String description;

  private String image_url;

  private Double price;

  private Integer stock;

  private Boolean active;

  private UUID category_id;

}
