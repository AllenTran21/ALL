/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chp9.addresses;

/**
 *
 * @author Allen
 */
public class roundTest {
    public static void main(String[] args){
        double price = 1234.567647;
        String stringedPrice = Double.toString(price);
        String newPrice = String.format("%.2f", price);
        System.out.printf("%.2f\n", price);
        System.out.println(stringedPrice);
        System.out.println(newPrice);
    }
}
