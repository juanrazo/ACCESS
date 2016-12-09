<%--
  Created by IntelliJ IDEA.
  User: juanrazo
  Date: 12/9/16
  Time: 5:16 AM
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="user1" class="mvc.UserData" scope="session"/>
<jsp:setProperty name="user1" property="*"/>
<HTML>
<BODY>
<%
    String redirectURL = "NextPage.jsp";
    response.sendRedirect(redirectURL);
%>
</BODY>
</HTML>
