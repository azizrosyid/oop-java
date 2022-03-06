/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateareavolume;

import java.util.Scanner;

/**
 *
 * @author azizrosyid
 */
public class CalculateAreaVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu Utama");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Input Panjang : ");
                int length = scanner.nextInt();
                System.out.print("Input Lebar : ");
                int width = scanner.nextInt();
                System.out.print("Input Tinggi : ");
                int height = scanner.nextInt();

                Balok balok = new Balok(length, width, height);
                System.out.printf("Luas Persegi Panjang : %.2f\n", balok.calculateArea());
                System.out.printf("Keliling Persegi Panjang : %.2f\n", balok.calculatePerimeter());
                System.out.printf("Volume Balok : %.2f\n", balok.calculateVolume());
                System.out.printf("Luas Permukaan Balok : %.2f\n", balok.calculateSurfaceArea());

            } else if (choice == 2) {
                System.out.print("Input Tinggi : ");
                int height = scanner.nextInt();
                System.out.print("Input Radius : ");
                int radius = scanner.nextInt();

                Tabung tabung = new Tabung(radius, height);
                System.out.printf("Luas Lingkaran : %.2f\n", tabung.calculateArea());
                System.out.printf("Keliling Lingkaran : %.2f\n", tabung.calculatePerimeter());
                System.out.printf("Volume Tabung : %.2f\n", tabung.calculateVolume());
                System.out.printf("Luas Permukaan Tabung : %.2f\n", tabung.calculateSurfaceArea());
            } else if (choice == 0) {
                break;
            }

            System.out.print("Ulangi? (Y|N) : ");
            char repeat = scanner.next().toUpperCase().charAt(0);
            if (repeat == 'N') {
                break;
            }
        } while (choice != 0);

    }

}
