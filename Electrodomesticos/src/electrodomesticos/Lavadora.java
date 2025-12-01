/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomesticos;

/**
 *
 * @author SALON206
 */
public class Lavadora extends Electrodomesticos{
    private double carga;
    
    private static final double CARGA_DEF = 5;
    
    //Constructor por defecto
    public Lavadora(){
        super();
        this.carga = CARGA_DEF;
    }
    
    public Lavadora(double precioBase, double peso){
        super(precioBase, peso);
        this.carga = CARGA_DEF;
        
    }
    
    //Constructor con la carga y el resto de los atributos heredados.
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, double carga){
        super(precioBase, peso, consumoEnergetico, color);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }
    
    @Override
    public double precioFinal(){
        double precio = super.precioFinal();
        if(carga > 30){
            peso += 50;
            
        }
        return precio;
    }
    
}
