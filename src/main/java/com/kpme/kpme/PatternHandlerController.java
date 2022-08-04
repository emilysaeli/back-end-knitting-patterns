package com.kpme.kpme;


import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;


@RestController
public class PatternHandlerController {

//    private static final String template = "Here is your pattern: %s!";

    @CrossOrigin(origins = "*")
    @PostMapping("")
    public ArrayList<ArrayList<Stitch>> createPattern(@RequestBody InputPattern inputPattern) {
        return new ReturnPattern(inputPattern.getInputPattern()).getOutputPattern();
    }
}

