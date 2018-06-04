
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Ads/Index" />
    </jsp:include>
    <title>View all Ads</title>
</head>
<body>
<jsp:include page="../partials/navbar.jsp" />
<div class="container">
    <h1>Welcome! Welcome to the Ads/Index!</h1>
</div>

<c:forEach var="ad" items="${ads}">
    <h1>${ad.title}</h1>
    <p>${ad.description}</p>
</c:forEach>
</body>
</html>
