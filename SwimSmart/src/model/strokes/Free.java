package model.strokes;

import java.util.Random;

/**
 * Created by susanchen on 2017-09-08.
 */
public class Free extends SwimStroke {

    public Free() {
        super();

    }

    @Override
    public void kick(int diff) {
        switch (diff) {
            case 0: dist = 200;
                    drill = "4x50 free kick easy";
                    break;
            case 1: dist = 400;
                    drill = "4x100 free kick easy";
                    break;
            case 2: dist = 400;
                    drill = "8x50 free kick build";
                    break;
            case 3: dist = 400;
                    drill = "8x50 free kick fast";
                    break;
            case 4: dist = 200;
                    drill = "8x25 free kick all out";
                    break;
            default:dist = 400;
                    drill = "4x100 free kick fast";
                    break;

        }
    }


    @Override
    public void easy() {
        Random rand = new Random();
        int value = rand.nextInt(13);
        switch (value) {
            case 0: dist = 200;
                    drill = "4x50 free descend 1-4";
            break;
            case 1: dist = 200;
                    drill = "4x50 free smooth";
            break;
            case 2: dist = 200;
                    drill = "8x25 free tech";
            break;
            case 3: dist = 200;
                    drill = "4x50 alt free/not free";
            break;
            case 4: dist = 200;
                    drill = "4x50 free alt swim/kick";
                break;
            case 5: dist = 200;
                    drill = "8x25 streamline free kick";
                break;
            case 6: dist = 200;
                    drill = "4x50 single arm free pull alt by 25";
                break;
            case 7: dist = 200;
                    drill = "4x50 free 8 kicks per pull";
                break;
            case 8: dist = 300;
                    drill = "4x75 free kick/swim/kick";
                break;
            case 9: dist = 100;
                drill = "4x25 free pull low stroke count";
                break;
            case 10: dist = 200;
                drill = "4x50 free pull smooth";
                break;
            case 11: dist = 200;
                drill = "4x50 free breathing 3 5 3 5";
                break;
            default: dist = 200;
                    drill = "4x50 free long and strong";
                break;
        }
    }

    @Override
    public void med() {
        Random rand = new Random();
        int value = rand.nextInt(16);
        switch (value) {
            case 0: dist = 400;
                    drill = "8x50 free strong";
                break;
            case 1: dist = 400;
                    drill = "8x50 free smooth";
                break;
            case 2: dist = 400;
                    drill = "8x50 free tech";
                break;
            case 3: dist = 400;
                drill = "8x50 alt free/not free";
                break;
            case 4: dist = 400;
                 drill = "8x50 free alt swim/kick";
                break;
            case 5: dist = 400;
                drill = "4x100 free alt smooth/fast by 50";
                break;
            case 6: dist = 400;
                drill = "4x100 free build";
                break;
            case 7: dist = 400;
                    drill = "4x100 free fast easy easy fast";
                break;
            case 8: dist = 400;
                    drill = "4x100 free alt smooth/fast";
                break;
            case 9: dist = 400;
                    drill = "2x200 free smooth";
                break;
            case 10: dist = 400;
                drill = "4x100 free pull smooth";
                break;
            case 11: dist = 400;
                drill = "4x100 free pull build";
                break;
            case 12: dist = 200;
                drill = "8x50 free breathing every 5";
                break;
            case 13: dist = 200;
                drill = "4x50 free breathing 3 5 3 7";
                break;
            case 14: dist = 200;
                drill = "8x25 free no breathing";
                break;
            case 15: dist = 400;
                drill = "8x50 pull breathing every 5";
            default: dist = 400;
                drill = "8x50 free long and strong";
                break;
        }
    }

    @Override
    public void hard() {
        Random rand = new Random();
        int value = rand.nextInt(15);
        switch (value) {
            case 0: dist = 400;
                drill = "8x50 free fast";
                break;
            case 1: dist = 400;
                drill = "8x50 free all out";
                break;
            case 2: dist = 250;
                drill = "10x25 free all out";
                break;
            case 3: dist = 400;
                drill = "4x100 free strong";
                break;
            case 4: dist = 400;
                drill = "400 free smooth";
                break;
            case 5: dist = 800;
                drill = "4x200 free strong";
                break;
            case 6: dist = 600;
                drill = "8x75 free build";
                break;
            case 7: dist = 400;
                drill = "4x100 alt free/not free";
                break;
            case 8: dist = 400;
                drill = "4x100 free build";
                break;
            case 9: dist = 400;
                drill = "4x100 free pull strong";
                break;
            case 10: dist = 400;
                drill = "8x50 free pull fast";
                break;
            case 11: dist = 200;
                drill = "4x50 free breathing 3 5 3 7";
                break;
            case 12: dist = 200;
                drill = "8x25 free no breathing";
                break;
            case 13: dist = 200;
                drill = "8x25 underwater kick";
                break;
            default: dist = 400;
                    drill = "4x100 free swim kick kick swim";
                break;
        }
    }


}
