package htw.berlin.wi.prog2.parsing;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;


public class CountingInputParser implements ExtendableInputParser {

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
                    count ++;
                    IDsCountMap.put(value, count);
                
                }      

            }

        }
        return IDsCountMap; // TODO hier implementieren und die korrekte Map zurückgeben   
    }
}