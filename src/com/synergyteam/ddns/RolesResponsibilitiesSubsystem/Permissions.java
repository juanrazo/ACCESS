package com.synergyteam.ddns.RolesResponsibilitiesSubsystem;

/**
 * Created by Paydro on 11/15/16.
 */
public enum Permissions {
    OWNER{
        public String toString(){
            return "Project Owner";
        }
    },

    MANAGE_PROJ{
        public String toString(){
            return "Project Manager";
        }
    },

    MANAGE_INIT{
        public String toString(){
            return "Initiative Manager";
        }
    },

    EDIT{
        public String toString(){
            return "Editor";
        }
    },

    NONE{
        public String toString(){
            return "No Permissions";
        }
    }
}
