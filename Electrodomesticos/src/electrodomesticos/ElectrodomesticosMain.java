/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomesticos;

/**
 *
 * @author SALON206
 */
public class ElectrodomesticosMain {
    public static void main(String[] args) {
        Electrodomesticos[] electrodomesticos = new Electrodomesticos[4];
        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Lavadora(150, 10);
        electrodomesticos[2] = new Television();
        
        for(Electrodomesticos e : electrodomesticos){
            System.out.println("Electrodomestico: "+e.getConsumoEnergetico());
        }
    }
}
 