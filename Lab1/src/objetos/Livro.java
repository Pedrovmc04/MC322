public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean isAvailable;

    public Livro(String titulo,String autor,String isbn){
        this.titulo = titulo;
        this.autor  = autor;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public void markAvailable(){
        this.isAvailable = false;
    }

    public boolean checkAvaible(){
        return this.isAvailable;
    }

    //GETTERS
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getIsbn(){
        return isbn;
    }

    public String toString(){
        return "Titulo:" + titulo
                +"\nAutor:" + autor
                +"\nISBN:" + isbn
                +"\nDisponibilidade:" + isAvailable;
    }
}
