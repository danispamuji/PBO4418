/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportasii;

/**
 *
 * @author Danis
 */
public class Mobil {
    String warna;
    int tahun = 2019;
    
    public Mobil() {

    }
    
    public Mobil(String color, int year) {
        this.warna = color;
        this.tahun = year;
    }
    
    public String getwarna() {
        return warna;
    }
    public int gettahun() {
        return tahun;
    }
}