package com.anil.java8.streams.streamOf;

import java.util.stream.Stream;

public class StreamOfMain {

    public static void main(String[] args){
        System.out.println("Stream of for Group of Numbers**********");
        Stream<Integer> stream = Stream.of(9,99,999,9999,99999);
        stream.forEach(System.out::println);
        System.out.println();
        System.out.println("Stream of for array*******************");
        Double[] d = {10.0,10.1,10.2,10.3};
        Stream<Double> doubleStream = Stream.of(d);
        doubleStream.forEach(System.out::println);
    }
}
