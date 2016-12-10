package com.synergyteam.ddns.DatabaseHandlerSubsystem;

/**d
 * Created by Paydro on 12/6/16.
 */
public class Tester {
    public static void main(String[] args) {
//
//        AccessHandler ach = new AccessHandler();
//        String[] testQuery = {"SELECT ? FROM ?", "*", "Project"};
//        String temp = "";
//        //ach.retrieveNonFundedProjectInfoByTitle(temp);
//        //ach.insertNonFundedProject(temp);
//        String [][] res = ach.retrieveNonFundedProjectInfoByDate(temp);
//        System.out.println("Results size: " + res.length);
//
//        for(int i = 0 ; i < res.length;i++){
//            for(int j = 0 ; j < res[i].length; j++){
//               // System.out.println("Res[" +i+ "]: "+res[i][j].length());
//                System.out.print(res[i][j]);
//            }
//            System.out.println();
//        }
        QueryHandler qh = new QueryHandler();
        String [] test = qh.retrieveNonFundedProjectInfoByTitle("test");
        String [][] otherTest = qh.retrieveNonFundedProjectInfoByMembership(1);
        System.out.println(test);
        for(int i = 0; i< otherTest.length;i++){
            for(int j = 0;j < otherTest[i].length;j++){
                System.out.println(otherTest[i][j]);
            }
        }
        String title = "Same old two step";
        String goal = "Teach old dogs how to do new tricks";
        String sDate = "20101012";
        String eDate = "20201111";
        String desc = "Teaching new tricks to old people on a daily basis to determine retention rates. ";


//        int insert = qh.createNonFundedProject(title, desc, sDate, eDate, goal);
//        System.out.println();
//        System.out.println("After inserting new proj return code: " + insert);
//        System.out.println();
//        String [] test = qh.retrieveNonFundedProjectInfoByTitle("old two");
//        System.out.println(test);
//        int insert = qh.insertNonFundedProjectMembership(9, 2, "Peter", "Estrada","pej@eclipse.net", "Owner");
//        int insert = qh.insertNonFundedProjectKeyword(9, "Work Hard");
//        int insert = qh.insertNonFundedProjectWebsite(9, "www.yahoo.com/index.html");
//        System.out.println("After inserting new proj return code: " + insert);

    }
}
