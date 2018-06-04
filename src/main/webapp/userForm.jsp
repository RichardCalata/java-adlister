
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${param.title}</title>

</head>
<body>
<form action="/addition">
    <label for="num1">Enter a Number</label>
    <input type="number" id="num1">
    <label for="num2">Enter a Number</label>
    <input type="number" id="num2">
    <button type="submit">Calculate</button>

</form>
</body>
</html>
