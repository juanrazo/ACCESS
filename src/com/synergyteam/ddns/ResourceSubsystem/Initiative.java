package com.synergyteam.ddns.ResourceSubsystem;

/**
 * Created by juanrazo on 12/9/16.
 */
public class Initiative extends Resource {
    protected String purpose;
    protected String website;
    protected String membership;

    public Initiative() {
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    @Override
    public String toString() {
        return "Initiative{" +
                "resourceID=" + resourceID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", purpose='" + purpose + '\'' +
                ", website='" + website + '\'' +
                ", membership='" + membership + '\'' +
                '}';
    }
}