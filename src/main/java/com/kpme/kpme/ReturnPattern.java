package com.kpme.kpme;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static com.kpme.kpme.Row.generateRow;
import static com.kpme.kpme.Row.parsePattern;

public class ReturnPattern {
    private ArrayList<ArrayList<Stitch>> outputPattern;

    public ReturnPattern(String inputPattern) {

        this.outputPattern = parsePattern(inputPattern);

    }

    public ArrayList<ArrayList<Stitch>> getOutputPattern() {
        return outputPattern;
    }
}



//Source: https://www.studioknitsf.com/knit-stitch-pattern-book/#:~:text=EASY%2DTO%2DFOLLOW%20KNITTING%20INSTRUCTIONS
//
//        CAST ON
//        Multiple of 6
//
//        IN THE ROUND
//        Row 1: * P1, K5 *
//        Row 2: * K1, P1 , K4*
//        Row 3: * K2, P1 , K3 *
//        Row 4: * K3, P1 , K2 *
//        Row 5: * K4, P1 , K1 *
//        Row 6: * K5, P1 *

//[
//        [{"stitch": "CO"}, {"stitch": "CO"}, {"stitch": "CO"}, {"stitch": "CO"}, {"stitch": "CO"}, {"stitch": "CO"}],
//        [{"stitch": "P"}, {"stitch": "K"}, {"stitch": "K"}, {"stitch": "K"}, {"stitch": "K"}, {"stitch": "K"}],
//        [{"stitch": "K"}, {"stitch": "P"}, {"stitch": "K"}, {"stitch": "K"}, {"stitch": "K"}, {"stitch": "K"}],
//        [{"stitch": "K"}, {"stitch": "K"}, {"stitch": "P"}, {"stitch": "K"}, {"stitch": "K"}, {"stitch": "K"}],
//        [{"stitch": "K"}, {"stitch": "K"}, {"stitch": "K"}, {"stitch": "P"}, {"stitch": "K"}, {"stitch": "K"}],
//        [{"stitch": "K"}, {"stitch": "K"}, {"stitch": "K"}, {"stitch": "K"}, {"stitch": "P"}, {"stitch": "K"}],
//        [{"stitch": "K"}, {"stitch": "K"}, {"stitch": "K"}, {"stitch": "K"}, {"stitch": "K"}, {"stitch": "P"}],
//        [{"stitch": "BO"}, {"stitch": "BO"}, {"stitch": "BO"}, {"stitch": "BO"}, {"stitch": "BO"}, {"stitch": "BO"}]
//        ]


//{"pattern": "diagonal seed",
//        "instructions": "CAST ON\nMultiple of 6 \n\nIN THE ROUND\nRow 1: * P1, K5 * \nRow 2: * K1, P1 , K4*\nRow 3: * K2, P1 , K3 *\nRow 4: * K3, P1 , K2 *\nRow 5: * K4, P1 , K1 *\nRow 6: * K5, P1 *"}