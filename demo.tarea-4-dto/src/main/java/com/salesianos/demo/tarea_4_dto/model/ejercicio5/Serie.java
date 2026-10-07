package com.salesianos.demo.tarea_4_dto.model.ejercicio5;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Serie {

    @Id @GeneratedValue
    private Long id;

    private String titulo;
    private String sinopsis;
    private int numeroTemporadas;
    private List<String> imagenes;

    @OneToOne
    private Creador creador;

    @OneToOne
    private Categoria categoria;


}
