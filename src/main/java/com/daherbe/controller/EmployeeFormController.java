package com.daherbe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author daherbe
 */
@Controller
@RequestMapping("/employeeform")
//@SessionAttributes("employee")
public class EmployeeFormController
{
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView handleRequest(ModelMap modelMap)
    {
        return new ModelAndView("employeeform");
    }
}
