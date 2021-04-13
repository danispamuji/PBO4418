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
    
    public static void kendaraanMelaju(Vehicle Vehicle){
        Vehicle.goStraight();
    }
    public static void main(String[] args) {
        Vehicle transportasi = new Vehicle();
        Bicycle sepeda = new Bicycle();
        MotorVehicle sepedamotor = new MotorVehicle(1, "AB 4678 DN");
        MotorCycle motor = new MotorCycle();
        Car mobil = new Car();
        
        kendaraanMelaju(new Vehicle());
        kendaraanMelaju(new Bicycle());
        kendaraanMelaju(new MotorVehicle());
        sepeda.ringBell();
        
        transportasi.goStraight();
        transportasi.turnLeft();
        transportasi.turnRight();
        sepedamotor.getSizeofEngine();
        sepedamotor.getLicencePlate();
        sepeda.ringBell();
        motor.setGearFoot(3);
        mobil.setSeatBelt(1);
        
        
        System.out.println("Nomer Sepeda Motor adalah "+sepedamotor.getLicencePlate());
        System.out.println("Mesinnya adalah "+sepedamotor.getSizeofEngine());
        System.out.println("Gear of motor3: " + motor.getGearFoot());
        System.out.println("Use sealbelt: " + mobil.getSeatBelt());

    }
}