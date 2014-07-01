package com.ufrgs.petcomp.database;

import java.util.HashMap;

/**
 * Created by João Paulo T Ruschel on 10/04/2014.
 *
 * The results of one instance of a test (one for each BTest for each BUser for each BProject)
 */

public class BTestResults {
    public HashMap<String, String> dataHash;
    private boolean completed;

    public BTestResults() {
        dataHash = new HashMap<String, String>();
        completed = false;
    }

    public boolean hasCompleted() {
        return completed;
    }

    public void complete(HashMap<String, String> results) {
        dataHash = results;
        completed = true;
    }
}
