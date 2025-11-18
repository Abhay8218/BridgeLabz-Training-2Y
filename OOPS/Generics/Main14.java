package Generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Course<ExamCourse> c1 = new Course<>("CS101", new ExamCourse());
        c1.enroll("Alice"); c1.enroll("Bob");

        Course<AssignmentCourse> c2 = new Course<>("ENG201", new AssignmentCourse());
        c2.enroll("Charlie");

        System.out.println(c1);
        System.out.println(c2);

        // print evaluation type objects
        Utils.printAnyCourses(Arrays.asList(c1.getType(), c2.getType(), new ResearchCourse()));
    }
}
