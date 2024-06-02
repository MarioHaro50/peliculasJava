package peliculas;

//import java.util.ArrayList;
import javax.swing.JOptionPane; // ! OBTENER INTERFACES Y CUADROS DE DIALOGOO
import peliculas.ui.UiPeliculas;

public class Main {

    public static void main(String[] args) {
        UiPeliculas.interfazUsuario();
    }
//    public static void main(String[] args) {
////        JOptionPane.showMessageDialog(
////                null,
////                "Dialogo de prueba"
////        );
//
//        // ! PARA INGRESAR DATOS, HACEMOS ESTO
//        String peliNueva = JOptionPane.showInputDialog(
//                null,
//                "Ingresa un texto",
//                "Titulo",
//                JOptionPane.PLAIN_MESSAGE // -1
//        );
//
//        // ! ASI MOSTRAMOS LOS DATOS
//        JOptionPane.showMessageDialog(
//                null,
//                peliNueva,
//                "Titulo",
////                JOptionPane.PLAIN_MESSAGE // -1
////                JOptionPane.ERROR_MESSAGE // 0
//                JOptionPane.INFORMATION_MESSAGE // 1
////                JOptionPane.WARNING_MESSAGE // 2
////                JOptionPane.QUESTION_MESSAGE // 3
//        );
//    }

//    public static void main(String[] args) {
//        // ! CREAMOS UNA LISTA DE OBJETOS
//        ArrayList<String> peliculas = new ArrayList<String>();
//
//        // Agregamos datos al array
//        peliculas.add("Peli 1");
//        peliculas.add("Peli 2");
//
//        // Mostramos todos los datos
//        System.out.println(peliculas);
//
//        // ! Para iterar usamos el forEach en Java
//        // ? OPCION 1
////        for (String pelicula : peliculas) {
////            System.out.println(pelicula);
////        }
//        // ? OPCION 2
////        peliculas.forEach(peli -> {
////            System.out.println(peli);
////        });
//
//        // ? OPCION 3
//        peliculas.forEach(System.out::println);
//    }
}