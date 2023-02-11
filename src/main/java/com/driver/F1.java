package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name,4 ,2 ,5,isManual,"racing", 1);

        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate; //set the value of new speed by using currentSpeed and rate

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            setCurrentGear(1);
        }
        else if(newSpeed >=1 && newSpeed<=50) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(1);
        }
        else if(newSpeed >=51 && newSpeed<=100) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(2);
        }
        else if(newSpeed >=101 && newSpeed<=150) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(3);
        }
        else if(newSpeed >=151 && newSpeed<=200) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(4);
        }
        else if(newSpeed >=201 && newSpeed<=250) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(5);
        }
        else if(newSpeed >250) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(6);
        }

        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
