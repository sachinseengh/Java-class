
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
    }
    
    public class Q13_ArrayOfObject {
        public static void main(String[] args) {
            // Create an array of Student objects
            Student[] students = new Student[3];
    
            // Initialize the array elements with Student objects
            students[0] = new Student("Alice", 20);
            students[1] = new Student("Bob", 22);
            students[2] = new Student("Charlie", 21);
    
            // Access and print the information of each student
            for (Student student : students) {
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println();
            }
        }
    }
    

