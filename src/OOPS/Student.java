package OOPS;

// private members
public class Student {
    private String name;
    private int id;
    private int totalProblemSolved;
    private static String batch_name;

    public Student(){
    }
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.totalProblemSolved = 0;
    }

    public Student(String name, int id, int totalProblemSolved) {
        this.name = name;
        this.id = id;
        this.totalProblemSolved = totalProblemSolved;
    }

//    copy constructor
    public Student(Student s){
        this.id = s.id;
        this.name = s.name;
        this.totalProblemSolved = s.totalProblemSolved;
        System.out.println(batch_name);
    }

    public void solvedProblem(int count) {
        totalProblemSolved += count;
        System.out.println(this.name + " solved " + totalProblemSolved + " problems. Batch name is " + batch_name );
    }

    public static void test_static() {
        System.out.println(batch_name);
    }
}
