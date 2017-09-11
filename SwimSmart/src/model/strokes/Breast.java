package model.strokes;

import java.util.Random;

/**
 * Created by susanchen on 2017-09-10.
 */
public class Breast extends SwimStroke {
    public Breast() {
        super();

    }

    @Override
    public void kick(int diff) {
        switch (diff) {
            case 0: dist = 200;
                drill = "4x50 whip kick easy";
                break;
            case 1: dist = 400;
                drill = "4x100 whip kick easy";
                break;
            case 2: dist = 400;
                drill = "8x50 whip kick build";
                break;
            case 3: dist = 400;
                drill = "8x50 whip kick fast";
                break;
            case 4: dist = 200;
                drill = "8x25 whip kick all out";
                break;
            default:dist = 400;
                drill = "4x100 whip kick fast";
                break;

        }
    }


    @Override
    public void easy() {
        Random rand = new Random();
        int value = rand.nextInt(6);
        dist = 200;
        switch (value) {
            case 0: drill = "8x25 breast tech";
                break;
            case 1: drill = "8x25 alt breast/free";
                break;
            case 2: drill = "8x25 breast breathe every 2";
                break;
            case 3: drill = "4x50 breast build";
                break;
            case 4: drill = "4x50 streamline breast kick";
                break;
            default: drill = "4x50 breast smooth";
                break;

        }

    }

    @Override
    public void med() {
        Random rand = new Random();
        int value = rand.nextInt(8);
        switch (value) {
            case 0: dist = 400;
                drill = "8x50 breast alt swim/kick";
                break;
            case 1: dist = 200;
                drill = "4x50 breast with fly kick";
                break;
            case 2: dist = 200;
                drill = "4x50 alt breast/free by 25";
                break;
            case 3: dist = 200;
                drill = "4x50 breast pull";
                break;
            case 4: dist = 200;
                drill = "4x50 alt breast/free";
                break;
            case 5: dist = 200;
                drill = "4x50 breast 3 kick 1 pull";
                break;
            case 6: dist = 400;
                drill = "8x50 breast fast";
                break;
            default: dist = 400;
                drill = "8x50 breast strong";
                break;

        }
    }

    @Override
    public void hard() {
        Random rand = new Random();
        int value = rand.nextInt(7);
        dist = 400;
        switch (value) {
            case 0: drill = "4x100 alt breast/free by 50";
                break;
            case 1: drill = "4x100 breast smooth";
                break;
            case 2: drill = "4x100 breast strong";
                break;
            case 3: drill = "8x50 breast all out";
                break;
            case 4: drill = "4x100 breast build";
                break;
            case 5: drill = "4x100 breast fast easy easy fast";
                break;
            default: drill = "2x200 breast strong";
                break;

        }


    }

}
