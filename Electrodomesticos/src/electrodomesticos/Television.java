/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomesticos;

/**
 *
 * @author holas
 */
public class Television extends Electrodomesticos {
    private double resolucion;
    private boolean sintonizadorTDT;
    
    private static final double RESOLUCION_DEF = 20;
    private static final boolean SINTONIZADOR_DEF = false;
 
    public Television() {
        super();
        this.resolucion = RESOLUCION_DEF;
        this.sintonizadorTDT = SINTONIZADOR_DEF;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_DEF;
        this.sintonizadorTDT = SINTONIZADOR_DEF;
    }
    
    public Television(double precioBase, double peso, char consumoEnergetico, String color, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public double getResolucion() {
        return resolucion;
    }
    
    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }
    
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        
        if (resolucion > 40) {
            precio += precio * 0.3;
        }
        
        if (sintonizadorTDT) {
            precio += 50;
        }
        
        return precio;
    }
}
