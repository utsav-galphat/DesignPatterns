package DesignPattern.BehavioralPattern;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehaviour quackBehaviour;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }
    public void swim(){
        System.out.println("All duck float, even decoys");
    }

    public abstract void display();

}
