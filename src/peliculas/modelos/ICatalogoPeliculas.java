package peliculas.modelos;

public interface ICatalogoPeliculas {
    void insertarPelicula(Pelicula nombrePelicula); // ! INSERTAMOS PELÍCULAS A NUESTRO CATALOGO
    void listarPeliculas(); // ! METODO PARA VER TODAS LAS PELICULAS
    void buscarPelicula(String nombrePelicula); // ! BUSCAR UNA PELICULA POR NOMBRE
}
