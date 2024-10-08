<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>

<%--Upload files--%>
<h3>Upload File</h3>
<form method="post" action="/UploadServlet" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="Upload">
</form>


<a href="hello-servlet">Hello Servlet</a>
</body>
</html>
