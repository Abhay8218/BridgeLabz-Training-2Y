// Base class
class Course {
    String courseName;
    int duration; // in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

// Subclass of Course
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass of OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // %

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%, Final Fee: $" + calculateFinalFee());
    }
}

// Test class
public class education {
    public static void main(String[] args) {
        Course course = new Course("Mathematics", 12);
        OnlineCourse online = new OnlineCourse("Java Programming", 8, "Udemy", true);
        PaidOnlineCourse paid = new PaidOnlineCourse("Data Science", 10, "Coursera", true, 500.0, 20.0);

        course.displayInfo();
        System.out.println("-----------");
        online.displayInfo();
        System.out.println("-----------");
        paid.displayInfo();
    }
}
