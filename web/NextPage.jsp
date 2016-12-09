<%--
  Created by IntelliJ IDEA.
  User: juanrazo
  Date: 12/9/16
  Time: 5:16 AM
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="user" class="mvc.UserData" scope="session"/>
<HTML>
<BODY>
You entered<BR>
Name: <%= user.getname() %><BR>
Email: <%= user.getEmail() %><BR>
Age: <%= user.getAge() %><BR>
</BODY>
</HTML>