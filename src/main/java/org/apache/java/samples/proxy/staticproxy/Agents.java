package org.apache.java.samples.proxy.staticproxy;

public class Agents implements Seller{

    private Owner owner;

    public Agents(){
        owner = new Owner();
    }

    public void buy() {
        System.out.println("正在代理Seller的buy方法");
        owner.buy();
        System.out.println("代理完成");
    }
}
