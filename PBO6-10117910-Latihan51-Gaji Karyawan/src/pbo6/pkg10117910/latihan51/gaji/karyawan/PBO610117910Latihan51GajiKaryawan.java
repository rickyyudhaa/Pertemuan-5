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
        Manager m = new Manager();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukan NIK : ");
        m.setNik(scn.nextLine());
        System.out.print("Masukan Nama : ");
        m.setNama(scn.next());
        System.out.print("Masukan Golongan : ");
        m.setGolongan(scn.nextInt());
        System.out.print("Masukan Jabatan (Manager/Kabag): ");
        m.setJabatan(scn.next());
        System.out.print("Masukan Jumlah Kehadiran : ");
        m.setKehadiran(scn.nextInt());
        
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK      :"+m.getNik());
        System.out.println("NAMA     :"+m.getNama());
        System.out.println("GOLONGAN : "+m.getGolongan());
        System.out.println("JABATAN  :"+m.getJabatan());
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN      : "+m.tunjanganGolongan(m.getGolongan()));
        System.out.println("TUNJANGAN JABATAN       : "+m.tunjanganJabatan(m.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN     : "+m.tunjanganKehadiran(m.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL      : "+m.gajiTotal());
        
    }

}
