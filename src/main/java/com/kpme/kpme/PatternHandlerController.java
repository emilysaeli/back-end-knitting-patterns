package com.kpme.kpme;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@RestController
public class PatternHandlerController {

    @CrossOrigin(origins = "*")
    @PostMapping("")
    public ArrayList<ArrayList<Stitch>> createPattern(@RequestBody InputPattern inputPattern) {
        return new ReturnPattern(inputPattern.getInputPattern()).getOutputPattern();
    }
}

