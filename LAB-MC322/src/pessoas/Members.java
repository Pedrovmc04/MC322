package pessoas;

import library.Objects;

import java.util.List;

public class Members {
    private String category;
    private String name;
    private String age;
    private Objects object;

    public Members(String category, String name, String age){
        this.category = category;
        this.name = name;
        this.age = age;
    }

    public Objects getObject(){
        return this.object;
    }

    public void setObject(Objects obj){
        this.object = obj;
    }
    public void removeObject(){
        this.object = null;
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
                +"\nName:"+name
                +"\nAge:"+age;
    }
}
