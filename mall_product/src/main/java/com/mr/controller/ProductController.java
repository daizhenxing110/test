package com.mr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("product")
public class ProductController {
    @GetMapping("we")
    public void testDome(){



        System.out.println(Test.test());
        System.out.println(Test.test());
    }


}
