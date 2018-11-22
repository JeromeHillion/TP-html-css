<%--
  Created by IntelliJ IDEA.
  User: gide
  Date: 21/11/18
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Unicode</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
</head>
<body>
<h1>Les caractères de 0 à 255</h1>
<div class="table-responsive">
<p/>
<hr width="100%"/>

<table class="table table-striped table-hover table-bordered">

    <c:forEach var="index" items="${indexAscii}">

        <td >
            <div class="table-success">${index}</div>
            <div  class="table-info">&#${index}</div>
            <c:if test="${index%32==0}">
                <tr></tr>
            </c:if>
        </td>
    </c:forEach>

</table>
</div>
<%-- <tr>
     <td><div>64</div> <div>&#64;</div> </td>
     <td><div>65</div> <div>&#65;</div></td>
 </tr>
</table>--%>

</body>
</html>