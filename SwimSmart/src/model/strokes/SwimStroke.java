package model.strokes;

/**
 * Created by susanchen on 2017-09-08.
 */
public abstract class SwimStroke implements SSInterface {
    public String drill;
    public int dist;

    public SwimStroke() {
        drill = "";
        dist = 0;
    }

    public void kick(int diff) {
        dist = 200;
        drill = "4x50 free kick";
    }

    public void easy() {
        dist = 200;
        drill = "8x25 free tech";
    }

    public void med() {
        dist = 400;
        drill = "4x100 free build";

    }

    public void hard() {
        dist = 400;
        drill = "4x100 free strong";

    }
}
