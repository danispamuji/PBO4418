/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import transportasii.Mobil;
import transportasii.Bycicle;

/**
 *
 * @author Danis
 */
public class TransportasiDemo {
    public static void main(String[] args){
        Bycicle sepeda = new Bycicle();
        sepeda.changeCadence(65);
        sepeda.speedUp(28);
        sepeda.changeGear(5);
        sepeda.printStates(); 
        
        Mobil mobil = new Mobil("Merah", 2019);
        mobil.getwarna();
        mobil.gettahun();
        
        System.out.println("Warna Mobil : "+mobil.getwarna());
        System.out.println("Thun Mobil : "+mobil.gettahun());
        
    }


}