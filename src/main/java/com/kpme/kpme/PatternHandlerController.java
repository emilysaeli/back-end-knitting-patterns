package com.kpme.kpme;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatternHandlerController {

    private static final String template = "Here is your pattern: %s!";

    @GetMapping("")
    PatternHandler patternHandler(@RequestParam String pattern) {
        return new PatternHandler(String.format(template, pattern));
    }
}
