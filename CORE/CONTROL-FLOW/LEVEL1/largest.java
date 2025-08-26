// package CORE.CONTROL-FLOW.LEVEL1;
import java.util.Scanner;

public class largest {
    public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int var2 = sc.nextInt();
      int var3 = sc.nextInt();
      int var4 = sc.nextInt();
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      if (var2 > var3 && var2 > var4) {
         var5 = true;
      }

      if (var3 > var2 && var3 > var4) {
         var6 = true;
      }

      if (var4 > var3 && var2 < var4) {
         var7 = true;
      }

      System.out.print("Is first number the largest? " + var5 + "\nIs the second number the largest? " + var6 + "\nIs the third number the largest?" + var7);
   } 
}
