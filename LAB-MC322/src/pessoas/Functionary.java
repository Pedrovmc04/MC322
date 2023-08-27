package pessoas;

public class Functionary {
    private String name;
    private String role;

    public Functionary(String name, String role){
        this.name = name;
        this.role = role;
    }

    //Getters and toString

    public String getName(){
        return name;
    }

    public String getRole(){
        return role;
    }

    public String toString(){
        return "Name:" + name
                +"\nRole:" + role;
    }
}