package DesignPattern.SingletonPattern;

public class Test {
    public static void main(String[] args) {
        Chocoholic ch = Chocoholic.getInstance();
        Chocoholic ch1 = Chocoholic.getInstance();

        System.out.println(ch);
        System.out.println(ch1);
    }
}
