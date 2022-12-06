package htw.berlin.wi.prog2.domain;

import static htw.berlin.wi.prog2.domain.Ingredient.Category.SAUCE;

import java.math.BigDecimal;

public class Sauce extends AbstractIngredient{

    public Sauce (String name, BigDecimal price, int calories){
        super(name, price, calories);
    }

    @Override
    public String toString() { return this.getName() + " als Sauce"; }

    /*
    @Override
    public Ingredient.Category getCategory(){
        return Category.SAUCE;
    }*/


    

private final Ingredient.Category category = SAUCE;

@Override
public Category getCategory(){
    return category;
}
}
