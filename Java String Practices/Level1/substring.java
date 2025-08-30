import java.util.*;
class substring {
    static String substringByChar(String s,int start,int end){
        if(start<0) start=0;
        if(end>s.length()) end=s.length();
        if(start>end) return "";
        StringBuilder sb=new StringBuilder();
        for(int i=start;i<end;i++) sb.append(s.charAt(i));
        return sb.toString();
    }
    static boolean equalsByChar(String a,String b){
        if(a==null || b==null) return a==b;
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        int start=sc.nextInt();
        int end=sc.nextInt();
        String subManual=substringByChar(text,start,end);
        String subBuilt="";
        try{ subBuilt=text.substring(start,end); }catch(RuntimeException e){ subBuilt=""; }
        System.out.println("ManualSub: "+subManual);
        System.out.println("BuiltInSub: "+subBuilt);
        System.out.println("Match: "+equalsByChar(subManual,subBuilt));
    }
}