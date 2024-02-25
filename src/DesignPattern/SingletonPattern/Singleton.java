package DesignPattern.SingletonPattern;

public class Singleton {
    private static Singleton singletonInstance;

    private Singleton(){

    }

    public static Singleton getSingletonInstance() {
        if(singletonInstance == null){
            synchronized (Singleton.class){
                if(singletonInstance == null){
                    singletonInstance = new Singleton();
                }
            }
        }
        return singletonInstance;
    }
}
