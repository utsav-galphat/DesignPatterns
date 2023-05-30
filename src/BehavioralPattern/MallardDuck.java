package BehavioralPattern;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am mallard duck");
    }
}
