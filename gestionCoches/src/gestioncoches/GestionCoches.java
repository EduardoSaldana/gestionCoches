/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncoches;

import vehiculo.vehiculo;


public class GestionCoches {

    /*
    cada coche tendra:
    - matricula: String
    - marca: String
    - modelo: String
    - color: String
    - disponible: boolean
    Getter/Setter
    Instanciar un par de Objetos y mostrarlo por pantalla
    */
    public static void main(String[] args) {
        vehiculo v1 = new vehiculo("WWW","Transformer","Optimus","Llamas",15.99,true);
        vehiculo v2 = new vehiculo("EEE","Citroen","Cactus","Gris",15.99,false);
        System.out.println(v1);
        System.out.println(v2);
    }
    
}
