package com.example.adminsonapc.app_27_polymorphism_abstract_interface;

/**
 * Created by admin on 2/10/2018.
 */

public class Animal {

    private String animalName;
    private String animalColor;
    private int animalPower;
    private int animalSpeed;

    public Animal(String animalName,String animalColor,int animalPower,int animalSpeed){

        // if this condition occurs then it will throw this exception to the log section so that we can see
        //  what's the error in log section and our application will be crushed.
        if(animalPower <=0)
            throw new IllegalArgumentException("Value of power must be greater than 0");
        if(animalSpeed <=0)
            throw new IllegalArgumentException("Value of speed must be greater than 0");


        this.animalName = animalName;
        this.animalColor = animalColor;
        this.animalPower = animalPower;
        this.animalSpeed = animalSpeed;
    }


    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public int getAnimalPower() {
        return animalPower;
    }

    public void setAnimalPower(int animalPower) {
        this.animalPower = animalPower;
    }

    public int getAnimalSpeed() {
        return animalSpeed;
    }

    public void setAnimalSpeed(int animalSpeed) {
        this.animalSpeed = animalSpeed;
    }

    public int calcuatePowerOfAnimal(){
        return getAnimalPower()*getAnimalSpeed();
    }

    @Override
    public String toString() {
        return String.format("%s : %s \n%s : %s \n%s : %d \n%s :%d\n", "Animal Name", getAnimalName(),
                "Animal Color", getAnimalColor(), "Animal Power", getAnimalPower(), "Animal Speed",
                getAnimalSpeed());
    }
}
