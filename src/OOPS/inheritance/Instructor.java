package OOPS.inheritance;

public class Instructor extends User{

    void teach(){
        System.out.println(name + "has started teaching");
    }

    Instructor(String name){
        super(name);
        System.out.println(" Instructor constructor");
    }
}
