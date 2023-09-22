<%-- 
    Document   : mostrar-persona
    Created on : 21 sep. 2023, 14:24:21
    Author     : claudio.vilas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="titulo" /></title>
    </head>
    <body>
        <h1><s:property value="titulo" /></h1>
        <s:form>
            <s:textfield name="nombre" />
            <s:submit key="persona.boton" name="submit" />
        </s:form>
        <div>
            <s:textfield name="valor" /> : <s:property value="nombre" />
        </div>
    </body>
</html>
