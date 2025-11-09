class NestedTryCatch {
    void methodB() {
        try {
            Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println("Handled Number Format Exception in B");
        }

        String s = null;
        System.out.println(s.length());
    }

    void methodA() {
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Exception propagated to A: " + e);
        }
    }

    public static void main(String[] args) {
        new NestedTryCatch().methodA();
    }
}
