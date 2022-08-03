package com.kpme.kpme;


import netscape.javascript.JSObject;
import org.springframework.web.bind.annotation.*;



@RestController
public class PatternHandlerController {

    private static final String template = "Here is your pattern: %s!";

    @CrossOrigin(origins = "*")
    @PostMapping("")
    public PatternHandler createPattern(@RequestBody Pattern inputPattern) {
        return new PatternHandler(String.format(template, inputPattern.getInputPattern()));
    }
}

