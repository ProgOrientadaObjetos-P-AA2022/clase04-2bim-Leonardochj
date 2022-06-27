/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {

    protected String nombrePropietario;
    protected String placa;
    protected double valorCancelar;

    public Automovil(String a, String b) {
        nombrePropietario = a;
        placa = b;
    }

    public void establecerNombrePropietario(String c) {
        nombrePropietario = c;
    }

    public void establecerPlaca(String c) {
        placa = c;
    }

    public abstract void establecerValorCancelar();

    public String obtenerNombrePropietario() {
        return nombrePropietario;
    }

    public String obtenerPlaca() {
        return placa;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del propietario: %s\n"
                + "Placa del automovil: %s\n"
                + "Valor a cancelar: %.2f\n",
                obtenerNombrePropietario(),
                obtenerPlaca(),
                obtenerValorCancelar());
        return cadena;
    }
}
