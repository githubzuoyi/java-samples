package org.apache.java.samples.proxy.dynamic;

public class Owner implements Seller {
    public void buy() {
        System.out.println("concrete seller");
    }
}
