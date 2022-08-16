package com.kpme.kpme;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.kpme.kpme.Row.checkForRange;
import static com.kpme.kpme.Row.generateOneRowOfStitches;
import static com.kpme.kpme.StitchBlock.*;


public class ReturnPattern {

    private static String inputPattern;

    public ReturnPattern(String inputPattern) {
        this.inputPattern = inputPattern;
    }


    public static ArrayList<ArrayList<Stitch>> createPattern() {

        // split pattern input into lines/rows
        String[] lines = inputPattern.split("\\r?\\n|\\r");

        // empty ArrayList to hold output pattern
        ArrayList<ArrayList<Stitch>> outputPattern = new ArrayList<>();
        int longestRow = 0;

        for (String line : lines) {
            int rowCount = checkForRange(line);
            for (int i = 0; i < rowCount; i++) {
                // generate stitch blocks and rows
                ArrayList<StitchBlock> stitchBlock = generateStitchBlocks(line);
                ArrayList<Stitch> row = generateOneRowOfStitches(stitchBlock);
                // check row length
                if (row.size() > longestRow) {
                    longestRow = row.size();
                }
                // append to outputPattern ArrayList, ignore empty rows
                if (!row.isEmpty()) {
                    outputPattern.add(row);
                }

            }
        }

        for (ArrayList<Stitch> row : outputPattern) {
            if (row.size() < longestRow) {
                int currentIndex = outputPattern.indexOf(row);
                int additionalStitches = longestRow - row.size();
                row = generateEmptyStitches(row, additionalStitches);
                outputPattern.set(currentIndex, row);
            }
        }
        if (outputPattern.size() == 0) {
            throw new RuntimeException("Unable to interpret pattern");
        }

        // generate BO and CO stitch blocks and rows, add to beginning and end of outputPattern
        ArrayList<StitchBlock> bindOff = generateBindOffRow(outputPattern);
        ArrayList<StitchBlock> castOn = generateCastOnRow(outputPattern);
        outputPattern.add(0, generateOneRowOfStitches(castOn));
        outputPattern.add(generateOneRowOfStitches(bindOff));

        return outputPattern;
    }


}