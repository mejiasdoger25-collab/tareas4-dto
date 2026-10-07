package com.salesianos.demo.tarea_4_dto.utils;

import com.salesianos.demo.tarea_4_dto.dto.ejercicio3.LibroDTO;
import com.salesianos.demo.tarea_4_dto.dto.ejercicio4.ReservaDTO;
import com.salesianos.demo.tarea_4_dto.dto.ejercicio5.SerieDTO;
import com.salesianos.demo.tarea_4_dto.model.ejercicio3.Autor;
import com.salesianos.demo.tarea_4_dto.model.ejercicio3.Libro;
import com.salesianos.demo.tarea_4_dto.model.ejercicio4.Cliente;
import com.salesianos.demo.tarea_4_dto.model.ejercicio4.Habitacion;
import com.salesianos.demo.tarea_4_dto.model.ejercicio4.Reserva;
import com.salesianos.demo.tarea_4_dto.model.ejercicio5.Categoria;
import com.salesianos.demo.tarea_4_dto.model.ejercicio5.Creador;
import com.salesianos.demo.tarea_4_dto.model.ejercicio5.Serie;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataSeed {

    // outputs testing area

    @PostConstruct
    public void initData(){

        Autor autor = Autor.builder()
                .nombre("Miguel")
                .apellido1("de Cervantes")
                .apellido2(null)
                .build();

        Libro libro = Libro.builder()
                .titulo("Don Quijote")
                .isbn("123456")
                .anioPublicacion(1605)
                .autor(autor)
                .build();

        Libro libroSinAutor = Libro.builder()
                .titulo("Libro desconocido")
                .isbn("999999")
                .anioPublicacion(2026)
                .autor(null)
                .build();

        System.out.println("----- LIBRO -----");
        System.out.println(LibroDTO.of(libro));
        System.out.println(LibroDTO.of(libroSinAutor));
        System.out.println(LibroDTO.of(null));


        Cliente cliente = Cliente.builder()
                .nombre("Juan")
                .apellidos("García López")
                .build();

        Habitacion habitacion = Habitacion.builder()
                .numero(204)
                .tipo("Doble")
                .precioNoche(50)
                .build();

        Reserva reservaCompleta = Reserva.builder()
                .codigo("R001")
                .cliente(cliente)
                .habitacion(habitacion)
                .numeroNoches(3)
                .build();

        Reserva reservaSinCliente = Reserva.builder()
                .codigo("R002")
                .cliente(null)
                .habitacion(habitacion)
                .numeroNoches(3)
                .build();

        Reserva reservaSinHabitacion = Reserva.builder()
                .codigo("R003")
                .cliente(cliente)
                .habitacion(null)
                .numeroNoches(3)
                .build();

        Reserva reservaSinNoches = Reserva.builder()
                .codigo("R004")
                .cliente(cliente)
                .habitacion(habitacion)
                .numeroNoches(0)
                .build();

        Habitacion habitacionSinPrecio = Habitacion.builder()
                .numero(205)
                .tipo("Individual")
                .precioNoche(0)
                .build();

        Reserva reservaSinPrecio = Reserva.builder()
                .codigo("R005")
                .cliente(cliente)
                .habitacion(habitacionSinPrecio)
                .numeroNoches(3)
                .build();

        System.out.println("\n----- RESERVA -----");
        System.out.println(ReservaDTO.of(reservaCompleta));
        System.out.println(ReservaDTO.of(reservaSinCliente));
        System.out.println(ReservaDTO.of(reservaSinHabitacion));
        System.out.println(ReservaDTO.of(reservaSinNoches));
        System.out.println(ReservaDTO.of(reservaSinPrecio));
        System.out.println(ReservaDTO.of(null));


        Creador creador = Creador.builder()
                .nombre("George")
                .apellidos("Lucas")
                .pais("Estados Unidos")
                .build();

        Categoria categoria = Categoria.builder()
                .nombre("Ciencia ficción")
                .descripcion("Series de ciencia ficción")
                .build();

        Serie serieCompleta = Serie.builder()
                .titulo("Star Wars")
                .sinopsis("Una historia en una galaxia muy, muy lejana")
                .numeroTemporadas(3)
                .imagenes(List.of("starwars.jpg", "starwars2.jpg"))
                .creador(creador)
                .categoria(categoria)
                .build();

        Serie serieSinCategoria = Serie.builder()
                .titulo("Serie sin categoría")
                .sinopsis("Una serie de prueba")
                .numeroTemporadas(2)
                .imagenes(List.of("serie.jpg"))
                .creador(creador)
                .categoria(null)
                .build();

        Serie serieSinImagenes = Serie.builder()
                .titulo("Serie sin imágenes")
                .sinopsis("Una serie de prueba")
                .numeroTemporadas(1)
                .imagenes(null)
                .creador(creador)
                .categoria(categoria)
                .build();

        Serie serieImagenesVacia = Serie.builder()
                .titulo("Serie con imágenes vacías")
                .sinopsis("Una serie de prueba")
                .numeroTemporadas(4)
                .imagenes(List.of())
                .creador(creador)
                .categoria(categoria)
                .build();

        System.out.println("\n----- SERIE -----");
        System.out.println(SerieDTO.of(serieCompleta));
        System.out.println(SerieDTO.of(serieSinCategoria));
        System.out.println(SerieDTO.of(serieSinImagenes));
        System.out.println(SerieDTO.of(serieImagenesVacia));
        System.out.println(SerieDTO.of(null));
    }
}
