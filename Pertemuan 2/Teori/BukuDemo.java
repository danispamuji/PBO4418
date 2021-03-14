/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class Buku{
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahun;
    
    public Buku(String judul, String pengarang, String penerbit, int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun; 
    }
    public void info(){
        System.out.println("Judul : "+ this.judul);
        System.out.println("Pengarang : " + this.pengarang);
        System.out.println("Penerbit : " + this.penerbit);
        System.out.println("Tahun : " + this.tahun);
    }   
}

/**
 *
 * @author user
 */
public class BukuDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Buku bukuku = new Buku ("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007);
        bukuku.info();
        
        Buku bukuku1 = new Buku ("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);
        bukuku1.info();
    }
}
