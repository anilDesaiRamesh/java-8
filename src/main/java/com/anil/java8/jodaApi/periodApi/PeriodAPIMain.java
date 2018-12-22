package com.anil.java8.jodaApi.periodApi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodAPIMain {

    public static void main(String[] args) {

        LocalDate dateOfBirth = LocalDate.of(1987, 4, 29);

        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        System.out.printf("My Current Age is %d Years %d Months %d Days ", period.getYears(),
                period.getMonths(), period.getDays());

        System.out.println();

        LocalDate sixtyYrsFromBirthDay = LocalDate.of(1987 + 60, 4, 29);
        Period periodForsixtyYrs = Period.between(currentDate, sixtyYrsFromBirthDay);
        int iTotalTimeAvailable = periodForsixtyYrs.getYears() * 365 + periodForsixtyYrs.getMonths() * 30 +
                periodForsixtyYrs.getDays();
        System.out.printf("Total time available to reach 60 years from today interns" +
                " of days %d", iTotalTimeAvailable);

    }
}
