package com.salesianos.demo.tarea_4_dto.dto.ejercicio5;

import com.salesianos.demo.tarea_4_dto.model.ejercicio5.Serie;

public record SerieDTO(
        String titulo,
        int temporadas,
        String creador,
        String categoria,
        String imagenPrincipal
) {

    public static SerieDTO of(Serie serie){
        if (serie == null)
            return null;

        return new SerieDTO(
                serie.getTitulo(),
                serie.getNumeroTemporadas(),
                serie.getCreador().getNombre() + " " + serie.getCreador().getApellidos(),
                //serie.getCategoria().getNombre(),
                serie.getCategoria().getNombre() != null ? serie.getCategoria().getNombre() : "",
                //serie.getImagenes().getFirst()
                serie.getImagenes() != null && !serie.getImagenes().isEmpty() ?
                        serie.getImagenes().getFirst() : ""
        );
    }

}
