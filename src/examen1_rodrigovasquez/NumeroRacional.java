/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_rodrigovasquez;

/**
 *
 * @author Rui
 */
public class NumeroRacional extends NumeroReal {

    private int numerador, denominador;

    public NumeroRacional() {
    }

    @Override
    public int autoDenominar() {
        return numerador / denominador;
    }

    public int simplificar() {
        if ((numerador / denominador) % 0) {

        }
    }
}
