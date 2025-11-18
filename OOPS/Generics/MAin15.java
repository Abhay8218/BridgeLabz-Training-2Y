package Generics;

public class Main {
    public static void main(String[] args) {
        Meal<VegetarianMeal> veg = Generator.createMealPlan(new VegetarianMeal(), true);
        Meal<VeganMeal> vegan = Generator.createMealPlan(new VeganMeal(), true);
        System.out.println(veg);
        System.out.println(vegan);

        Meal<VeganMeal> invalid = Generator.createMealPlan(new VeganMeal(), false); // returns null
        System.out.println("Invalid result: " + invalid);
    }
}

