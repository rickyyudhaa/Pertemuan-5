/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Handphone
 *
 */
package pbo6.pkg10117910.latihan55.handphone;

/**
 *
 * @author User
 */
public class PBO610117910Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android a = new Android("Samsung", "Android", "Grand", 3000000);
        a.setKeyStore("234ibfd3840fo");
        BlackBerry b = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        b.setPinBB("BHS249");
        WindowsPhone w = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        w.setWpKeyStore("UUUQIJWORJ");
        a.displayProduct();
        System.out.println("Android Key Store : "+a.getKeyStore());
        System.out.println("");
        b.displayProduct();
        System.out.println("PIN : "+b.getPinBB());
        System.out.println("");
        w.displayProduct();
        System.out.println("Wp Key Store : "+w.getWpKeyStore());
        
    }
    
}
