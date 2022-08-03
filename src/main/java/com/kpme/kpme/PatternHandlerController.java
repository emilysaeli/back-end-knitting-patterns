package com.kpme.kpme;


import org.springframework.web.bind.annotation.*;



@RestController
public class PatternHandlerController {

    private static final String template = "Here is your pattern: %s!";

    @CrossOrigin(origins = "*")
    @PostMapping("")
    public PatternHandler createPattern(@RequestBody String inputPattern) {
        return new PatternHandler(String.format(template, inputPattern));
    }
}

