package Wrapper;

public class nwsd // GameScoreboard.java
public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {10, null, 25, 30, null, 5}; // null => not played
        int notPlayed = 0;
        int total = 0;
        for (Integer s : scores) {
            if (s == null) notPlayed++;
            else total += s; // auto-unboxing
        }
        System.out.println("Players not played: " + notPlayed);
        System.out.println("Total of valid scores: " + total);
    }
}
{
}
