import java.util.*;

class remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        String result = str.replace(Character.toString(ch), "");
        System.out.println("Modified String: " + result);
    }
}
