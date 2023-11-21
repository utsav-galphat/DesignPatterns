package OOPS.Polymorphism.Interface;

public interface Flamable {
    default void fly(){
        System.out.println("Fly");
    }
}
