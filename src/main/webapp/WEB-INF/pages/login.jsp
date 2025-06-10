Login Page...User List

<%
out.println(request.getAttribute("msg"));

%>
<form action="logincheck">
	<label>Username:</label> <input type="text" name="uname" value=""
		placeholder="Enter Username" autocomplete="off" /> <br> <br>
	<label>Password:</label> 
	<input type="password" name="password"
		value="" placeholder="Enter Password" autocomplete="off" /> <br>
	<br> <input type="submit" value="Sign In" />
</form>