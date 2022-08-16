package com.kpme.kpme;

import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;




@RestController
public class PatternController {

    @CrossOrigin(origins = "*")
    @PostMapping("")
    public ArrayList<ArrayList<Stitch>> createPattern(@RequestBody InputPattern inputPattern) {
        return new ReturnPattern(inputPattern.inputPattern).createPattern();
    }

}

