import java.util.*;

public abstract class ElementMap{



    public void createHashMap(ArrayList<String> key, ArrayList<String> keyValue, HashMap<Object,Object> map){
        
        int size = key.size();

        for(int i = 0; i < size; i++)
        {
            map.put(key.get(i), keyValue.get(i));
        }

    };

    

}
