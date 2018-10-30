/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan54.koordinat;

/**
 *
 * @author User
 */
public class WarnaKoordinat extends Koordinat{
    public String namaWarna;
    
    public WarnaKoordinat(int x, int y, String namaWarna){
       super(x,y);
       this.x=x;
       this.y=y;
       this.namaWarna=namaWarna;
       
    }
    public String getNamaWarna() {
        return namaWarna;
    }
    
    public void setNamaWarna(String namaWarna){
        
    }
}
