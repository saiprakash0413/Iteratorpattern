package com.motorcyclesiteratordesignpattern.infostorage;

import com.motorcyclesiteratordesignpattern.motorcycles.MotorCycle;
/*author Saiprakash Reddy*/
public class MotorCycleDataStorage {
	

    private MotorCycle []motorCycle = new MotorCycle[5];
    private int index;
     
    public void addMotorCycle(int id,String motorCycleName, double size, double speed, String color, String registrationNumber){
        int i = index++;
        motorCycle[i] = new MotorCycle(id,motorCycleName,size,speed,color,registrationNumber);
    }
     
    public MotorCycle[] getMotorCycles(){
        return motorCycle;
    }

}
