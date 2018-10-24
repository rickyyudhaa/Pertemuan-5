/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Siapa Kamu
 *
 */
package pbo6.pkg10117910.latihan52.siapakamu;

/**
 *
 * @author User
 */
public class PBO610117910Latihan52Siapakamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia m = new Manusia();
        
        Dosen d = new Dosen();
        d.setNip("41227829930");
        d.setMataKuliah("PBO");
        d.setNama("Rizki Adam Kurniawan");
        d.setUmur(27);
        
        System.out.println("NIP Dosen : "+d.getNip());
        d.siapaKamu();
        d.mengajarApa();
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("10110269");
        Mahasiswa.setNama("Nindi");
        Mahasiswa.setUmur(17);
        mhs.setKelas("PBO2");
       
        System.out.println("NIM MAHASISWA : "+mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
        
        
    }
    
}
