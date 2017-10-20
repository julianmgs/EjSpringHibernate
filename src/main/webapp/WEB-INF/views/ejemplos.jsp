<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Ejemplo</title>
</head>
<body>

<c:forEach items="${ejemplos}" var="e">
${e.id} - ${e.texto}
<br>
</c:forEach>

</body>
</html>