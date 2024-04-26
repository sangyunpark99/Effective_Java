package org.example.빌더패턴;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import org.example.빌더패턴.Pizza.Builder;

public abstract class Pizza {
    public enum Topping {
        HAM,MUSHROOM,ONION,PEPPER,SAUSAGE
    }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Pizza.Builder<T>> {
            EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
            public T addTopping(Topping topping) {
                toppings.add(Objects.requireNonNull(topping));
                return self();
            }

            abstract Pizza build();

            protected abstract T self();
        }

        Pizza(Builder<?> builder) {
            toppings = builder.toppings.clone();
    }
}
