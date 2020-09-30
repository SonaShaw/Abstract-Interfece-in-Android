package com.example.adminsonapc.app_27_polymorphism_abstract_interface;

/**
 * Created by admin on 2/10/2018.
 */

public class Cat extends Animal {

    public Cat(String animalName, String animalColor, int animalPower, int animalSpeed){
        super(animalName,animalColor,animalPower,animalSpeed);

    }

    @Override
    public int calcuatePowerOfAnimal() {
        return super.calcuatePowerOfAnimal();
    }

    @Override
    public String toString() {
        return "Cat :" +super.toString();
    }
}
