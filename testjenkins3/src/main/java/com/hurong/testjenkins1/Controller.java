package com.hurong.testjenkins1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @RequestMapping(path = "/ping")
    public String ping() {

        return "这是第 1 次gittest!";


    }
}
