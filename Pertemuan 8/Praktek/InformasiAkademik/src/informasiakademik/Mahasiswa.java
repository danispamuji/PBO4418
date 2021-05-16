package informasiakademik;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danis
 */
public class Mahasiswa extends InformasiAkademik {
    String nama;
    String nim;
    String email;
    String alamat;
    
    public Mahasiswa(){
    }
    
    public void setNama (String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    

    public void Cetak(){
        System.out.println("DATA MAHASISWA");
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
        System.out.println("Email Mahasiswa: "+ email);
        System.out.println("Alamat: "+ alamat);

    }

}
