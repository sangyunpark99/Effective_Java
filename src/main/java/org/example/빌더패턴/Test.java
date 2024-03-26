package org.example.빌더패턴;

public class Test {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(240,10)
                .calories(100)
                .fat(10)
                .carbohydrate(20)
                .sodium(3)
                .build();
    }
}
