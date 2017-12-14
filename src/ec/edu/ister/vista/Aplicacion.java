/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.vista;

import ec.edu.ister.modelo.Autobus;
import ec.edu.ister.modelo.Taxi;
import ec.edu.ister.modelo.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author Expression quike is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class Aplicacion {
    public static void main(String[] args) {
       //Vehiculo obj1=new Taxi();
       Vehiculo obj2 =new Autobus();
       JOptionPane.showMessageDialog(null,obj2.toString());
        obj2.Consumo();  
    }

}
