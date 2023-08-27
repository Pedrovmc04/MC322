package library;

public class Objects {
    private String title;
    private String author;
    private String publicationYear;
    private boolean isAvailable;

    public Objects(String title, String author, String publicationYear){
        this.title = title;
        this.author  = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    public void markAvailable(){
        this.isAvailable = false;
    }

    public  void markUnavable(){
        this.isAvailable = false;
    }

    public boolean checkAvaible(){
        return this.isAvailable;
    }


    //Getters and toString
    public String getPublicationYear(){
        return publicationYear;
    }
    public String getTitulo(){
        return title;
    }

    public String getAutor(){
        return author;
    }

    public String toString(){
        return "\nTitle:" + title
                +"\nAuthor:" + author
                +"\nPublication Year:" + publicationYear
                +"\nDisponibilidade:" + isAvailable;
    }
}
