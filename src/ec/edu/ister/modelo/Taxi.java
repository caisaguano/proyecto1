/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Expression quike is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class Taxi extends Vehiculo{
    public Taxi(){
    }

    public Taxi(int numerolicencia, String matricula, String modelo, String potencia) {
        super(matricula, modelo, potencia);
        this.numerolicencia = numerolicencia;
    }
    private int numerolicencia;

    public int getNumerolicencia() {
        return numerolicencia;
    }

    public void setNumerolicencia(int numerolicencia) {
        this.numerolicencia = numerolicencia;
    }

    @Override
    public void Consumo() {
        JOptionPane.showMessageDialog(null,"los taxis consumen 12 galones de extra");
    
    }

    @Override
    public String toString() {
        return super.toString()+"\n "+"este es un taxi"; //To change body of generated methods, choose Tools | Templates.
    }
    

}
