/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class Prueba {

    public static void main(String[] args) {
        //Creación de los objetos
        Ajedrez juego1 = new Ajedrez(64, "Acorralar el rey enemigo");
        Ajedrez juego2 = new Ajedrez(64, "Defender tu rey del jugador enemigo");
 // Conversión implícita
        Piezas peonesB = new Piezas(8, true, 64, "Derrotar al ejercito enemigo");
        Piezas peonesN = new Piezas(8, false, 64, "Derrotar al ejercito enemigo");
 // Conversión implícita
        Peon ficha1 = new Peon(1, "frontal", 1, true, 64, "Defender a su rey");
        Peon ficha2 = new Peon(1, "frontal", 1, false, 64, "Derrotar al rey enemigo");
 // Conversión implícita
        Caballo caballito1 = new Caballo(4, "En forma de L", 1, true, 64, "Limitar el movimiento de las piezas enemigas");
        Caballo caballito2 = new Caballo(4, "En forma de L", 1, false, 64, "ponerse en un lugar donde protega a las piezas aliadas");

        //Creación del ArrayList
        ArrayList<Ajedrez> lista = new ArrayList<>();
        //Añadir objetos creados anteriormente a la ArrayList
        lista.add(juego1);
        lista.add(juego2);
        lista.add(peonesB);
        lista.add(peonesN);
        lista.add(ficha1);
        lista.add(ficha2);
        lista.add(caballito1);
        lista.add(caballito2);

        //For Each para mostrar el ArrayList       
        for (Ajedrez aux : lista) {
            System.out.println(aux);
            //If para acceder al método de la clase seleccionada
// Conversiones explícitas
            if (aux instanceof Piezas) {
                ((Piezas) aux).curiosidadPiezas();
            }
            System.out.println("-------------------------------");
// Conversiones explícitas
            if (aux instanceof Peon) {
                System.out.println("-------------------------------");
                ((Peon) aux).curiosidadPeon();
                System.out.println("-------------------------------");
            }
// Conversiones explícitas
            if (aux instanceof Caballo) {
                System.out.println("-------------------------------");
                ((Caballo) aux).curiosidadCaballo();
                System.out.println("-------------------------------");
            }
            //If para acceder al metodo que se sobreescribe en todas las clases
            System.out.println("-------------------------------");
//Método Polimorfico
            aux.info();
            System.out.println("-------------------------------");
        }
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");

        //Métodos de  ArrayList
        System.out.println("Index of:");
        //Para indicar en que posición está eñ objeto
        System.out.println(lista.indexOf(caballito1));

        System.out.println("Constains:");
        //para saber si el objeto está dentro del ArrayList
        System.out.println(lista.contains(ficha1));
        //elimina el objeto del arrayList

        lista.remove(ficha1);
        System.out.println("Lista luego de borrar uno de los objetos");
        for (Ajedrez aux : lista) {
            System.out.println(aux);
            
        }

    }
}
