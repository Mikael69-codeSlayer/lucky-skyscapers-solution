package com.company;

public class Main {

    public static void main(String[] args) {
      for(var floor = 1; floor <= 220; floor++) {
          System.out.println("floor: " + floor);
          var fakeFloor = LuckySkyscaper.toFakeFloor(floor);
          System.out.println("fakeFloor: " + LuckySkyscaper.toRealFloor(floor));
          var backToRealFloor = LuckySkyscaper.toRealFloor(fakeFloor);
          System.out.println("  back to real: " + backToRealFloor);
      }
    }
}
