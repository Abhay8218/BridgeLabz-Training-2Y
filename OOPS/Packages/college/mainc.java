import college.student.Student;
import college.faculty.Faculty;

public class mainc {
    public static void main(String[] args) {
        Student s = new Student("Aby", "CS101");
        Faculty f = new Faculty("Dr. Rao", "Data Structures");

        s.displayName();
        s.displayRoll();

        f.displayName();
        f.displaySubject();
    }
}
