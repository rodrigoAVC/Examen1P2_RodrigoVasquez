/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_rodrigovasquez;

/**
 *
 * @author Rui
 */
public class NumeroExponencial extends NumeroReal {
    private int base;
    private int expo;

    public NumeroExponencial() {
    }

    public NumeroExponencial(int base, int expo) {
        this.base = base;
        this.expo = expo;
    }

    @Override
    public int autoDenominar() {
        return (int)Math.pow(base, expo);
    }
    
    public int multiplicacion() {
        int base;
        int expo;
        if () {
            
        }
    }
}
