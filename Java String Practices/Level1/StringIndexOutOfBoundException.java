import java.util.*;
class StringOutOfBoundException {
    static void generateSIOOBE(String s){
        char c=s.charAt(s.length());
        System.out.println(c);
    }
    static void handleSIOOBE(String s){
        try{
            char c=s.charAt(s.length());
            System.out.println(c);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Handled: StringIndexOutOfBoundsException");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        try{
            generateSIOOBE(s);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Caught in main: StringIndexOutOfBoundsException");
        }
        handleSIOOBE(s);
    }
}