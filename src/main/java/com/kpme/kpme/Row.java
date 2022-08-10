package com.kpme.kpme;

import com.google.gson.Gson;
import java.util.ArrayList;

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

    // converts row to JSON string, currently not in use
//    public static String convertArrayToJson(ArrayList<Stitch> arrayList) {
//        Gson gson = new Gson();
//        String jsonString = gson.toJson(arrayList);
//        return jsonString;
//    }
}
