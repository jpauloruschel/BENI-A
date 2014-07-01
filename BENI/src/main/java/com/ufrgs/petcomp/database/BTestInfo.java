package com.ufrgs.petcomp.database;

import java.util.ArrayList;

/**
 * Created by João Paulo T Ruschel on 10/04/2014.
 *
 * Information about a test - name, comments and instructions.
 * It's the same for all BProjects on the app.
 * Initialized at the start of the app.
 */

public class BTestInfo {
    String name;
    String comments;
    ArrayList instructions;

    public BTestInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
