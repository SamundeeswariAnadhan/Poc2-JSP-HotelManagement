<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.ArrayList" %>
    <%@ page import = "com.HotelRegistration.Homeinfo" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"  href="css/home.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%ArrayList<Homeinfo> homeInfo = new ArrayList<Homeinfo>(); 
  homeInfo = (ArrayList<Homeinfo>)request.getAttribute("availability");
%>
</head>
<body>

<div class="header">
  <h1>Welcome</h1>
  <p>THE RESEDIAN HOTEL</p>
</div> <table>
        <thead>
            <tr>
                <th>Serial Number</th>
                <th>Room Number</th>
                <th>Room Name</th>
            </tr>
       </thead>
        <tbody>
             <% for(int i = 0; i < homeInfo.size(); i++) {
            	Homeinfo Hinfo = new Homeinfo();
                Hinfo = homeInfo.get(i);
                
            %>


            <tr>
                <td><%=Hinfo.getSno()%></td>
                <td><%=Hinfo.getRoom_Number()%></td>
                <td><%=Hinfo.getRoom_Name()%></td>
               </tr>
            <%
            }
            %> 
         </tbody>
    </table>
  
    
</body>
</html>