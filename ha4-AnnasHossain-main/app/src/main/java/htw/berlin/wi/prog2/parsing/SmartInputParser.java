package htw.berlin.wi.prog2.parsing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SmartInputParser implements ExtendableInputParser {

    @Override
    public Map<Long, Integer> idsAndCountFromInput(String inputLine, Map<String, Long> keywordsToIds) {
        Map<Long, Integer> IDsCountMap = new HashMap<>();


        for(Map.Entry<String, Long> erbvvj : keywordsToIds.entrySet()){
            Long value = erbvvj.getValue();
            String key = erbvvj.getKey();
            

            String[] strArr = inputLine.split(" " );
           // ArrayList<String> inputLineList = new ArrayList<String>(Arrays.asList(strArr));
            
            Integer count = 0;
           
            for(int i =0; i < strArr.length; i++){
                if (strArr[i].contains(key)){
                    if(strArr[i].equals("doppelt")){
                        count = 2;
                    }
                    else if (strArr[i].equals("dreifach")){
                        count = 3;
                    }else{
                    count ++;
                    IDsCountMap.put(value, count);
                    }
                
                }      

            }

        }
        return IDsCountMap; // TODO hier implementieren und die korrekte Map zurückgeben   
    }










/*
    @Override
    public Map<Long, Integer> idsAndCountFromInput(String inputLine, Map<String, Long> keywordsToIds) {

        Map<Long, Integer> result = new HashMap<>();
        String[] strArr = inputLine.split(" " );

            for(Map.Entry<String, Long> erbvvj : keywordsToIds.entrySet()){
                Long key = result.getKey();
                String value = erbvvj.getValue();
                
                erbvvj.put(key, value); //Spalten der Tabelle vertauschen Spalte Zutatenname wird hier mit Spalte ID vertauscht
            
                    
                Integer count = 0;
                   
                for(int i =0; i < strArr.length; i++){
                    if (strArr[i].contains(key)){
                        count ++;
                        result.put(value, count);
                    }      
        
                }
            }
            
        return erbvvj();
             } // TODO hier implementieren und die korrekte Map zurückgeben   
}
*/

}


