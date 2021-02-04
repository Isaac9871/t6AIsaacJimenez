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
public class Caballo extends Piezas{
   private int casillasMovimineto;
 private String formaMovimiento;

    public Caballo(int casillasMovimineto, String formaMovimiento, int cantPiezas, boolean color, int cantCasillas, String objetivo) {
        super(cantPiezas, color, cantCasillas, objetivo);
        this.casillasMovimineto = casillasMovimineto;
        this.formaMovimiento = formaMovimiento;
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
        return "Caballo{" + "casillasMovimineto=" + casillasMovimineto + ", formaMovimiento=" + formaMovimiento + '}';
    } 
}
