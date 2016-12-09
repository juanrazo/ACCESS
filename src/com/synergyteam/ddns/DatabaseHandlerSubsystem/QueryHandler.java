package com.synergyteam.ddns.DatabaseHandlerSubsystem;

import java.util.ArrayList;
import java.util.Date;

public class QueryHandler {

    /*
    This method is a public interface for inserting nonfunded projects into the ACCESS Database
     */
    public int insertNonFundedProject(String title, String desc, String startDate, String endDate, String goal) {
        InsertQueries isq = new InsertQueries();
        return new DatabaseHandlerManager().insertIntoAccessDB(isq.insertNonFundedProject(
                title, desc, startDate, endDate, goal));

    }
    /*
    This method is a public interface for insreting nonfunded project membership into the ACCESS Sdatabase.
    */
    public int insertNonFundedProjectMembership(int pid, int uid, String fName, String lName, String email,
                                                String role){
        InsertQueries isq = new InsertQueries();
        return new DatabaseHandlerManager().insertIntoAccessDB(isq.insertNonFundedProjectMembership(
                pid, uid, fName, lName, email, role ));
    }

    /*
     * PRE:
     * @requires title != null
     *
     * POST:
     *  @ensures \result == (result.exist() && !SQLException)? { int 'PID', tinyint 'fundedProject' == 0 | 1, 'Title',
     *  'Description', 'startDate'. 'endDate', 'Goal' } : { "Result not found", "-1" };
     */
    public String[] retrieveNonFundedProjectInfoByTitle(String title){
        return new DatabaseHandlerManager().retrieveSingleNonFundedProjectInfo(
                new SelectQueries().selectNonFundedProjectInfoByTitle(title) );
    }

    /*
     * PRE:
     * @requires startDate != null && startDate.valid && startDate.format == 'YYYYMMDD'
     *
     * POST:
     *  @ensures \result[1...n] == (result.exist() && !SQLException)? { int 'PID', tinyint 'fundedProject' == 0 | 1, 'Title',
     *  'Description', 'startDate'. 'endDate', 'Goal' } : { "Result not found", "-1" };
     */
    public String[][] retrieveNonFundedProjectInfoByStartDate(String date){
        return new DatabaseHandlerManager().retrieveMultNonFundedProjectInfo(
                new SelectQueries().selectNonFundedProjectInfoByStartDate(date) );
    }

    /*
     * PRE:
     * @requires endDate != null && endDate.valid && endDate.format == 'YYYYMMDD'
     *
     * POST:
     *  @ensures \result[1...n] == (result.exist() && !SQLException)? { int 'PID', tinyint 'fundedProject' == 0 | 1, 'Title',
     *  'Description', 'startDate'. 'endDate', 'Goal' } : { "Result not found", "-1" };
     */
    public String[][] retrieveNonFundedProjectInfoByEndDate(String date){
        return new DatabaseHandlerManager().retrieveMultNonFundedProjectInfo(
                new SelectQueries().selectNonFundedProjectInfoByEndDate(date) );
    }

    /*
     * PRE:
     * @requires startDate != null && startDate.valid && startDate.format == 'YYYYMMDD'
     * endDate != null && endDate.valid && endDate.format == 'YYYYMMDD'
     * startDate < endDate
     *
     * POST:
     *  @ensures \result[1...n] == (result.exist() && !SQLException)? { int 'PID', tinyint 'fundedProject' == 0 | 1, 'Title',
     *  'Description', 'startDate'. 'endDate', 'Goal' } : { "Result not found", "-1" };
     */
    public String[][] retrieveNonFundedProjectInfoByDateRange(String startDate, String endDate){
        return new DatabaseHandlerManager().retrieveMultNonFundedProjectInfo(
                new SelectQueries().selectNonFundedProjectInfoByDateRange(startDate,endDate) );
    }
    /*
     * PRE:
     * @requires uid != NULL, uid.exists() in SSO
     *
     * POST:
     *  @ensures \result[1...n] == (result.exist() && !SQLException)? { int 'PID', tinyint 'fundedProject' == 0 | 1, 'Title',
     *  'Description', 'startDate'. 'endDate', 'Goal' } : { "Result not found", "-1" };
     */
    public String[][] retrieveNonFundedProjectInfoByMembership(int uid){
        return new DatabaseHandlerManager().retrieveMultNonFundedProjectInfo(
                new SelectQueries().selectNonFundedProjectInfoByMembership(uid) );
    }

