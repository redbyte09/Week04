package com.mealplangenerator;


import java.util.ArrayList;
import java.util.List;
public class Implementation {
    public static void main(String[] args) {
        // Creating meal plan managers
        Meal<VegetarianMeal> vegetarianMealPlan = new Meal<>();
        Meal<VeganMeal> veganMealPlan = new Meal<>();
        Meal<KetoMeal> ketoMealPlan = new Meal<>();
        Meal<HighProteinMeal> highProteinMealPlan = new Meal<>();

        // Adding meals
        VegetarianMeal vegMeal1 = new VegetarianMeal("Paneer Curry");
        VeganMeal veganMeal1 = new VeganMeal("Avocado Salad");
        KetoMeal ketoMeal1 = new KetoMeal("Grilled Chicken with Avocado");
        HighProteinMeal proteinMeal1 = new HighProteinMeal("Egg Omelet with Spinach");

        vegetarianMealPlan.addMeal(vegMeal1);
        veganMealPlan.addMeal(veganMeal1);
        ketoMealPlan.addMeal(ketoMeal1);
        highProteinMealPlan.addMeal(proteinMeal1);

        // Displaying meals for each category
        System.out.println("Vegetarian Meal Plan:");
        vegetarianMealPlan.displayMeals();
        System.out.println();

        System.out.println("Vegan Meal Plan:");
        veganMealPlan.displayMeals();
        System.out.println();

        System.out.println("Keto Meal Plan:");
        ketoMealPlan.displayMeals();
        System.out.println();

        System.out.println("High-Protein Meal Plan:");
        highProteinMealPlan.displayMeals();
        System.out.println();

        // Creating a combined meal plan list
        List<MealPlan> personalizedPlan = new ArrayList<>();
        personalizedPlan.add(vegMeal1);
        personalizedPlan.add(veganMeal1);
        personalizedPlan.add(ketoMeal1);
        personalizedPlan.add(proteinMeal1);

        // Generating a personalized meal plan dynamically
        Meal.generateMealPlan(personalizedPlan);
    }
}
