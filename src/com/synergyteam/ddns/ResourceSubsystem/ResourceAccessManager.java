package com.synergyteam.ddns.ResourceSubsystem;
import java.util.Calendar;
import java .util.Date;
import com.synergyteam.ddns.DatabaseHandlerSubsystem.QueryHandler;
/**
 * Created by Paydro on 12/2/16.
 */
public class ResourceAccessManager {

    public int createNonFundedProject(String title, String desc, Date sDate,
                                      Date eDate, String goal, String objective,
                                      String key, String website){
        int test = 0;
        QueryHandler queryHandler = new QueryHandler();

        test = (queryHandler.insertProject( false, title, desc, sDate, eDate
                , goal, objective, key, website ) > 0)? 1:0;

        return test;
    }

}

