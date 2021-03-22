/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class TestGame {
    public static void main(String[] args) {
        GamePlayer demo = new GamePlayer();
        demo.setPosition(30,40);
        demo.Run(60);
        demo.Run();
    }
    
}
