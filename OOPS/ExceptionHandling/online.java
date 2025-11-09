import java.time.*;

class LateSubmissionException extends Exception { public LateSubmissionException(String msg){super(msg);} }
class InvalidFileFormatException extends Exception { public InvalidFileFormatException(String msg){super(msg);} }

class OnlineExamSubmission {
    LocalDateTime deadline = LocalDateTime.of(2025, 11, 10, 10, 0);

    public void submitExam(String fileName, LocalDateTime time) throws Exception {
        if (!fileName.endsWith(".pdf"))
            throw new InvalidFileFormatException("Submission failed: invalid file format");
        if (time.isAfter(deadline))
            throw new LateSubmissionException("Submission failed: late submission");
        System.out.println("Exam submitted successfully");
    }

    public static void main(String[] args) {
        OnlineExamSubmission o = new OnlineExamSubmission();
        try {
            o.submitExam("answer.docx", LocalDateTime.now());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
