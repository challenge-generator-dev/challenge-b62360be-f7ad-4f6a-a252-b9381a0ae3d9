package infraestructura.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.Year;

/**
 * DTO para recibir solicitudes de creación o actualización de libros.
 * Contiene los datos necesarios para crear o modificar un libro.
 */
public record LibroRequest(
    @NotBlank(message = "El título del libro no puede estar vacío")
    String titulo,

    @NotBlank(message = "El autor del libro no puede estar vacío")
    String autor,

    @NotBlank(message = "El ISBN del libro no puede estar vacío")
    String isbn,

    @NotNull(message = "El año de publicación no puede ser nulo")
    Year añoPublicacion,

    @NotBlank(message = "La editorial no puede estar vacía")
    String editorial,

    @Positive(message = "La cantidad total debe ser un número positivo")
    int cantidadTotal
) {
    // Constructor compacto proporcionado por el record
}