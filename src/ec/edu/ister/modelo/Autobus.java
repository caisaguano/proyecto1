/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

import ec.edu.ister.vista.DatosVehiculo;

/**
 *
 * @author Expression quike is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class Autobus extends Vehiculo{
    public Autobus(){
    
    }
    private int numeroPlazas; 

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public Autobus(int numeroPlazas, String matricula, String modelo, String potencia) {
        super(matricula, modelo, potencia);
        this.numeroPlazas = numeroPlazas;
    }

    @Override
    public void Consumo() {
        DatosVehiculo registro =new DatosVehiculo();
        registro.setVisible(true);
      // registro.setVisible(false);
    }
    

}
