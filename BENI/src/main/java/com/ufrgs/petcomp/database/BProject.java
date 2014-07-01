package com.ufrgs.petcomp.database;

import java.util.ArrayList;

/**
 * Created by João Paulo T Ruschel on 10/04/2014.
 *
 * Details a BENI Project - all users, tests parameters and report generation.
 */

public class BProject {
    public final int NUMBER_OF_TESTS = 17;
    /**
     * Databases - each manages its own loading and saving */
    // Main User Database
    public UserDatabase userDatabase;
    // Main Default Test Info Database - information about the tests
    private final BTestInfoDatabase bTestInfoDatabase;

    public BProject(BTestInfoDatabase bTestInfoDatabase) {
        // BTest Info Database
        this.bTestInfoDatabase = bTestInfoDatabase;

        // Initialize users
        userDatabase = new UserDatabase();
        userDatabase.addData(new User("Jose", NUMBER_OF_TESTS));
        userDatabase.addData(new User("Joao", NUMBER_OF_TESTS));
        userDatabase.addData(new User("Maria", NUMBER_OF_TESTS));
        userDatabase.addData(new User("Ana", NUMBER_OF_TESTS));
        for (int i = 0; i < 64; i++)
            userDatabase.addData(new User("Pessoa " + i, NUMBER_OF_TESTS));

    }

    // Get the results for all tests about the person of ID id
    public ArrayList<BTestResults> getResultsForID(int id) {
        return userDatabase.getUser(id).getTestResults();
    }
}
