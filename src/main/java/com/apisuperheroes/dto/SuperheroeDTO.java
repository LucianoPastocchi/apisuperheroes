package com.apisuperheroes.dto;

import com.apisuperheroes.entity.Superheroe;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SuperheroeDTO {
  private Long id;
  private String nombre;

  public SuperheroeDTO(Superheroe superheroe) {
    super();
    this.id = superheroe.getId();
    this.nombre = superheroe.getNombre();
  }

}
