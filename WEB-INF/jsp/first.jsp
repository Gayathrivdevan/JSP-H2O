<html>
<head>

<title> post:ApacheTomcatServer</title>
</head>

<body>

<%-- START --%>

<%@ page import="java.io.*" %>
<%@ page import="hex.genmodel.easy.RowData" %>
<%@ page import="hex.genmodel.easy.EasyPredictModelWrapper" %>
<%@ page import="hex.genmodel.easy.prediction.*" %>
<%@ page import="Demo.MyClass" %>
<%@ page import="Demo.gbm_fe4d6729_adc9_48e8_9dc8_6ef651370ef7"%>

<%
MyClass tc = new MyClass();
out.println(tc.predictReturn());
%>
<%-- END --%>
</body>
</html>
