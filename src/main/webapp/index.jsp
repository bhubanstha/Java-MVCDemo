<%@page import="org.springframework.core.SpringVersion"%>
<html>
<body>
<h2>Hello World!</h2>

<form action="add">
	<input type="text" name="t1" value="1"><br/><br/>
	<input type="text" name="t2" value="2"><br/><br/>
	<input type="submit" value="submit" />
	
	<span> <%= SpringVersion.getVersion() %></span>
</form>
</body>
</html>
