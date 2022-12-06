package htw.berlin.wi.prog2.data;

import htw.berlin.wi.prog2.domain.Ingredient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuUtils {

    public static List<String> focusOnNames(Map<Long, Ingredient> articles) {
        List<String> names = new ArrayList<>();
        for (Ingredient art : articles.values()) names.add(art.getName());
        return names;
    }

    public static Map<String, Long> focusOnNameAndInvert(Map<Long, Ingredient> articles) {
        Map<String, Long> whatever = new HashMap<>();
        for(Map.Entry<Long, Ingredient> however : articles.entrySet()){
            Long key = however.getKey();
            Ingredient value = however.getValue();

            whatever.put(value.getName(), key); //Spalten der Tabelle vertauschen; Spalte Zutatenname wird hier mit Spalte ID vertauscht
        }
        return whatever; // TODO hier implementieren und korrekte Ergebnis-Map zurückgeben
    }

    public static List<Ingredient> ingredientsFromIdAndCount(Map<Long, Integer> idsAndCount, Map<Long, Ingredient> articles) {
        List<Ingredient> result = new ArrayList<>();
        Long id;
        Integer count;
        for (Map.Entry<Long, Integer> entry : idsAndCount.entrySet()) {
            id = entry.getKey();
            count = entry.getValue();
            for (Map.Entry<Long, Ingredient> entryArticles : articles.entrySet()){
                if(id == entryArticles.getKey()){
                    for (count= entry.getValue(); count >= 1; count--){
                        result.add(entryArticles.getValue());
                    }
                }
            }
            
        }

        
        return result; // TODO hier implementieren und korrekte Ergebnis-Liste zurückgeben
    }
}


