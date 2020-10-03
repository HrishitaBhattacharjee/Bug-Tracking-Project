<%@ page language="java"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function getAllProjects(){
	alert("in func");
}

</script>
</head>
<body>
<% UserDetails u=(UserDetails)request.getAttribute("details");
      
   %> 
 Name:   <%out.println(u.getName());%>
 Email Address:   <%=u.getEmailAddress() %>
 Role:     <%=u.getRole() %>
 
<form action="createProject">
<button type="button" name="btn" onclick="getAllProjects()">Display all projects</button>
<button type="submit" name="btn" >Create Project</button>

</form>

   
<div id="getProjects">

</div>

</body>
</html>