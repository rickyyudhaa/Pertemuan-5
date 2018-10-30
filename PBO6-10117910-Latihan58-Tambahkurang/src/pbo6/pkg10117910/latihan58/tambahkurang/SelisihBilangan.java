/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan58.tambahkurang;

/**
 *
 * @author User
 */
public class SelisihBilangan extends Bilangan {

    public void tampilHasilSelisih() {
        int selisih = getX() - getY();
        System.out.println("Hasil selisih " + getX() + " - "
                + getY() + " = " + selisih);
    }
}
