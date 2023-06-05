package com.mochilas.demoMochilas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Entity
@Getter
@Service
@Table(name = "roles")
public class Role {

  @Id
  @GeneratedValue
  private UUID id;

  @Column(length = 25, nullable = false)
  private String name;

  @Column(length = 125)
  private String description;

}
