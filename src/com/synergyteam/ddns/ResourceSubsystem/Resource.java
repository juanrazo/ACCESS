package com.synergyteam.ddns.ResourceSubsystem;

import java.util.Date;

/**
 * Created by juanrazo on 12/8/16.
 */
public abstract class Resource {
    protected int resourceID;
    protected String  title;
    protected String description;
    protected Date startDate;
    protected Date endDate;

    public void setResourceID(int id){
        this.resourceID = id;
    }

    public int getResourceID(){
        return resourceID;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }

    public String getTitle(){
        return this.title;
    }

    public String getDescription(){
        return this.description;
    }

    public Date getStartDate(){
        return this.startDate;
    }

    public Date getEndDate(){
        return this.endDate;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resourceID=" + resourceID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

}
