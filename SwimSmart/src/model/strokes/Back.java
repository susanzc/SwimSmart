package model.strokes;

import java.util.Random;

/**
 * Created by susanchen on 2017-09-10.
 */
public class Back extends SwimStroke {

    public Back() {
        super();

    }

    @Override
    public void kick(int diff) {
        switch (diff) {
            case 0: dist = 200;
                drill = "4x50 back kick easy";
                break;
            case 1: dist = 400;
                drill = "4x100 back kick easy";
                break;
            case 2: dist = 400;
                drill = "8x50 back kick build";
                break;
            case 3: dist = 400;
                drill = "8x50 back kick fast";
                break;
            case 4: dist = 200;
                drill = "8x25 back kick all out";
                break;
            default:dist = 400;
                drill = "4x100 back kick fast";
                break;

        }
    }


    @Override
    public void easy() {
        Random rand = new Random();
        int value = rand.nextInt(11);
        switch (value) {
            case 0:
                dist = 200;
                drill = "4x50 back easy";
                break;
            case 1:
                dist = 200;
                drill = "4x50 back descending 1-4";
                break;
            case 2:
                dist = 200;
                drill = "8x25 back tech";
                break;
            case 3:
                dist = 200;
                drill = "4x50 alt free/back";
                break;
            case 4:
                dist = 200;
                drill = "4x50 back alt swim/kick";
                break;
            case 5:
                dist = 200;
                drill = "8x25 streamline fly kick on back";
                break;
            case 6:
                dist = 200;
                drill = "4x50 single arm back pull alt by 25";
                break;
            case 7:
                dist = 200;
                drill = "4x50 single arm back pull alt 3";
                break;
            case 8:
                dist = 300;
                drill = "4x75 back 1 2 3 switch";
                break;
            case 9:
                dist = 100;
                drill = "4x25 back pull easy";
                break;
            default:
                dist = 200;
                drill = "4x50 back pull smooth";
                break;
        }
    }

    @Override
    public void med() {
        Random rand = new Random();
        int value = rand.nextInt(13);
        switch (value) {
            case 0: dist = 400;
                drill = "8x50 back strong";
                break;
            case 1: dist = 400;
                drill = "8x50 back smooth";
                break;
            case 2: dist = 400;
                drill = "8x50 back tech";
                break;
            case 3: dist = 400;
                drill = "8x50 alt free/back";
                break;
            case 4: dist = 400;
                drill = "8x50 back alt swim/kick";
                break;
            case 5: dist = 400;
                drill = "4x100 back alt smooth/fast by 50";
                break;
            case 6: dist = 400;
                drill = "4x100 back build";
                break;
            case 7: dist = 400;
                drill = "4x100 back fast easy easy fast";
                break;
            case 8: dist = 400;
                drill = "4x100 back alt smooth/fast";
                break;
            case 9: dist = 400;
                drill = "2x200 back smooth";
                break;
            case 10: dist = 400;
                drill = "4x100 back pull smooth";
                break;
            case 11: dist = 400;
                drill = "4x100 back pull build";
                break;
            default: dist = 200;
                drill = "8x50 fly kick on back build";
                break;
        }
    }

    @Override
    public void hard() {
        Random rand = new Random();
        int value = rand.nextInt(13);
        switch (value) {
            case 0: dist = 400;
                drill = "8x50 back fast";
                break;
            case 1: dist = 400;
                drill = "8x50 back all out";
                break;
            case 2: dist = 250;
                drill = "10x25 back all out";
                break;
            case 3: dist = 400;
                drill = "4x100 back strong";
                break;
            case 4: dist = 400;
                drill = "400 back smooth";
                break;
            case 5: dist = 800;
                drill = "4x200 back strong";
                break;
            case 6: dist = 600;
                drill = "8x75 back build";
                break;
            case 7: dist = 400;
                drill = "4x100 alt free/back";
                break;
            case 8: dist = 400;
                drill = "4x100 back build";
                break;
            case 9: dist = 400;
                drill = "4x100 back pull strong";
                break;
            case 10: dist = 400;
                drill = "8x50 back pull fast";
                break;
            case 11: dist = 200;
                drill = "4x50 fly kick on back fast";
                break;
            default: dist = 200;
                drill = "8x25 underwater kick";
                break;
        }
    }
}
