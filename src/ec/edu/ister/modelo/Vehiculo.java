/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

/**
 *
 * @author Expression quike is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public abstract class Vehiculo {

    @Override
    public String toString() {
        return "todos son vehiculos"; //To change body of generated methods, choose Tools | Templates.
    }

public Vehiculo(){
}
    public Vehiculo(String matricula, String modelo, String potencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }
    
    protected String matricula;
    protected String modelo;
    protected String potencia;

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPotencia() {
        return potencia;
    }
 public abstract void Consumo();

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    
}
