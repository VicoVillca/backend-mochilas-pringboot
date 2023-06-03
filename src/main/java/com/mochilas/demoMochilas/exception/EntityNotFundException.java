package com.mochilas.demoMochilas.exception;

import jakarta.persistence.EntityNotFoundException;
import java.util.UUID;

public class EntityNotFundException extends  RuntimeException{

  public EntityNotFundException(String message){
    super(message);
  }
  public EntityNotFundException(String entity, UUID id){
    super(String.format("%s con el id: %s no fue encontrado",entity,id.toString()));
  }
}
