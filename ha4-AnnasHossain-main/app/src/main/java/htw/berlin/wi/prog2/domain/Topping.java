package htw.berlin.wi.prog2.domain;
import static htw.berlin.wi.prog2.domain.Ingredient.Category.TOPPING;


import java.math.BigDecimal;

public class Topping extends AbstractIngredient{

    public Topping (String name, BigDecimal price, int calories){
        super(name, price, calories);
    }

    @Override
    public String toString() { return this.getName() + " als Topping"; }

    /*/
    @Override
    public Ingredient.Category getCategory(){
        return Category.TOPPING;
    }
*/

    

private final Ingredient.Category category = TOPPING;

@Override
public Category getCategory(){
    return category;
}

    
}
