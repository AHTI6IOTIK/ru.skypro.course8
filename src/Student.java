import java.util.Objects;

// Напишите методы Equals and HashCode для класса Student, который состоит из полей String name и int age.
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Student)) {
            return false;
        }

        Student student = (Student) o;

        return student.name.equals(this.name) && student.age == this.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Name = " + name + " age = " + age;
    }
}
