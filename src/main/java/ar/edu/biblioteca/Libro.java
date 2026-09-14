package ar.edu.biblioteca.modelo;


public class Libro {

    private String isbn;
    private String titulo;
    private boolean disponible;
    private boolean postgrado

    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.disponible = true;
    }
}
