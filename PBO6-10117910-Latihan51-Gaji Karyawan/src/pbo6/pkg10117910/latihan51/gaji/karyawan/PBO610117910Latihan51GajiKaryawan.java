/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Gaji Karyawan
 *
 */
package pbo6.pkg10117910.latihan51.gaji.karyawan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO610117910Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Karyawan k = new Karyawan();
        Manager m = new Manager();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukan NIK : ");
        k.setNik(scn.nextLine());
        System.out.print("Masukan Nama : ");
        k.setNama(scn.next());
        System.out.print("Masukan Golongan : ");
        k.setGolongan(scn.nextInt());
        System.out.print("Masukan Jabatan (Manager/Kabag): ");
        k.setJabatan(scn.next());
        System.out.print("Masukan Jumlah Kehadiran : ");
        m.setKehadiran(scn.nextInt());
        
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK      :"+k.getNik());
        System.out.println("NAMA     :"+k.getNama());
        System.out.println("GOLONGAN : "+k.getGolongan());
        System.out.println("JABATAN  :"+k.getJabatan());
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN      : "+m.tunjanganGolongan(k.getGolongan()));
        System.out.println("TUNJANGAN JABATAN       : "+m.tunjanganJabatan(k.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN     : "+m.tunjanganKehadiran(m.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL      : "+m.gajiTotal());
        
    }

}
