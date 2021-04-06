package geekbrains.lesson_7;


import java.util.Locale;
import java.util.Scanner;

public class Bowl {
    protected int foodAmount;
    private static final Scanner SCANNER = new Scanner(System.in);

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

    public int setFoodAmount(int amount) {
            this.foodAmount += amount;

return foodAmount;
    }
}
