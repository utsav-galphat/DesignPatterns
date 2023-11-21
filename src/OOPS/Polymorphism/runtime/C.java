package OOPS.Polymorphism.runtime;

public class C extends B{
    C() {
        this.a = 20;
    }

//    @Override
    public void print1() {
        System.out.println("C: " + this.a);
    }
}
