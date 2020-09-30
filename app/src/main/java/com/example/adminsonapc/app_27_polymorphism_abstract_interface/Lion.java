package com.example.adminsonapc.app_27_polymorphism_abstract_interface;

/**
 * Created by admin on 2/10/2018.
 */

public class Lion extends Animal{

    private boolean canFight = true;
    private int fightingPower;

    public Lion(String animalName, String animalColor, int animalPower, int animalSpeed, boolean canFight,
                int fightingPower){

        super(animalName,animalColor,animalPower,animalSpeed);

        if(fightingPower <= 0)
            throw new IllegalArgumentException("Fighting power must be greater then 0");


        this.canFight = canFight;
        this.fightingPower = fightingPower;
    }

    public boolean getCanFight() {
        return canFight;
    }

    public void setCanFight(boolean canFight) {
        this.canFight = canFight;
    }

    public int getFightingPower() {
        return fightingPower;
    }

    public void setFightingPower(int fightingPower) {
        this.fightingPower = fightingPower;
    }

    @Override
    public int calcuatePowerOfAnimal() {
        return super.calcuatePowerOfAnimal() + fightingPower;
    }

    @Override
    public String toString() {
        return String.format("%s \n%s : %b \n%s : %d",super.toString(), "Can Fight",
                            getCanFight(), "Fighting Power", getFightingPower());
    }
}
