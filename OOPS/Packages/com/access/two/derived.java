package com.access.two;

import com.access.one.Base;

public class Derived extends Base {
    public void testAccess() {
        System.out.println("In Derived (com.access.two) extending Base:");
        publicMethod();     // accessible
        protectedMethod();  // accessible because subclass (even if different package)
        // defaultMethod(); // not accessible - package-private and different package
        // privateMethod(); // not accessible - private
        // callPrivate is public; it can be called.
        callPrivate();      // allowed because it's public wrapper calling private inside Base
    }
}
