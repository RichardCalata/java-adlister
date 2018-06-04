
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${param.title}</title>
</head>
<body>
<form action="/guess" method="POST">
    <label for="guess">make a guess</label>
    <input type="string" id="guess" name="guess">
    <button type="submit">Guess</button>

</form>
</body>
</html>
