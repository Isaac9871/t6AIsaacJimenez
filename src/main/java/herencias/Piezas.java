/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author isaac
 */
public class Piezas extends Ajedrez {
    private int cantPiezas;
    private boolean color; //True=blancas

    public Piezas(int cantPiezas, boolean color, int cantCasillas, String objetivo) {
        super(cantCasillas, objetivo);
        this.cantPiezas = cantPiezas;
        this.color = color;
    }
    
    @Override
   public void info(){
        System.out.println("Cada jugador tiene 16 piezas que puede controlar");   
    }

    public int getCantPiezas() {
        return cantPiezas;
    }

    public void setCantPiezas(int cantPiezas) {
        this.cantPiezas = cantPiezas;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Piezas{" + "cantPiezas=" + cantPiezas + ", color=" + color + '}';
    }

   
    
    
    
}
