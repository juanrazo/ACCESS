package com.synergyteam.ddns.User;

import com.sun.deploy.resources.ResourceManager;
import com.synergyteam.ddns.ResourceSubsystem.Resource;
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
@WebServlet(name = "ViewProject")
public class ViewProject extends HttpServlet {
    private ResourceAccessManager resources;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        resources = new ResourceAccessManager();
        //{ int 'PID', tinyint 'fundedProject' == 0 | 1, 'Title', 'Description', 'startDate'. 'endDate', 'Goal' }
        PrintWriter out= response.getWriter();
        String title= request.getParameter("title");
        String[] project = resources.viewProject(title);
        response.setContentType("text/plain");
        String htmlBody = "     <div id=\"page-wrapper\">\n" +
                "        <div class=\"row\">\n" +
                "          <div class=\"col-lg-12\">\n" +
                "            <h1 class=\"page-header\">Project Detailed View</h1>\n" +
                "          </div>\n" +
                "          <!-- /.col-lg-12 -->\n" +
                "        </div>\n" +
                "        <!-- Funded project? -->\n" +
                "        <div class=\"form-group\">\n" +
                "          <label>* Funded Project?</label>\n" +
                "          <label class=\"checkbox-inline\">\n" +
                "            <input data-toggle=\"modal\" data-target=\"#fundedProject\" type=\"radio\" name=\"optionsRadios\" id=\"optionsRadios1\" value=\"option1\">Yes\n" +
                "          </label>\n" +
                "          <label class=\"checkbox-inline\">\n" +
                "            <input type=\"radio\" name=\"optionsRadios\" id=\"optionsRadios2\" value=\"option2\" checked>No\n" +
                "          </label>\n" +
                "        </div>\n" +
                "        \n" +
                "        <!-- Modal -->\n" +
                "        <div class=\"container\">\n" +
                "        \t<div class=\"modal fade\" id=\"fundedProject\" role=\"dialog\">\n" +
                "        \t\t<div class=\"modal-dialog modal-lg\">\n" +
                "        \t\t\t<!-- Modal content-->\n" +
                "        \t\t\t<div class=\"modal-content\">\n" +
                "        \t\t\t\t<div class=\"modal-header\">\n" +
                "        \t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n" +
                "        \t\t\t\t\t<h4 class=\"modal-title\">List of Funded Projects</h4>\n" +
                "        \t\t\t\t</div>\n" +
                "        \t\t\t<div class=\"modal-body\">\n" +
                "        \t\t\t\t<p>Please select from the list of funded projects you own.</p>\n" +
                "        \t\t\t\t<div class=\"panel panel-default\">\n" +
                "        \t\t\t\t\t<div class=\"panel-heading\">\n" +
                "        \t\t\t\t\t\tFunded Projects\n" +
                "        \t\t\t\t\t</div>\n" +
                "        \t\t\t\t\t<div class=\"panel-body\">\n" +
                "                    \t\t\t<table width=\"100%\" class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n" +
                "                        \t\t\t<thead>\n" +
                "                            \t\t\t<tr>\n" +
                "                                \t\t\t<th>Project Title</th>\n" +
                "                                \t\t\t<th>Project Description</th>\n" +
                "                            \t\t\t</tr>\n" +
                "                        \t\t\t</thead>\n" +
                "                        \t\t\t<tbody>\n" +
                "                          \t\t\t\t<tr class=\"even gradeC\">\n" +
                "                              \t\t\t\t<td><a href=\"initiative.jsp\">Project Title 1</a></td>\n" +
                "                              \t\t\t\t<td>Description 1</td>\n" +
                "                          \t\t\t\t</tr>\n" +
                "                          \t\t\t\t<tr class=\"odd gradeX\">\n" +
                "                              \t\t\t\t<td><a href=\"initiative.jsp\">Project Title 1</a></td>\n" +
                "                              \t\t\t\t<td>Description 1</td>\n" +
                "                          \t\t\t\t</tr>\n" +
                "                          \t\t\t\t<tr class=\"even gradeC\">\n" +
                "                              \t\t\t\t<td><a href=\"initiative.jsp\">Project Title 1</a></td>\n" +
                "                              \t\t\t\t<td>Description 1</td>\n" +
                "                          \t\t\t\t</tr>\n" +
                "                        \t\t\t</tbody>\n" +
                "                    \t\t\t</table>\n" +
                "          \t\t\t\t\t</div>\n" +
                "        \t\t\t\t</div>\n" +
                "        \t\t\t\t<div class=\"modal-footer\">\n" +
                "          \t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Select</button>\n" +
                "        \t\t\t\t</div>\n" +
                "      \t\t\t\t</div>\n" +
                "    \t\t\t</div>\n" +
                "  \t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\t\t<!-- Modal end-->\n" +
                "        <!-- /.row -->\n" +
                "        <div class=\"row\">\n" +
                "          <form role=\"form\" method=\"post\" action=\"AddNonFunded\">\n" +
                "          <div class=\"col-lg-12\">\n" +
                "            <div class=\"panel panel-default\">\n" +
                "              <div class=\"panel-heading\">\n" +
                "                Project Information\n" +
                "              </div>\n" +
                "              <div class=\"panel-body\">\n" +
                "                  <div class=\"col-lg-6\">\n" +
                "                    <div class=\"form-group\">\n" +
                "                      <label>* Title</label>\n" +
                "                      <input class=\"form-control\" placeholder=\""+ project[2] +"\" name=\"projecttitle\">\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                    <!-- col-lg-4 (nested) -->\n" +
                "                    <div class=\"col-lg-3\">\n" +
                "                      <div class=\"form-group\">\n" +
                "                        <label>* Start Date</label>\n" +
                "                        <input class=\"form-control\" placeholder=\""+ project[4]+"\" name=\"startdate\">\n" +
                "                      </div>\n" +
                "                    </div>\n" +
                "                    <!--col-lg-4 (nested) -->\n" +
                "                    <div class=\"col-lg-3\">\n" +
                "                      <div class=\"form-group\">\n" +
                "                        <label>* End Date</label>\n" +
                "                        <input class=\"form-control\" placeholder=\""+ project[5]+"\" name=\"enddate\">\n" +
                "                      </div>\n" +
                "                    </div>\n" +
                "                    <div class=\"col-lg-7\">\n" +
                "                      <div class=\"form-group\">\n" +
                "                        <label>* Description</label>\n" +
                "                        <input class=\"form-control\" placeholder=\""+ project[3]+"\" name=\"description\">\n" +
                "                      </div>\n" +
                "                    </div>\n" +
                "                    <div class=\"col-lg-4\">\n" +
                "                      <div class=\"form-group\">\n" +
                "                        <label>Keyword(s)</label>\n" +
                "                        <input class=\"form-control\" placeholder=\"Keyword\" name=\"keyword\">\n" +
                "                      </div>\n" +
                "                    </div>\n" +
                "                    <div class=\"col-lg-6\">\n" +
                "                      <div class=\"form-group\">\n" +
                "                        <label>Goals</label>\n" +
                "                        <input class=\"form-control\" placeholder=\"Goals\" name=\"goals\">\n" +
                "                      </div>\n" +
                "                    </div>\n" +
                "                    <div class=\"col-lg-5\">\n" +
                "                      <div class=\"form-group\">\n" +
                "                        <label>Objectives</label>\n" +
                "                        <input class=\"form-control\" placeholder=\"Objectives\" name=\"objectives\">\n" +
                "                      </div>\n" +
                "                    </div>\n" +
                "                    <div class=\"col-lg-4\">\n" +
                "                      <div class=\"form-group\">\n" +
                "                          <label>Document Type</label>\n" +
                "                          <select class=\"form-control\">\n" +
                "                              <option>Type 1</option>\n" +
                "                              <option>Type 2</option>\n" +
                "                              <option>Type 3</option>\n" +
                "                              <option>Type 4</option>\n" +
                "                              <option>Type 5</option>\n" +
                "                          </select>\n" +
                "                      </div>\n" +
                "                    </div>\n" +
                "                    <div class=\"col-lg-7\">\n" +
                "                      <div class=\"form-group\">\n" +
                "                        <label>Attachment Link</label>\n" +
                "                        <input class=\"form-control\" placeholder=\"Attachment Link\">\n" +
                "                      </div>\n" +
                "                    </div>\n" +
                "                    <div class=\"col-lg-11\">\n" +
                "                      <div class=\"form-group\">\n" +
                "                        <label>Website</label>\n" +
                "                        <input class=\"form-control\" placeholder=\"Website\">\n" +
                "                      </div>\n" +
                "                    </div>\n" +
                "                    <!-- /.col-lg-4 (nested) -->\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <div class=\"col-lg-12\">\n" +
                "            <div class=\"panel panel-default\">\n" +
                "              <div class=\"panel-heading\">\n" +
                "                Project Membership\n" +
                "              </div>\n" +
                "                <div class=\"panel-body\">\n" +
                "                    <table width=\"100%\" class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n" +
                "                        <thead>\n" +
                "                            <tr>\n" +
                "                                <th>Name</th>\n" +
                "                                <th>Email</th>\n" +
                "                                <th>Role</th>\n" +
                "                                <th>Action</th>\n" +
                "                            </tr>\n" +
                "                        </thead>\n" +
                "                        <tbody>\n" +
                "                            <tr class=\"odd gradeX\">\n" +
                "                                <td>\n" +
                "                                    <div class=\"form-group\">\n" +
                "                                      <input class=\"form-control\" placeholder=\"Search by Name\">\n" +
                "                                    </div>\n" +
                "                                </td>\n" +
                "                                <td>\n" +
                "                                    <div class=\"form-group\">\n" +
                "                                      <input class=\"form-control\" placeholder=\"Search by Email\">\n" +
                "                                    </div>\n" +
                "                                </td>\n" +
                "                                <td>\n" +
                "                                    <div class=\"form-group\">\n" +
                "                                      <input class=\"form-control\" placeholder=\"Role\">\n" +
                "                                    </div>\n" +
                "                                </td>\n" +
                "                                <td>\n" +
                "                                    <div class=\"form-group\">\n" +
                "                                      <input class=\"form-control\" placeholder=\"X\">\n" +
                "                                    </div>\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "                        </tbody>\n" +
                "                    </table>\n" +
                "                    <form action=\"#\" >\n" +
                "                      <p align=\"right\">\n" +
                "                        <button align=\"right\" type=\"submit\" class=\"btn btn-default\">Add Membership</button>\n" +
                "                      </p>\n" +
                "                    </form>\n" +
                "                    <!-- /.table-responsive -->\n" +
                "                </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <div class=\"col-lg-12\">\n" +
                "            <div class=\"panel panel-default\">\n" +
                "              <div class=\"panel-heading\">\n" +
                "                Initiatives Associated with Project\n" +
                "              </div>\n" +
                "              <div class=\"panel-body\">\n" +
                "                    <table width=\"100%\" class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n" +
                "                        <thead>\n" +
                "                            <tr>\n" +
                "                                <th>Title</th>\n" +
                "                                <th>Description</th>\n" +
                "                                <th>Creation Date</th>\n" +
                "                                <th>Linked Initiative</th>\n" +
                "                                <th>Owner</th>\n" +
                "                            </tr>\n" +
                "                        </thead>\n" +
                "                        <tbody>\n" +
                "                          <tr class=\"even gradeC\">\n" +
                "                              <td><a href=\"initiative.jsp\">Initiative Title 1</a></td>\n" +
                "                              <td>Description 1</td>\n" +
                "                              <td>MM-DD-YYYY</td>\n" +
                "                              <td>No</td>\n" +
                "                              <td><a href=\"#\">Owner A</a></td>\n" +
                "                          </tr>\n" +
                "                          <tr class=\"odd gradeX\">\n" +
                "                              <td><a href=\"initiative.jsp\">Initiative Title 2</a></td>\n" +
                "                              <td>Description 2</td>\n" +
                "                              <td>MM-DD-YYYY</td>\n" +
                "                              <td>Yes</td>\n" +
                "                              <td><a href=\"#\">Owner B</a></td>\n" +
                "                          </tr>\n" +
                "                          <tr class=\"even gradeC\">\n" +
                "                              <td><a href=\"initiative.jsp\">Initiative Title 3</a></td>\n" +
                "                              <td>Description 3</td>\n" +
                "                              <td>MM-DD-YYYY</td>\n" +
                "                              <td>No</td>\n" +
                "                              <td><a href=\"#\">Owner A</a></td>\n" +
                "                          </tr>\n" +
                "                        </tbody>\n" +
                "                    </table>\n" +
                "                    <form action=\"#\" >\n" +
                "                      <p align=\"right\">\n" +
                "                        <button align=\"right\" type=\"submit\" class=\"btn btn-default\">Add Initiative</button>\n" +
                "                        <button data-toggle=\"modal\" data-target=\"#linkInitiative\" align=\"right\" type=\"button\" class=\"btn btn-default\">Link Existing Initiative</button>\n" +
                "                      </p>\n" +
                "                    </form>\n" +
                "                    <!-- Modal -->\n" +
                "        \t\t\t<div class=\"container\">\n" +
                "        \t\t\t\t<div class=\"modal fade\" id=\"linkInitiative\" role=\"dialog\">\n" +
                "        \t\t\t\t\t<div class=\"modal-dialog modal-lg\">\n" +
                "        \t\t\t\t\t\t<!-- Modal content-->\n" +
                "        \t\t\t\t\t\t<div class=\"modal-content\">\n" +
                "        \t\t\t\t\t\t\t<div class=\"modal-header\">\n" +
                "        \t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n" +
                "        \t\t\t\t\t\t\t\t<h4 class=\"modal-title\">Link Existing Initiative</h4>\n" +
                "        \t\t\t\t\t\t\t</div>\n" +
                "        \t\t\t\t\t\t<div class=\"modal-body\">\n" +
                "        \t\t\t\t\t\t\t<p>Please select an initiative(s) to link to the project.</p>\n" +
                "        \t\t\t\t\t\t\t<div class=\"panel panel-default\">\n" +
                "        \t\t\t\t\t\t\t\t<div class=\"panel-heading\">\n" +
                "        \t\t\t\t\t\t\t\t\tInitiatives\n" +
                "        \t\t\t\t\t\t\t\t</div>\n" +
                "        \t\t\t\t\t\t\t\t<div class=\"panel-body\">\n" +
                "                    \t\t\t\t\t\t<table width=\"100%\" class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n" +
                "                        \t\t\t\t\t\t<thead>\n" +
                "                            \t\t\t\t\t\t<tr>\n" +
                "                                \t\t\t\t\t\t<th>Title</th>\n" +
                "                                \t\t\t\t\t\t<th>Description</th>\n" +
                "                                \t\t\t\t\t\t<th>Creation Date</th>\n" +
                "                                \t\t\t\t\t\t<th>Linked Initiative</th>\n" +
                "                                \t\t\t\t\t\t<th>Owner</th>\n" +
                "                            \t\t\t\t\t\t</tr>\n" +
                "                        \t\t\t\t\t\t</thead>\n" +
                "                        \t\t\t\t\t\t<tbody>\n" +
                "                          \t\t\t\t\t\t\t<tr class=\"even gradeC\">\n" +
                "                              \t\t\t\t\t\t\t<td><a href=\"initiative.jsp\">Initiative Title 1</a></td>\n" +
                "                              \t\t\t\t\t\t\t<td>Description 1</td>\n" +
                "                              \t\t\t\t\t\t\t<td>MM-DD-YYYY</td>\n" +
                "                              \t\t\t\t\t\t\t<td>No</td>\n" +
                "                              \t\t\t\t\t\t\t<td><a href=\"#\">Owner A</a></td>\n" +
                "                          \t\t\t\t\t\t\t</tr>\n" +
                "                          \t\t\t\t\t\t\t<tr class=\"odd gradeX\">\n" +
                "                              \t\t\t\t\t\t\t<td><a href=\"initiative.jsp\">Initiative Title 1</a></td>\n" +
                "                              \t\t\t\t\t\t\t<td>Description 2</td>\n" +
                "                              \t\t\t\t\t\t\t<td>MM-DD-YYYY</td>\n" +
                "                              \t\t\t\t\t\t\t<td>Yes</td>\n" +
                "                              \t\t\t\t\t\t\t<td><a href=\"#\">Owner B</a></td>\n" +
                "                          \t\t\t\t\t\t\t</tr>\n" +
                "                          \t\t\t\t\t\t\t<tr class=\"even gradeC\">\n" +
                "                              \t\t\t\t\t\t\t<td><a href=\"initiative.jsp\">Initiative Title 1</a></td>\n" +
                "                              \t\t\t\t\t\t\t<td>Description 3</td>\n" +
                "                              \t\t\t\t\t\t\t<td>MM-DD-YYYY</td>\n" +
                "                              \t\t\t\t\t\t\t<td>No</td>\n" +
                "                              \t\t\t\t\t\t\t<td><a href=\"#\">Owner A</a></td>\n" +
                "                          \t\t\t\t\t\t\t</tr>\n" +
                "                        \t\t\t\t\t\t</tbody>\n" +
                "                    \t\t\t\t\t\t</table>\n" +
                "          \t\t\t\t\t\t\t\t</div>\n" +
                "        \t\t\t\t\t\t\t</div>\n" +
                "        \t\t\t\t\t\t<div class=\"modal-footer\">\n" +
                "          \t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Select</button>\n" +
                "        \t\t\t\t\t\t</div>\n" +
                "      \t\t\t\t\t\t</div>\n" +
                "    \t\t\t\t\t</div>\n" +
                "  \t\t\t\t\t</div>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t\t<!-- Modal end-->\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          </div>\n" +
                "          <div>* Required Fields</div>\n" +
                "          <p align=\"right\">\n" +
                "            <button name=\"AddNonFunded\" align=\"right\" type=\"submit\" class=\"btn btn-default\">Save</button>\n" +
                "            <button name=\"saveandreturn\" type=\"submit\" class=\"btn btn-default\">Save and Return</button>\n" +
                "            <button name=\"delete\" type=\"submit\" class=\"btn btn-default\">Delete</button>\n" +
                "            <button name=\"cancel\" type=\"reset\" class=\"btn btn-default\">Cancel</button>\n" +
                "          </p>\n" +
                "        </form>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <!-- /#page-wrapper -->\n" +
                "    </div>";
        HeadderFooter.printHeadder(response, htmlBody);
    }
}
