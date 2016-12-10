package com.synergyteam.ddns.ResourceSubsystem;


import java.util.Date;
import java.util.LinkedList;

/**
 * Created by juanrazo on 12/9/16.
 */
public class NonFunded extends Project{
    protected LinkedList<String> keyword[];
    protected String documentType;
    protected String website;
    protected String membership;


    public NonFunded(String title, String desctiption, String goal, String objective){
        this.title = title;
//        this.startDate = startDate;
//        this.endDate = endDate;
        this.description = desctiption;
        this.goal = goal;
        this.objective = objective;
    }

    public void setKeyword(LinkedList<String>[] keyword) {
        this.keyword = keyword;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }


    public LinkedList<String>[] getKeyword() {
        return keyword;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getWebsite() {
        return website;
    }

    public String getMembership() {
        return membership;
    }

    @Override
    public String toString() {
        return "NonFunded{" +
                "resourceID=" + resourceID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", documentType='" + documentType + '\'' +
                ", goal='" + goal + '\'' +
                ", objective='" + objective + '\'' +
                ", website='" + website + '\'' +
                ", membership='" + membership + '\'' +
                '}';
    }

}