package BehavioralPattern;

public class ModelDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I am model duck ");
    }

    public ModelDuck(){
        flyBehavior = new FlyWithWings();
        quackBehaviour = new Quack();
    }
}
