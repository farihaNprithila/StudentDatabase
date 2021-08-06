<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<%--
  @author Prithila
  @since 6/29/2021
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <title>New course</title>
</head>

<nav class="navbar navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Add Course</a>
</nav>

<body>
    <div class="mt-lg-5 col-md-12" align="center">
        <div class="w-50 p-3 rounded" style="background-color: #eee;">
            <form:form method="POST" action="/addcourse" modelAttribute="addCourse">
                <c:choose>
                    <c:when test="${course != null}">
                        <div class="form-row" align="center">
                            <div class="col-md mb-3">
                                <form:label for="name" path="name">Course Name</form:label>
                                <form:input path="name" type="text" class="form-control" placeholder="Enter Course Name"
                                            value="${course.name}"/>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="col-md-6 mb-3">
                                <form:label for="id" path="id">Course Code</form:label>
                                <form:input path="id" type="text" class="form-control" placeholder="Enter Course Code"
                                            value="${course.id}"/>
                            </div>
                            <div class="col-md-6 mb-3">
                                <form:label for="departmentID" path="departmentID">Department ID</form:label>
                                <form:input path="departmentID" type="number" class="form-control"
                                            placeholder="Enter Department"
                                            value="${course.departmentID}"/>
                            </div>
                        </div>
                        <input type="hidden" id="task" name="task" value="update">
                    </c:when>
                    <c:otherwise>
                        <div class="form-row" align="center">
                            <div class="col-md mb-3">
                                <form:label for="name" path="name">Course Name</form:label>
                                <form:input path="name" type="text" class="form-control" placeholder="Enter Course Name"/>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="col-md-6 mb-3">
                                <form:label for="id" path="id">Course Code</form:label>
                                <form:input path="id" type="text" class="form-control" placeholder="Enter Course Code"/>
                            </div>
                            <div class="col-md-6 mb-3">
                                <form:label for="departmentID" path="departmentID">Department ID</form:label>
                                <form:input path="departmentID" type="number" class="form-control"
                                            placeholder="Enter Department"/>
                            </div>
                        </div>
                        <input type="hidden" id="task" name="task" value="add">
                    </c:otherwise>
                </c:choose>
                <button class="btn btn-primary" type="submit">Submit course</button>
            </form:form>
        </div>
    </div>
</body>

</html>