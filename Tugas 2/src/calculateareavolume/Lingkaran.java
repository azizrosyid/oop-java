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
public class Lingkaran implements MenghitungBidang {

    double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * this.radius;
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter(double radius) {
        return Math.PI * 2 * radius;
    }

}
