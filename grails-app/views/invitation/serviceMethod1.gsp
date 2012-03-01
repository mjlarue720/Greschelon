
<%--
  Created by IntelliJ IDEA.
  User: michael
  Date: 2/16/12
  Time: 11:45 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>Here is the "serviceMethod1" groovy server page</title>
</head>
<body>
Welcome to the "assemble MESSAGE body" groovy server page!
<br>
<br>
Use this to activate "serviceMethod1"!
<br>
<br>
%{--todo link works from method defined in controller, but not when in service--}%
<g:link controller="invitation" action="serviceMethod1">
    Invoke "serviceMethod1" which PRINTS from InvitationController (InvitationService)
</g:link>
<br>
<br>
%{--<g:link controller="invitation" action="serviceMethod2">--}%
    %{--Invoke "serviceMethod" from InvitationController (InvitationService)--}%
%{--</g:link>--}%
%{--<br>--}%
%{--<br>--}%
</body>
</html>