    /* Default Constructor */
    public QueryHandler() {  }



    /* This method accepts a pid (project id) that is contained in the set of Project IDs stored in the ACCESS
    database. This method then accepts a userID and role which are then associated to the pid. The method returns 0
    if the insert was unsuccessful, or 1 if the insert was successful. */
    public int insertProjectMembership(int pid, int uid, String role) {
        return 0;
    }

    /* This method accepts a pid (project id) that is contained in the set of Project IDs stored in the ACCESS
    database. This method then accepts a keyword which is then associated to the pid. The method returns 0 if the
    insert was unsuccessful, or 1 if the insert was successful. */
    public int insertProjectKeyword(int pid, String keyword) {
        return 0;
    }

    /* This method accepts a pid (project id) that is contained in the set of Project IDs stored in the ACCESS
    database. This method then accepts an iid (initiative id) that is contained in the set of Initiative IDs stored in
    the ACCESS database. The iid is then associated to the pid. The method returns 0 if the insert was unsuccessful,
    or 1 if the insert was successful. */
    public int insertProjectAssociatedInitiative(int pid, int iid) {
        return 0;
    }

    /* This method accepts a pid (project id) that is contained in the set of Project IDs stored in the ACCESS
    database. This method then accepts an objective which is then associated to the pid. The method returns 0 if the
    insert was unsuccessful, or 1 if the insert was successful. */
    public int insertProjectObjective(int pid, String objective) {
        return 0;
    }

    /* This method accepts a pid (project id) that is contained in the set of Project IDs stored in the ACCESS
    database. This method then accepts a valid userID which are then associated as the PI to the pid. The method
    returns 0 if the insert was unsuccessful, or 1 if the insert was successful. */
    public int insertFundedProjectPI(int pid, int pi_uid) {
        return 0;
    }

    /* This method accepts a pid (project id) that is contained in the set of Project IDs stored in the ACCESS
    database. This method then accepts a userID which are then associated as the CoPI to the pid. The method returns 0
    if the insert was unsuccessful, or 1 if the insert was successful. */
    public int insertFundedProjectCoPI(int pid, int copi_uid) {
        return 0;
    }

    /* This method accepts a pid (project id) that is contained in the set of Project IDs stored in the ACCESS
    database. This method then accepts a website URL which is then associated to the pid. The method returns 0 if
    the insert was unsuccessful, or 1 if the insert was successful. */
    public int insertProjectWebsite(int pid, String url) {
        return 0;
    }

    /* This method accepts a pid (project id) that is contained in the set of Project IDs stored in the ACCESS
    database. This method then accepts a document URL which is then associated to the pid. The method returns 0 if
    the insert was unsuccessful, or 1 if the insert was successful. */
    public int insertProjectDocumentAttachment(int pid, String document_url) {
        return 0;
    }

    /*
    This method accepts an integer for the first argument. The integer must be positive, cannot exist in the set of
    Initiative IDs already stored in the ACCESS database. If the set of Initiative IDs is empty, then the iid should
    equal 1, else it should equal the old value of iid + 1. The seconded argument is a string for the initiative
    title. The constraint on the title is it must be a valid initiative title. The third argument is a string for
    the initiative category. The constraint on the category is it must exist within the predefined set of Categories.
    The fourth argument is a string for the initiative description. The constraint on the description is it must be
    a valid description of the initiative. The fifth argument is a Date for the start date. The sixth argument is a
    Date for the end date. The start date must be a date before the end date. The last argument is a string for the
    initiative purpose. The constraint for the purpose is it must be a valid initiative purpose statement. The method
    returns 0 if the insert was unsuccessful, or 1 if the insert was successful.
    //@ PRE:
    //@requires (\foral iid | (iid !(\exists {Initiative_ID}))) &&
    //@ (iid == (!{Initiative_ID})? 1 : (iid ==
    //@ \old iid + 1));
    //@ title == valid initiative.name;
    //@ category \exist {Category};
    //@ description == valid initiative.description;
    //@ startDate < endDate;
    //@ purpose == valid initiative.purpose;
    //@ POST:
    //@ensures \result (!SQLException && executeUpdate== 1)? 1 : 0);
    */
    public int insertInitiative(int iid, String title, String category, String description, Date startDate,
                                Date endDate, String purpose) {
        return 0;
    }

