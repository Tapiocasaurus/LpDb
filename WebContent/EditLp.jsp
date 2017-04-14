<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ page import = "java.util.List, entities.LpEntry" %>
<title>Edit an existing Lp</title>
</head>
 <body >

<% 
int iD = (Integer)request.getAttribute("iD");
String albumName =  (String)request.getAttribute("aN");
String artistName =  (String)request.getAttribute("aR");
String genre =  (String)request.getAttribute("gE");
int years =  (Integer)request.getAttribute("yE");
int tracks =  (Integer)request.getAttribute("tR");
int length =  (Integer)request.getAttribute("lE");
request.setAttribute("iD", iD);
%>
<form action = "MasterControllerServlet" method = "post">

<%
List<LpEntry> allItems = (List<LpEntry>)request.getAttribute("AllItems");
%>

<font color="black" size=5>
<br><div align="center">Album Name: <br/> <input type = "text" name = "an" value = <%=albumName%>></div>
<br><div align="center">Artist:<br/> <input type = "text" name = "ar" value = <%=artistName%>></div>
<br><div align="center">Genre:<br/>  
 <select name="ge">
 	<option value=<%=genre%>><%=genre%></option>
    <option value="Rock">Rock</option>
    <option value="HipHop">HipHop</option>
    <option value="Country">Country</option>
    <option value="Blues">Blues</option>
    <option value="Jazz">Jazz</option>
    <option value="Electronic">Electronic</option>
    <option value="Punk">Punk</option>
    <option value="Grunge">Grunge</option>
    <option value="Alt Rock">Alt-Rock</option>
    <option value="TripHop">TripHop</option>
    <option value="Dubstep">Dubstep</option>
    <option value="Folk">Folk</option>
    <option value="Metal">Metal</option>
    <option value="Spoken Word">Spoken Word</option>
    <option value="Trance">Trance</option>
  </select>
</div>
<br><div align="center">Year Released:<br/> 
<select name="ye">
<option value=<%=years%>><%=years%></option>
<% for (int a = 1930; a<2017; a++){%>

	 <option value=<%=a%>><%=a%></option>
	    
<%}%>
   
  </select>
</div>


<br><div align="center"># of Tracks:<br/>
<select name="tr">
<option value=<%=tracks%>><%=tracks%></option>
<% for (int b = 1; b<120; b++){%>

	 <option value=<%=b%>><%=b%></option>
	    
<%}%>
   
  </select>
</div>
<br><div align="center"> Length(in Minutes):
<select name="le">
<option value=<%=length%>><%=length%></option>
<% for (int c = 1; c<240; c++){%>

	 <option value=<%=c%>><%=c%></option>
	    
<%}%>
   
  </select>
</div>

</font>


<br><div align="center"><br/> <input type = "submit" name ="doThisToItem" value = "Submit Changes"></div>

</form>
</body>
</html>