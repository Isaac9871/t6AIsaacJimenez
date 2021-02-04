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
public class Caballo extends Piezas {

    private int casillasMovimineto;
    private String formaMovimiento;

    public Caballo(int casillasMovimineto, String formaMovimiento, int cantPiezas, boolean color, int cantCasillas, String objetivo) {
        super(cantPiezas, color, cantCasillas, objetivo);
        this.casillasMovimineto = casillasMovimineto;
        this.formaMovimiento = formaMovimiento;
    }

    @Override
    public void info() {
        System.out.println("No puede hacer otro movimiento que no sea en forma de L");
    }
    
      public void curiosidadCaballo(){
       System.out.println("El caballo es la unica pieza que puede avanzar saltando otras piezas");
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
        return super.toString()+"Caballo{" + "casillasMovimineto=" + casillasMovimineto + ", formaMovimiento=" + formaMovimiento + '}';
    }
}
