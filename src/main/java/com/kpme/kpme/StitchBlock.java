package com.kpme.kpme;

import java.util.ArrayList;

public class StitchBlock {
    String stitch;
    int count;

    public StitchBlock(String stitch, int count) {
        this.stitch = stitch;
        this.count = count;
    }

    public ArrayList<Stitch> generateStitches() {
        ArrayList<Stitch> stitches = new ArrayList<>();
        for (int i = 0; i < this.count; i++) {
            Stitch newStitch = new Stitch(this.stitch);
            stitches.add(newStitch);
        }
        return stitches;
    }
}
