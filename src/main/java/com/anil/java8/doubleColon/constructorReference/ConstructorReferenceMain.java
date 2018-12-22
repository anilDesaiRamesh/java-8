package com.anil.java8.doubleColon.constructorReference;

public class ConstructorReferenceMain {

    public static void main(String[] args){

        SampleFactory sampleFactory = Sample::new;
        Sample sample = sampleFactory.getSample(10);
        System.out.println(sample);

    }
}
