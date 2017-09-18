/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAP;

/**
 *
 * @author fznrm
 */
public class iterasi {
    
    private double x1, x2, alpha, cs, Tawal, Takhir;

    public iterasi() {
    }    

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getCs() {
        return cs;
    }

    public void setCs(double cs) {
        this.cs = cs;
    }

    public void setAlpha(double alpha) {
        this.alpha = 0.99;
    }

    public void setTakhir(double Takhir) {
        this.Takhir = 1;
    }

    public void setTawal(double Tawal) {
        this.Tawal = 1000;
    }

    public double getAlpha() {
        return alpha;
    }

    public double getTakhir() {
        return Takhir;
    }

    public double getTawal() {
        return Tawal;
    }
}
