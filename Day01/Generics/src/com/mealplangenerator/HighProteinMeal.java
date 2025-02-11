package com.mealplangenerator;

public class HighProteinMeal implements MealPlan {
    private String mealName;

    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public void displayMeal() {
        System.out.println("High-Protein Meal: " + mealName);
    }
}
