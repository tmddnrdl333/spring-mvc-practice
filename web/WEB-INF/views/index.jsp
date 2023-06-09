<%--
  Created by IntelliJ IDEA.
  User: jsw0824
  Date: 2023-06-08
  Time: 오전 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SteveJobda</title>
</head>
<body>
    <h2>Well Calm two SteveJobda!</h2>
    <h3>안영하세요.</h3>
    <div>${data}</div>
    <div>
        <form action="/main" method="get">
            <input type="text" name="id" placeholder="ID" value=""/>
            <input type="password" name="pw" placeholder="PW" value=""/>
            <input type="submit" value="전송"/>
        </form>
    </div>
    <div>
        <form action="/login" method="post">
            <input type="text" name="id" placeholder="ID" value=""/>
            <input type="password" name="pw" placeholder="PW" value=""/>
            <input type="submit" value="전송"/>
        </form>
    </div>
<%--    <img src="/img/img1.png"/>--%>
</body>
</html>
