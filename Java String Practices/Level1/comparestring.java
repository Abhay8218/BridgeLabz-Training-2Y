import java.util.*;

class comparestring {
    static boolean equalsByChar(String a, String b){
        if(a==null || b==null) return a==b;
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean manual=equalsByChar(s1,s2);
        boolean builtin=s1.equals(s2);
        System.out.println("Manual: "+manual);
        System.out.println("BuiltIn: "+builtin);
        System.out.println("SameResult: "+(manual==builtin));
    }
}