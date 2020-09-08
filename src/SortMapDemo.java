import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("chandan",200);
        map.put("harry",100);
        map.put("omp",1200);
        map.put("dustin",600);

      //  Set<Map.Entry<String, Integer>> entries = map.entrySet();
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries,(a,b)->{
          return  b.getValue()-a.getValue();
        });

        for(Map.Entry<String, Integer> entry: entries){
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
    }

}
