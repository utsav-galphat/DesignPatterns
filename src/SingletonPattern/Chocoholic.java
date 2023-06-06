package SingletonPattern;

//This example is of chocolate boiler
public class Chocoholic {
    private boolean empty;
    private boolean boiled;

    private static Chocoholic ch = new Chocoholic(); //create a static instance of a class, this will be thread safe
//    private static Chocoholic ch;

    private Chocoholic() {  //define a private constructor so that none can create new obj
        empty = true;
        boiled = false;
    }

    public static Chocoholic getInstance() { // define a method which will return the created object
        /* here we are doing lazy loading
        if(ch == null){
            ch = new Chocoholic();
        } */
        return ch;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
