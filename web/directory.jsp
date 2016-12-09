<%@ page contentType="text/html;charset=UTF-8" language="java"

%>
<jsp:include page="headder.jsp"/>
<jsp:include page="navigation.jsp" />

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Directory</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
				<div class="row">
          			<form role="form">
          				<div class="col-lg-12">
            				<div class="panel panel-default">
              					<div class="panel-heading">
                					Welcome to Accelerating, Connecting, and Evaluating Student Success (ACCESS)
              					</div>
              					<div class="panel-body">
									<div class="row">
										<div class="col-lg-5">
                      						<div class="form-group">
                          						<label>Search by College</label>
                          						<select class="form-control">
                              						<option>College 1</option>
                              						<option>College 2</option>
                              						<option>College 3</option>
                              						<option>College 4</option>
                              						<option>College 5</option>
                          						</select>
                      						</div>
                      					</div>
                      				</div>
									<div class="row">
										<div class="col-lg-5">
                      						<div class="form-group">
                          						<label>Search by Department</label>
                          						<select class="form-control">
                              						<option>Department 1</option>
                              						<option>Department 2</option>
                              						<option>Department 3</option>
                              						<option>Department 4</option>
                              						<option>Department 5</option>
                          						</select>
                      						</div>
                      					</div>
                      				</div>
                      				<div class="row">
										<div class="col-lg-5">
                      						<div class="form-group">
                          						<label>Search by Category</label>
                          						<select class="form-control">
                              						<option>Category 1</option>
                              						<option>Category 2</option>
                              						<option>Category 3</option>
                              						<option>Category 4</option>
                              						<option>Category 5</option>
                          						</select>
                      						</div>
                      					</div>
                      				</div>
                      				<div class="row">
										<div class="col-lg-5">
                      						<div class="form-group">
                          						<label>Search by Date</label>
                          						<select class="form-control">
                              						<option>Start Date</option>
                          						</select>
                      						</div>
                      					</div>
                      					<div class="col-lg-5">
                      						<div class="form-group">
                      							<label> </label>
                          						<select class="form-control">
                              						<option>End Date</option>
                          						</select>
                      						</div>
                      					</div>
                      				</div>
                      				<div class="row">
										<div class="col-lg-5">
                      						<div class="form-group">
                          						<label>Search by Keyword</label>
                          						<select class="form-control">
                              						<option>Keyword 1</option>
                              						<option>Keyword 2</option>
                              						<option>Keyword 3</option>
                              						<option>Keyword 4</option>
                              						<option>Keyword 5</option>
                          						</select>
                      						</div>
                      					</div>
                      				</div>
                      				<div class="row">
										<div class="col-lg-5">
                      						<form action="#" >
                      							<label>Show all Initiatives</label>
                       							<button align="right" type="submit" class="btn btn-default btn-block">Show All</button>
						                    </form>
                      					</div>
                      				</div>
                      				<div class="row">
                      					<div class="col-lg-12 panel-body">
                      					<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                        					<thead>
                            					<tr>
                            						<th>
                            							<div class="checkbox">
                                            				<label>
                                                    			<input type="checkbox" value="">
                                                			</label>
                                            			</div>
                            						</th>
                                					<th>Initiative Title</th>
                                					<th>Initiative Description</th>
                                					<th>Category</th>
                                					<th>Owner</th>
                                					<th>Creation Date</th>
                            					</tr>
                        					</thead>
                        					<tbody>
                          						<tr class="even gradeC">
                          							<td>
                          								<div class="checkbox">
                                            				<label>
                                                    			<input type="checkbox" value="">
                                                			</label>
                                            			</div>
                                            		</td>
                              						<td><a href="initiative.jsp">Initiative Title 1</a></td>
                              						<td>Description 1</td>
                              						<td>Category A</td>
                              						<td><a href="#">Owner A</a></td>
                              						<td>MM-DD-YYYY</td>
                          						</tr>
                          						<tr class="odd gradeX">
                          							<td>
                          								<div class="checkbox">
                                            				<label>
                                                    			<input type="checkbox" value="">
                                                			</label>
                                            			</div>
                          							</td>
                              						<td><a href="initiative.jsp">Initiative Title 1</a></td>
                              						<td>Description 1</td>
                              						<td>Category A</td>
                              						<td><a href="#">Owner A</a></td>
                              						<td>MM-DD-YYYY</td>
                          						</tr>
                          						<tr class="even gradeC">
                          							<td>
                          								<div class="checkbox">
                                            				<label>
                                                    			<input type="checkbox" value="">
                                                			</label>
                                            			</div>
                          							</td>
                              						<td><a href="initiative.jsp">Initiative Title 1</a></td>
                              						<td>Description 1</td>
                              						<td>Category A</td>
                              						<td><a href="#">Owner A</a></td>
                              						<td>MM-DD-YYYY</td>
                          						</tr>
                        					</tbody>
                    					</table>
                      				</div>
                    			</div>
              				</div>
              			</div>
              			<div>
              				Download Summary Report as Excel 
              				<a href="#"><i class="fa fa-file-excel-o fa-fw"></i></a> 
              				or PDF 
              				<a href="#"><i class="fa fa-file-pdf-o fa-fw"></i></a> 
              			</dvi>
              			<div>
              				Download Detailed Report as Excel 
              				<a href="#"><i class="fa fa-file-excel-o fa-fw"></i></a> 
              				or PDF 
              				<a href="#"><i class="fa fa-file-pdf-o fa-fw"></i></a> 
              			</dvi>
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
