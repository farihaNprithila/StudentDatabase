<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  @author Prithila
  @since 7/16/2021
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Course List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
          integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
</head>

<nav class="navbar navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Course List</a>
</nav>

<body>
    <div class="p-3" align="center">
        <h4>Courses</h4>
        <div class="w-75 p-3 table-responsive">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th scope="col">Course Code</th>
                    <th scope="col">Course Name</th>
                    <th scope="col">Department</th>
                    <th scope="col">Date Added</th>
                    <th scope="col">Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="course" items="${courses}" varStatus="status">
                    <tr>
                        <td><c:out value="${course.id}"/></td>
                        <td><c:out value="${course.name}"/></td>
                        <td><c:out value="${course.departmentID}"/></td>
                        <td><c:out value="${course.creationDate}"/></td>
                        <td>
                            <a class="btn btn-success" href="<c:url value='/editcourse/${courses[status.index].id}' />"><i
                                    class="fas fa-edit"></i></button>
                            </a> &nbsp;&nbsp;&nbsp;
                            <a class="btn btn-danger" href="<c:url value='/deletecourse/${courses[status.index].id}' />"><i
                                    class="far fa-trash-alt"></i></button>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <a class="btn btn-primary float-left" href="/addcourse">Add New Course</a>
        </div>
    </div>
</body>
</html>