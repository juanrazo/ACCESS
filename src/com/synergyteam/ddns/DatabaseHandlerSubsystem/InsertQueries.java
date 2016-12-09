package com.synergyteam.ddns.DatabaseHandlerSubsystem;

import java.util.Date;

/**
 * Created by Paydro on 12/2/16.
 */
public class InsertQueries extends Queries{

    protected String insertNonFundedProject( String title, String desc, String startDate, String endDate, String goal){
        return "INSERT INTO `Project`(`FundedProject`, `Title`, `Description`, `StartDate`, " +
                "`EndDate`, `Goal`) VALUES (0 , '" + title + "', '" + desc + "', '" + startDate +
                "', '" + endDate + "', '" + goal + "')";
    }

}
