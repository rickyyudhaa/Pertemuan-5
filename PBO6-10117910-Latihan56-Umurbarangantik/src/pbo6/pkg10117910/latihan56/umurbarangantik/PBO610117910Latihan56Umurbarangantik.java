/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Umur Barang Antik
 *
 */
package pbo6.pkg10117910.latihan56.umurbarangantik;

/**
 *
 * @author User
 */
public class PBO610117910Latihan56Umurbarangantik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio r = new Radio(234);
        r.setName("Radio AM");
        System.out.println("Nama barang Antik : "+r.getName());
        r.tampilUmur();
    }
    
}
