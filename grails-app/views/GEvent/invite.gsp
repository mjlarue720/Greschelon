<%--
  Created by IntelliJ IDEA.
  User: michael
  Date: 2/3/12
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>"invite" - to display controls to create an invitation</title>
</head>
<body>
Welcome to the "invite" controller!
<br>
<br>
Use this to activate "invite"!
<br>
<br>
<g:link controller="GEvent" action="invite">
    Invoke the "invite" Method from GEventController, and STAY ON THIS PAGE
</g:link>
<br>
<br>
<g:link controller="GEvent" action="index">
    List ALL Events (from the index action associated with GEvent)
</g:link>
<br>
<br>

<br>
<br>
<g:link controller="invitation" action="serviceMethod1">
    Invoke "serviceMethod1" Method from InvitationController
</g:link>
<br>
<br>
<g:link controller="invitation" action="serviceMethod2">
    Invoke "serviceMethod2" Method from InvitationController
</g:link>
<br>
<br>

<g:form url='[controller: "invitation", action: "index"]' >
        %{--id="searchableForm"--}%
        %{--name="searchableForm"--}%
        %{--method="get">--}%
    <g:textField name="q" value="${params.q}" size="50"/>
    <input type="submit" value="Search" />
</g:form>

<br>
<br>
%{--<g:link controller="Invitation" action="pickEventFromList">--}%
    %{--Pick (action = pickEventFromList)--}%
%{--</g:link>--}%
%{--<br>--}%
<br>

</body>
</html>