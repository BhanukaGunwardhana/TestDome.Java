package Java_Advanced.TestDomeTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Findmaxoccurrencenumber
{
    public static int maxOccurance(ArrayList<Integer> list) {
        Set<Integer>set=new HashSet<>(list);
        HashMap<Integer, Integer> map=new HashMap<>();
        List<Integer> list_=new ArrayList<>();
        for (int i: set){
            int count=0;
            for(int j:list){
                if(i==j){
                    count++;
                
                }
            }
            map.put(i, count);
            list_.add(count);

        }
        Collections.sort(list_);
        int i=list_.get(list_.size()-1);
        for (int j:list){
            for(Entry<Integer, Integer> v:map.entrySet()){
                if(i==v.getValue()){
                   int k=v.getKey();
                   if(k==j){
                    return j;
                   }
                   
                }
            }

        }
        
        return -1;
        

        
        
    }
    
    public static void main(String[] args) {
        System.out.println(maxOccurance(new ArrayList<>(Arrays.asList(4,2,3,4,6,2,4,2,2,2,2,4,5,8,4,9,4,7))));
    }
}