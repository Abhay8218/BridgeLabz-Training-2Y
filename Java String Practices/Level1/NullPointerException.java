import java.util.*;
class NullPointerException {
    static void generateNPE(){
        String text=null;
        int x=text.length();
        System.out.println(x);
    }
    static void handleNPE(){
        String text=null;
        try{
            int x=text.length();
            System.out.println(x);
        }catch(NullPointerException e){
            System.out.println("Handled: NullPointerException");
        }
    }
    public static void main(String[] args){
        try{
            generateNPE();
        }catch(NullPointerException e){
            System.out.println("Caught in main: NullPointerException");
        }
        handleNPE();
    }
}