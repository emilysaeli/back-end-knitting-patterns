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
        return row;
    }

    public static int checkForRange(String line) {
        String rangePattern = "(?:(\\d+|\\d+ )\\-(\\d+| \\d+))";
        Pattern r = Pattern.compile(rangePattern);
        Matcher matcher = r.matcher(line);
        if (matcher.find()) {
            int rowCount = Integer.parseInt(matcher.group(2).trim()) - Integer.parseInt(matcher.group(1).trim()) + 1;
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
