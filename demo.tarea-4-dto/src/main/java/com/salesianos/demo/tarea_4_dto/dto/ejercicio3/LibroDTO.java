package com.salesianos.demo.tarea_4_dto.dto.ejercicio3;

import com.salesianos.demo.tarea_4_dto.model.ejercicio3.Libro;

public record LibroDTO(
        String titulo,
        String isbn,
        String autor,
        int anioPublicacion
) {


    public static LibroDTO of(Libro l){
        if (l == null)
            return null;


        // validaciones names y lastnames
        String nombreAutor = "";
        if (l.getAutor() != null) {
            nombreAutor = l.getAutor().getNombre() + " " + l.getAutor().getApellido1();

            if (l.getAutor().getApellido2() != null)
                nombreAutor += " " + l.getAutor().getApellido2();
        }


        return new LibroDTO(
                l.getTitulo(),
                l.getIsbn(),
                l.getAutor().getNombre() + l.getAutor().getApellido1() + l.getAutor().getApellido2(),
                l.getAnioPublicacion()
        );
    }


    /*
    public LibroDTO to(){
        return Libro.builder()
                .
    }*/
}
