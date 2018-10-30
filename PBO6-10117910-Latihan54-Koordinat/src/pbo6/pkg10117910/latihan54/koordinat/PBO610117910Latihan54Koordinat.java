/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Koordinat
 *
 */
package pbo6.pkg10117910.latihan54.koordinat;

/**
 *
 * @author User
 */
public class PBO610117910Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat w = new WarnaKoordinat(10, 4, "Jingga");
        System.out.println("Warna Koordinat : "+w.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+w.x+" Koordinat Sumbu Y : "+w.y);
    }
    
}
