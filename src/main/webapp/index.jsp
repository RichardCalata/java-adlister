<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "some title" %></title>
    <%@ include file="partials/head.jsp"%>
    <%@ include file="partials/navbar.jsp"%>
    <%--<%@ include file="./style.css"%>--%>

</head>
<body>
    <c:if test="true">
        <h1>This is Index.JSP</h1>
    </c:if>
    <%@ include file="login.jsp" %>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>


</body>
</html>
