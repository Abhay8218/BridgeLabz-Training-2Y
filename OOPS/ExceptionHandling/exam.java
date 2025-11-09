import java.io.*;

class InvalidStudentException extends Exception { public InvalidStudentException(String msg){super(msg);} }

class OnlineExam {
    void validateStudent(boolean valid) throws InvalidStudentException {
        if (!valid) throw new InvalidStudentException("Invalid student ID!");
    }

    void submitExam() throws IOException, InvalidStudentException {
        validateStudent(false);
        throw new IOException("File upload failed!");
    }

    public static void main(String[] args) {
        OnlineExam e = new OnlineExam();
        try {
            e.submitExam();
        } catch (InvalidStudentException | IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}
