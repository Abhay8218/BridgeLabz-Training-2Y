import java.util.Arrays;

public class OTP {

    public static int generateOTP() {
        return (int)(100000 + Math.random() * 900000); // 6-digit
    }

    public static boolean checkUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i+1; j < arr.length; j++)
                if (arr[i] == arr[j]) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < otps.length; i++) otps[i] = generateOTP();

        System.out.println("OTPs: " + Arrays.toString(otps));
        System.out.println("All unique? " + checkUnique(otps));
    }
}
