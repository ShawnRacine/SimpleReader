package com.racine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sunrx on 2016/9/26.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.put("id","8901");
        return "main";
    }

//    @RequestMapping("/right")
//    public String Right(@RequestParam(value = "name", required = false) String name) {
//        return "right-sidebar";
//    }
}
