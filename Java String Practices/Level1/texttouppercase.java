import java.util.*;
class texttouppercase {
    static String toUpperManual(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z') sb.append((char)(ch-32));
            else sb.append(ch);
        }
        return sb.toString();
    }
    static boolean equalsByChar(String a,String b){
        if(a==null||b==null) return a==b;
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String manual=toUpperManual(text);
        String built=text.toUpperCase();
        System.out.println("Manual: "+manual);
        System.out.println("BuiltIn: "+built);
        System.out.println("Match: "+equalsByChar(manual,built));
    }
}
