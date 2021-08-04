package com.daherbe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author daherbe
 */

@Controller
public class AboutMeController
{
    @RequestMapping("/aboutme")
    public ModelAndView handleRequest()
    {
        return new ModelAndView("aboutme");
    }
}
