package com.mausv;

/**
 * Created by Mauricio on 10/8/2015.
 */
public class Room {
    private Owner owner;
    private Dimensions roomDimensions;
    private Bed bed;
    private Desk desk;

    public Room(Owner owner, Dimensions roomDimensions, Bed bed, Desk desk) {
        this.owner = owner;
        this.roomDimensions = roomDimensions;
        this.bed = bed;
        this.desk = desk;
    }

    public void bed(){
        bed.goToSleep();
    }

    public void wake(){
        bed.wakeUp();
    }

    public Desk getDesk() {
        return desk;
    }
}
