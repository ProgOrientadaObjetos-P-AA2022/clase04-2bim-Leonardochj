/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {

    private int numeroGalones;
    private double costoGalon;
    private double IVA;

    public AutomovilGasolina(String a, String b, int c, double d) {
        super(a, b);
        numeroGalones = c;
        costoGalon = d;
    }

    public void establecerNumeroGalones(int c) {
        numeroGalones = c;
    }

    public void establecerCostoGalon(int c) {
        costoGalon = c;
    }

    public void establecerIVA() {
        IVA = ((costoGalon * numeroGalones) * 10) / 100;
    }

    @Override
    public void establecerValorCancelar() {
        valorCancelar = (costoGalon * numeroGalones) + IVA;
    }

    public int obtenerNumeroGalones() {
        return numeroGalones;
    }

    public double obtenerCostoGalon() {
        return costoGalon;
    }

    public double obtenerIVA() {
        return IVA;
    }

    @Override
    public String toString() {
        String cadena = "DATOS DEL AUTOMOVIL CON GASOLINA\n";
        cadena = String.format("%s%s", cadena, super.toString());
        cadena = String.format("%sNumero de galones: %d\n"
                + "Costo por cada galon: %.2f\n"
                + "Descuento: %.2f\n", cadena,
                obtenerNumeroGalones(),
                obtenerCostoGalon(),
                obtenerIVA());
        return cadena;
    }
}
