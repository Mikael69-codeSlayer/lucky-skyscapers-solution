package com.company;

public class Main {

    public static void main(String[] args) {

        // Test to non-memoized version
     /* for(var floor = 1; floor <= 220; floor++) {
          System.out.println("floor: " + floor);
          var fakeFloor = LuckySkyscaper.toFakeFloor(floor);
          System.out.println("fakeFloor: " + LuckySkyscaper.toRealFloor(floor));
          var backToRealFloor = LuckySkyscaper.toRealFloor(fakeFloor);
          System.out.println("  back to real: " + backToRealFloor);
      } */

        // Test memoized version

        var skyScaper = new LuckySkyScaperMemoized(220);

        for(var floor = 1; floor <= 220; floor++) {
            System.out.println("floor: " + floor);
            var fakeFloor = skyScaper.toFakeFloor(floor);
            System.out.println("fakeFloor: " + LuckySkyscaper.toRealFloor(floor));
            var backToRealFloor = skyScaper.toRealFloor(fakeFloor);
            System.out.println("  back to real: " + backToRealFloor);
        }
    }
}
