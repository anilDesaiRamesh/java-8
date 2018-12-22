package com.anil.java8.consumer.consumerChaining;

public class Movie {

    String stName;
    Result result;

    public Movie(String stName, Result result) {
        this.stName = stName;
        this.result = result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "stName='" + stName + '\'' +
                ", result=" + result +
                '}';
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
