import java.util.*;
class texttolower {
    static String toLowerManual(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z') sb.append((char)(ch+32));
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
        String manual=toLowerManual(text);
        String built=text.toLowerCase();
        System.out.println("Manual: "+manual);
        System.out.println("BuiltIn: "+built);
        System.out.println("Match: "+equalsByChar(manual,built));
    }
}