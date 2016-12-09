package com.synergyteam.ddns.DatabaseHandlerSubsystem;

/**
 * Created by Paydro on 12/2/16.
 */
public class InsertQueries extends Queries{
    private static final String insertNonFundedQuery = "INSERT INTO TABLE Project ";

    public static final String getinsertNonFundedQuery(){

        return insertNonFundedQuery;
    }

}
