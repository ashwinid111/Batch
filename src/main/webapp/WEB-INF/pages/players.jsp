players page
<%@page import="com.tka.controller.Player"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tka.controller.User"%>
<%-- <%
ArrayList<User> al=(ArrayList<User>) request.getAttribute("userList");
for(User user:al){
	out.println(user.getUname());
	out.println(user.getPassword());
}
%> --%>
<%
ArrayList<Player> players=(ArrayList<Player>) request.getAttribute("playerlist");
%>
<table border="1">
<tr>
<th>Player Id</th>
<th>Player Name</th>
<th>Player Age</th>
</tr>
<%
for(Player player:players){
%>
<tr>
<th><%= player.getPid() %></th>
<th><%= player.getPlayerName() %></th>
<th><%= player.getPlayerAge() %></th>
</tr>
<%
}
%>
</table>