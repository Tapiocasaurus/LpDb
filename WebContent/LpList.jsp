<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page import = "java.util.List, entities.LpEntry" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add an Lp or Change an existing Lp</title>
</head>
<%
        //String bgColor = "1B1716";
     %>
<body>
<form action = "MasterControllerServlet" method = "post">


<%
List<LpEntry> allItems = (List<LpEntry>)request.getAttribute("AllItems");
%>
<font color="black" size=9>

 <br><div align="center"> LpDb</div>
 
 </font>
 <font color="black" size=1>

 <br><div align="center"> A Long Play Database for audiophiles and record hoarders alike.</div>
<br><div align="center"> ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</div>
 
 
 </font>
 <font color="black">
 <div align="center">
<table border= 1 bgcolor="D7E2E8" cellpadding = 5>

<tr>

<th>Id</th>
<th>Album Name</th>
<th>Artist Name</th>
<th>Genre</th>
<th>Year</th>
<th># of Tracks</th>
<th>Length (in minutes)</th>
</tr>

<%
for(int i = 0; i<allItems.size(); i++){
%>


<tr>

<td><%= allItems.get(i).getId()%></td>
<td><%= allItems.get(i).getAlbumName()%></td>
<td><%= allItems.get(i).getArtist()%></td>
<td><%= allItems.get(i).getGenre()%></td>
<td><%= allItems.get(i).getYear()%></td>
<td><%= allItems.get(i).getTracks()%></td>
<td><%= allItems.get(i).getLength()%></td>
</tr>




<%
}
%>
</table>
</div>

<br><div align="center">Select the ID you wish to Edit:
<select name="id">

<%
for(int i = 0; i<allItems.size(); i++){
%>
	<option value= <%=allItems.get(i).getId()%>><%=allItems.get(i).getId()%></option>  
<% 
} 
%>
 
  </select>
</div>
<br/>

<br><div align="center"><br/> <input type = "submit" name ="doThisToItem" value = "Delete Album"></div>
<br><div align="center"><br/> <input type = "submit" name ="doThisToItem" value = "Edit Album"></div>
<br><div align="center"><br/> <input type = "submit" name ="doThisToItem" value = "Add a New Album"></div>

</form>
</body>
</html>
</font>
