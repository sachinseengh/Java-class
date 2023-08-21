
    import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getAge(), student2.getAge());
    }
}

public class Q23_Comparator {
    public static void main(String[] args) {
        // Create a List of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 21));

        // Sort the List using the AgeComparator
        Collections.sort(students, new AgeComparator());

        // Print the sorted list
        System.out.println("Sorted students by age:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}


