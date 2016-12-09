<%@ page contentType="text/html;charset=UTF-8" language="java"

%>
<jsp:include page="headder.jsp"/>
<jsp:include page="navigation.jsp" />

        <div id="page-wrapper">
            <div class="row">
            <form role="form">
                <div class="col-lg-12">
                    <h1 class="page-header">Analysis</h1>
                </div>
                <h4>Welcome to Accelerating, Connecting, and Evaluating Student Success (ACCESS)</h4>
				<div class="row">
          				<div class="col-lg-12">
            				<div class="panel panel-default">
              					<div class="panel-heading">
                					Query
              					</div>
              					<div class="panel-body">
              						<div class="row">
                    					<div class="col-lg-4">
                      						<div class="form-group">
                          						<label>Type</label>
                          						<select class="form-control">
                             						<option>Type 1</option>
                             						<option>Type 2</option>
                              						<option>Type 3</option>
                              						<option>Type 4</option>
                              						<option>Type 5</option>
                          						</select>
                      						</div>
                    					</div>
                    				</div>
                    			</div>
              				</div>
              			</div>
              	</div>
              	<div class="row">
          				<div class="col-lg-12">
            				<div class="panel panel-default">
              					<div class="panel-heading">
                					Filters
              					</div>
              					<div class="panel-body">
              						<div class="row">
                    					<div class="col-lg-4">
                      						<div class="form-group">
                          						<label>Category</label>
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
                    					<div class="col-lg-4">
                      						<div class="form-group">
                          						<label>Classification</label>
                          						<select class="form-control">
                             						<option>Classification 1</option>
                             						<option>Classification 2</option>
                              						<option>Classification 3</option>
                              						<option>Classification 4</option>
                              						<option>Classification 5</option>
                          						</select>
                      						</div>
                    					</div>
                    				</div>
                    				<div class="row">
                    					<div class="col-lg-4">
                    						<div class="form-group">
          										<label>Graduates</label>
          										<label class="checkbox-inline">
            										<input type="radio" name="optionsRadios" id="optionsRadios1" value="option1">Yes
         										</label>
          										<label class="checkbox-inline">
            										<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2" checked>No
          										</label>
        									</div>
        								</div>
                    				</div>
                    				<div class="row">
                    					<div class="col-lg-4">
                      						<div class="form-group">
                          						<label>Major Field</label>
                          						<select class="form-control">
                             						<option>Major Field 1</option>
                             						<option>Major Field 2</option>
                              						<option>Major Field 3</option>
                              						<option>Major Field 4</option>
                              						<option>Major Field 5</option>
                          						</select>
                      						</div>
                    					</div>
                    				</div>
                    				<div class="row">
                    					<div class="col-lg-4">
                      						<div class="form-group">
                          						<label>Department</label>
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
                    			</div>
              				</div>
              			</div>
              	</div>
              	<div class="row">
          				<div class="col-lg-12">
            				<div class="panel panel-default">
              					<div class="panel-heading">
                					Restriction
              					</div>
              					<div class="panel-body">
              						<div class="row">
                    					<div class="col-lg-4">
                      						<div class="form-group">
                          						<label>Time to Degree</label>
                          						<select class="form-control">
                             						<option>Time to Degree 1</option>
                             						<option>Time to Degree 2</option>
                              						<option>Time to Degree 3</option>
                              						<option>Time to Degree 4</option>
                              						<option>Time to Degree 5</option>
                          						</select>
                      						</div>
                    					</div>
                    				</div>
                    				<div class="row">
                    					<div class="col-lg-4">
                    						<div class="form-group">
          										<label>Undergraduate to Graduate Advancement</label>
          										<label class="checkbox-inline">
            										<input type="radio" name="optionsRadios" id="optionsRadios1" value="option1">Yes
         										</label>
          										<label class="checkbox-inline">
            										<input type="radio" name="optionsRadios" id="optionsRadios2" value="option2" checked>No
          										</label>
        									</div>
        								</div>
                    				</div>
                    			</div>
              				</div>
              			</div>
              	</div>
              	              			<p align="right">
            				<button align="right" type="submit" class="btn btn-default">Download Results</button>
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
