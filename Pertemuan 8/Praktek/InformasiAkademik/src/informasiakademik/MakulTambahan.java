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
public class MakulTambahan extends InformasiAkademik {
    String makultambahan;
    
    public MakulTambahan(){
    }
    
    public void setMatkulTambahan(String makultambahan){
        this.makultambahan = makultambahan;
    }
    
    public String getMatkulTambahan(){
        return makultambahan;
    }
    
    public void Cetak(){
        System.out.println("Mata Kuliah Tambahan: "+makultambahan);
    }
    
}
