<%--
  Created by IntelliJ IDEA.
  User: michael
  Date: 12/2/11
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
   <head>
       <title>Muster Application Administration</title>
       <meta name="layout" content="main" />
   </head>
   <body>
       <div class="dialog" style="margin-left:20px;width:60%;">
           <ul>
             <g:each var="c" in="${grailsApplication.controllerClasses}">
                   <li class="controller"><g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link></li>
             </g:each>
           </ul>
       </div>
   </body>
</html>