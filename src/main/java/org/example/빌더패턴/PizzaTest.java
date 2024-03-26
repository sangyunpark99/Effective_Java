package org.example.빌더패턴;

import static org.example.빌더패턴.Pizza.Topping.HAM;

public class PizzaTest {
    public static void main(String[] args) {
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceinside()
                .build();
    }
}
