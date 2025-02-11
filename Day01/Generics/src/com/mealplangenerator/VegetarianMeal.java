package com.mealplangenerator;

public class VegetarianMeal implements MealPlan {
    private String mealName;

    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public void displayMeal() {
        System.out.println("Vegetarian Meal: " + mealName);
    }
}
