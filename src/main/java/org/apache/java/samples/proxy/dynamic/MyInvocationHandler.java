package org.apache.java.samples.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Seller owner;

    public MyInvocationHandler(Seller owner) {
        this.owner = owner;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理前");
        owner.buy();
        method.invoke(owner,args);
        System.out.println("代理后");
        return null;
    }
}
