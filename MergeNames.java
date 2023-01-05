package Java_Advanced.CodeGen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) throws UnsupportedOperationException {
        try {
            Set<String> set1= new HashSet<>(Arrays.asList(names1));
            Set<String> set2= new HashSet<>(Arrays.asList(names2));
            set1.addAll(set2);
            int s=set1.size();
            String [] arr=new String [s];
            int j=0;
            for (String i:set1){
                arr[j]=i;
                j++;
            
                } 
                return arr;
            }
            
        catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
      

      
      
        
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        try {
            System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2)));
        } catch (UnsupportedOperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // should print Ava, Emma, Olivia, Sophia
    }
}