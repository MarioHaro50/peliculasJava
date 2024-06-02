package peliculas.modelos;

import javax.swing.*;
import java.util.ArrayList;

public class ImplementacionCatalogoPelicula implements ICatalogoPeliculas{

    private final ArrayList<String> listaPeliculas;

    public ImplementacionCatalogoPelicula() {
        this.listaPeliculas = new ArrayList<>();
    }

    @Override
    public void insertarPelicula(Pelicula nombrePelicula) {
        this.listaPeliculas.add(nombrePelicula.toString());
    }

    @Override
    public void listarPeliculas() {
        JOptionPane.showMessageDialog(
                null,
                this.listaPeliculas,
                "Nuestras Películas",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
        String resultado = null;
        for(var pelicula : this.listaPeliculas) {
            if(pelicula.equals(nombrePelicula)) {
                resultado = pelicula;
                break;
            } else {
                resultado = pelicula;
            }
        }

        if(nombrePelicula.equals(resultado)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Resultado -> " + resultado,
                    "Película Encontrada",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "No se encontró la pelicula -> " + resultado,
                    "Película No Encontrada",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
