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
public class PersegiPanjang {

    final double length;
    final double width;

    public PersegiPanjang(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return this.length * this.width;
    }

    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

    public double calculateArea(double x, double y) {
        return x * y;
    }

    public double calculatePerimeter(double x, double y) {
        return 2 * (x + y);
    }

}
