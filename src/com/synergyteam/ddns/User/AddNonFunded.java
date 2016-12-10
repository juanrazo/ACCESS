package com.synergyteam.ddns.User;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
/**
 * Created by juanrazo on 12/9/16.
 */
@WebServlet(name = "AddNonFunded")
public class AddNonFunded extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        response.setContentType("text/plain");

        String title= request.getParameter("projecttitle");
        String startdate = request.getParameter("startdate");
        String enddate = request.getParameter("enddate");
        String description = request.getParameter("description");

        out.println(title +" is the title");
        out.println(startdate + " is the startdate");
        out.println("Non-Funded Projects for user:");
        out.println("<jsp:include page=\"headder.jsp\"/>\n" +
                "<jsp:include page=\"navigation.jsp\" />");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        String htmlBody = "        <div id=\"page-wrapper\">\n" +
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
                "                                <tbody>\n" +
                "                                    <tr class=\"odd gradeX\">\n" +
                "                                        <td><a href=\"project.jsp\">Project 1</a></td>\n" +
                "                                        <td>Project</td>\n" +
                "                                        <td>Owner</td>\n" +
                "                                        <td>MM-DD-YYYY</td>\n" +
                "                                    </tr>\n" +
                "                                    <tr class=\"even gradeC\">\n" +
                "                                        <td><a href=\"initiative.jsp\">Initiative Title 1</a></td>\n" +
                "                                        <td>Initiative</td>\n" +
                "                                        <td>IA</td>\n" +
                "                                        <td>MM-DD-YYYY</td>\n" +
                "                                    </tr>\n" +
                "                                    <tr class=\"odd gradeX\">\n" +
                "                                        <td><a href=\"project.jsp\">Project title 2</a></td>\n" +
                "                                        <td>Project</td>\n" +
                "                                        <td>Owner</td>\n" +
                "                                        <td>MM-DD-YYYY</td>\n" +
                "                                    </tr>\n" +
                "                                    <tr class=\"odd grageC\">\n" +
                "                                        <td><a href=\"project.jsp\">Project title 3</a></td>\n" +
                "                                        <td>Project</td>\n" +
                "                                        <td>Owner</td>\n" +
                "                                        <td>MM-DD-YYYY</td>\n" +
                "                                    </tr>\n" +
                "                                    <tr class=\"even gradeC\">\n" +
                "                                        <td><a href=\"initiative.jsp\">Initiative Title 2</a></td>\n" +
                "                                        <td>Initiative</td>\n" +
                "                                        <td>IA</td>\n" +
                "                                        <td>MM-DD-YYYY</td>\n" +
                "                                    </tr>\n" +
                "                                    <tr class=\"odd gradeX\">\n" +
                "                                        <td><a href=\"#\">Project title 4</a></td>\n" +
                "                                        <td>Project</td>\n" +
                "                                        <td>Owner</td>\n" +
                "                                        <td>MM-DD-YYYY</td>\n" +
                "                                    </tr>\n" +
                "                                    <tr class=\"odd gradeX\">\n" +
                "                                        <td><a href=\"#\">Project title 5</a></td>\n" +
                "                                        <td>Project</td>\n" +
                "                                        <td>Owner</td>\n" +
                "                                        <td>MM-DD-YYYY</td>\n" +
                "                                    </tr>\n" +
                "                                    <tr class=\"even gradeC\">\n" +
                "                                        <td><a href=\"#\">Initiative Title 3</a></td>\n" +
                "                                        <td>Initiative</td>\n" +
                "                                        <td>IA</td>\n" +
                "                                        <td>MM-DD-YYYY</td>\n" +
                "                                    </tr>\n" +
                "                                    <tr class=\"odd gradeX\">\n" +
                "                                        <td><a href=\"#\">Project title 6</a></td>\n" +
                "                                        <td>Project</td>\n" +
                "                                        <td>Owner</td>\n" +
                "                                        <td>MM-DD-YYYY</td>\n" +
                "                                    </tr>\n" +
                "                                    <tr class=\"odd gradeX\">\n" +
                "                                        <td><a href=\"#\">Project title 7</a></td>\n" +
                "                                        <td>Project</td>\n" +
                "                                        <td>Owner</td>\n" +
                "                                        <td>MM-DD-YYYY</td>\n" +
                "                                    </tr>\n" +
                "                                    <tr class=\"even gradeC\">\n" +
                "                                        <td><a href=\"#\">Initiative Title 4</a></td>\n" +
                "                                        <td>Initiative</td>\n" +
                "                                        <td>IA</td>\n" +
                "                                        <td>MM-DD-YYYY</td>\n" +
                "                                    </tr>\n" +
                "                                    <tr class=\"odd gradeX\">\n" +
                "                                        <td><a href=\"#\">Project title 8</a></td>\n" +
                "                                        <td>Project</td>\n" +
                "                                        <td>Owner</td>\n" +
                "                                        <td>MM-DD-YYYY</td>\n" +
                "                                    </tr>\n" +
                "                                </tbody>\n" +
                "                            </table>\n" +
                "                            <form action=\"project.jsp\" >\n" +
                "                              <button type=\"submit\" class=\"btn btn-outline btn-primary\">Add Project</button>\n" +
                "                              <button type=\"submit\" formaction=\"initiative.jsp\" class=\"btn btn-outline btn-primary\">Add Initiative</button>\n" +
                "                            </form>\n" +
                "\n" +
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
        HeadderFooter.printHeadder(response, htmlBody);
    }

}
