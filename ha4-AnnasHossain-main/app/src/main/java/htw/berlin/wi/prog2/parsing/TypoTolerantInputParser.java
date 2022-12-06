package htw.berlin.wi.prog2.parsing;

import java.util.Map;
import java.util.HashMap;

public class TypoTolerantInputParser implements ExtendableInputParser {

    @Override
    public Map<Long, Integer> idsAndCountFromInput(String inputLine, Map<String, Long> keywordsToIds) {

        Map<Long, Integer> IDsCountMap = new HashMap<>();
        
        String[] strArr = inputLine.split(" " );
        

        for(Map.Entry<String, Long> erbvvj : keywordsToIds.entrySet()){
            Long value = erbvvj.getValue();
            //String key = erbvvj.getKey();
            
            //ArrayList<String> inputLineList = new ArrayList<String>(Arrays.asList(strArr));
            
            
           
            for(int i =0; i < strArr.length; i++){
                Integer count = 0;
                if(strArr[i].contains(erbvvj.getKey())){
                    count++;
                }

                if(count != 0){
                    if(IDsCountMap.containsKey(value)){
                    IDsCountMap.put(value, IDsCountMap.get(value) + count);

                
                    }/*
                    else if (strArr[i].contains(erbvvj.getKey())){
                    count ++;
                    IDsCountMap.put(value, count);
                
                    }*/
                    else{
                        IDsCountMap.put(value, count);
                    } 


                /*
                if (strArr[i].contains(erbvvj.getKey())){
                    
                    IDsCountMap.put(value, IDsCountMap.get(value) + 1);
                    count += 1;
                }
                else{
                    IDsCountMap.put(value, 1);
                }      
              */  
                }
            }
        
        }
        return IDsCountMap; // TODO hier implementieren und die korrekte Map zurückgeben   
    }
     
}
