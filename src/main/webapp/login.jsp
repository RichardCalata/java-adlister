
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile");
        }
    }
%>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />
    <div class="container">
        <h1>Please Log In</h1>
        <form action="/login.jsp" method="POST">
            <div class="form-group">
                <label for="username">Username</label>
                <input id="username" name="username" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input id="password" name="password" class="form-control" type="password">
            </div>
            <input type="submit" class="btn btn-primary btn-block" value="Log In">
        </form>
    </div>
</body>
</html>
=======
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

>>>>>>> a7a0d43917715bcab4ced3a89f7a1f54ac8aadd1
