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
public class NilaiAkhir {
    int nilaipokok; //nilai mata kuliah pokok
    int nilaitambahan; //nilai mata kuliah tambahan
    float nilaiakhir;
    
    public NilaiAkhir(){
        
    }
    
    public void setNilaiakhir (int nilaipokok, int nilaitambahan){
        
        nilaiakhir = (nilaipokok*6)+(nilaitambahan*4);
    }
    public float getNilaiakhir(){
        return nilaiakhir;
    }

    public void Cetak(){
        System.out.println("Nilai Mata Kuliah Pokok :  "+ nilaipokok);
        System.out.println("Nilai Mata Kuliah Tambahan : "+ nilaitambahan);
        System.out.println("Nilai Akhir :"+ getNilaiakhir());
    }
}
