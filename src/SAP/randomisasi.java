/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAP;

import java.util.Random;

/**
 *
 * @author fznrm
 */
public class randomisasi {

    protected static Random random = new Random();

    public static double randomInRange(double min, double max) {
        double range = max - min;
        double scaled = random.nextDouble() * range;
        double shifted = scaled + min;
        return shifted;
    }
}
