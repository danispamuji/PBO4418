import java.util.Stack;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danis
 */

public class Stack_In {
      public static void main(String args[]){
            Kamera kamera = new Kamera();
            System.out.println(kamera.sisaKamera());
 
            kamera.tambahKamera("Nikon");
            kamera.tambahKamera("Canon");
            kamera.tambahKamera("Fuji");
            System.out.println(kamera.sisaKamera());
 
            kamera.gantiKamera(2,"Sony");
            System.out.println(kamera.sisaKamera());
 
            kamera.kameraRusak();
            System.out.println(kamera.sisaKamera());
      }
}
 
class Store_Kamera {
      Stack<String> camera = new Stack<String>();
 
      public Store_Kamera(){
 
      }
      public void setKamera(Stack<String> camera) {
            this.camera = camera;
      }
      public Stack<String> getKamera(){
            return this.camera;
      }
} 
 
class Kamera extends Store_Kamera {
      public void tambahKamera(String camera){
            super.getKamera().push(camera);
      }
      public String kameraRusak(){
            return super.getKamera().pop();
      }
      public void gantiKamera(int index,String camera){
            super.getKamera().set(index, camera);
      }
      public Stack<String> sisaKamera(){
            return super.getKamera();
      }
}

