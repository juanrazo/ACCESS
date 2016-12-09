
<%@ page contentType="text/html;charset=UTF-8" language="java"

%>
<jsp:include page="headder.jsp"/>
<jsp:include page="navigation.jsp" />


        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Resources</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            DataTables Advanced Tables
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                        <th>Title</th>
                                        <th>Type</th>
                                        <th>Role</th>
                                        <th>Last Modified Date</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr class="odd gradeX">
                                        <td><a href="project.jsp">Project 1</a></td>
                                        <td>Project</td>
                                        <td>Owner</td>
                                        <td>MM-DD-YYYY</td>
                                    </tr>
                                    <tr class="even gradeC">
                                        <td><a href="initiative.jsp">Initiative Title 1</a></td>
                                        <td>Initiative</td>
                                        <td>IA</td>
                                        <td>MM-DD-YYYY</td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><a href="project.jsp">Project title 2</a></td>
                                        <td>Project</td>
                                        <td>Owner</td>
                                        <td>MM-DD-YYYY</td>
                                    </tr>
                                    <tr class="odd grageC">
                                        <td><a href="project.jsp">Project title 3</a></td>
                                        <td>Project</td>
                                        <td>Owner</td>
                                        <td>MM-DD-YYYY</td>
                                    </tr>
                                    <tr class="even gradeC">
                                        <td><a href="initiative.jsp">Initiative Title 2</a></td>
                                        <td>Initiative</td>
                                        <td>IA</td>
                                        <td>MM-DD-YYYY</td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><a href="#">Project title 4</a></td>
                                        <td>Project</td>
                                        <td>Owner</td>
                                        <td>MM-DD-YYYY</td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><a href="#">Project title 5</a></td>
                                        <td>Project</td>
                                        <td>Owner</td>
                                        <td>MM-DD-YYYY</td>
                                    </tr>
                                    <tr class="even gradeC">
                                        <td><a href="#">Initiative Title 3</a></td>
                                        <td>Initiative</td>
                                        <td>IA</td>
                                        <td>MM-DD-YYYY</td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><a href="#">Project title 6</a></td>
                                        <td>Project</td>
                                        <td>Owner</td>
                                        <td>MM-DD-YYYY</td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><a href="#">Project title 7</a></td>
                                        <td>Project</td>
                                        <td>Owner</td>
                                        <td>MM-DD-YYYY</td>
                                    </tr>
                                    <tr class="even gradeC">
                                        <td><a href="#">Initiative Title 4</a></td>
                                        <td>Initiative</td>
                                        <td>IA</td>
                                        <td>MM-DD-YYYY</td>
                                    </tr>
                                    <tr class="odd gradeX">
                                        <td><a href="#">Project title 8</a></td>
                                        <td>Project</td>
                                        <td>Owner</td>
                                        <td>MM-DD-YYYY</td>
                                    </tr>
                                </tbody>
                            </table>
                            <form action="project.jsp" >
                              <button type="submit" class="btn btn-outline btn-primary">Add Project</button>
                              <button type="submit" formaction="initiative.jsp" class="btn btn-outline btn-primary">Add Initiative</button>
                            </form>

                            
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
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

    <!-- DataTables JavaScript -->
    <script src="./vendor/datatables/js/jquery.dataTables.min.js"></script>
    <script src="./vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
    <script src="./vendor/datatables-responsive/dataTables.responsive.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="./dist/js/sb-admin-2.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
            responsive: true
    });    
    });
    </script>

</body>

</html>
