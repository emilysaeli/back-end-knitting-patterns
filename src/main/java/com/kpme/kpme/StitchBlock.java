package com.kpme.kpme;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class StitchBlock {
    String stitch;
    int count;

    public StitchBlock(String stitch, int count) {
        this.stitch = stitch;
        this.count = count;
    }

    // Generate stitch object from stitchblock
    public ArrayList<Stitch> generateStitches() {
        ArrayList<Stitch> stitches = new ArrayList<>();
        for (int i = 0; i < this.count; i++) {
            Stitch newStitch = new Stitch(this.stitch);
            stitches.add(newStitch);
        }
        return stitches;
    }

    // generate stitch blocks, currently only looking for "K1" "P1" format
    public static ArrayList<StitchBlock> generateStitchBlocks(String input) {
        // parse string input into an array of stitchBlock capture groups
        String stitchBlockPattern = "([KP])(\\d+)";  // K or P + count
        Pattern r = Pattern.compile(stitchBlockPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = r.matcher(input);
        ArrayList<StitchBlock> matches = new ArrayList<StitchBlock>();

        while (matcher.find()) {
            String stitchType = matcher.group(1);
            int count = Integer.parseInt(matcher.group(2));
            StitchBlock stitchBlock = new StitchBlock(stitchType, count);
            matches.add(stitchBlock);
        }
        return matches;
    }

    public static ArrayList<StitchBlock> generateCastOnRow(ArrayList<ArrayList<Stitch>> pattern) {
        ArrayList<StitchBlock> castOnRow = new ArrayList<StitchBlock>();
        String stitchType = "CO";
        int count = pattern.get(0).size();
        StitchBlock stitchBlock = new StitchBlock(stitchType, count);
        castOnRow.add(stitchBlock);
        return castOnRow;
    }

    public static ArrayList<StitchBlock> generateBindOffRow(ArrayList<ArrayList<Stitch>> pattern) {
        ArrayList<StitchBlock> bindOffRow = new ArrayList<StitchBlock>();
        String stitchType = "BO";
        int count = pattern.get(0).size();
        StitchBlock stitchBlock = new StitchBlock(stitchType, count);
        bindOffRow.add(stitchBlock);
        return bindOffRow;
    }
}
