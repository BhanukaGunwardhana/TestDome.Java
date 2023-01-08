package Java_Advanced.TestDomeTests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Veterinarian {
    Queue<String> q=new LinkedList<>();
    public void accept(String petName) {
        try {
            q.add(petName);
            
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        
    }

    public String heal() {
        try {
            if (q.isEmpty()){return null;}
            
            String s=q.peek();
            q.remove();
            return s;
            
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
       
    }
    
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.accept("Barkley");
        veterinarian.accept("Mittens");
        veterinarian.accept("A");
        veterinarian.accept("B");
        System.out.println(veterinarian.heal());
        System.out.println(veterinarian.heal());
        System.out.println(veterinarian.heal());
    }
}