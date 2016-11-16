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
public class RoleAccessManager {

    public Permissions associatePermissions(Roles role){
        switch(role) {
            case PI:
                return Permissions.OWNER;
            case CO_PI:
                return Permissions.MANAGE_PROJ;
            case PA:
                return Permissions.MANAGE_PROJ;
            case IA:
                return Permissions.MANAGE_INIT;
            case AE:
                return Permissions.EDIT;
            default:
                return Permissions.NONE;
        }
    }


}
