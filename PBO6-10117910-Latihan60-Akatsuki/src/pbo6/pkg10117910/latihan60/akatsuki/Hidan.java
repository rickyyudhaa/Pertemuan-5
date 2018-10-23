/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan60.akatsuki;

/**
 *
 * @author User
 */
public class Hidan extends Member{
    public Hidan() {
       nama ="Hidan";
       asalDesa = "Yugakure";
       ultimateJutsu = "Jujutsu: Shiji Hyōketsu";
       
    }
    
    @Override
    public void tampilData() {
        System.out.println("Nama            : "+nama);
        System.out.println("Asal Desa       : "+asalDesa);
        System.out.println("Ultimate Jutsu  : "+ultimateJutsu); //To change body of generated methods, choose Tools | Templates.
        System.out.println("");
    }
}
