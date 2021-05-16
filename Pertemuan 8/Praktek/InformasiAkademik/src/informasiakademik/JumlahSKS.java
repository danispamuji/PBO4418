/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informasiakademik;

/**
 *
 * @author user
 */
public class JumlahSKS extends InformasiAkademik {
    String jumlahsks;
    
    public JumlahSKS (){
    }
    
    public void setJumlahsks (String jumlahsks){
        this.jumlahsks = jumlahsks;
    }
    
    public String getJumlahsks(){
        return jumlahsks;
    }
    
    public void Cetak(){
        System.out.println("Jumlah SKS yang diambil : "+ jumlahsks);
    }
}
