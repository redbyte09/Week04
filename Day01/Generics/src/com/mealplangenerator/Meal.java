package com.mealplangenerator;


import java.util.ArrayList;
import java.util.List;
public class Meal <T extends MealPlan> {
private List<T> mealList = new ArrayList<>();

public void addMeal(T meal) {
    mealList.add(meal);
}

public List<T> getMealList() {
    return mealList;
}

public void displayMeals() {
    for (T meal : mealList) {
        meal.displayMeal();
    }
}

// Generic Method to Generate a Meal Plan
public static <T extends MealPlan> void generateMealPlan(List<T> meals) {
    System.out.println("Generating Personalized Meal Plan:");
    for (T meal : meals) {
        meal.displayMeal();
    }
    System.out.println("----------------------");
}

}
