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
public class Ajedrez {

    private int cantCasillas;
    private String objetivo;

    public Ajedrez(int cantCasillas, String objetivo) {
        this.cantCasillas = cantCasillas;
        this.objetivo = objetivo;
    }
     
    public void info(){
        System.out.println("Juego de estrategia de 1 vs 1");   
    }

    public int getCantCasillas() {
        return cantCasillas;
    }

    public void setCantCasillas(int cantCasillas) {
        this.cantCasillas = cantCasillas;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return "Ajedrez{" + "cantCasillas=" + cantCasillas + ", objetivo=" + objetivo + '}';
    }
    
    
}
