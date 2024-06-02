package peliculas.modelos;

import java.io.Serializable; // PARA USAR INTERFACES
import java.util.Objects;

// ! CLASE DE JAVABEANS
public class Pelicula implements Serializable {
    private String nombre;

    public Pelicula() {} // ! SE NECESITA UN CONSTRUCTOR VACÍO SIEMPRE

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pelicula pelicula)) return false;
        return Objects.equals(nombre, pelicula.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}
