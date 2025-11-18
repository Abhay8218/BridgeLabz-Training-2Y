package Generics;
public interface MealPlan {
    String description();
}
public class VegetarianMeal implements MealPlan {
    @Override public String description() { return "Vegetarian Plan"; }
}
public class VeganMeal implements MealPlan {
    @Override public String description() { return "Vegan Plan"; }
}
public class Meal<T extends MealPlan> {
    private final T plan;
    public Meal(T plan) { this.plan = plan; }
    public T getPlan() { return plan; }
    @Override public String toString() { return "Meal[" + plan.description() + "]"; }
}
public class Generator {
    // validate and generate: returns Meal<T> if valid, else null
    public static <T extends MealPlan> Meal<T> createMealPlan(T plan, boolean isValid) {
        if (!isValid) {
            System.out.println("Invalid plan for user preferences.");
            return null;
        }
        return new Meal<>(plan);
    }
}
