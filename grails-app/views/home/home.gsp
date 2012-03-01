<%--
  Created by IntelliJ IDEA.
  User: michael
  Date: 12/2/11
  Time: 6:22 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
   <head>
       <title>Muster</title>
       <meta name="layout" content="main" />
   </head>
   <body>
       Welcome to Muster!
       <br>
       <br>
       Gone are the days when you coordinate activities with your friends by e-mail!
       <br>
       Use Muster to simplify your planning and spend your time instead with your friends
       <br>
       ...doing the things you want to do!
%{--following lines are based on the example found at:
http://stackoverflow.com/questions/6118077/grails-button-syntax--}%
        <br>
        <br>
        This is the Muster homepage.
        <br>
        <br>
        Click one of the links below to start your Muster experience!
        %{--adding a link to create new event action as per GSWG page 78--}%
        <br>
        <br>
        <g:link controller="GEvent" action="create">
         Create a New Event
        </g:link>
        %{--adding a link to create view all events as per GSWG page 78--}%
        <br>
        <br>
        <g:link controller="GEvent" action="list">
        View All Events
        </g:link>
        %{--adding a link to view all controllers (this is intended to be temporary)--}%
        <br>
        <br>
        <g:link controller="admin">
        Admin (see all controllers)
        </g:link>
        <br>
        <br>
        <br>
        <br>
           <g:link controller="GPerson" action="muggleTest">
               muggleTest
           </g:link>
       <br>
       <br>
           <g:link controller="GEvent" action="invite">
               Make an Invitation to a Newly Created Event
           </g:link>
       <br>
       <br>



   </body>

</html>