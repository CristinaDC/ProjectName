package com.java.Parking;

public class ParkingCarmelo {
    public static void main(String[] args) {

        final boolean hayCoche = true;
        while (hayCoche){
            final SensorDeLaPuerta sensorDeLaPuerta = new SensorDeLaPuerta();
            sensorDeLaPuerta.getCoche();
        }
    }
}
