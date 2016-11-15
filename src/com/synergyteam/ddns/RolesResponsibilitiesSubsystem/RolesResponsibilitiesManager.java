package com.synergyteam.ddns.RolesResponsibilitiesSubsystem;

/*
 *
 * Created by Paydro on 11/15/16.
 *
11/15/16 15:05
Hi Everyone,

The owner is the person who has the ability to update and delete a project.

Hope this helps.

Thanks.

Elsa.
 *
 */
public class RolesResponsibilitiesManager {

//    public RolesResponsibilitiesManager(){
//
//    }

    public Responsibilities associatePermissions(Roles role){
        switch(role) {
            case OWNER:
                return Responsibilities.OWN;
            case PA:
                return Responsibilities.MANAGE_PA;
            case IA:
                return Responsibilities.MANAGE_IA;
            case AE:
                return Responsibilities.EDIT;
            default:
                return Responsibilities.NONE;
        }
    }


}
