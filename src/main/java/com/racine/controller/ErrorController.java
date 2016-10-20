package com.racine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sunrx on 2016/10/9.
 */

public class ErrorController implements org.springframework.boot.autoconfigure.web.ErrorController {
    @RequestMapping
    public String handleError(){
        return "404";
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
