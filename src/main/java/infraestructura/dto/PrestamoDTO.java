package infraestructura.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDate;

/**
 * DTO para transferir datos de préstamos entre capas.
 * Contiene la información de un préstamo de libro.
 */
public record PrestamoDTO(
    @NotNull(message = "El ID del préstamo no puede ser nulo")
    Long id,

    @NotNull(message = "El ID del libro no puede ser nulo")
    Long libroId,

    @NotBlank(message = "El nombre del usuario no puede estar vacío")
    String usuario,

    @NotNull(message = "La fecha de préstamo no puede ser nula")
    LocalDate fechaPrestamo,

    @NotNull(message = "La fecha de devolución no puede ser nula")
    LocalDate fechaDevolucion,

    @NotBlank(message = "El estado del préstamo no puede estar vacío")
    String estado
) {
    // Constructor compacto proporcionado por el record
}