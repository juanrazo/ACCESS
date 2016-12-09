package com.synergyteam.ddns.DatabaseHandlerSubsystem;

import java.util.Date;

/**
 * Created by Paydro on 12/2/16.
 */
public class InsertQueries extends Queries{

    // this method returns an SQL query to insert a non-funded project into the database.
    protected String insertNonFundedProject( String title, String desc, String startDate, String endDate, String goal){
        return "INSERT INTO `Project`(`FundedProject`, `Title`, `Description`, `StartDate`, " +
                "`EndDate`, `Goal`) VALUES (0 , '" + title + "', '" + desc + "', '" + startDate +
                "', '" + endDate + "', '" + goal + "')";
    }

    //This method returns an SQL query to insert nonfundedprojectmembership into the database
    protected String insertNonFundedProjectMembership(int pid, int uid, String fName, String lName, String email,
                                                      String role ){
        return  "INSERT INTO `NonFundedProjectMembership`(`PID`, `UID`, `FName`, `LName`, `Email`, `Role`)  " +
                "(" + pid + ", "+ uid + ",'" + fName+ "','" + lName +"','" +email + "','"+ role +"');";
    }

}
