/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

/**
 *
 * @author Aziz
 */
public class Konversi {
    private double celcius;
    Konversi(double temperature){
        this.celcius = temperature;
    }
    
    public double calculateCelcius(){
        return this.celcius;
    }
    
    public double calculaterReamur(){
        return (4 * this.celcius) / 5;
    }
    
    public double calculateFahrenheit(){
        return (9 * this.celcius) / 5 + 32;
    }
    
    public double calculateKelvin(){
       return this.celcius + 273.15; 
    }
    
    public String calculateWaterCondition(){
        if (this.celcius <= 0){
            return "Beku";
        }
        if (this.celcius >= 100){
            return "Mendidih";
        }
        return "Normal";
    }
    
    public void setCelcius(double celcius){
        this.celcius = celcius;
    }
}
