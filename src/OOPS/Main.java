package OOPS;

public class Main {
    public static void main(String[] args) {
        Student luffy = new Student("Luffy", 1);

        Student zoro = new Student("Zoro", 2);

        Student nami = new Student(zoro);

        luffy.solvedProblem(3);
        zoro.solvedProblem(1);
        zoro.solvedProblem(3);
        Student.test_static();
    }
}
