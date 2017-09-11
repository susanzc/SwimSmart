package model.strokes;

import java.util.Random;

/**
 * Created by susanchen on 2017-09-08.
 */
public class Fly extends SwimStroke {

    public Fly() {
        super();

    }

    @Override
    public void kick(int diff) {
        switch (diff) {
            case 0: dist = 200;
                drill = "4x50 fly kick easy";
                break;
            case 1: dist = 400;
                drill = "4x100 fly kick easy";
                break;
            case 2: dist = 400;
                drill = "8x50 fly kick build";
                break;
            case 3: dist = 400;
                drill = "8x50 fly kick fast";
                break;
            case 4: dist = 200;
                drill = "8x25 fly kick all out";
                break;
            default:dist = 400;
                drill = "4x100 fly kick fast";
                break;

        }
    }


    @Override
    public void easy() {
        Random rand = new Random();
        int value = rand.nextInt(5);
        dist = 200;
        switch (value) {
            case 0: drill = "8x25 single arm fly alt by 25";
                break;
            case 1: drill = "8x25 single arm fly alt 3";
                break;
            case 2: drill = "8x25 single arm fly alt 5";
                break;
            case 3: drill = "4x50 streamline fly kick";
                break;
            default: drill = "8x25 fly 3 right 3 left 1 full";
                break;

        }

    }

    @Override
    public void med() {
        Random rand = new Random();
        int value = rand.nextInt(8);
        switch (value) {
            case 0: dist = 400;
                    drill = "8x50 single arm fly alt by 25";
                break;
            case 1: dist = 200;
                    drill = "4x50 single arm fly alt 3";
                break;
            case 2: dist = 200;
                    drill = "4x50 single arm fly alt 5";
                break;
            case 3: dist = 200;
                    drill = "4x50 fly 1 right 1 left 1 full";
                break;
            case 4: dist = 400;
                    drill = "8x50 fly 3 right 3 left 1 full";
                break;
            case 5: dist = 200;
                    drill = "4x50 fly 3 right 3 left 3 full";
                break;
            case 6: dist = 400;
                    drill = "8x50 fly fast";
                break;
            default: dist = 400;
                    drill = "8x50 fly smooth";
                break;

        }
    }

    @Override
    public void hard() {
        Random rand = new Random();
        int value = rand.nextInt(7);
        dist = 400;
        switch (value) {
            case 0: drill = "4x100 single arm fly alt by 25";
                break;
            case 1: drill = "4x100 fly smooth";
                break;
            case 2: drill = "4x100 fly strong";
                break;
            case 3: drill = "8x50 fly all out";
                break;
            case 4: drill = "4x100 fly 3 right 3 left 1 full";
                break;
            case 5: drill = "4x100 fly 3 right 3 left 3 full";
                break;
            default: drill = "8x50 fly fast";
                break;

        }


    }
}
