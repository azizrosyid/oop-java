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
public class Balok extends PersegiPanjang {

    private final double height;

    public Balok() {
        super(0, 0);
        this.height = 0;
    }

    public Balok(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double calculateVolume() {
        return this.calculateArea() * this.height;
    }

    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public double calculateSurfaceArea(double length, double width, double heigth) {
        return 2 * length * width + 2 * width * height + 2 * length * height;
    }

}
