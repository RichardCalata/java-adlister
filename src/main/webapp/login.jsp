<%--
  Created by IntelliJ IDEA.
  User: richardcalata
  Date: 5/31/18
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
if("POST".equals(request.getMethod())) {
    String username = request.getParameter("username");
//    String password = request.getParameter("password");
    if (username.equalsIgnoreCase("admin")) {

        response.sendRedirect("profile.jsp");
    }
}


%>

<form method="POST" action="login.jsp">
    <label for="username">username</label>
    <input id ="username" name="username" type="text" placeholder="username">
    <br>

    <%--<label for="password">Password</label>--%>
    <%--<input id="password" name="password" type="password" placeholder="password">--%>
    <br>

    <button type="submit">submit</button>
</form>

