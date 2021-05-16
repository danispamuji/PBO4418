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
public class Dosen extends InformasiAkademik {
    String nama;
    String nidn;
    String email;
    String makul;
    
    public Dosen(){
        
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNidn(String nidn){
        this.nidn = nidn;
    }
    
    public String getNidn(){
        return nidn;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setMakul(String makul){
        this.makul = makul;
    }
    
    public String getMakul(){
        return makul;
    }
    

    public void Cetak(){
        System.out.println("DATA DOSEN");
        System.out.println("Nama: "+ nama);
        System.out.println("NIDN: "+ nidn);
        System.out.println("Email Dosen: "+ email);
        System.out.println("Mata Kuliah: "+ makul);
    }
}
