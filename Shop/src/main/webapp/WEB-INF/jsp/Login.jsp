<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>S H O P</title>
</head>

<body>
<center>
LOGIN
<form action="submit">
 
 <table>
            <tr>
                <td class="f1_label">User Name :</td><td><input type="text" name="username" value="" />
                </td>
            </tr>
            <tr>
                <td class="f1_label">Password  :</td><td><input type="password" name="password" value=""  />
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" name="login" value="LOGIN"  />
                </td>
            </tr>
        </table>
        </center>
</form>
</body>
</html>