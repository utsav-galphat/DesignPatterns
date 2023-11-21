package OOPS.Polymorphism.Interface;

public interface Flyable {
    default void fly(){
        System.out.println("Fly");
    }
}
