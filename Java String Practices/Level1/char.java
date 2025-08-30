import java.util.*;
class char {
    static char[] toCharsManual(String s){
        char[] a=new char[s.length()];
        for(int i=0;i<s.length();i++) a[i]=s.charAt(i);
        return a;
    }
    static boolean arraysEqual(char[] a,char[] b){
        if(a==null || b==null) return a==b;
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(a[i]!=b[i]) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        char[] manual=toCharsManual(text);
        char[] built=text.toCharArray();
        System.out.println("Match: "+arraysEqual(manual,built));
    }
}