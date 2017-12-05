<%--
  Created by IntelliJ IDEA.
  User: dch67
  Date: 4/24/2017
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel = "stylesheet", type = "text/css", href = "style/mystyle.css"/>
</head>
<body>
<h1>Thank you for joining our email list</h1>
<p>Here is the information that you entered:</p>

<label>Email:</label>
<span>${anyUser.email}</span><br>
<label>First Name:</label>
<span>${anyUser.firstName}</span><br>
<label>Last Name:</label>
<span>${anyUser.lastName}</span><br>
<p>To enter another email address , click on the back button in your browser, or the return button below</p>

<form action="" method="get">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">

</form>


</body>
</html>
