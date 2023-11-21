package OOPS.Polymorphism.Interface;

public class Bird implements Flyable, Flamable{

    @Override
    public void fly() {
        Flamable.super.fly();
    }
}
