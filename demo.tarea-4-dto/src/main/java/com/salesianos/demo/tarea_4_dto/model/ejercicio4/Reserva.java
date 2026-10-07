package com.salesianos.demo.tarea_4_dto.model.ejercicio4;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reserva {

    @Id @GeneratedValue
    private Long id;

    private String codigo;
    private int numeroNoches;

    @OneToOne
    private Cliente cliente;

    @OneToOne
    private Habitacion habitacion;
}
