package com.salesianos.demo.tarea_4_dto.model.ejercicio5;

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
public class Categoria {

    @Id @GeneratedValue
    private Long id;

    private String nombre;
    private String descripcion;
}
