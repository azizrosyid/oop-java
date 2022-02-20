/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import java.util.Scanner;

/**
 *
 * @author Aziz
 */
public class Main {

    public static void main(String[] args) {
        MainApp program = new MainApp();
        program.start();
    }
}

class MainApp {

    Konversi temperatureConverter = new Konversi(0);
    Scanner scanner = new Scanner(System.in);

    public void start() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("+-----------------------+\n");
        stringBuilder.append("| Program Konversi Suhu |\n");
        stringBuilder.append("+-----------------------+\n");

        System.out.print(stringBuilder.toString());
        this.editTemperatureCelcius();

        do {
            int choice = menu();

            if (choice == 1) {
                this.showDataConvertion();
            } else if (choice == 2) {
                this.editTemperatureCelcius();
            } else if (choice == 3) {
                break;
            }
        } while (true);
    }

    private void showDataConvertion() {
        System.out.printf("Suhu Dalam Celcius      : %f\n", this.temperatureConverter.calculateCelcius());
        System.out.printf("Suhu Dalam Fahrenheit   : %f\n", this.temperatureConverter.calculateFahrenheit());
        System.out.printf("Suhu Dalam Reamur       : %f\n", this.temperatureConverter.calculaterReamur());
        System.out.printf("Suhu Dalam Kelvin       : %f\n", this.temperatureConverter.calculateKelvin());
        System.out.printf("Kondisi Air %s\n", this.temperatureConverter.calculateWaterCondition());
    }

    private void editTemperatureCelcius() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Input Data\n");
        stringBuilder.append("------------\n");
        stringBuilder.append("Suhu Dalam Celcius    : ");
        System.out.print(stringBuilder.toString());

        double tempCelcius = this.scanner.nextDouble();
        this.temperatureConverter.setCelcius(tempCelcius);
    }

    private int menu() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Opsi\n");
        stringBuilder.append("---------\n");
        stringBuilder.append("1. Lihat Data Konversi\n");
        stringBuilder.append("2. Edit Data Konversi\n");
        stringBuilder.append("3. Exit\n");
        stringBuilder.append("Pilih   : ");

        System.out.print(stringBuilder.toString());

        return this.scanner.nextInt();
    }
}
