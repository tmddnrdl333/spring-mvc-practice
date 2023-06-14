package com.applemango.SteveJobda.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = {"IndexController (->index.jsp)"})
@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
