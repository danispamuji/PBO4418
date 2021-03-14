
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

class Mobil{
    //Variabel
    String warna;
    int tahunProduksi;
    boolean onoff = false;
    int gantiGigi;
    
    //Method
    void hidupkanMobil(){
        onoff = true;
    }
    void matikanMobil(){
        onoff = false;
    }
    void ubahGigi (int gigiBaru) {
        gantiGigi = gigiBaru;
    }
}


public class MobilDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        // Membuat object
        Mobil mobilku = new Mobil();
        // memanggil atribut dan memberi nilai
        mobilku.warna="Merah";
        mobilku.tahunProduksi= 2020;
        mobilku.hidupkanMobil();
        mobilku.ubahGigi(2);
        
        Mobil mobilku12 = new Mobil();
        mobilku12.warna="Merah";
        mobilku12.tahunProduksi= 2020;
        mobilku12.matikanMobil ();
        mobilku12.ubahGigi(0);
        
        
        
        System.out.println("Warna: "+ mobilku.warna);
        System.out.println("Tahun: "+ mobilku.tahunProduksi);
        System.out.println("Kondisi mobil: "+ mobilku.onoff);
        System.out.println("Ganti gigi: "+ mobilku.gantiGigi);
        System.out.println("-------------------------------");
        
        System.out.println("Warna: "+ mobilku12.warna);
        System.out.println("Tahun: "+ mobilku12.tahunProduksi);
        System.out.println("Kondisi mobil: "+ mobilku12.onoff);
        System.out.println("Ganti gigi: "+ mobilku12.gantiGigi);
    
    }
    
}
