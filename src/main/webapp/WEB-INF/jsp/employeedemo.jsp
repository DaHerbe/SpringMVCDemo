<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Demo</title>
    </head>
    <body>
        <div name="employees" style="width:300px">
            <form>
                <fieldset>
                    <legend>Current Employees</legend>
                    <select name="employeeList" size="5" style="width:100%" >
                        <option value="employee1">Test Employee 1</option>
                        <option value="employee2">Test Employee 2</option>
                        <option value="employee3">Test Employee 3</option>
                    </select>
                </fieldset>
            </form>
        </div>
        
        <div>
            ${employeeList}
        </div>
        
        <br>
        
        <div name="buttons">
            <button name="addButton" onclick="location.href='employeeform'">Add Employee</button>
            <button name="editButton">Edit</button>
            
            <form method="delete" action="employeedemo">
                <button name="deleteButton">Delete</button>
            </form>
        </div>
        
    </body>
</html>
