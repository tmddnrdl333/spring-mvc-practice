package com.applemango.SteveJobda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping("/")
    public String index() {
//        // TODO: delete below
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try (Connection con = DriverManager
//                .getConnection(
//                        "jdbc:mysql://localhost:3306/jobjar",
//                        "{id}",
//                        "{pw}"
//                )
//        ) {
//            System.out.println(con);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        // ~

        return "index";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
