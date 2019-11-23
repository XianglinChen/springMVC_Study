<%--
  Created by IntelliJ IDEA.
  User: 陈向林
  Date: 2019/11/23
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定</title>
</head>
<body>
<a href="param/testParam?userName=hehe">RequestMapping注解</a>

   <form action="param/saveAccount" method="post">
       姓名：<input type="text" name="username"/><br>
       密码：<input type="text" name="password"/><br>
       金额：<input type="text" name="money"/><br>
       用户的姓名：<input type="text" name="user.uname"/><br>
       用户的年龄：<input type="text" name="user.age"/><br>
       <input type="submit" value="提交"/><br>
   </form>

</body>
</html>
