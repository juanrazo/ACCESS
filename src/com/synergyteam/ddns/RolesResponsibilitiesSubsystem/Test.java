package com.synergyteam.ddns.RolesResponsibilitiesSubsystem;

import java.util.HashMap;

/**
 * Created by Paydro on 11/15/16.
 */
public class Test {
    public static void main(String[] arg){
        RolesResponsibilitiesManager rrm = new RolesResponsibilitiesManager();
        System.out.println(rrm.associatePermissions(Roles.PA));
        HashMap testMap = new HashMap();
        testMap.put("Steve",rrm.associatePermissions(Roles.AE));
        System.out.println(testMap.get("Steve").toString());

    }
}
