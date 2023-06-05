package com.mochilas.demoMochilas.exception;

import com.mochilas.demoMochilas.entity.Role;
import java.util.UUID;

public class EntityNotFoundException extends RuntimeException{

  public EntityNotFoundException(String message){
    super(message);
  }

  public EntityNotFoundException(String entity, UUID id){
    super(String.format("%d con id:%d no encontrado",entity,id.toString()));
  }

  public EntityNotFoundException(Role role){
    super(String.format("Role with name %d already exists.",role.getName()));
  }
}
