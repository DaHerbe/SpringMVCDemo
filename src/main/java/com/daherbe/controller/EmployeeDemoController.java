package com.daherbe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.daherbe.resources.EmployeeManager;
/**
 *
 * @author daherbe
 */
@Controller
@RequestMapping("/employeedemo")
//@SessionAttributes("employee")
public class EmployeeDemoController
{
    EmployeeManager manager = new EmployeeManager();
    
    @RequestMapping(method = RequestMethod.GET)
    public String getHandler(Model model)
    {
        return "employeedemo";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String postHandler(HttpServletRequest request, Model model)
    {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        
        manager.addEmployee(firstName, lastName, email);
        
        model.addAttribute("employeeList", manager.getEmployeeDisplay());
        return "employeedemo";
    }
    
    @RequestMapping(method = RequestMethod.DELETE)
    public String updateHandler(Model model)
    {
        return "employeeform";
    }
    
    /*
    @RequestMapping(method = RequestMethod.GET)
    public String handleRequest(Model model)
    {
        return "employeedemo";
    }
    */
}
