package peliculas.ui;

import peliculas.modelos.*;
import javax.swing.JOptionPane;

public class UiPeliculas {
    public static void interfazUsuario() {
        ICatalogoPeliculas peliculasArr = new ImplementacionCatalogoPelicula();
        Pelicula pelicula;

        CERRAR:
        while (true) {
            String opcion = JOptionPane.showInputDialog(
              null,
              "1.- Agregar nueva película\n"
              + "2.- Ver todo el catálogo\n"
              + "3.- Buscar película\n"
              + "4.- Salir\n",
              "Ingresa Opción",
              3
            );

            int opcionInt = 0;

            try {
                opcionInt = Integer.parseInt(opcion);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Se requiere un número entero entre las opciones",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null,
                        e,
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }

            switch (opcionInt) {
                case 1:
                    String titulo = JOptionPane.showInputDialog(
                            null,
                            "Ingresa el título de la película",
                            "Ingresa Título",
                            3
                    );

                    pelicula = new Pelicula(titulo);
                    peliculasArr.insertarPelicula(pelicula);
                    break;

                case 2:
                    peliculasArr.listarPeliculas();
                    break;
                case 3:
                    String tituloBuscar = JOptionPane.showInputDialog(
                            null,
                            "Ingresa el título de la película a buscar",
                            "Buscar una película",
                            3
                    );
                    peliculasArr.buscarPelicula(tituloBuscar);
                    break;
                case 4:
                    break CERRAR;
                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opción no válida",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                    break;
            }
        }
    }
}
