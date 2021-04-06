package geekbrains.lesson_7;

import java.util.Locale;
import java.util.Scanner;

public class Cat {
    private String name;
    protected int appetite;
    private boolean hungry;
    private static final Scanner SCANNER = new Scanner(System.in);

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = false;
    }

    public void eat(Bowl bowl) {
        if (appetite > bowl.foodAmount) {
            System.out.printf("Cat %s can`t eat! In bowl not enough food\n Want to add some food? Y/N\n", this.name);
            if (!SCANNER.next().toLowerCase(Locale.ROOT).equals("y")) {
                bowl.foodAmount += 500;
                System.out.printf("Food put for %d\n", bowl.foodAmount);}
            } else {
                bowl.decreaseFood(appetite);
                System.out.printf("Cat %s ate some food and cat not hungry = %s\n", this.name, hungry = true);
            }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
