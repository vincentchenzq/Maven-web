<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8" />
    <script src="https://cdn.bootcss.com/jquery/2.0.0/jquery.min.js"></script>
</head>
<body>
<h2>Hello World!</h2>
haha
<div>
    ${currentUser}
</div>
<form action="/test">
    <input type="text" name="userId" id="userId">
    <br>
    <input type="text" name="password" id="password">
    <br>
</form>

<button id="submit">提交</button>
<script>
    $("#submit").click(function(){
        $.ajax({
            url:'/test',
            success:function(data){
                debugger;
            },
            error:function(error){
                debugger
            }
        });
    });
</script>
</body>
</html>
