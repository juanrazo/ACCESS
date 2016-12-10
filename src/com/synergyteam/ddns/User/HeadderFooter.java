package com.synergyteam.ddns.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by juanrazo on 12/9/16.
 */
public class HeadderFooter{

    protected static void printHeadder(HttpServletResponse response, String htmlBody) throws ServletException, IOException {
        String htmlHeadder = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <meta name=\"description\" content=\"\">\n" +
                "    <meta name=\"author\" content=\"\">\n" +
                "\n" +
                "    <title>ACCESS</title>\n" +
                "\n" +
                "    <!-- Bootstrap Core CSS -->\n" +
                "    <link href=\"./vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
                "\n" +
                "    <!-- MetisMenu CSS -->\n" +
                "    <link href=\"./vendor/metisMenu/metisMenu.min.css\" rel=\"stylesheet\">\n" +
                "\n" +
                "    <!-- Custom CSS -->\n" +
                "    <link href=\"./dist/css/sb-admin-2.css\" rel=\"stylesheet\">\n" +
                "\n" +
                "    <!-- Morris Charts CSS -->\n" +
                "    <link href=\"./vendor/morrisjs/morris.css\" rel=\"stylesheet\">\n" +
                "\n" +
                "    <!-- Custom Fonts -->\n" +
                "    <link href=\"./vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
                "\n" +
                "    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n" +
                "    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n" +
                "    <!--[if lt IE 9]>\n" +
                "    <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n" +
                "    <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n" +
                "    <![endif]-->\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "<div id=\"wrapper\">";
        String htmlNav = "<!-- Navigation -->\n" +
                "<nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\n" +
                "    <div class=\"navbar-header\">\n" +
                "        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n" +
                "            <span class=\"sr-only\">Toggle navigation</span>\n" +
                "            <span class=\"icon-bar\"></span>\n" +
                "            <span class=\"icon-bar\"></span>\n" +
                "            <span class=\"icon-bar\"></span>\n" +
                "        </button>\n" +
                "        <a class=\"navbar-brand\" href=\"index.jsp\">Access</a>\n" +
                "    </div>\n" +
                "    <!-- /.navbar-header -->\n" +
                "\n" +
                "    <ul class=\"nav navbar-top-links navbar-right\">\n" +
                "        <li class=\"dropdown\">\n" +
                "            [Name]\n" +
                "        </li>\n" +
                "        <!-- /.dropdown -->\n" +
                "        <li class=\"dropdown\">\n" +
                "            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n" +
                "                <i class=\"fa fa-user fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\n" +
                "            </a>\n" +
                "            <ul class=\"dropdown-menu dropdown-user\">\n" +
                "                <li><a href=\"#\"><i class=\"fa fa-user fa-fw\"></i> User Profile</a>\n" +
                "                </li>\n" +
                "                <li><a href=\"#\"><i class=\"fa fa-gear fa-fw\"></i> Settings</a>\n" +
                "                </li>\n" +
                "                <li class=\"divider\"></li>\n" +
                "                <li><a href=\"../../web/login.html\"><i class=\"fa fa-sign-out fa-fw\"></i> Logout</a>\n" +
                "                </li>\n" +
                "            </ul>\n" +
                "            <!-- /.dropdown-user -->\n" +
                "        </li>\n" +
                "        <!-- /.dropdown -->\n" +
                "    </ul>\n" +
                "    <!-- /.navbar-top-links -->\n" +
                "    <div class=\"navbar-default sidebar\" role=\"navigation\">\n" +
                "        <div class=\"sidebar-nav navbar-collapse\">\n" +
                "            <ul class=\"nav\" id=\"side-menu\">\n" +
                "                <li>\n" +
                "                    <a href=\"index.jsp\"><i class=\"fa fa-inbox\"></i> My Resources</a>\n" +
                "                </li>\n" +
                "                <li>\n" +
                "                    <a href=\"directory.jsp\"><i class=\"fa fa-align-left\"></i> Directory</a>\n" +
                "                </li>\n" +
                "                <li>\n" +
                "                    <a href=\"analysis.jsp\"><i class=\"fa fa-bar-chart-o\"></i> Analysis</a>\n" +
                "                </li>\n" +
                "\n" +
                "            </ul>\n" +
                "        </div>\n" +
                "        <!-- /.sidebar-collapse -->\n" +
                "    </div>\n" +
                "    <!-- /.navbar-static-side -->\n" +
                "</nav>";
        String htmlfooter = "\n" +
                "    <!-- jQuery -->\n" +
                "    <script src=\"./vendor/jquery/jquery.min.js\"></script>\n" +
                "\n" +
                " <script>\n" +
                "$('form').submit(function(ev){\n" +
                "ev.preventDefault();\n" +
                "console.log('clicked',ev.originalEvent,ev.originalEvent.explicitOriginalTarget)\n" +
                "})\n" +
                "</script>"+
                "    <!-- Bootstrap Core JavaScript -->\n" +
                "    <script src=\"./vendor/bootstrap/js/bootstrap.min.js\"></script>\n" +
                "\n" +
                "    <!-- Metis Menu Plugin JavaScript -->\n" +
                "    <script src=\"./vendor/metisMenu/metisMenu.min.js\"></script>\n" +
                "\n" +
                "    <!-- DataTables JavaScript -->\n" +
                "    <script src=\"./vendor/datatables/js/jquery.dataTables.min.js\"></script>\n" +
                "    <script src=\"./vendor/datatables-plugins/dataTables.bootstrap.min.js\"></script>\n" +
                "    <script src=\"./vendor/datatables-responsive/dataTables.responsive.js\"></script>\n" +
                "\n" +
                "    <!-- Custom Theme JavaScript -->\n" +
                "    <script src=\"./dist/js/sb-admin-2.js\"></script>\n" +
                "\n" +
                "    <!-- Page-Level Demo Scripts - Tables - Use for reference -->\n" +
                "    <script>\n" +
                "    $(document).ready(function() {\n" +
                "        $('#dataTables-example').DataTable({\n" +
                "            responsive: true\n" +
                "    });    \n" +
                "    });\n" +
                "    </script>\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>";

        HttpServletResponse resp = response;
        PrintWriter out= resp.getWriter();
        resp.setContentType("text/html");
        out.println(htmlHeadder);
        out.println(htmlNav);
        out.println(htmlBody);
        out.println(htmlfooter);


    }


}
