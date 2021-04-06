import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danis
 */
public class ArrayList_In {
      public static void main(String args[]){
           Kamera camera = new Kamera();
           System.out.println(camera.sisaKamera());

           camera.tambahKamera("Nikon");
           camera.tambahKamera("Sony");
           camera.tambahKamera("Fuji");
           camera.tambahKamera("Canon");
           System.out.println(camera.sisaKamera());

           camera.gantiKamera(1,"Analog");
           System.out.println(camera.sisaKamera());

           camera.cameraRusak(0);
           System.out.println(camera.sisaKamera());
      }
}

class Store_Kamera {
      ArrayList<String> cameras = new ArrayList<>();

      public Store_Kamera(){

      }
      public void setKamera(ArrayList<String> cameras) {
            this.cameras = cameras;
      }
      public ArrayList<String> getKamera(){
            return this.cameras;
      }
} 

class Kamera extends Store_Kamera {
      public void tambahKamera(String cameras){
            super.getKamera().add(cameras);
      }
      public String cameraRusak(int index){
            return super.getKamera().remove(index);
      }
      public void gantiKamera(int index, String cameras){
            super.getKamera().set(index, cameras);
      }
      public ArrayList<String> sisaKamera(){
            return super.getKamera();
      }
}