<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title><tiles:insertAttribute name="title"></tiles:insertAttribute></title>
</head>
<body>
	<header>
		<tiles:insertAttribute name="header"/>
	</header>
	<div id="body">
		<tiles:insertAttribute name="body"/>
	</div>
	<footer>
		<tiles:insertAttribute name="footer"/>
	</footer>
</body>
</html>