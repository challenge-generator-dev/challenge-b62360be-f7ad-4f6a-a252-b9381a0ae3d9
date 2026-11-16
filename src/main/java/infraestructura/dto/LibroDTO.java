package infraestructura.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.Year;

/**
 * DTO para transferir datos de libros entre capas.
 * Contiene la información básica de un libro para operaciones de lectura.
 */
public record LibroDTO(
    @NotNull(message = "El ID del libro no puede ser nulo")
    Long id,

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

    @Positive(message = "La cantidad disponible debe ser un número positivo")
    int cantidadDisponible
) {
    // Constructor compacto proporcionado por el record
}