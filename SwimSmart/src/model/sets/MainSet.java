package model.sets;

import model.strokes.SwimStroke;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by susanchen on 2017-09-08.
 */
public class MainSet {
    public List<String> set;
    public int difficulty;
    public int minLength;
    public int setLength;
    public SwimStroke a;
    public SwimStroke b;

    public MainSet(int difficulty, int minLength, SwimStroke a, SwimStroke b) {
        set = new ArrayList<>();
        this.difficulty = difficulty;
        this.minLength = minLength;
        this.setLength = 0;
        this.a = a;
        this.b = b;
    }

    public void genSet() {
        switch (difficulty) {
            case 1:
                easySet();
                break;
            case 2:
                easyMedSet();
                break;
            case 3:
                medSet();
                break;
            case 4:
                medHardSet();
                break;
            case 5:
                hardSet();
                break;
            default: medSet();
            break;
        }
    }

    public void easySet() {
        int dist = 0;
        while (dist < minLength) {
            Random rand = new Random();
            int diff = rand.nextInt(2);
            int var = rand.nextInt(3);
            int stroke = rand.nextInt(10);
            SwimStroke thisStroke = a;
            if (stroke <= 3) {
                thisStroke = b;
            }
            if (var == 0)
                    thisStroke.kick(diff);
            else thisStroke.easy();

            set.add(thisStroke.drill);
            dist = dist + thisStroke.dist;
        }
        setLength = dist;
    }

    public void easyMedSet() {
        int dist = 0;
        while (dist < minLength) {
            Random rand = new Random();
            int diff = rand.nextInt(2);
            int var = rand.nextInt(3);
            int stroke = rand.nextInt(10);
            SwimStroke thisStroke = a;
            if (stroke <= 3) {
                thisStroke = b;
            }
            if (var == 0)
                    thisStroke.kick(diff + 1);
            else if (diff == 0)
                    thisStroke.easy();
            else    thisStroke.med();

            set.add(thisStroke.drill);
            dist = dist + thisStroke.dist;
        }
        setLength = dist;

    }

    public void medSet() {
        int dist = 0;
        while (dist < minLength) {
            Random rand = new Random();
            int diff = rand.nextInt(3);
            int var = rand.nextInt(3);
            int stroke = rand.nextInt(10);
            SwimStroke thisStroke = a;
            if (stroke <= 3) {
                thisStroke = b;
            }
            if (var == 0)
                thisStroke.kick(diff + 1);
            else thisStroke.med();
            set.add(thisStroke.drill);
            dist = dist + thisStroke.dist;
        }
        setLength = dist;

    }

    public void medHardSet() {
        int dist = 0;
        while (dist < minLength) {
            Random rand = new Random();
            int diff = rand.nextInt(2);
            int var = rand.nextInt(3);
            int stroke = rand.nextInt(10);
            SwimStroke thisStroke = a;
            if (stroke <= 3) {
                thisStroke = b;
            }
            if (var == 0)
                thisStroke.kick(diff + 3);
            else if (diff == 0)
                thisStroke.med();
            else    thisStroke.hard();

            set.add(thisStroke.drill);
            dist = dist + thisStroke.dist;
        }
        setLength = dist;

    }

    public void hardSet() {
        int dist = 0;
        while (dist < minLength) {
            Random rand = new Random();
            int diff = rand.nextInt(2);
            int var = rand.nextInt(3);
            int stroke = rand.nextInt(10);
            SwimStroke thisStroke = a;
            if (stroke <= 3) {
                thisStroke = b;
            }
            if (var == 0)
                thisStroke.kick(diff + 4);
            else thisStroke.hard();
            set.add(thisStroke.drill);
            dist = dist + thisStroke.dist;
        }
        setLength = dist;

    }
}
