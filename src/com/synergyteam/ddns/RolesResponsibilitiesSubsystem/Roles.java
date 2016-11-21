package com.synergyteam.ddns.RolesResponsibilitiesSubsystem;

/**
 * Created by Paydro on 11/15/16.
 */
public enum Roles {

    PI{
        public String toString(){
            return "Project Initiator";
        }
    },

    CO_PI{
        public String toString() {
            return "Co-Project Initiator";
        }
    },

    PA{
        public String toString() {
            return "Project Administrator";
        }
    },

    IA{
        public String toString() {
            return "Initiative Administrator";
        }
    },

    AE {
        public String toString() {
            return "Activity Editor";
        }
    }
}
