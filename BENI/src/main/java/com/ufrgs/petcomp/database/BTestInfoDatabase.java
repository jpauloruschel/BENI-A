package com.ufrgs.petcomp.database;

import java.util.ArrayList;

/**
 * Created by João Paulo T Ruschel on 10/04/2014.
 *
 * Collection of all BTests information.
 * Created at the start of the app.
 * Referenced on all BProjects.
 */

public class BTestInfoDatabase {
    private ArrayList dataList;

    public BTestInfoDatabase() {
        dataList = new ArrayList<BTestInfo>();
    }

    public void addData(BTestInfo testInformation) {
        dataList.add(testInformation);
    }

    public ArrayList getDataList() {
        return dataList;
    }
}
