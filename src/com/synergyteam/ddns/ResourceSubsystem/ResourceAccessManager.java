package com.synergyteam.ddns.ResourceSubsystem;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java .util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import com.synergyteam.ddns.DatabaseHandlerSubsystem.QueryHandler;
/**
 * Created by Paydro on 12/2/16.
 * Modified by JuanR
 */
public class ResourceAccessManager {

    private LinkedList<NonFunded> nonFundedList = new LinkedList<NonFunded>();
    private LinkedList<Funded> funded = new LinkedList<Funded>();
    private LinkedList<Initiative> initiativeList = new LinkedList<Initiative>();
    private LinkedList<Activity> activityList = new LinkedList<Activity>();

    private String[][] resource;














    private QueryHandler queryHandler = new QueryHandler();


    public ResourceAccessManager(int userID){
        resource = queryHandler.retrieveNonFundedProjectInfoByMembership(userID);
        //createNonFundedList();
    }








    public ResourceAccessManager(){
    }

    public String[] viewProject(String title){
        return queryHandler.retrieveNonFundedProjectInfoByTitle(title);
    }

    private void createNonFundedList(){

        for(int i =0; i < resource.length;i++){
            for(int j=0; j < resource[i].length; j++){
                nonFundedList.add(new NonFunded(resource[i][j], resource[i][j], resource[i][j], resource[i][j]) );
            }
        }
    }

    public String[][] viewNonFundedProjectsByMemberID(int memberID){
        return queryHandler.retrieveNonFundedProjectInfoByMembership(memberID);
    }

    public String[][] userRole(int memberID){
        return queryHandler.retrieveMultProjectMembershipInfo(memberID);
    }

    public String[][] getResource(){
        return resource;
    }


    public LinkedList<NonFunded> getNonFundedList(){
        return nonFundedList;
    }

}

