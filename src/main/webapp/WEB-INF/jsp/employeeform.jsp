<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Demo</title>
    </head>
    <body>
        
        <h2>Enter the employee data:</h2>
        
        <div name="employeeForm">
            <form method="post" action="employeedemo">
                <label>First name: </label>
                <input type="text" name="firstName" />
                <br>
                <label>Last name: </label>
                <input type="text" name="lastName" />
                <br>
                <label>E-mail: </label>
                <input type="text" name="email" />
                <br>
                <br>
                <input type="submit" value="Add Employee">
            </form>
        </div>
    </body>
</html>
