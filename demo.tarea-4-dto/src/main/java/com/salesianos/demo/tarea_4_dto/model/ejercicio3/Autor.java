package com.salesianos.demo.tarea_4_dto.model.ejercicio3;

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
public class Autor {

    @Id @GeneratedValue
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nacionacilada;

}
