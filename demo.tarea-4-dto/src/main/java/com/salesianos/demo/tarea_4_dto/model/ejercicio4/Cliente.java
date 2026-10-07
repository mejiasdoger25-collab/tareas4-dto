package com.salesianos.demo.tarea_4_dto.model.ejercicio4;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    @Id @GeneratedValue
    private Long id;

    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;


}
