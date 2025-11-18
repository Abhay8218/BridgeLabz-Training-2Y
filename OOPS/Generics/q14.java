package Generics;

public abstract class CourseType {
    public abstract String evaluation();
}
public class ExamCourse extends CourseType {
    @Override public String evaluation() { return "Exam-based evaluation"; }
}
public class AssignmentCourse extends CourseType {
    @Override public String evaluation() { return "Assignment-based evaluation"; }
}
public class ResearchCourse extends CourseType {
    @Override public String evaluation() { return "Research-based evaluation"; }
}
import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private final String code;
    private final T type;
    private final List<String> enrolled = new ArrayList<>();
    public Course(String code, T type) { this.code = code; this.type = type; }
    public void enroll(String student) { enrolled.add(student); }
    public String getCode() { return code; }
    public T getType() { return type; }
    public List<String> getEnrolled() { return new ArrayList<>(enrolled); }
    @Override public String toString() {
        return "Course[" + code + ", " + type.getClass().getSimpleName() + ", enrolled=" + enrolled.size() + "]";
    }
}

import java.util.List;

public class Utils {
    public static void printAnyCourses(List<? extends CourseType> types) {
        for (CourseType t : types) System.out.println("CourseType: " + t.getClass().getSimpleName() + " -> " + t.evaluation());
    }
}

