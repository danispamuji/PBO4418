/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

class Manusia {
    String nama;
    boolean punyaTV;
    
    Manusia (){
    }
    public Manusia (String nama) {
       this.nama = nama;
    }
    public String namaSaya(){
        return nama;
    }
    void beliTV (TV tiviku){
        punyaTV = true;
        System.out.println(punyaTV);
    }
    void jualSemuaTV(){
        punyaTV = false;
        System.out.println(punyaTV);
    }   
    boolean cekTV() {
        return punyaTV;
    }
}

class TV {
    int channel, volumeLevel;
    boolean on = false;
    
    public TV(){}
    public void turnOn() {on = true;}
    public void turnOff(){on = false; }
    public void setChannel(int NewChannel){channel = NewChannel;}
    public void channelUp() {++channel;}
    public void channelDown() {--channel;}
    public void setVolume(int newvolume) {volumeLevel = newvolume;}
    public void volumeUp() { ++volumeLevel;}
    public void volumeDown(){--volumeLevel;}
}

public class ClassManusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Manusia orang = new Manusia("Erik");
        System.out.println(orang.namaSaya());
        TV tiviku = new TV();
        orang.beliTV(tiviku);
        orang.jualSemuaTV();
        
    }
}