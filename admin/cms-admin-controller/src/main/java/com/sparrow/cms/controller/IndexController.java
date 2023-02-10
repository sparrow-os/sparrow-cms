package com.sparrow.cms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {
    @GetMapping("/{url}")
    public ModelAndView all(@PathVariable("url") String url) {
        return new ModelAndView(url);
    }
}
