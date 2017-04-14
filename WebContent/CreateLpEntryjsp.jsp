<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a new Lp</title>
</head>
<body>
<form action = "CreateLpServlet" method = "post">
<font color="black" size=5>
<br><div align="center">Album Name: <br/> <input type = "text" name = "aN" value = ""></div>
<br><div align="center">Artist:<br/> <input type = "text" name = "ar" value = "" ></div>
<br><div align="center">Genre:<br/>  
 <select name="ge">
    <option value="Rock">Rock</option>
    <option value="HipHop">HipHop</option>
    <option value="Country">Country</option>
    <option value="Blues">Blues</option>
    <option value="Jazz">Jazz</option>
    <option value="Electronic">Electronic</option>
    <option value="Punk">Punk</option>
    <option value="Grunge">Grunge</option>
    <option value="Alt Rock">Alt-Rock</option>
    <option value="Blues">TripHop</option>
    <option value="Blues">Dubstep</option>
    <option value="Blues">Folk</option>
    <option value="Blues">Metal</option>
    <option value="Blues">Spoken Word</option>
    <option value="Blues">Trance</option>
  </select>
</div>
<br><div align="center">Year Released:<br/> 
<select name="ye">
<% for (int a = 1930; a<2017; a++){%>

	 <option value=<%=a%>><%=a%></option>
	    
<%}%>
   
  </select>
</div>


<br><div align="center"># of Tracks:<br/>
<select name="tr">
<% for (int b = 1; b<120; b++){%>

	 <option value=<%=b%>><%=b%></option>
	    
<%}%>
   
  </select>
</div>
<br><div align="center">Length(in Minutes):<br/>
<select name="le">
<% for (int c = 1; c<240; c++){%>

	 <option value=<%=c%>><%=c%></option>
	    
<%}%>
   
  </select>
</div>
</font>


<br><div align="center"><br/> <input type = "submit" name ="doThisToItem" value = "Submit Album"></div>

</form>
</body>
</html>