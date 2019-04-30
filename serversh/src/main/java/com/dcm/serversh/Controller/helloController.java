package com.dcm.serversh.Controller;

import com.dcm.serversh.Model.User;
import com.dcm.serversh.Server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class helloController {
    //show index.html
    @GetMapping("/index")
    public ModelAndView getIndex()
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    //for example:insert into database
    @Autowired
    private UserService userService;
    @GetMapping("/add")
    public String addUser()
    {
        User user=new User();
        user.setId("123456");
        user.setName("jack");
        userService.addUser(user);

        return "hello:"+user.getName();
    }
}
