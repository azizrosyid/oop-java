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
public class Tabung extends Lingkaran implements MenghitungRuang {

    private double height;

    public Tabung(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return this.calculateArea() * this.height;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * Math.PI * this.radius * (this.radius + this.height);
    }

}
