import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map2 {
    public static void main(String[] args) {
        int[] arr={7,1,2,6,3,4,2,7};
        Map<Integer,Integer> map=new TreeMap<>();
//        for (int i = 0; i < arr.length; i++) {
        int t=0;
          for(int i:arr){
            t=map.getOrDefault(i,0)+1;
            map.put(i,t);

//            if(!map.containsKey(arr[i])){
//                map.put(arr[i],1);
//            }
//            else{
//                map.put(arr[i], map.get(arr[i])+1);
//            }
        }
        Set<Map.Entry<Integer,Integer>> mp=map.entrySet();

        int index=0;

        for (Map.Entry<Integer,Integer> en:mp){
            if(en.getValue()==1){
                index=en.getKey();
                break;
            }
        }

        for (int i:arr){
            if (index==i){
                System.out.println(i);
                break;
            }
        }

    }
}
