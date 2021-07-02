package org.apache.java.samples.proxy.staticproxy;

public class Owner implements Seller{
    public void buy() {
        System.out.println("concrete seller");
    }
}
