/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author ACER
 */
class TRIANGLE {

    private int b;
    private int h;
    private int s;

    public TRIANGLE(int b, int h) {
        this.b = b;
        this.h = h;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void calcul_surface3() {
        s = (b * h) / 2;

    }

    public void affiche_surface3() {
        System.out.println("la surface du triangle est:" + s);
    }
}
