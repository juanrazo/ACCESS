package com.synergyteam.ddns.ResourceSubsystem;

import java.util.LinkedList;

/**
 * Created by juanrazo on 12/9/16.
 */
public class Activity extends Resource {
    protected LinkedList<String> keywords;
    protected String classification;
    protected String semester;
    protected String courseName;
    protected String participant;


    public LinkedList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(LinkedList<String> keywords) {
        this.keywords = keywords;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    @Override
    public String toString() {
        return "Activiity{" +
                "resourceID=" + resourceID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", keywords=" + keywords +
                ", classification='" + classification + '\'' +
                ", semester='" + semester + '\'' +
                ", courseName='" + courseName + '\'' +
                ", participant='" + participant + '\'' +
                '}';
    }

}
