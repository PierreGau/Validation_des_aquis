<%-- 
    Document   : AffichageEtudiantsJSP
    Created on : 4 nov. 2022, 10:11:06
    Author     : pgaut
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des  etudiants</title>
    </head>
    <body>
        <ul>
        <c:forEach items="${listeEtudiant}" var="etudiant">   
            <p>- nom : <c:out value="${ etudiant.getNom()}" />  
                id : <c:out value="${ etudiant.getId()}" /> 
                <c:out value="${ etudiant.getMoyenne()}" /></p>
        </c:forEach>
        </ul>
    </body>
</html>
