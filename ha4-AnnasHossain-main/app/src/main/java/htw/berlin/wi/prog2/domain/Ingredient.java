package htw.berlin.wi.prog2.domain;

import java.math.BigDecimal;

public interface Ingredient{


    public String getName();

    public BigDecimal getPrice();

    public int getCalories();

    public enum Category {
        BASE,
        PROTEIN,
        TOPPING,
        SAUCE
    }

   public Ingredient.Category getCategory();


    @Override
    public String toString();
}
