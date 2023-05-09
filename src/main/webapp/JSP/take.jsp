<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление пользователя</title>
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
<div>
    <input type="text" id="Name" placeholder="Имя">
    <input type="text" id="LN" placeholder="Фамилия">
    <input type="text" id="MN" placeholder="Отчество">
    <input type="text" id="Age" placeholder="Возраст">
    <input type="text" id="Lng" placeholder="Язык">

    <button type="button" name="data" onclick="req()" >Добавить</button>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="js/takeJSON.js"></script>
</body>
</html>
