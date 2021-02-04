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
        return "Peon{" + "casillasMovimineto=" + casillasMovimineto + ", formaMovimiento=" + formaMovimiento + '}';
    }
 
 
    
}
