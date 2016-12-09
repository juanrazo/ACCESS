<%@ page contentType="text/html;charset=UTF-8" language="java"

%>
<jsp:include page="headder.jsp"/>
<jsp:include page="navigation.jsp" />

      <div id="page-wrapper">
        <div class="row">
          <div class="col-lg-12">
            <h1 class="page-header">Project Detailed View</h1>
          </div>
          <!-- /.col-lg-12 -->
        </div>
        <!-- Funded project? -->
        <div class="form-group">
          <label>* Funded Project?</label>
          <label class="checkbox-inline">
            <input data-toggle="modal" data-target="#fundedProject" type="radio" name="optionsRadios" id="optionsRadios1" value="option1">Yes
          </label>
          <label class="checkbox-inline">
            <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2" checked>No
          </label>
        </div>
        
        <!-- Modal -->
        <div class="container">
        	<div class="modal fade" id="fundedProject" role="dialog">
        		<div class="modal-dialog modal-lg">
        			<!-- Modal content-->
        			<div class="modal-content">
        				<div class="modal-header">
        					<button type="button" class="close" data-dismiss="modal">&times;</button>
        					<h4 class="modal-title">List of Funded Projects</h4>
        				</div>
        			<div class="modal-body">
        				<p>Please select from the list of funded projects you own.</p>
        				<div class="panel panel-default">
        					<div class="panel-heading">
        						Funded Projects
        					</div>
        					<div class="panel-body">
                    			<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                        			<thead>
                            			<tr>
                                			<th>Project Title</th>
                                			<th>Project Description</th>
                            			</tr>
                        			</thead>
                        			<tbody>
                          				<tr class="even gradeC">
                              				<td><a href="initiative.jsp">Project Title 1</a></td>
                              				<td>Description 1</td>
                          				</tr>
                          				<tr class="odd gradeX">
                              				<td><a href="initiative.jsp">Project Title 1</a></td>
                              				<td>Description 1</td>
                          				</tr>
                          				<tr class="even gradeC">
                              				<td><a href="initiative.jsp">Project Title 1</a></td>
                              				<td>Description 1</td>
                          				</tr>
                        			</tbody>
                    			</table>
          					</div>
        				</div>
        				<div class="modal-footer">
          				<button type="button" class="btn btn-default" data-dismiss="modal">Select</button>
        				</div>
      				</div>
    			</div>
  			</div>
		</div>
		<!-- Modal end-->
        <!-- /.row -->
        <div class="row">
          <form role="form">
          <div class="col-lg-12">
            <div class="panel panel-default">
              <div class="panel-heading">
                Project Information
              </div>
              <div class="panel-body">
                  <div class="col-lg-6">
                    <div class="form-group">
                      <label>* Title</label>
                      <input class="form-control" placeholder="Title">
                    </div>
                  </div>
                    <!-- col-lg-4 (nested) -->
                    <div class="col-lg-3">
                      <div class="form-group">
                        <label>* Start Date</label>
                        <input class="form-control" placeholder="Start Date">
                      </div>
                    </div>
                    <!--col-lg-4 (nested) -->
                    <div class="col-lg-3">
                      <div class="form-group">
                        <label>* End Date</label>
                        <input class="form-control" placeholder="End Date">
                      </div>
                    </div>
                    <div class="col-lg-7">
                      <div class="form-group">
                        <label>* Description</label>
                        <input class="form-control" placeholder="Description">
                      </div>
                    </div>
                    <div class="col-lg-4">
                      <div class="form-group">
                        <label>Keyword(s)</label>
                        <input class="form-control" placeholder="Keyword">
                      </div>
                    </div>
                    <div class="col-lg-6">
                      <div class="form-group">
                        <label>Goals</label>
                        <input class="form-control" placeholder="Goals">
                      </div>
                    </div>
                    <div class="col-lg-5">
                      <div class="form-group">
                        <label>Objectives</label>
                        <input class="form-control" placeholder="Objectives">
                      </div>
                    </div>
                    <div class="col-lg-4">
                      <div class="form-group">
                          <label>Document Type</label>
                          <select class="form-control">
                              <option>Type 1</option>
                              <option>Type 2</option>
                              <option>Type 3</option>
                              <option>Type 4</option>
                              <option>Type 5</option>
                          </select>
                      </div>
                    </div>
                    <div class="col-lg-7">
                      <div class="form-group">
                        <label>Attachment Link</label>
                        <input class="form-control" placeholder="Attachment Link">
                      </div>
                    </div>
                    <div class="col-lg-11">
                      <div class="form-group">
                        <label>Website</label>
                        <input class="form-control" placeholder="Website">
                      </div>
                    </div>
                    <!-- /.col-lg-4 (nested) -->
              </div>
            </div>
          </div>
          <div class="col-lg-12">
            <div class="panel panel-default">
              <div class="panel-heading">
                Project Membership
              </div>
                <div class="panel-body">
                    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                        <thead>
                            <tr>
                                <th>Name</th>
                                <th>Email</th>
                                <th>Role</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr class="odd gradeX">
                                <td>
                                    <div class="form-group">
                                      <input class="form-control" placeholder="Search by Name">
                                    </div>
                                </td>
                                <td>
                                    <div class="form-group">
                                      <input class="form-control" placeholder="Search by Email">
                                    </div>
                                </td>
                                <td>
                                    <div class="form-group">
                                      <input class="form-control" placeholder="Role">
                                    </div>
                                </td>
                                <td>
                                    <div class="form-group">
                                      <input class="form-control" placeholder="X">
                                    </div>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                    <form action="#" >
                      <p align="right">
                        <button align="right" type="submit" class="btn btn-default">Add Membership</button>
                      </p>
                    </form>
                    <!-- /.table-responsive -->
                </div>
            </div>
          </div>
          <div class="col-lg-12">
            <div class="panel panel-default">
              <div class="panel-heading">
                Initiatives Associated with Project
              </div>
              <div class="panel-body">
                    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                        <thead>
                            <tr>
                                <th>Title</th>
                                <th>Description</th>
                                <th>Creation Date</th>
                                <th>Linked Initiative</th>
                                <th>Owner</th>
                            </tr>
                        </thead>
                        <tbody>
                          <tr class="even gradeC">
                              <td><a href="initiative.jsp">Initiative Title 1</a></td>
                              <td>Description 1</td>
                              <td>MM-DD-YYYY</td>
                              <td>No</td>
                              <td><a href="#">Owner A</a></td>
                          </tr>
                          <tr class="odd gradeX">
                              <td><a href="initiative.jsp">Initiative Title 2</a></td>
                              <td>Description 2</td>
                              <td>MM-DD-YYYY</td>
                              <td>Yes</td>
                              <td><a href="#">Owner B</a></td>
                          </tr>
                          <tr class="even gradeC">
                              <td><a href="initiative.jsp">Initiative Title 3</a></td>
                              <td>Description 3</td>
                              <td>MM-DD-YYYY</td>
                              <td>No</td>
                              <td><a href="#">Owner A</a></td>
                          </tr>
                        </tbody>
                    </table>
                    <form action="#" >
                      <p align="right">
                        <button align="right" type="submit" class="btn btn-default">Add Initiative</button>
                        <button data-toggle="modal" data-target="#linkInitiative" align="right" type="button" class="btn btn-default">Link Existing Initiative</button>
                      </p>
                    </form>
                    <!-- Modal -->
        			<div class="container">
        				<div class="modal fade" id="linkInitiative" role="dialog">
        					<div class="modal-dialog modal-lg">
        						<!-- Modal content-->
        						<div class="modal-content">
        							<div class="modal-header">
        								<button type="button" class="close" data-dismiss="modal">&times;</button>
        								<h4 class="modal-title">Link Existing Initiative</h4>
        							</div>
        						<div class="modal-body">
        							<p>Please select an initiative(s) to link to the project.</p>
        							<div class="panel panel-default">
        								<div class="panel-heading">
        									Initiatives
        								</div>
        								<div class="panel-body">
                    						<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                        						<thead>
                            						<tr>
                                						<th>Title</th>
                                						<th>Description</th>
                                						<th>Creation Date</th>
                                						<th>Linked Initiative</th>
                                						<th>Owner</th>
                            						</tr>
                        						</thead>
                        						<tbody>
                          							<tr class="even gradeC">
                              							<td><a href="initiative.jsp">Initiative Title 1</a></td>
                              							<td>Description 1</td>
                              							<td>MM-DD-YYYY</td>
                              							<td>No</td>
                              							<td><a href="#">Owner A</a></td>
                          							</tr>
                          							<tr class="odd gradeX">
                              							<td><a href="initiative.jsp">Initiative Title 1</a></td>
                              							<td>Description 2</td>
                              							<td>MM-DD-YYYY</td>
                              							<td>Yes</td>
                              							<td><a href="#">Owner B</a></td>
                          							</tr>
                          							<tr class="even gradeC">
                              							<td><a href="initiative.jsp">Initiative Title 1</a></td>
                              							<td>Description 3</td>
                              							<td>MM-DD-YYYY</td>
                              							<td>No</td>
                              							<td><a href="#">Owner A</a></td>
                          							</tr>
                        						</tbody>
                    						</table>
          								</div>
        							</div>
        						<div class="modal-footer">
          							<button type="button" class="btn btn-default" data-dismiss="modal">Select</button>
        						</div>
      						</div>
    					</div>
  					</div>
				</div>
				<!-- Modal end-->
            </div>
          </div>
          </div>
          <div>* Required Fields</div>
          <p align="right">
            <button align="right" type="submit" class="btn btn-default">Save</button>
            <button type="submit" class="btn btn-default">Save and Return</button>
            <button type="submit" class="btn btn-default">Delete</button>
            <button type="reset" class="btn btn-default">Cancel</button>
          </p>
        </form>
        </div>
      </div>
      <!-- /#page-wrapper -->
    </div>
    <!-- /#wrapper -->
    <!-- jQuery -->
    <script src="./vendor/jquery/jquery.min.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="./vendor/bootstrap/js/bootstrap.min.js"></script>
    <!-- Metis Menu Plugin JavaScript -->
    <script src="./vendor/metisMenu/metisMenu.min.js"></script>
    <!-- Morris Charts JavaScript -->
    <script src="./vendor/raphael/raphael.min.js"></script>
    <script src="./vendor/morrisjs/morris.min.js"></script>
    <script src="./data/morris-data.js"></script>
    <!-- Custom Theme JavaScript -->
    <script src="./dist/js/sb-admin-2.js"></script>
  </body>
  </html>
