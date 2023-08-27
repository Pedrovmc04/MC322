package pessoas;

public class members {
    private String category;
    private String name;
    private String age;

    public members(String category, String name, String age){
        this.category = category;
        this.name = name;
        this.age = age;
    }

    //Getters and toString
    public String getCategory(){
        return category;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }

    public String toString(){
        return "Category:"+category
                +"\nNome:"+name
                +"\nAge:"+age;
    }
}
