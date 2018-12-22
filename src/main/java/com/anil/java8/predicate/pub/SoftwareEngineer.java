package com.anil.java8.predicate.pub;

public class SoftwareEngineer {

    private String stName;
    private int iAge;
    private boolean bIsHavingGF;

    public SoftwareEngineer(String stName, int iAge, boolean bIsHavingGF) {
        this.stName = stName;
        this.iAge = iAge;
        this.bIsHavingGF = bIsHavingGF;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getiAge() {
        return iAge;
    }

    public void setiAge(int iAge) {
        this.iAge = iAge;
    }

    public boolean isbIsHavingGF() {
        return bIsHavingGF;
    }

    public void setbIsHavingGF(boolean bIsHavingGF) {
        this.bIsHavingGF = bIsHavingGF;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "stName='" + stName + '\'' +
                '}';
    }
}
