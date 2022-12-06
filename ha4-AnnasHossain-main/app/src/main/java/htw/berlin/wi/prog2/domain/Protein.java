package htw.berlin.wi.prog2.domain;
import static htw.berlin.wi.prog2.domain.Ingredient.Category.PROTEIN;
import java.math.BigDecimal;

//import com.google.common.cache.AbstractLoadingCache;

public class Protein extends AbstractIngredient{

    public Protein (String name, BigDecimal price, int calories){
        super(name, price, calories);
    }

    
@Override
public String toString() { return this.getName(); }

/*
@Override
public Ingredient.Category getCategory(){
    return Category.PROTEIN;
}*/


private final Ingredient.Category category = PROTEIN;

@Override
public Category getCategory(){
    return category;
}


}
