package com.synergyteam.ddns.DatabaseHandlerSubsystem;

/**
 * Created by Paydro on 12/6/16.
 */
public class SelectQueries extends Queries {

    // This method returns a string used to query a single project by title name or a part of the title name
    protected String selectNonFundedProjectInfoByTitle(String title) {
        return "SELECT * FROM Project WHERE MATCH (Title, Description, Goal) AGAINST ('" + title +
                "' IN NATURAL LANGUAGE MODE);";
    }

    //This method returns multiple projects if they have the same start date
    protected String selectNonFundedProjectInfoByStartDate(String startdate) {
        return "SELECT * FROM Project WHERE StartDate = '" + startdate + "'";
    }
    //this method returns multiple projects if they have the same end date
    protected String selectNonFundedProjectInfoByEndDate(String enddate) {
        return "SELECT * FROM Project WHERE EndDate = '" + enddate + "'";
    }
    //this method returns multiple projects if the start and end dates fall between a specific range
    protected String selectNonFundedProjectInfoByDateRange(String startDate, String endDate) {
        return "Select * FROM Project WHERE StartDate = '" + startDate + "' AND EndDate = '" +
                endDate + "'";
    }

    //this method returns multiple projects for a user id that is associated with the project.
    protected String selectNonFundedProjectInfoByMembership(int uid) {
        return "SELECT a.PID, a.FundedProject, a.Title, a.Description, a.StartDate, a.EndDate, " +
                "a.Goal FROM Project a, NonFundedProjectMembership b WHERE a.PID = b.PID AND " +
                "b.UID =" + uid +";";

    }
}
