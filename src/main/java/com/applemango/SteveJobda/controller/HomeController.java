package com.applemango.SteveJobda.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = {"HomeController (->index.jsp)"})
@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {

        return "index";
    }
}
