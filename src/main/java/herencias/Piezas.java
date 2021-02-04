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
    public void info() {
        System.out.println("Cada jugador tiene 16 piezas que puede controlar");
    }

    public void fichas() {
        System.out.println("Cada jugador tiene, el rey,la dama,torres,caballos,alfiles y peones");
    }

    public void curiosidadPiezas() {
        System.out.println("Hay un movimiento en el cual podemos mover dos piezas en un unico turno.\n"
                + "El movimiento es llamado Enroque, en el cual podemos mover el rey al lado de la torre y esta se traslada al otro lado del rey para protger dicha ficha");
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
        return super.toString() + " Piezas{" + "cantPiezas=" + cantPiezas + ", color=" + color + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.cantPiezas;
        hash = 71 * hash + (this.color ? 1 : 0);
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
        final Piezas other = (Piezas) obj;
        if (this.cantPiezas != other.cantPiezas) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        return true;
    }

}
