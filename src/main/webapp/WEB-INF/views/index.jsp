<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>mt</title>
</head>
<body>
<form method="post" >
    <input name="num1">
    <input name="num2"><br>
    <input type="submit" value="Addition" name="check">
    <input type="submit" value="Subtraction" name="check">
    <input type="submit" value="Multiplication" name="check">
    <input type="submit" value="Division" name="check">
</form>
<h2>Kết quả phép ${check} là ${result}</h2>
</body>
</html>
