/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboidcalculator;

import calculateareavolume.Balok;

/**
 *
 * @author azizrosyid
 */
public class CuboidCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Balok calculator = new Balok();
        ProgramCuboidCalculator programCuboidCalculator = new ProgramCuboidCalculator(calculator);
        programCuboidCalculator.start();
    }

}
