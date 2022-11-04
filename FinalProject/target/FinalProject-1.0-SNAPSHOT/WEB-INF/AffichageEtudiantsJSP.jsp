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
        <table>
            <tbody>
            <tr> <th>Photo</th> <th>Nom</th> <th>ID</th> <th>Moyenne</th></tr>
        <c:forEach items="${listeEtudiant}" var="etudiant">   
            
                <tr>
                    <td width="200"height="200"><img src="${ etudiant.getPhoto()}" alt="Photo de l'etudiant"  width="200"height="200">
                    </td>
                    <td width="200"height="200">
                        <c:out value="${ etudiant.getNom()}" />  
                    </td>
                    <td width="200"height="200">
                        <c:out value="${ etudiant.getId()}" /> 
                    </td>
                    <td width="200"height="200">
                        <c:out value="${ etudiant.getMoyenne()}" />
                    </td>          
        </c:forEach>
            </tbody>
        </table>
    </body>
</html>
