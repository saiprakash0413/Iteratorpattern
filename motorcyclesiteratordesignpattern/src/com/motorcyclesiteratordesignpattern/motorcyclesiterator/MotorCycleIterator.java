package com.motorcyclesiteratordesignpattern.motorcyclesiterator;

import java.util.Iterator;

import com.motorcyclesiteratordesignpattern.motorcycles.MotorCycle;
/*author Saiprakash Reddy*/
public class MotorCycleIterator implements Iterator<MotorCycle> {
	
	private MotorCycle [] motorCycle;
    int pos;
     
    public MotorCycleIterator(MotorCycle []motorCycle){
        this.motorCycle = motorCycle;
    }
    @Override
    public boolean hasNext() {
        if(pos >= motorCycle.length || motorCycle[pos] == null)
            return false;
        return true;
    }
 
    @Override
    public MotorCycle next() {
        return motorCycle[pos++];
    }
 
    @Override
    public void remove() {
        if(pos <=0 )
            throw new IllegalStateException("Illegal position");
        if(motorCycle[pos-1] !=null){
            for (int i= pos-1; i<(motorCycle.length-1);i++){
            	motorCycle[i] = motorCycle[i+1];
            }
            motorCycle[motorCycle.length-1] = null;
        }
    }

}
