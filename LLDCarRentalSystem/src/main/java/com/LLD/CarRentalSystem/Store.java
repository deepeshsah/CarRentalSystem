package com.LLD.CarRentalSystem;


import java.util.ArrayList;
import java.util.List;

import com.LLD.CarRentalSystem.Product.Vehicle;
import com.LLD.CarRentalSystem.Product.VehicleType;

public class Store {

    int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();


    public List<Vehicle> getVehicles(VehicleType vehicleType) {

        return inventoryManagement.getVehicles();
    }


    //addVehicles, update vehicles, use inventory management to update those.


    public void setVehicles(List<Vehicle> vehicles) {
        inventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

    //update reservation

}
