package htw.berlin.wi.prog2.domain;

import java.math.BigDecimal;

import org.w3c.dom.Text;

public class IngredientBuilder {

    private String name;
    private BigDecimal price;
    private int calories;

    public IngredientBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public IngredientBuilder setPrice(String price) {
        this.price = new BigDecimal(price);
        return this;
    }

    public IngredientBuilder setCals(int calories) {
        this.calories = calories;
        return this;
    }

    public Ingredient build(Ingredient.Category cat) {

        if(cat == Ingredient.Category.TOPPING){
            return new Topping(name, price, calories);
        }
        else if(cat == Ingredient.Category.SAUCE){
            return new Sauce(name, price, calories);
        }
        else if(cat == Ingredient.Category.PROTEIN){
            return new Protein(name, price, calories);
        }
        else if(cat == Ingredient.Category.BASE){
            return new Base(name, price, calories);
        }
        else{
            return null;
        }        // TODO hier die richtige Unterklasse instanziieren
    }
}
