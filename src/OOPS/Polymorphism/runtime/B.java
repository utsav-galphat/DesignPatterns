package OOPS.Polymorphism.runtime;

public class B extends A {
    B() {
        this.a = 15;
    }

    @Override
    public void print() {
        System.out.println("B: " + this.a);
    }
}
