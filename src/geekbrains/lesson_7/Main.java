package geekbrains.lesson_7;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", 100);
        Cat cat2 = new Cat("Barsik", 100);
        Cat cat3 = new Cat("Tanosik", 400);
        Cat cat4 = new Cat("Kisa", 100);
        Bowl bowl = new Bowl();
        bowl.putFoodInto(300);
        cat1.eat(bowl);
        cat2.eat(bowl);
        cat3.eat(bowl);
        cat4.eat(bowl);

    }
}
