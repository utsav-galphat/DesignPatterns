package DesignPattern.BuilderPattern;

public class Client {
    public static void main(String[] args) {
        Student.Builder studentBuilder = Student.builder();
        studentBuilder.setName("o");
        studentBuilder.setAge(12);
        studentBuilder.setBatchName("n");
        studentBuilder.setPsp(9.9);

        Student student2 = Student.builder().setPsp(3.3)
                .setAge(1)
                .setName("t")
                .setBatchName("r")
                .setPsp(2.3)
                .build();


        Student student = studentBuilder.build();

        System.out.println(student2.toString());;
    }
}
