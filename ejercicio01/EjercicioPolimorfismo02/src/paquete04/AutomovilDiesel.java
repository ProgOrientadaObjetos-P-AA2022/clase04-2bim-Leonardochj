/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {

    private int numeroLitros;
    private double costoLitro;
    private double descuento;

    public AutomovilDiesel(String a, String b, int c, double d) {
        super(a, b);
        numeroLitros = c;
        costoLitro = d;
    }

    public void establecerNumeroLitros(int c) {
        numeroLitros = c;
    }

    public void establecerCostoLitro(double c) {
        costoLitro = c;
    }

    public void establecerDescuento() {
        descuento = ((numeroLitros * costoLitro) * 10) / 100;
    }

    @Override
    public void establecerValorCancelar() {
        valorCancelar = (costoLitro - descuento) * costoLitro;
    }

    public int obtenerNumeroLitros() {
        return numeroLitros;
    }

    public double obtenerCostoLitro() {
        return costoLitro;
    }

    public double obtenerDescuento() {
        return descuento;
    }
    @Override
    public String toString() {
        String cadena = "DATOS DEL AUTOMOVIL CON DIESEL\n";
        cadena = String.format("%s%s", cadena, super.toString());
        cadena = String.format("%sNumero de litros: %d\n"
                + "Costo por cada litro: %.2f\n"
                + "Descuento: %.2f\n",
                cadena,
                obtenerNumeroLitros(),
                obtenerCostoLitro(),
                obtenerDescuento());
        return cadena;
    }
}
