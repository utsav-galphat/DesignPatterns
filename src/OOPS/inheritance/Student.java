package OOPS.inheritance;

public class Student extends User{

    Student(String name) {
        super(name);
    }

    void solveProblem(){
        System.out.println(name + " is solving problem ");
    }
}
