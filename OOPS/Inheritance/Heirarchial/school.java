// Base class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher of " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student in grade " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    String position;

    Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    void displayRole() {
        System.out.println(name + " is a Staff member working as " + position);
    }
}

// Test
public class SchoolDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher("Alice", 40, "Mathematics");
        Student s = new Student("Bob", 15, "10th Grade");
        Staff st = new Staff("Charlie", 35, "Clerk");

        t.displayInfo();
        t.displayRole();
        s.displayInfo();
        s.displayRole();
        st.displayInfo();
        st.displayRole();
    }
}
