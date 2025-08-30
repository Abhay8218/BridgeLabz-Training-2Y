import java.util.*;
class ArrayIndexOutOfBoundsException {
    static void generateAIOOBE(String[] names){
        String x=names[names.length];
        System.out.println(x);
    }
    static void handleAIOOBE(String[] names){
        try{
            String x=names[names.length];
            System.out.println(x);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Handled: ArrayIndexOutOfBoundsException");
        }catch(RuntimeException e){
            System.out.println("Handled: "+e.getClass().getSimpleName());
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] names=new String[n];
        for(int i=0;i<n;i++) names[i]=sc.next();
        try{
            generateAIOOBE(names);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught in main: ArrayIndexOutOfBoundsException");
        }
        handleAIOOBE(names);
    }
}