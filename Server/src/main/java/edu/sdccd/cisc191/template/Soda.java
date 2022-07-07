package edu.sdccd.cisc191.template;

public class Soda extends Beverage implements Liquid, Calories{

    private int calories;

    //Constructor for soda which inherits from Beverage and also has calories
    public Soda(double amount, String unit, int calories) {
        super(amount, unit, "Soda");
        this.calories = calories;
    }

    @Override
    public String toString() {
        return super.toString() + " with " + calories + " calories.";
    }

    @Override
    public int caloriesToRuns() {
        return calories / 100;
    }


    //get calories
    public int getCalories() {
        return calories;
    }

    //set calories
    public void setCalories(int calories) {
        this.calories = calories;
    }

}
