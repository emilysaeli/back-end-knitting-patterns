package com.kpme.kpme;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.kpme.kpme.Stitch.generateStitches;


public class Row {

    // create row of stitches from ArrayList of stitchblocks
    public static ArrayList<Stitch> generateOneRowOfStitches(ArrayList<StitchBlock> stitchBlocks){
        ArrayList<Stitch> row = new ArrayList<>();
        for (StitchBlock stitchBlock: stitchBlocks) {
            ArrayList<Stitch> stitches = generateStitches(stitchBlock);
            row.addAll(stitches);
        }
        if (row.size() > 200) {
            throw new RuntimeException("Pattern contains one or more row(s) exceeding 200 stitches");
        }
        return row;
    }

    // check to see if row contains a range, return additional row count if applicable
    public static int checkForRange(String line) {
        String rangePattern = "(?:(\\d+|\\d+ )\\-(\\d+| \\d+))"; // check for nums separated by dash, with or without space
        Pattern r = Pattern.compile(rangePattern);
        Matcher matcher = r.matcher(line);
        if (matcher.find()) {
            int rowCount = Integer.parseInt(matcher.group(2).trim()) - Integer.parseInt(matcher.group(1).trim()) + 1; // number of rows to generate
            return rowCount;
        }
        return 1;
    }

    /*
 converts row to JSON string, currently not in use
    public static String convertArrayToJson(ArrayList<Stitch> arrayList) {
        Gson gson = new Gson();
        String jsonString = gson.toJson(arrayList);
        return jsonString;
    }
*/
}
