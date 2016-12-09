package com.synergyteam.ddns.ResourceSubsystem;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
/**
 * Created by Paydro on 12/2/16.
 */
public class Tester {
    public static void main(String[] args) { // driver

        ResourceAccessManager ram = new ResourceAccessManager();

        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyymmdd", Locale.ENGLISH);
        try {
            sDate = simpleDateFormat.parse("20161120");
            eDate = simpleDateFormat.parse("20181220");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int test = -1;

        test = ram.createNonFundedProject("Driver and stub testing",
                "Creating a false entry to determine the error handling of the system",
                sDate, eDate, "return 1 on successfull insert",
                "Finish by 2am", "test", "www.w3schools.com"); // expected result 1
        System.out.println("test = [" + test + "]");
        test = -1;

        test = ram.createNonFundedProject("",
                "Creating a false entry to determine the error handling of the system",
                sDate, eDate, "return 1 on successfull insert",
                "Finish by 2am", "test", "www.w3schools.com"); // expected result 0
        System.out.println("test = [" + test + "]");
        test = -1;

        test = ram.createNonFundedProject("DRIVER TESTING",
                "Creating a false entry to determine the error handling of the system",
                eDate, sDate,"return 1 on successfull insert",
                "Finish by 2am", "test", "www.w3schools.com"); // expected result 0
        System.out.println("test = [" + test + "]");
    }

    private static Date sDate;
    private static Date eDate;
}
