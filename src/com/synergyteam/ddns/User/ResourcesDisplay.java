package com.synergyteam.ddns.User;

import com.synergyteam.ddns.ResourceSubsystem.ResourceAccessManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by juanrazo on 12/9/16.
 */
@WebServlet(name = "Servlet")
public class ResourcesDisplay extends HttpServlet {

    private ResourceAccessManager resourceAccessManager;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        resourceAccessManager = new ResourceAccessManager();

        String[][] ownedResources = resourceAccessManager.viewNonFundedProjectsByMemberID(1);
        String[][] role = resourceAccessManager.userRole(1);

        String middle = "";
        for(int i = 0; i < ownedResources.length; i++){
            middle += "<tr class=\"odd gradeX\">\n" +
                    "<td><a href=\"project.jsp\">"+ ownedResources[i][2]+"</a></td>\n" +
                    "<td>Project</td>\n" +
                    "<td>"+ role[i][2]+"</td>\n" +
                    "<td>"+ ownedResources[i][4]+"</td>\n" +
                    "</tr>\n";
        }

        response.setContentType("text/plain");
        String htmlBody;
        String top = "        <div id=\"page-wrapper\">\n" +
                "            <div class=\"row\">\n" +
                "                <div class=\"col-lg-12\">\n" +
                "                    <h1 class=\"page-header\">Resources</h1>\n" +
                "                </div>\n" +
                "                <!-- /.col-lg-12 -->\n" +
                "            </div>\n" +
                "            <!-- /.row -->\n" +
                "            <div class=\"row\">\n" +
                "                <div class=\"col-lg-12\">\n" +
                "                    <div class=\"panel panel-default\">\n" +
                "                        <div class=\"panel-heading\">\n" +
                "                            DataTables Advanced Tables\n" +
                "                        </div>\n" +
                "                        <!-- /.panel-heading -->\n" +
                "                        <div class=\"panel-body\">\n" +
                "                            <table width=\"100%\" class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n" +
                "                                <thead>\n" +
                "                                    <tr>\n" +
                "                                        <th>Title</th>\n" +
                "                                        <th>Type</th>\n" +
                "                                        <th>Role</th>\n" +
                "                                        <th>Last Modified Date</th>\n" +
                "                                    </tr>\n" +
                "                                </thead>\n" +
                "                                <tbody>\n";

//                "                                    <tr class=\"odd gradeX\">\n" +
//                "                                        <td><a href=\"project.jsp\">Project 1</a></td>\n" +
//                "                                        <td>Project</td>\n" +
//                "                                        <td>Owner</td>\n" +
//                "                                        <td>MM-DD-YYYY</td>\n" +
//                "                                    </tr>\n" +
//                "                                    <tr class=\"even gradeC\">\n" +
//                "                                        <td><a href=\"initiative.jsp\">Initiative Title 1</a></td>\n" +
//                "                                        <td>Initiative</td>\n" +
//                "                                        <td>IA</td>\n" +
//                "                                        <td>MM-DD-YYYY</td>\n" +

        String bottom =
                "                                    </tr>\n" +
                "                                </tbody>\n" +
                "                            </table>\n" +
                "                            <button href==\"project.jsp\" class=\"btn btn-outline btn-primary\">Add Project</button>\n" +
                "                            \n" +
                "                            <!-- /.table-responsive -->\n" +
                "                        </div>\n" +
                "                        <!-- /.panel-body -->\n" +
                "                    </div>\n" +
                "                    <!-- /.panel -->\n" +
                "                </div>\n" +
                "                <!-- /.col-lg-12 -->\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <!-- /#page-wrapper -->\n" +
                "    </div>\n" +
                "    <!-- /#wrapper -->";
        htmlBody = top + middle + bottom;
        HeadderFooter.printHeadder(response, htmlBody);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
