/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateareavolume;

/**
 *
 * @author azizrosyid
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {

    private final double height;

    public Balok(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return this.calculateArea() * this.height;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * this.length * this.width + 2 * this.width * this.height + 2 * this.length * this.height;
    }

}
