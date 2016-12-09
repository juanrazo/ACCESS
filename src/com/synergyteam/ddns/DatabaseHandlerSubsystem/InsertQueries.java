package com.synergyteam.ddns.DatabaseHandlerSubsystem;

import java.util.Date;

/**
 * Created by Paydro on 12/2/16.
 */
public class InsertQueries extends Queries {

    protected String insertNonFundedProject(String title, String desc, String startDate, String endDate, String goal) {
        return "INSERT INTO `Project`(`FundedProject`, `Title`, `Description`, `StartDate`, " +
                "`EndDate`, `Goal`) VALUES (0 , '" + title + "', '" + desc + "', '" + startDate +
                "', '" + endDate + "', '" + goal + "')";
    }

    protected String insertNonFundedProjectMembership(int pid, int uid, String fName, String lName, String email,
                                                      String role) {
        return "INSERT INTO `NonFundedProjectMembership` (`PID`, `UID`, `FName`, `LName`, `Email`, `Role`) VALUES"+
                " ('" + pid + "', '" + uid + "', '" + fName + "', '" + lName + "', '" + email + "', '"+ role + "');";
    }

    protected String insertNonFundedProjectKeyword(int pid, String keyword){
        return "INSERT INTO `ProjectKeywordTable` (`PID`, `Keyword`) VALUES ('" + pid + "', '" + keyword + "');";
    }

    protected String insertNonFundedProjectWebsite(int pid, String website){
        return "INSERT INTO `ProjectKeywordTable` (`PID`, `Keyword`) VALUES ('" + pid + "', '" +  website + "');";
    }

}
