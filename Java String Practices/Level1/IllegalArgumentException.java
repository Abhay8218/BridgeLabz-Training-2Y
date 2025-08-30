import java.util.*;
class IllegalArgumentException {
    static void generateIAE(String s,int start,int end){
        String r=s.substring(start,end);
        System.out.println(r);
    }
    static void handleIAE(String s,int start,int end){
        try{
            String r=s.substring(start,end);
            System.out.println(r);
        }catch(IllegalArgumentException e){
            System.out.println("Handled: IllegalArgumentException");
        }catch(RuntimeException e){
            System.out.println("Handled: "+e.getClass().getSimpleName());
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<=b){ int t=a; a=b; b=t; }
        try{
            generateIAE(s,a,b);
        }catch(RuntimeException e){
            System.out.println("Caught in main: "+e.getClass().getSimpleName());
        }
        handleIAE(s,a,b);
    }
}