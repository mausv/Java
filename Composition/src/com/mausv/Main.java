package com.mausv;

public class Main {

    public static void main(String[] args) {
        Owner mauricio = new Owner("Mauricio", 18);

        Desk brownDesk = new Desk(new Dimensions(10,10,5), "brown");

        Bed bed = new Bed (2, new Dimensions(20,10,2), "blue");

        Room mauricioRoom = new Room (mauricio, new Dimensions(50,50,10), bed, brownDesk);

        mauricioRoom.bed();

        mauricioRoom.wake();

        mauricioRoom.getDesk().cleanDesk();
    }
}
