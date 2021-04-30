package com.CompositionChallenge;

public class Main {

  public static void main(String[] args) {

      Wall wall1 = new Wall("East");
      Wall wall2 = new Wall("West");
      Wall wall3 = new Wall("North");
      Wall wall4 = new Wall("South");

      Ceiling ceiling  = new Ceiling(20,55);

      Bed bed = new Bed("Modern",4,3,2,1);

      Lamp lamp = new Lamp("Classic",75,false);

      Bedroom bedRoom = new Bedroom("Omkar's Bedroom",wall1,wall2,wall3,wall4,bed,ceiling,lamp);

      bedRoom.getLamp();
      bedRoom.makeBed();
  }




}
