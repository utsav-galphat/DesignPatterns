package OOPS.inheritance;

public class User {
    String name;

    String email;

    void login() {
        System.out.println(name + " has logged in");
    }

    User(String name){
        this.name = name;
        System.out.println(" User Constructor");
    }
}
