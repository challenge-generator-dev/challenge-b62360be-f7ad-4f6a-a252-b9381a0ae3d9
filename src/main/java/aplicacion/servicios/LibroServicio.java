package aplicacion.servicios;

import dominio.repositorios.LibroRepositorio;
import infraestructura.dto.LibroDTO;
import infraestructura.dto.LibroRequest;

import java.util.List;

/**
 * Servicio de aplicación para gestionar operaciones de libros.
 * Coordina la lógica de negocio relacionada con el inventario de libros.
 */
public class LibroServicio {

    private final LibroRepositorio libroRepositorio;

    public LibroServicio(LibroRepositorio libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }

    // TODO(reto): Implementar el método crearLibro que recibe un LibroRequest
    // y retorna un LibroDTO. Debe validar que no exista un libro con el mismo ISBN
    // antes de guardar. Usar el repositorio para persistir.
    public LibroDTO crearLibro(LibroRequest request) {
        throw new UnsupportedOperationException("Implementar crearLibro");
    }

    // TODO(reto): Implementar el método obtenerLibroPorId que recibe un Long id
    // y retorna un Optional<LibroDTO>. Debe usar el repositorio para buscar.
    public LibroDTO obtenerLibroPorId(Long id) {
        throw new UnsupportedOperationException("Implementar obtenerLibroPorId");
    }

    // TODO(reto): Implementar el método obtenerTodosLosLibros que retorna
    // una lista de LibroDTO con todos los libros del repositorio.
    public List<LibroDTO> obtenerTodosLosLibros() {
        throw new UnsupportedOperationException("Implementar obtenerTodosLosLibros");
    }

    // TODO(reto): Implementar el método actualizarLibro que recibe un id y un
    // LibroRequest. Debe verificar que el libro existe antes de actualizar.
    public LibroDTO actualizarLibro(Long id, LibroRequest request) {
        throw new UnsupportedOperationException("Implementar actualizarLibro");
    }

    // TODO(reto): Implementar el método eliminarLibro que recibe un id y
    // elimina el libro del repositorio si existe.
    public void eliminarLibro(Long id) {
        throw new UnsupportedOperationException("Implementar eliminarLibro");
    }

    // TODO(reto): Implementar el método buscarPorTitulo que recibe un String
    // titulo y retorna una lista de LibroDTO con los libros que coincidan.
    public List<LibroDTO> buscarPorTitulo(String titulo) {
        throw new UnsupportedOperationException("Implementar buscarPorTitulo");
    }

    // TODO(reto): Implementar el método buscarPorAutor que recibe un String
    // autor y retorna una lista de LibroDTO con los libros que coincidan.
    public List<LibroDTO> buscarPorAutor(String autor) {
        throw new UnsupportedOperationException("Implementar buscarPorAutor");
    }

    // TODO(reto): Implementar el método verificarDisponibilidad que recibe un
    // id y retorna true si el libro está disponible para préstamo.
    public boolean verificarDisponibilidad(Long id) {
        throw new UnsupportedOperationException("Implementar verificarDisponibilidad");
    }
}