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
public class Peon extends Piezas{
    
 private int casillasMovimineto;
 private String formaMovimiento;

    public Peon(int casillasMovimineto, String formaMovimiento, int cantPiezas, boolean color, int cantCasillas, String objetivo) {
        super(cantPiezas, color, cantCasillas, objetivo);
        this.casillasMovimineto = casillasMovimineto;
        this.formaMovimiento = formaMovimiento;
    }
    
      @Override
   public void info(){
        System.out.println("El peon solo puede atacar de forma diagonal");   
    }
   
 @Override
    public void fichas() {
        System.out.println("Cada jugador tiene 8 peones");
    }
   
     public void curiosidadPeon(){
       System.out.println("El peon al llegar al final del tablero,podrá convertirse en la Dama");
   }

    public int getCasillasMovimineto() {
        return casillasMovimineto;
    }

    public void setCasillasMovimineto(int casillasMovimineto) {
        this.casillasMovimineto = casillasMovimineto;
    }

    public String getFormaMovimiento() {
        return formaMovimiento;
    }

    public void setFormaMovimiento(String formaMovimiento) {
        this.formaMovimiento = formaMovimiento;
    }

    @Override
    public String toString() {
        return super.toString()+"Peon{" + "casillasMovimineto=" + casillasMovimineto + ", formaMovimiento=" + formaMovimiento + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.casillasMovimineto;
        hash = 97 * hash + Objects.hashCode(this.formaMovimiento);
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
        final Peon other = (Peon) obj;
        if (this.casillasMovimineto != other.casillasMovimineto) {
            return false;
        }
        if (!Objects.equals(this.formaMovimiento, other.formaMovimiento)) {
            return false;
        }
        return true;
    }
 
 
    
}
