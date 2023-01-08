package Java_Advanced.TestDomeTests;

import java.util.*;

public class RoutePlanner {

    public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn,
                                      boolean[][] mapMatrix) {
                                        

                                     try {
                                        int [][] arr= new int [3][3];
                                        int position;
                                        
                                        
                                        if(position>=0 && position<=8){

                                        }
                                        
                                     } catch (Exception e) {
                                        // TODO: handle exception
                                        throw new UnsupportedOperationException("Waiting to be implemented.");
                                     }   
       
    }
        
    public static void main(String[] args) {
        boolean[][] mapMatrix = {
            {true,  false, false},
            {true,  true,  false},
            {false, true,  true}
        };
        
        System.out.println(routeExists(0, 0, 2, 2, mapMatrix));
    }
}