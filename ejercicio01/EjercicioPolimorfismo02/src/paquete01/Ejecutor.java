/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        String nombrePropietario = "Leonardo";
        String placa = "LJB-1876";
        
        int numeroGalones = 50;
        double costoGalones = 25.43;
        
        int numeroLitros = 20;
        double costoLitros  = 3.00;
        
        ArrayList<Automovil> auto = new ArrayList<>();
        
        AutomovilGasolina autoGasolina = new AutomovilGasolina(
                nombrePropietario, placa, numeroGalones, costoGalones);
        autoGasolina.establecerValorCancelar();
        autoGasolina.establecerIVA();
        auto.add(autoGasolina);
        System.out.printf("%s\n", autoGasolina);
        
        System.out.println("--------------------------------------\n");
        
        AutomovilDiesel autoDiesel = new AutomovilDiesel(
                nombrePropietario, placa, numeroLitros, costoLitros);
        autoDiesel.establecerValorCancelar();
        autoDiesel.establecerDescuento();
        auto.add(autoDiesel);
        System.out.printf("%s\n", autoDiesel);
    }
}
