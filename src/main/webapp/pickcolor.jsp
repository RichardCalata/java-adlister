
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${param.title}</title>

</head>
<body>
    <label for="color">Pick a Color</label>
    <form method="POST" id="color" action="/pickcolor" >

        <input type="text" name="color">
        <button type="submit" >Pick a color</button>

    </form>

</body>
</html>
