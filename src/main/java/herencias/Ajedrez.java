/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import java.util.Objects;

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

    public Ajedrez() {
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.cantCasillas;
        hash = 89 * hash + Objects.hashCode(this.objetivo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ajedrez other = (Ajedrez) obj;
        if (this.cantCasillas != other.cantCasillas) {
            return false;
        }
        if (!Objects.equals(this.objetivo, other.objetivo)) {
            return false;
        }
        return true;
    }
    
    
}
