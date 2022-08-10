package com.kpme.kpme;


import java.util.ArrayList;

// class to hold a single stitch
public class Stitch {
    public String stitch;

    public Stitch(String stitch) {
        this.stitch = stitch;
    }


    // Generate stitch object from stitch block
    public static ArrayList<Stitch> generateStitches(StitchBlock stitchBlock) {
        ArrayList<Stitch> stitches = new ArrayList<>();
        for (int i = 0; i < stitchBlock.count; i++) {
            Stitch newStitch = new Stitch(stitchBlock.stitch);
            stitches.add(newStitch);
        }
        return stitches;
    }
}
