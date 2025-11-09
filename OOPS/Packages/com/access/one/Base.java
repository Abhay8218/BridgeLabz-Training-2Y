package com.access.one;

public class Base {
    public void publicMethod() { System.out.println("publicMethod"); }
    protected void protectedMethod() { System.out.println("protectedMethod"); }
    void defaultMethod() { System.out.println("defaultMethod (package-private)"); }
    private void privateMethod() { System.out.println("privateMethod"); }

    // a method to call private from inside class
    public void callPrivate() { privateMethod(); }
}
