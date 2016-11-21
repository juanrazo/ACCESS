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
        System.out.printf("**** Testing Switch statements **** : ");
        switch(role){
            case PI:
                System.out.printf("Permissions: %s\n",Permissions.OWNER.toString());
                return Permissions.OWNER;
            case CO_PI:
                System.out.printf("Permissions: %s\n",Permissions.MANAGE_PROJ.toString());
                return Permissions.MANAGE_PROJ;
            case PA:
                System.out.printf("Permissions: %s\n",Permissions.MANAGE_PROJ.toString());
                return Permissions.MANAGE_PROJ;
            case IA:
                System.out.printf("Permissions: %s\n",Permissions.MANAGE_INIT.toString());
                return Permissions.MANAGE_INIT;
            case AE:
                System.out.printf("Permissions: %s\n",Permissions.EDIT.toString());
                return Permissions.EDIT;
            default:
                System.out.printf("Permissions: %s\n",Permissions.NONE.toString());
                return Permissions.NONE;
        }
    }
    public ParticipantRole retrieveParticipant(int part) {
        switch (part) {
            case 0:
                return ParticipantRole.ASST;
            case 1:
                return ParticipantRole.LEAD;
            case 2:
                return ParticipantRole.PART;
            default:
                return ParticipantRole.OTHER;
        }
    }

}
