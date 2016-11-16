package com.synergyteam.ddns.RolesResponsibilitiesSubsystem;

import java.util.HashMap;

/**
 * Created by Paydro on 11/15/16.
 */
public class Test {
    public static void main(String[] arg){
        RoleAccessManager rrm = new RoleAccessManager();
        System.out.println(rrm.associatePermissions(Roles.PA));
        HashMap testMap = new HashMap();
        testMap.put("Steve", rrm.associatePermissions(Roles.AE));
        testMap.put("Gator", rrm.associatePermissions(Roles.PI));
        testMap.put("Juan", rrm.associatePermissions(Roles.PA));
        System.out.println("Steves's Permissions: " + testMap.get("Steve").toString());
        System.out.println("Gator's Permissions: " + testMap.get("Gator").toString());
        System.out.println("Juans's Permissions: " + testMap.get("Juan").toString());
    }
}
