import java.util.Queue;
import java.util.LinkedList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danis
 */
public class Queue_In {
      public static void main(String args[]){
            Kamera kamera = new Kamera();
            System.out.println(kamera.sisaKamera());
 
            kamera.tambahKamera("Nikon");
            kamera.tambahKamera("Sony");
            kamera.tambahKamera("Fuji");
            kamera.tambahKamera("Canon");
            kamera.tambahKamera("GoPro");
            System.out.println(kamera.sisaKamera());
 
            kamera.kameraRusak(4);
            System.out.println(kamera.sisaKamera());
      }      
}

class Store_Kamera {
      Queue<String> cameras = new LinkedList<String>();
 
      public Store_Kamera(){
 
      }
      public void setKamera(Queue<String> cameras) {
            this.cameras = cameras;
      }
      public Queue<String> getKamera(){
            return this.cameras;
      }
}

class Kamera extends Store_Kamera {
      public void tambahKamera(String cameras){
            super.getKamera().add(cameras);
      }
      public void kameraRusak(int index){
            System.out.println(super.getKamera().poll());
      }
      public Queue<String> sisaKamera(){
            return super.getKamera();
      }
} 