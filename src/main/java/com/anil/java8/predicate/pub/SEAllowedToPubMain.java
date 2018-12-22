package com.anil.java8.predicate.pub;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SEAllowedToPubMain {

    public static void main(String[] args){

        SoftwareEngineer[] eng = PubAccessValidatorUtility.populateData();

        List<SoftwareEngineer> validate = PubAccessValidatorUtility.validate(eng);

        System.out.println("List of software engineers allowed to Pub");
        Comparator<SoftwareEngineer> comparator = (se1,se2) -> se1.getiAge()>se2.getiAge() ? -1 : se1.getiAge() < se2.getiAge() ? 1 : 0;
        Collections.sort(validate,comparator);
        System.out.println(validate);


    }
}
