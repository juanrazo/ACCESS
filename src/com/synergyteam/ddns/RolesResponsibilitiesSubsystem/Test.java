package com.synergyteam.ddns.RolesResponsibilitiesSubsystem;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Paydro on 11/15/16.
 */
public class Test {
    public static void main(String[] arg){
        /* create RoleAccessManager object for testing */
        RoleAccessManager rrm = new RoleAccessManager();

        /* Create HashMap to store names with permissions can change to id later*/
        HashMap <String, Permissions> testMap = new <String, Permissions> HashMap();

        /* Inserting bogus values with roles */
        testMap.put("Steve", rrm.associatePermissions(Roles.AE));
        testMap.put("Gator", rrm.associatePermissions(Roles.PI));
        System.out.printf("Gator role: %s\n", Roles.PI.toString());
        testMap.put("Juan", rrm.associatePermissions(Roles.PA));

        System.out.println("*** Permissions within the ACCESS system ****");
        System.out.println();
         /* Iterate through permissions to see values */
        for(Permissions p : Permissions.values())
            System.out.printf("Permissions: %s %d \n", p.toString(), p.ordinal() );


        System.out.println("\n*** Roles within the ACCESS system ****");
        System.out.println();
        /* Iterate through roles to see values */
        for(Roles r : Roles.values())
            System.out.printf("Roles: %s %d \n", r.toString(), r.ordinal() );

        System.out.println("\n*** Insertions within the HashMap system ****");
        System.out.println();
        /* Iterate through Hashmap to see insertions */
        for(String name: testMap.keySet()){
            String key = name.toString();
            Permissions p = testMap.get(name);
            System.out.println(name +  " permissions: " + p);
        }
    }
}
