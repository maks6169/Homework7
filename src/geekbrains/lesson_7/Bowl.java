package geekbrains.lesson_7;


import java.util.Locale;
import java.util.Scanner;

public class Bowl {
    protected int foodAmount;

    public void putFoodInto(int amount) {
        this.foodAmount += amount;
        System.out.printf("Food put for %d, and %d left\n", amount, foodAmount);
    }

    public void decreaseFood(int amount) {
        this.foodAmount -= amount;
        System.out.printf("Food decreased for %d, and %d left\n", amount, foodAmount);
    }

    public int getFoodAmount() {

        return foodAmount;

    }

    public int setFoodAmount(int i) {
        this.foodAmount = this.foodAmount + i;
        System.out.printf("Food increased for %d\n", foodAmount);

        return foodAmount;
    }
}
