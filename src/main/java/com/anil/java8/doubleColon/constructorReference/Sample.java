package com.anil.java8.doubleColon.constructorReference;

public class Sample {

    private int iTemp;

    public Sample(int iTemp) {
        System.out.println("Sample class constructor invocation and object creation");
        this.iTemp= iTemp;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "iTemp=" + iTemp +
                '}';
    }
}
