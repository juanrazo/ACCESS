package com.synergyteam.ddns.DatabaseHandlerSubsystem;

/**
 * Created by Paydro on 12/6/16.
 */
public class SelectQueries extends Queries {

    protected String selectNonFundedProjectInfoByTitle(String title){
        return "SELECT * FROM Project WHERE MATCH (Title, Description, Goal) AGAINST ('" + title + "' IN NATURAL LANGUAGE MODE);";

    }
}
