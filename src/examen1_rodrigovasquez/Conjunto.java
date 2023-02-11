package examen1_rodrigovasquez;

import java.awt.Color;
import java.util.ArrayList;

public class Conjunto {
    private Color color;
    ArrayList<NumeroComplejo> numComplejo = new ArrayList();

    public Conjunto() {
    }

    public Conjunto(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<NumeroComplejo> getNumComplejo() {
        return numComplejo;
    }

    public void setNumComplejo(ArrayList<NumeroComplejo> numComplejo) {
        this.numComplejo = numComplejo;
    }
    
    
}
