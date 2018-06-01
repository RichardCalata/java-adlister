<%@ page import="org.apache.commons.lang3.StringUtils" %><%--
  Created by IntelliJ IDEA.
  User: richardcalata
  Date: 6/1/18
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

    <title>${param.title}</title>
</head>
<body>
    <h1>Enter Name</h1>
    <form method="POST" action="/name">
        <label for="name"></label>
        <input id="name" type="text" name="name">
        <button type="submit">Submit</button>
    </form>


</body>
</html>
