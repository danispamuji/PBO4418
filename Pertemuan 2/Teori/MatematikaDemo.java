/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class matematika{
    int total = 0;
    int nilai = 0;
    
   
   //method
    void Pertambahan (int nilaiBaru){
        total = nilai + nilaiBaru;
        System.out.println("\nHasil Penjumlahan: "+ nilai +" + " + nilaiBaru + " = " + total);
    }
    
    void Pengurangan (int nilaiBaru){
        total = nilai - nilaiBaru;
        System.out.println("\nHasil Perkurangan: "+ nilai +" + " + nilaiBaru + " = " + total);
    }
    
    void Perkaliam (int nilaiBaru){
        total = nilai * nilaiBaru;
        System.out.println("\nHasil Penjumlahan: "+ nilai +" + " + nilaiBaru + " = " + total);
    }
    
    void Pembagian (int nilaiBaru){
        total = nilai / nilaiBaru;
        System.out.println("\nHasil Bagi: "+ nilai +" + " + nilaiBaru + " = " + total);
    }
}

/**
 *
 * @author user
 */
public class MatematikaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        //Membuat object
        matematika math = new matematika();
        //Memanggil atribut dan memberi nilai
        //penjumlahan
        math.nilai = 20;
        math.Pertambahan(20);
        //Perkurangan
        math.nilai = 10;
        math.Pengurangan(5);
        //perkalian
        math.nilai = 10;
        math.Perkaliam(20);
        //pembagian
        math.nilai = 20;
        math.Pembagian(2);
    }
}
