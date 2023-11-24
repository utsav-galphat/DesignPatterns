package DesignPattern.BuilderPattern;

public class Student {
    private String name;
    private String batchName;
    private int age;

    private double psp;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", batchName='" + batchName + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                '}';
    }

    private Student(Builder studentBuild){
        this.name = studentBuild.getName();
        this.age = studentBuild.getAge();
        this.batchName = studentBuild.getBatchName();
        this.psp = studentBuild.getPsp();
    }
    public static Builder builder(){
        return new Builder();
    }
    static class Builder{
        private String name;
        private String batchName;
        private int age;
        private double psp;

        public Student build(){
            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getBatchName() {
            return batchName;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }
    }
}
