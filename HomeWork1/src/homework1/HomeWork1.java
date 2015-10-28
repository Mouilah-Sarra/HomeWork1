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
public class HomeWork1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Carre c1 = new Carre(5);
        c1.calcul_surface1();

        CERCLE c2 = new CERCLE(7, (int) 3.14);
        c2.calcul_surface2();

        TRIANGLE c3 = new TRIANGLE(4, 7);
        c3.calcul_surface3();

        c1.affiche_surface1();
        c2.affiche_surface2();
        c3.affiche_surface3();
    }

}
