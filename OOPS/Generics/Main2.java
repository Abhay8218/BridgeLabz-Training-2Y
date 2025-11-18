package Generics;

public class Main2 {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Amol", 20);
        System.out.println("Student Pair: " + student);
        System.out.println("Name: " + student.getFirst() + ", Age: " + student.getSecond());
    }
}

