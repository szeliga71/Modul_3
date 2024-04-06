package zad4;

public class Student implements Comparable<Student>{

    private int age;
    private double height;
    private String name;
    private String lastName;

    public Student(int age, double height, String name, String lastName) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Student student) {
        return this.lastName.compareTo(student.getLastName());

    }

    @Override
    public String toString() {
        return "zad4.Student{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
