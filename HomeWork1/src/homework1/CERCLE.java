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
class CERCLE {

    private int r;
    final double p = 3.14;
    private int s;

    public CERCLE(int r, int R) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void calcul_surface2() {
        s = (int) (r * r * p);
    }

    public void affiche_surface2() {
        System.out.println("la surface du cercle est:" + s);
    }
}
