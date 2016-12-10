package com.synergyteam.ddns.ResourceSubsystem;

/**
 * Created by juanrazo on 12/9/16.
 */
public abstract class Project extends Resource{
    protected String goal;
    protected String objective;

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }
}
