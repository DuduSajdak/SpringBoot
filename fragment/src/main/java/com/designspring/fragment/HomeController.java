
package com.designspring.fragment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/blog")
    public String blog(){
        return "blog";
    }
    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
    @RequestMapping("/oi")
    public String oi(){
        return "oi";
    }
}
