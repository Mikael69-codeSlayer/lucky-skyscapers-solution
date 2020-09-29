package com.company;

public class LuckySkyscaper {

    static public int toRealFloor(int fakeFloorGoal){
        // loop through real floor numbers
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= fakeFloorGoal; realFloor++) {
            if(fakeFloorGoal == fakeFloor) {
                return realFloor; // this ends the loop and the method
            }
           do {
               fakeFloor++;
           } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);


        }
        return -1; // could not find real floor number
    }
    static public int toFakeFloor(int fakeFloorGoal){
        // loop through real floor numbers
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor < fakeFloorGoal; realFloor++) {
            do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);


        }
        return fakeFloor; // could not find fake floor number
    }
}
