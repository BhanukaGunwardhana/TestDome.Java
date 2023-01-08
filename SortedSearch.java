package Java_Advanced.TestDomeTests;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        try {
            int count=0;
            for (int i: sortedArray){
                if(i<lessThan){
                    count++;
                }

                
            }
            return count;
            
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        
    }
    
    public static void main(String[] args) {
        //System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
        String s="gsvhs hsoivhio";
        s.contains("s");
        s.indexOf("s");
        System.out.println( s.indexOf("vhs", 0));
    }
}