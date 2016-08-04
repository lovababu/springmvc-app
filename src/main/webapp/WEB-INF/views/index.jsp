<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Maven + Spring MVC</title>
</head>
<body>
<form>
    <select>
        <c:forEach items="${genders}" var="key">
            <option value="${key}">${key}</option>
        </c:forEach>
    </select>
</form>
</body>
</html>