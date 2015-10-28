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
class Carre {

    private int a;
    private int s;

    public Carre(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void calcul_surface1() {
        s = a * a;
    }

    public void affiche_surface1() {
        System.out.println("la surface du carre est:" + s);
    }
}
