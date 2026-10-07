package com.salesianos.demo.tarea_4_dto.dto.ejercicio4;

import com.salesianos.demo.tarea_4_dto.model.ejercicio4.Reserva;

public record ReservaDTO(
        String codigo,
        String Cliente,
        String habitacion,
        int numeroNoches,
        double precioTotal
) {

    public static ReservaDTO of(Reserva reserva){
        if (reserva == null)
            return null;


        return new ReservaDTO(
                reserva.getCodigo(),

                //reserva.getCliente().getNombre() + " " + reserva.getCliente().getApellidos(),
                reserva.getCliente() != null
                        ? reserva.getCliente().getNombre() + " "
                        + reserva.getCliente().getApellidos()
                        : "",

                //reserva.getHabitacion().getNumero() + "-" + reserva.getHabitacion().getTipo(),
                reserva.getHabitacion() != null
                        ? reserva.getHabitacion().getNumero() + " - "
                        + reserva.getHabitacion().getTipo()
                        : "",

                reserva.getNumeroNoches(),

                //reserva.getNumeroNoches()*reserva.getHabitacion().getPrecioNoche()
                reserva.getHabitacion() != null
                        ? reserva.getNumeroNoches()
                        * reserva.getHabitacion().getPrecioNoche()
                        : 0
        );
    }

}
