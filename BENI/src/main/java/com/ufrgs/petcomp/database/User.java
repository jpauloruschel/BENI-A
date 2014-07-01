package com.ufrgs.petcomp.database;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by João Paulo T Ruschel on 10/04/2014.
 */
public class User {
    public enum Handness {
        Left, Right
    }
    public enum Sex {
        Male, Female
    }
    // All information
    private String name, lastNames;
    private Date birth;
    private Handness handness;
    private String country;
    private Sex sex;
    private String obs;
    // List of test results
    private ArrayList<BTestResults> testResults;

    public User(String name, int testCount) {
        this.name = name;
        this.testResults = new ArrayList<BTestResults>();
        for (int i = 0; i < testCount; i++) {
            testResults.add(new BTestResults());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public Date getBirth() {
        return birth;
    }

    public ArrayList<BTestResults> getTestResults() {
        return testResults;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Handness getHandness() {
        return handness;
    }

    public void setHandness(Handness handness) {
        this.handness = handness;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
