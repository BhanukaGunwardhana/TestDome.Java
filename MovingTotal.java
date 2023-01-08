package Java_Advanced.TestDomeTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovingTotal {
    /**
     * Adds/appends list of integers at the end of internal list.
     */
    List<Integer> arr=new ArrayList<>();
    public void append(int[] list) {
        try {
            for (int i: list){
                this.arr.add(i);
                //System.out.println(i);
            }

            
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given total.
     */
    public boolean contains(int total) {
        try {
            //int count=0;
            for(int i=0;i<this.arr.size()-2;i++){
                int sum=0;
                for(int j=i;j<i+3;j++){
                    sum=sum+this.arr.get(j);

                }

                if(sum==total){
                    return true;
                }

            }
            return false;

            
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        
    }

    public static void main(String[] args) {
        MovingTotal movingTotal = new MovingTotal();

        movingTotal.append(new int[] { 1, 2, 3, 4 });

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));
        System.out.println(movingTotal.contains(12));
        System.out.println(movingTotal.contains(7));

        movingTotal.append(new int[] { 5 });

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));        
        System.out.println(movingTotal.contains(12));
        System.out.println(movingTotal.contains(7));
    }
}
