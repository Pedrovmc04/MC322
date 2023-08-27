package library;

public class Objects {
    private String category;
    private String title;
    private String author;
    private String publicationYear;
    private boolean isAvailable;
    private String returnDate;

    public Objects(String category,String title, String author, String publicationYear){
        this.category = category;
        this.title = title;
        this.author  = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
        this.returnDate = null;
    }

    public void markAvailable(){
        this.isAvailable = false;
        this.returnDate = null;
    }

    public  void markUnavable(String returnDate){
        this.isAvailable = false;
        this.returnDate = returnDate;
    }

    public boolean checkAvaible(){
        return this.isAvailable;
    }


    //Getters and toString

    public String getCategory(){
        return category;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublicationYear(){
        return publicationYear;
    }

    public String getReturnDate(){
        return returnDate;
    }
    public String toString(){
        return  "Category:" + category
                +"\nTitle:" + title
                +"\nAuthor:" + author
                +"\nPublication Year:" + publicationYear
                +"\nAvailability:" + isAvailable;
    }
}
