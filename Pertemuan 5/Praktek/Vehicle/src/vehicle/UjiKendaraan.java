package vehicle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danis
 */
public class UjiKendaraan {
    public static void main(String[] args) {
        Vehicle transportasi = new Vehicle();
        Bicycle sepeda = new Bicycle();
        MotorVehicle sepedamotor = new MotorVehicle(1, "AB 4678 DN");

        sepeda.ringBell();
        sepedamotor.getSizeofEngine();
        sepedamotor.getLicencePlate();
        transportasi.goStraight();
        transportasi.turnLeft();
        
        System.out.println("Nomer Sepeda Motor adalah "+sepedamotor.getLicencePlate());
        System.out.println("Mesinnya adalah "+sepedamotor.getSizeofEngine());

    }
}