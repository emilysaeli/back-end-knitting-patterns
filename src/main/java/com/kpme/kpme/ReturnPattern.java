package com.kpme.kpme;

import java.util.ArrayList;
import static com.kpme.kpme.Row.generateOneRowOfStitches;
import static com.kpme.kpme.StitchBlock.*;


public class ReturnPattern {
    private final ArrayList<ArrayList<Stitch>> outputPattern;

    public ReturnPattern(String inputPattern) {
        this.outputPattern = createPattern(inputPattern);
    }

    // getter
    public ArrayList<ArrayList<Stitch>> getOutputPattern() {
        return outputPattern;
    }

    public static ArrayList<ArrayList<Stitch>> createPattern(String input) {

        // split pattern input into lines/rows
        String[] lines = input.split(System.lineSeparator());

        // empty ArrayList to hold output pattern
        ArrayList<ArrayList<Stitch>> outputPattern = new ArrayList<>();

        for (String line: lines) {
            // generate stitch blocks and rows
            ArrayList<StitchBlock> stitchBlock = generateStitchBlocks(line);
            ArrayList<Stitch> row = generateOneRowOfStitches(stitchBlock);

            // append to outputPattern ArrayList, ignore empty rows
            if (!row.isEmpty()) {
                outputPattern.add(row);
            }
        }
         // generate BO and CO stitch blocks and rows, add to beginning and end of outputPattern
         ArrayList<StitchBlock> bindOff = generateBindOffRow(outputPattern);
         ArrayList<StitchBlock> castOn = generateCastOnRow(outputPattern);
         outputPattern.add(0, generateOneRowOfStitches(castOn));
         outputPattern.add(generateOneRowOfStitches(bindOff));

        return outputPattern;
    }
}

