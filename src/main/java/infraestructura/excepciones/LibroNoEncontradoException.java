package infraestructura.excepciones;


import dominio.Libro;
/**
 * Excepción lanzada cuando no se encuentra un libro en el sistema.
 * Se utiliza para manejar errores 404 en las operaciones de libro.
 */
public class LibroNoEncontradoException extends RuntimeException {

    private final Long libroId;

    // TODO(reto): Implementar el constructor que recibe el ID del libro
    // y genera un mensaje descriptivo. Guardar el ID en el campo libroId.
    public LibroNoEncontradoException(Long libroId) {
        super("Libro no encontrado con ID: " + libroId);
        this.libroId = libroId;
    }

    // TODO(reto): Implementar un segundo constructor que recibe el ID y un mensaje personalizado.
    public LibroNoEncontradoException(Long libroId, String mensaje) {
        super(mensaje);
        this.libroId = libroId;
    }

    // TODO(reto): Implementar el getter para libroId.
    public Long getLibroId() {
        throw new UnsupportedOperationException("Implementar getLibroId");
    }
}