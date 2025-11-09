class InvalidRatingException extends Exception { public InvalidRatingException(String msg){super(msg);} }
class EmptyReviewException extends Exception { public EmptyReviewException(String msg){super(msg);} }

class ProductReview {
    public void submitReview(int rating, String comment) throws Exception {
        if (rating < 1 || rating > 5)
            throw new InvalidRatingException("Invalid rating! Must be 1-5.");
        if (comment == null || comment.trim().isEmpty())
            throw new EmptyReviewException("Review comment cannot be empty!");
        System.out.println("Review Submitted Successfully!");
    }

    public static void main(String[] args) {
        ProductReview r = new ProductReview();
        try {
            r.submitReview(6, "");
        } catch (InvalidRatingException e) {
            System.out.println(e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println(e.getMessage());
        }
    }
}
