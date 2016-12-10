package com.synergyteam.ddns.ResourceSubsystem;

/**
 * Created by juanrazo on 12/9/16.
 */
public class Funded extends Project {
    protected String type;
    protected String website;

    public Funded(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Funded{" +
                "resourceID=" + resourceID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", goal='" + goal + '\'' +
                ", type='" + type + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
