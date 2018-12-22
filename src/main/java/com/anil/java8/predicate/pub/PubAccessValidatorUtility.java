package com.anil.java8.predicate.pub;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PubAccessValidatorUtility {
    public static SoftwareEngineer[] populateData() {

        SoftwareEngineer[] se = {new SoftwareEngineer("Durga",60,false),
        new SoftwareEngineer("Sunil",25,true),
        new SoftwareEngineer("Sayan",26,true),
        new SoftwareEngineer("Subbu",28,false),
        new SoftwareEngineer("Ravi",19,true)};
        return se;
    }

    public static List<SoftwareEngineer> validate(SoftwareEngineer[] eng) {

        List<SoftwareEngineer> list = new ArrayList<>();

        for(SoftwareEngineer se : eng){
            if(checkSeValidity(se))
                list.add(se);

        }
        return list;
    }

    public static boolean checkSeValidity(SoftwareEngineer softwareEngineer){

        Predicate<SoftwareEngineer> predicate = softwareEngineer1 -> softwareEngineer1.getiAge()>=18
                && softwareEngineer1.isbIsHavingGF();
        return predicate.test(softwareEngineer);

    }
}
