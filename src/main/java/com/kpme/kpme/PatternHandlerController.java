package com.kpme.kpme;


import org.springframework.web.bind.annotation.*;



@RestController
public class PatternHandlerController {

    private static final String template = "Here is your pattern: %s!";

    @CrossOrigin(origins = "*")
    @PostMapping("")
    public ReturnPattern createPattern(@RequestBody InputPattern inputPattern) {
        return new ReturnPattern(inputPattern.getInputPattern());
    }
}

