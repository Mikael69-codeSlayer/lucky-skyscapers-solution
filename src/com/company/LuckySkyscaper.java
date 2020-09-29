package com.company;

public class LuckySkyscaper {

    static public void floorList(int totalRealFloors){
        // loop through real floor numbers
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= totalRealFloors; realFloor++) {
            System.out.println("realFloorNo: " + realFloor + " fakeFloorNo: " + fakeFloor);
            // add 1 to fakeFLoor and continue adding 1 as long as
            // fakeFloor ends with 4 or ends with 13
           do {
               fakeFloor++;
           } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);


        }
    }
}
