<%--
  Created by IntelliJ IDEA.
  User: michael
  Date: 2/3/12
  Time: 8:46 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>muggleTest - to display controls to create a new GPerson</title>
</head>
<body>
Welcome to the "muggle" controller!
<br>
<br>
Use this to activate "muggleTest"!
<br>
<br>
<g:link controller="GEvent" action="create">
    Create a New Event
</g:link>
%{--adding a link to as per GSWG page 78--}%
<br>
<br>
<g:link controller="GEvent" action="list">
    View All Events
</g:link>
<br>
<br>
%{--the following is suspect; needs work... wrong action placed here--}%
<g:link controller="GPerson" action="list">
    list all the GPerson entries, including the one just newly added
</g:link>
%{--comment--}%
<br>
<br>
<g:link controller="admin">
    Admin (see all controllers)
</g:link>

</body>
</html>