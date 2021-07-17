<%--
  @author Prithila
  @since 6/29/2021
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
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
            <form method="POST" action="/addcourse" modelAttribute="addCourse">
                <div class="form-row" align="center">
                    <div class="col-md mb-3">
                        <label for="courseName">Course Name</label>
                        <input type="text" class="form-control" id="courseName" placeholder="Enter Course Name" required>
                    </div>
                </div>
                <div class="form-row">
                    <div class="col-md-6 mb-3">
                        <label for="courseID">Course Code</label>
                        <input type="text" class="form-control" id="courseID" placeholder="Enter Course Code" required>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="department">Department</label>
                        <input type="text" class="form-control" id="department" placeholder="Enter Department" required>
                    </div>
                </div>
                <button class="btn btn-primary" type="submit">Submit course</button>
            </form>
        </div>
    </div>
</body>

</html>