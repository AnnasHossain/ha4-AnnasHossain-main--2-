package htw.berlin.wi.prog2.domain;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class AbstractIngredient implements Ingredient {

    
    
   /* public class AbstractIngredient {
        private final String name;
        private final BigDecimal price;
        private final int calories;
    }*/
    private final String name;
    private final BigDecimal price;
    private final int calories;
    

public AbstractIngredient(String name, BigDecimal price, int calories) {
    this.name = name;
    this.price = price;
    this.calories = calories;
}


@Override
public String toString() { return this.getName(); }



public String getName(){
    return name;
}

public BigDecimal getPrice(){
    return price;
}

public int getCalories(){
    return calories;
}

@Override
public boolean equals(Object that){
    if (this == that) return true;

    if (that == null) return false;

    //NEU   if(this.getCalories() != ((AbstractIngredient) that).getCalories()) return false;

    if(this.getClass() != that.getClass()) return false;


    AbstractIngredient abstractIngredient = (AbstractIngredient) that;

    return this.calories == (abstractIngredient.calories) && this.name.trim().equals(abstractIngredient.name.trim()) && this.price.compareTo(abstractIngredient.price) == 0;
}


@Override
public int hashCode(){
    return Objects.hash(calories, name.trim(), price.setScale(2));
}

}
