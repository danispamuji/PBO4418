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
public class MakulPokok extends InformasiAkademik {
    String makulpokok;
    
    public MakulPokok(){
    }
    
    public void setMatkulPokok(String makulpokok){
        this.makulpokok = makulpokok;
    }
    
    public String getMatkulPokok(){
        return makulpokok;
    }
    
    public void Cetak(){
        System.out.println("Mata Kuliah Pokok: "+makulpokok);
    }
    
}
