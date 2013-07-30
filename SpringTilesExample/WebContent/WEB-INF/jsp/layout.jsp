<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<title><tiles:getAsString name="title" /></title>
</head>
<body>
	<table border="1" height="100%" width="100%">
		<tr>
			<td colspan="2" height="10%">
				<div id="header">
					<div id="headerTitle">
						<tiles:insertAttribute name="header" />
					</div>
				</div>
			</td>
		</tr>
		<tr>
			<td width="20%">
				<div id="menu">
					<tiles:insertAttribute name="menu" />
				</div>
			</td>
			<td>
				<div id="content">
					<tiles:insertAttribute name="content" />
				</div>
			</td>
		</tr>
		<tr>
			<td colspan="2" height="10%">
				<div id="footer">
					<tiles:insertAttribute name="footer" />
				</div>
			</td>
		</tr>
	</table>
</body>
</html>