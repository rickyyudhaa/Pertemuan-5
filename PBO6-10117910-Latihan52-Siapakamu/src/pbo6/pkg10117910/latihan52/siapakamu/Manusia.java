/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan52.siapakamu;

/**
 *
 * @author User
 */
public class Manusia {
    static String nama;
    static int umur;

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Manusia.nama = nama;
    }

    public static int getUmur() {
        return umur;
    }

    public static void setUmur(int umur) {
        Manusia.umur = umur;
    }
    
    public void siapaKamu(){
        System.out.println("Saya Manusia");
    }
}
