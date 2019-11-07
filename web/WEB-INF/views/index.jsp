<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: z-one
  Date: 11/7/19
  Time: 4:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="showSandwich">
    <fieldset style="height: fit-content; width: fit-content">
      <legend>Sandwich Condiments Selection</legend>
      <form:checkboxes path="condiment"  items="${condiment}" name="condiment"/>
      <p><button type="submit">Order</button></p>
    </fieldset>
  </form>
  <p>Orders: ${result}</p>
  </body>
</html>
