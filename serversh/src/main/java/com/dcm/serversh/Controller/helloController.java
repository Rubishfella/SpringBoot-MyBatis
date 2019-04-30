package com.dcm.serversh.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class helloController {
    @GetMapping("/index")
    public ModelAndView getIndex()
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}
