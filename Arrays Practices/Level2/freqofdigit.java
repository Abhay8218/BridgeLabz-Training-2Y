import java.util.*;

class freqofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        String numStr = Long.toString(num);
        int[] freq = new int[10];  // for digits 0-9

        for(int i=0; i<numStr.length(); i++){
            int digit = numStr.charAt(i) - '0';
            freq[digit]++;
        }

        System.out.println("\nDigit Frequencies:");
        for(int i=0; i<10; i++){
            if(freq[i] > 0){
                System.out.println("Digit " + i + " occurs " + freq[i] + " times.");
            }
        }
    }
}
