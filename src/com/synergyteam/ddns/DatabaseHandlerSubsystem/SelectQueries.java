package com.synergyteam.ddns.DatabaseHandlerSubsystem;

/**
 * Created by Paydro on 12/6/16.
 */
public class SelectQueries extends Queries {

    protected String selectNonFundedProjectInfoByTitle(String title) {
        return "SELECT * FROM Project WHERE MATCH (Title, Description, Goal) AGAINST ('" + title +
                "' IN NATURAL LANGUAGE MODE);";
    }

    protected String selectNonFundedProjectInfoByStartDate(String startdate) {
        return "SELECT * FROM Project WHERE StartDate = '" + startdate + "'";
    }

    protected String selectNonFundedProjectInfoByEndDate(String enddate) {
        return "SELECT * FROM Project WHERE EndDate = '" + enddate + "'";
    }

    protected String selectNonFundedProjectInfoByDateRange(String startDate, String endDate) {
        return "Select * FROM Project WHERE StartDate = '" + startDate + "' AND EndDate = '" +
                endDate + "'";
    }

    protected String selectNonFundedProjectInfoByMembership(int uid) {
        return "SELECT a.PID, a.FundedProject, a.Title, a.Description, a.StartDate, a.EndDate, " +
                "a.Goal FROM Project a, NonFundedProjectMembership b WHERE a.PID = b.PID AND " +
                "b.UID =" + uid +";";

    }
}