    /* This method accepts a iid (initiative id) that is contained in the set of Initiative IDs stored in the ACCESS
    database. This method then accepts a valid userID and role which are then associated to the iid. The method
    returns 0 if the insert was unsuccessful, or 1 if the insert was successful. */
    public int insertInitiativeMembership(int iid, int uid, String role) {
        return 0;
    }

    /* This method accepts a iid (initiative id) that is contained in the set of Initiative IDs stored in the ACCESS
    database. This method then accepts a keyword which is then associated to the iid. The method returns 0 if the
    insert was unsuccessful, or 1 if the insert was successful. */
    public int insertInitiativeKeword(int iid, String keyword) {
        return 0;
    }

    /* This method accepts a iid (initiative id) that is contained in the set of Initiative IDs stored in the ACCESS
    database. This method then accepts an aid (activity id) that is contained in the set of Activity IDs stored in the
    ACCESS database. The aid is then associated to the iid. The method returns 0 if the insert was unsuccessful, or 1
    if the insert was successful. */
    public int insertInitiativeAssociatedActivity(int iid, int aid) {
        return 0;
    }

    /* This method accepts a iid (initiative id) that is contained in the set of Initiative IDs stored in the ACCESS
    database. This method then accepts a website URL which is then associated to the iid. The method returns 0 if the
    insert was unsuccessful, or 1 if the insert was successful. */
    public int insertInitiativeWebsite(int iid, String url) {
        return 0;
    }

    /* This method accepts a iid (initiative id) that is contained in the set of Initiative IDs stored in the ACCESS
    database. This method then accepts a document URL which is then associated to the iid. The method returns 0 if
    the insert was unsuccessful, or 1 if the insert was successful. */
    public int insertInitiativeDocumentAttachment(int iid, String document_url) {
        return 0;
    }

    /*
    This method accepts an integer for the first argument. The integer must be positive, cannot exist in the set of
    Activity IDs already stored in the ACCESS database. If the set of Activity IDs is empty, then the aid should
    equal 1, else it should equal the old value of aid + 1. The seconded argument is a string for the activity title.
    The constraint on the title is it must be a valid activity title. The third argument is a string is a string for
    the activity description. The constraint on the description is it must be a valid description of the activity. The
    fourth argument is a Date for the start date. The fifth argument is a Date for the end date. The start date must be
    a date before the end date. The sixth argument for the activity classification. The constraint on the
    classification is it must exist within the predefined set of classifications. The last argument is a string for
    the activity semester. The constraint for the semester is it must be a valid semester (past or current only). The
    method returns 0 if the insert was unsuccessful, or 1 if the insert was successful.
    //@ PRE:
    //@requires (\forall aid | (aid !(\exists {Activity_ID}))) &&
    //@ (aid == (!{Activty_ID})? 1 : (aid ==
    //@ \old aid + 1));
    //@ title == valid activity.name;
    //@ description == valid initiative.description;
    //@ startDate < endDate;
    //@ classification == valid activity.classification;
    //@ semester <= current semester;
    //@ POST:
    //@ensures \result (!SQLException && executeUpdate== 1)? 1 : 0);
    */
    public int insertActivity(int aid, String title, String description, Date startDate, Date endDate,
                              String classification, String semester) {
        return 0;
    }

    /* This method accepts an aid (activity id) that is contained in the set of Activity IDs stored in the ACCESS
    database. This method then accepts a keyword which is then associated to the aid. The method returns 0 if the
    insert was unsuccessful, or 1 if the insert was successful. */
    public int insertActivityKeyword(int aid, String keyword) {
        return 0;
    }






}
