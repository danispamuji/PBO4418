/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informasiakademik;

/**
 *
 * @author Danis
 */
public class InformasiAkademik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Danis Septiya Pamuji";
        mahasiswa.nim = "A11.2019.12029";
        mahasiswa.email = "111201912029@mhs.dinus.ac.id";
        mahasiswa.alamat = "Dsn Kalikembar, Bandungan, Kab.Semarang";
        mahasiswa.Cetak();
        
        Dosen dosen = new Dosen();
        dosen.nama = "Galuh Wilujeng Saraswati M.CS";
        dosen.nidn = "0617019401";
        dosen.email = "galuhwilujeng@dsn.dinus.ac.id";
        dosen.makul = "Logika Informatika";
        dosen.Cetak();
        
        MakulPokok makulpokok = new MakulPokok();
        makulpokok.makulpokok = "Logika Informatika";
        makulpokok.Cetak();
        
        MakulTambahan makultambahan = new MakulTambahan();
        makultambahan.makultambahan = "PKWU";
        makultambahan.Cetak();
        
        JumlahSKS jumlahsks = new JumlahSKS();
        jumlahsks.jumlahsks = "24";
        jumlahsks.Cetak();
        
        NilaiAkhir nilai = new NilaiAkhir ();
        nilai.nilaipokok = 94;
        nilai.nilaitambahan = 88;
        nilai.Cetak();
        
    }
    
}
