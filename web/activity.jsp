<%@ page contentType="text/html;charset=UTF-8" language="java"

%>
<jsp:include page="headder.jsp"/>
<jsp:include page="navigation.jsp" />

      <div id="page-wrapper">
        <div class="row">
          <div class="col-lg-12">
            <h1 class="page-header">Activity Detailed View</h1>
          </div>
          <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
        <div class="row">
          <form role="form">
          <div class="col-lg-12">
            <div class="panel panel-default">
              <div class="panel-heading">
                Activity Information
              </div>
              <div class="panel-body">
                  <div class="col-lg-12">
                    <div class="form-group">
                      <label>* Title</label>
                      <input class="form-control" placeholder="Title">
                    </div>
                  </div>
                    <!-- col-lg-4 (nested) -->
                    <div class="col-lg-4">
                      <div class="form-group">
                        <label>* Start Date</label>
                        <input class="form-control" placeholder="Start Date">
                      </div>
                    </div>
                    <!--col-lg-4 (nested) -->
                    <div class="col-lg-4">
                      <div class="form-group">
                        <label>* End Date</label>
                        <input class="form-control" placeholder="End Date">
                      </div>
                    </div>
                    <div class="col-lg-4">
                      <div class="form-group">
                        <label>Keyword(s)</label>
                        <input class="form-control" placeholder="Keyword">
                      </div>
                    </div>
                    <div class="col-lg-12">
                      <div class="form-group">
                        <label>* Description</label>
                        <input class="form-control" placeholder="Description">
                      </div>
                    </div>
                    <p><h4>Target Audience</h4></p>
                    <div class="col-lg-4">
                      <div class="form-group">
                          <label>* Classification</label>
                          <select class="form-control">
                              <option>Classification 1</option>
                              <option>Classification 2</option>
                              <option>Classification 3</option>
                              <option>Classification 4</option>
                              <option>Classification 5</option>
                          </select>
                      </div>
                    </div>
                    <div class="col-lg-7">
                      <div class="form-group">
                        <label>Description</label>
                        <input class="form-control" placeholder="Description">
                      </div>
                    </div>
              </div>
            </div>
          </div>
          <div class="col-lg-12">
            <div class="panel panel-default">
              <div class="panel-heading">
                Activity Course Mapping Information
              </div>
                <div class="panel-body">
                  <div class="col-lg-4">
                      <div class="form-group">
                          <label>Semester</label>
                          <select class="form-control">
                              <option>Semester 1</option>
                              <option>Semester 2</option>
                              <option>Semester 3</option>
                              <option>Semester 4</option>
                              <option>Semester 5</option>
                          </select>
                      </div>
                    </div>
                    <div class="col-lg-7">
                      <div class="form-group">
                        <label>Course Name</label>
                        <input class="form-control" placeholder="Course Name">
                      </div>
                    </div>
                </div>
            </div>
          </div>
          <div class="col-lg-12">
            <div class="panel panel-default">
              <div class="panel-heading">
                Activity Participant Information
              </div>
              <div class="panel-body">
                    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                        <thead>
                            <tr>
                                <th>ID</th>
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
                                      <input class="form-control" placeholder="Search by ID">
                                    </div>
                                </td>
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
