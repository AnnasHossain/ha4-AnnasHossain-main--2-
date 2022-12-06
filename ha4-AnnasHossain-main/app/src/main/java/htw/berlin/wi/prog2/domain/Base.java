package htw.berlin.wi.prog2.domain;


import java.math.BigDecimal;

import static htw.berlin.wi.prog2.domain.Ingredient.Category.BASE;

public class Base extends AbstractIngredient{

    public Base (String name, BigDecimal price, int calories){
        super(name, price, calories);
    }
    @Override
    public String toString() { return this.getName() + "-Brot"; }

    private final Ingredient.Category category = BASE;

    @Override
    public Category getCategory(){
        return category;
    }

    /*
    @Override
    public Ingredient.Category getCategory(){
        return Category.BASE;
    }
    */
}



