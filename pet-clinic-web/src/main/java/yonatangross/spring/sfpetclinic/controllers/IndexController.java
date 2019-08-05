package yonatangross.spring.sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "templates/index.html"})
    public String index() {
        return "index";
    }
}


