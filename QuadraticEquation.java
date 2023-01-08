package Java_Advanced.TestDomeTests;

public class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) throws UnsupportedOperationException {
        try {

            double x_1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
            double x_2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
            Roots root=new Roots(x_1, x_2);
            return root;
            
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        
    }
    
    public static void main(String[] args) throws UnsupportedOperationException {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {         
        this.x1 = x1;
        this.x2 = x2;
    }
}