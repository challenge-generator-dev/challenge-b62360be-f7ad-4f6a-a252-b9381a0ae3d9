package dominio.repositorios;

import dominio.Libro;
import java.util.List;
import java.util.Optional;

/**
 * Puerto para operaciones de persistencia de libros.
 * Define las operaciones que el dominio necesita para interactuar con el almacenamiento de libros.
 */
public interface LibroRepositorio {

    /**
     * Guarda un libro en el repositorio.
     * @param libro el libro a guardar
     * @return el libro guardado
     */
    Libro guardar(Libro libro);

    /**
     * Busca un libro por su identificador único.
     * @param id el identificador del libro
     * @return un Optional que contiene el libro si existe, o vacío si no existe
     */
    Optional<Libro> buscarPorId(Long id);

    /**
     * Busca todos los libros disponibles en el repositorio.
     * @return una lista de todos los libros
     */
    List<Libro> buscarTodos();

    /**
     * Elimina un libro del repositorio por su identificador.
     * @param id el identificador del libro a eliminar
     */
    void eliminar(Long id);

    /**
     * Busca libros por su título.
     * @param titulo el título o parte del título a buscar
     * @return una lista de libros que coinciden con el título
     */
    List<Libro> buscarPorTitulo(String titulo);

    /**
     * Busca libros por su autor.
     * @param autor el autor o parte del autor a buscar
     * @return una lista de libros que coinciden con el autor
     */
    List<Libro> buscarPorAutor(String autor);

    /**
     * Verifica si un libro está disponible para préstamo.
     * @param id el identificador del libro
     * @return true si el libro está disponible, false en caso contrario
     */
    boolean estaDisponible(Long id);
}