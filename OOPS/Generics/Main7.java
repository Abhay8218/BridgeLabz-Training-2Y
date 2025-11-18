package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> src = Arrays.asList(1, 2, 3);
        List<Number> dest = new ArrayList<>();
        Utils.copyList(dest, src);
        System.out.println("Dest after copy: " + dest);

        List<Object> destObj = new ArrayList<>();
        Utils.copyList(destObj, Arrays.asList(4.5, 6.7));
        System.out.println("DestObj after copy: " + destObj);
    }
}
