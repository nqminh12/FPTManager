<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Task List</title>
</head>
<body>
    <%@include file="/components/headerAndSideBar.jsp"%>
    <div style="position: relative; z-index: -3">
        <div style="position: absolute; left: 25vw; top: 10vh;">
            <c:forEach items="${taskList}" var="task">
                <div class="card">
                    <div class="card-body">
                        <div class="row align-items-center">
                            <div class="col-auto">
                                <!-- Your profile image or icon -->
                                <img src="img/task_icon.png" alt="Task Icon" class="profile-img">
                            </div>
                            <div class="col text-right">
                                <h5 class="card-title">${task.title}</h5>
                                <p class="card-text">${task.des}</p>
                                <p class="card-text">Start Date: ${task.start_date}</p>
                                <p class="card-text">End Date: ${task.end_date}</p>
                                <p class="card-text">Status: ${task.status}</p>
                                <!-- Additional details as needed -->
                                <!-- Example buttons or links -->
                                <div class="mt-3">
                                    <form action="taskDetailsServlet" method="post">
                                        <input type="hidden" name="taskId" value="${task.task_id}">
                                        <button class="btn btn-primary">View Details</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>

    <!-- Bootstrap and other scripts -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>
