import java.util.*;
class NumberFormatException {
    static void generateNFE(String text){
        int x=Integer.parseInt(text);
        System.out.println(x);
    }
    static void handleNFE(String text){
        try{
            int x=Integer.parseInt(text);
            System.out.println(x);
        }catch(NumberFormatException e){
            System.out.println("Handled: NumberFormatException");
        }catch(RuntimeException e){
            System.out.println("Handled: "+e.getClass().getSimpleName());
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        try{
            generateNFE(text);
        }catch(NumberFormatException e){
            System.out.println("Caught in main: NumberFormatException");
        }
        handleNFE(text);
    }
}