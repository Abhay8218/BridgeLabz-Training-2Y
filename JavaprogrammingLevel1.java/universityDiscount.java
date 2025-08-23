public class universityDiscount {
    public static void main(String[] args) {
        int fee= 125000;                 
        int discountPercent =10;         

        int discount = (fee * discountPercent)/100;   
        int discountedPrice= fee-discount;           

        System.out.println("The Discounted Amount in INR is " + discount);
        System.out.println("The Discounted Price the student will pay in INR is " + discountedPrice);
    }
}
