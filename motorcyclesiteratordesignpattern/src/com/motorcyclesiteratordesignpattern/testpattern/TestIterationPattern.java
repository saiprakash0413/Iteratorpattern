package com.motorcyclesiteratordesignpattern.testpattern;

import com.motorcyclesiteratordesignpattern.infostorage.MotorCycleDataStorage;
import com.motorcyclesiteratordesignpattern.motorcyclesiterator.MotorCycleIterator;
/*author Saiprakash Reddy*/
public class TestIterationPattern {
	
	public static void main(String[] args) {
        MotorCycleDataStorage motorcycledatastorage = new MotorCycleDataStorage();
        System.out.println("--------------------MotorCycle Iterator Pattern---------------------");
        motorcycledatastorage.addMotorCycle(1, "KTM", 200.5, 50, "black", "Ap 26 0619");
        motorcycledatastorage.addMotorCycle(2, "Pulser", 100.5, 50, "Red", "Ap 27 3459");
        motorcycledatastorage.addMotorCycle(3, "Splender", 89, 50, "black", "TS 23 0999");
        motorcycledatastorage.addMotorCycle(4, "Hero Honda", 101.5, 50, "Black and White", "TS 26 2789");
        motorcycledatastorage.addMotorCycle(5, "Apache", 98, 50, "black", "Ts 27 2341");
        
         
        MotorCycleIterator motorCycleIterator = new MotorCycleIterator(motorcycledatastorage.getMotorCycles());
        while(motorCycleIterator.hasNext()){
            System.out.println(motorCycleIterator.next());
        }
        System.out.println(".............Apply removing while iterating................");
        motorCycleIterator = new MotorCycleIterator(motorcycledatastorage.getMotorCycles());
        while(motorCycleIterator.hasNext()){
            System.out.println(motorCycleIterator.next());
            motorCycleIterator.remove();
        }
    }

}
