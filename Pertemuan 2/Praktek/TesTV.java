/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danis Pamuji
 */
public class TesTV {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
                    
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