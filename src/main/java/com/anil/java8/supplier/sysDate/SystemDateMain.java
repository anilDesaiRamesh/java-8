package com.anil.java8.supplier.sysDate;

import java.util.Date;
import java.util.function.Supplier;

public class SystemDateMain {

    public static void main(String[] args){

        Supplier<Date> supplier = () -> new Date();
        System.out.println(supplier.get());

    }
}
