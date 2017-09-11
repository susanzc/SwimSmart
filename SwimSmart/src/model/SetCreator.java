package model;

import model.sets.MainSet;
import model.strokes.Breast;
import model.strokes.Free;
import model.strokes.SwimStroke;

/**
 * Created by susanchen on 2017-09-08.
 */
public class SetCreator {

    public static void main(String args[]) {
        SwimStroke a = new Free();
        SwimStroke b = new Breast();
        MainSet m = new MainSet(4, 3000, a, b);
        m.genSet();
        System.out.println("Set:\n");
        for (String s : m.set)
            System.out.println(s + "\n");
        System.out.println("Total distance swam: " + m.setLength + "m");

    }
}
