package com.mochilas.demoMochilas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter @Setter
public class ErrorDto {
  private int status;
  private String error;
  private String message;
}
