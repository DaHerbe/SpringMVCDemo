package com.daherbe.resources;

import java.util.ArrayList;
/**
 *
 * @author daherbe
 */

public class EmployeeManager
{
    ArrayList<EmployeeVO> employeeList = new ArrayList<>();
    
    public void addEmployee(String firstName, String lastName, String email)
    {
        employeeList.add(new EmployeeVO(firstName, lastName, email));
    }
    
    public void updateEmployee()
    {
        //TODO
    }
    
    public void deleteEmployee()
    {
        //TODO
    }
    
    public String getEmployeeDisplay()
    {
        String ret = "<h3>";
        
        for(EmployeeVO e : employeeList)
        {
            ret += e;
            ret += "<br>";
        }
        
        ret += "</h3>";
        
        return ret;
    }
}
