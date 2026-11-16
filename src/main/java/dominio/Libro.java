package dominio;

import java.time.Year;
import java.util.Objects;

public class Libro {
    private Long id;
    private String titulo;
    private String autor;
    private String isbn;
    private Year añoPublicacion;
    private String editorial;
    private int cantidadTotal;
    private int cantidadDisponible;

    public Libro(Long id, String titulo, String autor, String isbn, Year añoPublicacion,
                 String editorial, int cantidadTotal) {
        this.id = id;
        this.titulo = Objects.requireNonNull(titulo, "El título no puede ser nulo");
        this.autor = Objects.requireNonNull(autor, "El autor no puede ser nulo");
        this.isbn = Objects.requireNonNull(isbn, "El ISBN no puede ser nulo");
        this.añoPublicacion = Objects.requireNonNull(añoPublicacion, "El año de publicación no puede ser nulo");
        this.editorial = Objects.requireNonNull(editorial, "La editorial no puede ser nula");
        if (cantidadTotal <= 0) {
            throw new IllegalArgumentException("La cantidad total debe ser positiva");
        }
        this.cantidadTotal = cantidadTotal;
        this.cantidadDisponible = cantidadTotal;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public Year getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void prestar() {
        if (cantidadDisponible <= 0) {
            throw new IllegalStateException("No hay copias disponibles para préstamo");
        }
        cantidadDisponible--;
    }

    public void devolver() {
        if (cantidadDisponible >= cantidadTotal) {
            throw new IllegalStateException("Todas las copias ya están disponibles");
        }
        cantidadDisponible++;
    }

    public boolean estaDisponible() {
        return cantidadDisponible > 0;
    }

    public void actualizarCantidadTotal(int nuevaCantidad) {
        if (nuevaCantidad <= 0) {
            throw new IllegalArgumentException("La cantidad total debe ser positiva");
        }
        if (nuevaCantidad < (cantidadTotal - cantidadDisponible)) {
            throw new IllegalArgumentException("No se puede reducir la cantidad total por debajo de las copias prestadas");
        }
        this.cantidadTotal = nuevaCantidad;
        this.cantidadDisponible = nuevaCantidad - (cantidadTotal - cantidadDisponible);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(id, libro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}