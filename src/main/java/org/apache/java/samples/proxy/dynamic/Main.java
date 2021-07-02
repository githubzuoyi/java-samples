package org.apache.java.samples.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        Seller owner = new Owner();

        Seller seller = (Seller) Proxy.newProxyInstance(Seller.class.getClassLoader(), new Class[]{Seller.class},new MyInvocationHandler(owner));
        seller.buy();
    }
}
