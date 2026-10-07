package com.salesianos.demo.tarea_4_dto.model.ejercicio3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Libro {

    @Id @GeneratedValue
    private Long id;
    private String titulo;
    private String isbn;
    private int anioPublicacion;

    //@Builder.Default
    @OneToOne
    private Autor autor;

}
