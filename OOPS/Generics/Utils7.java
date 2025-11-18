package Generics;

import java.util.List;

public class Utils {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) {
            dest.add(n); // safe because dest accepts Number or supertypes
        }
    }
}
